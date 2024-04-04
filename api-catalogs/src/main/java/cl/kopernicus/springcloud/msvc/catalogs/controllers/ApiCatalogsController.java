package cl.kopernicus.springcloud.msvc.catalogs.controllers;

import cl.kopernicus.springcloud.msvc.catalogs.models.dto.mappings.ListOfMapsDTO;
import cl.kopernicus.springcloud.msvc.catalogs.models.dto.mappings.MapSystemDTO;
import cl.kopernicus.springcloud.msvc.catalogs.models.entities.MapTable;
import cl.kopernicus.springcloud.msvc.catalogs.models.dto.mappings.MappingObjectDTO;
import cl.kopernicus.springcloud.msvc.catalogs.models.errors.ApiError;
import cl.kopernicus.springcloud.msvc.catalogs.services.ApiCatalogsService;
import jakarta.servlet.http.HttpServletRequest;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;
import java.util.*;
import java.util.stream.Stream;

@RestController
public class ApiCatalogsController {
    private static final String MAPPING_TYPE_NAME = "mappingType";
    private static final String SYSTEM_A_NAME = "systemA";
    private static final String SYSTEM_B_NAME = "systemB";
    private static final String CODE_NAME = "code";
    private static final String MODE_NAME = "mode";
    private static final Logger log = LoggerFactory.getLogger(ApiCatalogsController.class);
    @Autowired
    private ApiCatalogsService service;
    @Autowired
    private ApplicationContext context;

    @Autowired
    private Environment env;

    @Autowired
    private HttpServletRequest httpServletRequest;
    /*
    private static ResponseEntity<Map<String, String>> validar(BindingResult result) {
        Map<String, String> errores = new HashMap<>();
        result.getFieldErrors().forEach(err -> {
            errores.put(err.getField(), "El campo " + err.getField() + " " + err.getDefaultMessage());
        });
        return ResponseEntity.badRequest().body(errores);
    }
    */

    /**
     * REST Controller para @GetMapping("/api/mappings") que retorna una lista de objetos <code>MappingObjectDTO</code>
     * a partir de una serie de parámetros que permiten buscar un mapeo específico entre el código manejado por un
     * Sistema A y un Sistema B, para un catálogo específico.
     * Los mapeos están definidos en la tabla de base de datos <code>map_table</code> la cual está mapeada a la
     * entidad JPA <code>MapTable</code>
     * @param   mappingType Query param (request param) que indica el catálogo en donde se realizará el mapeo.
     * @param   systemA     Query param (request param) que el "Sistema A", el cual puede ser interpretado como un sistema
     * de orígen o de de destino, dependiendo del parámetro <code>mode</code> ("atob" o "btoa" respectivamente).
     * @param   systemB     Query param (request param) que el "Sistema B", el cual puede ser interpretado como un sistema
     * de orígen o de de destino, dependiendo del parámetro <code>mode</code> ("btoa" o "atob" respectivamente).
     * @param   code        Query param (request param) que indica el código que se quiere mapear dentro del catálogo indicado
     * en el parámetro <code>mappingType</code>.
     * El <code>code</code> estará asociado al sistema de origen según lo que se indique en el parámetro
     * <code>mode</code>: "atob" (sistema de origen es A) o "btoa" (sistema de origen es B).
     * @param   mode        Indica la "dirección" del mapeo:
     *                      - "atob": Desde un sistema A a un sistema B
     *                      - "btoa": Desde un sistema B a un sistema A.
     *                      - "allcoincidences": Todos los mapeos que se encuentren ya sea desde un sistema A a un
     *                      sistema B o desde un sistema B a un sistema A.
     * @return Una atributo <code>content</code> que es una lista o arreglo de objetos <code>MappingObjectDTO</code>.
     * @see MappingObjectDTO
     * @see MapTable
     */
    @GetMapping("/api/mappings")
    public ResponseEntity<?> findMap(
            @RequestHeader Map<String, String> headers,
            @RequestHeader(name = "x-organization-id") String xOrganizationId,
            @RequestHeader(name = "x-organization-type") String xOrganizationType,
            @RequestHeader(name = "x-client-application") String xClientApplication,
            @RequestHeader(name = "x-client-application-flow", required = false) String xClientApplicationFlow,
            @RequestHeader(name = "x-trace-id") String xTraceId,
            @RequestHeader(name = "x-user") String xUser,
            @RequestParam(name = MAPPING_TYPE_NAME) String mappingType,
            @RequestParam(name = SYSTEM_A_NAME) String systemA,
            @RequestParam(name = SYSTEM_B_NAME) String systemB,
            @RequestParam(name = CODE_NAME, required = false) String code,
            @RequestParam(name = MODE_NAME) String mode
    ) {
        String message = MessageFormat
                .format("Params -> " + MAPPING_TYPE_NAME + ": ''{0}'', " + SYSTEM_A_NAME + ": ''{1}'', " + CODE_NAME + ": ''{2}'', " +
                                SYSTEM_B_NAME + ": ''{3}'', " + MODE_NAME + ": ''{4}'', " +
                                "Headers -> x-organization-id: {5}, x-organization-type: {6}, x-client-application: {7}, " +
                                "x-client-application-flow: {8}, x-trace-id: {9}, x-user: {10}",
                        mappingType, systemA, code, systemB, mode, xOrganizationId, xOrganizationType,
                        xClientApplication, xClientApplicationFlow, xTraceId, xUser);
        log.info(headers.toString() + " " + message);
        Map<String, List<MappingObjectDTO>> body = new LinkedHashMap<>();
        Optional <List<MapTable>> opt = Optional.empty();
        if ("atob".equalsIgnoreCase(mode))
            opt = service.findByAtoB(mappingType, systemA, systemB, code);
        else if ("btoa".equalsIgnoreCase(mode))
            opt = service.findByBtoA(mappingType, systemB, systemA, code);
        else if ("allcoincidences".equalsIgnoreCase(mode))
            opt = service.findAllMapCoincidences(mappingType, systemA, systemB, code);

        if (opt.isPresent() &&  !opt.get().isEmpty()) {
            List<MapTable> mapTables = opt.get();
            List<MappingObjectDTO> mappinObjects = getMappingObjects(mapTables.stream());
            body.put("content", mappinObjects);
            return ResponseEntity.ok(body);
        }
        /* Mensaje de error que indica que el contenido no fue encontrado */
        String documentation_url = "";
        String path = httpServletRequest.getRequestURI(); //+ " " + httpServletRequest.getRequestURL().toString();
        ApiError apiError = new ApiError(
                HttpStatus.NOT_FOUND,
                "Resource Not Found",
                path,
                xTraceId,
                documentation_url
        );
        apiError.setSuggestion(
                MessageFormat.format("Intente utilizando otros valores en los parámetros ''{0}'', ''{1}'', ''{2}'', ''{3}'', ''{4}''",
                    MAPPING_TYPE_NAME, SYSTEM_A_NAME, SYSTEM_B_NAME, CODE_NAME, MODE_NAME
                )
        );
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(apiError);
    }

    @GetMapping("/api/mappings/pages/{pageNumber}")
    public ResponseEntity<?> findAll(
            @RequestHeader(name = "x-organization-id") String xOrganizationId,
            @RequestHeader(name = "x-organization-type") String xOrganizationType,
            @RequestHeader(name = "x-client-application") String xClientApplication,
            @RequestHeader(name = "x-client-application-flow", required = false) String xClientApplicationFlow,
            @RequestHeader(name = "x-trace-id") String xTraceId,
            @RequestHeader(name = "x-user") String xUser,
            @PathVariable Integer pageNumber,
            @RequestParam Integer pageSize) {
        Map<String, Object> body = new LinkedHashMap<>();
        Pageable pageable = PageRequest.of(pageNumber, pageSize, Page.empty().getSort().ascending());
        Page<MapTable> page = service.findAll(pageable);
        List<MappingObjectDTO> mappinObjects = getMappingObjects(page.get());

        body.put("content", mappinObjects);
        body.put("pageable", page.getPageable());
        body.put("totalElements", page.getTotalElements());
        body.put("totalPages", page.getTotalPages());
        body.put("last", page.isLast());
        body.put("size", page.getSize());
        body.put("number", page.getNumber());
        body.put("sort", page.getSort());
        body.put("numberOfElements", page.getNumberOfElements());
        body.put("first", page.isFirst());
        body.put("empty", page.isEmpty());
        return ResponseEntity.ok(body);
    }

    @PostMapping("/api/mappings/pages/{pageNumber}")
    public ResponseEntity<?> findBtoA(
            @RequestHeader(name = "x-organization-id") String xOrganizationId,
            @RequestHeader(name = "x-organization-type") String xOrganizationType,
            @RequestHeader(name = "x-client-application") String xClientApplication,
            @RequestHeader(name = "x-client-application-flow", required = false) String xClientApplicationFlow,
            @RequestHeader(name = "x-trace-id") String xTraceId,
            @RequestHeader(name = "x-user") String xUser,
            @RequestParam(name = MAPPING_TYPE_NAME) String mappingType,
            @RequestParam(name = SYSTEM_A_NAME) String systemA,
            @RequestParam(name = SYSTEM_B_NAME) String systemB,
            @RequestParam(name = MODE_NAME) String mode,
            @PathVariable Integer pageNumber,
            @RequestParam Integer pageSize,
            @RequestBody ListOfMapsDTO objects
            ) {
        Map<String, Object> body = new LinkedHashMap<>();
        Pageable pageable = PageRequest.of(pageNumber, pageSize, Page.empty().getSort().ascending());
        List<String> objectList = objects.getObjects().stream().map(o -> o.get("code")).toList();
        Page<MapTable> page = null;

        if ("atob".equalsIgnoreCase(mode))
            page = service.findByAtoB(mappingType, systemA, systemB, objectList, pageable);
        else if ("btoa".equalsIgnoreCase(mode))
            page = service.findByBtoA(mappingType, systemB, systemA, objectList, pageable);
        //else if ("allcoincidences".equalsIgnoreCase(mode))
        //    opt = service.findAllMapCoincidences(mappingType, systemA, systemB, code);

        if (page != null) {
            List<MappingObjectDTO> mappinObjects = getMappingObjects(page.get());

            body.put("content", mappinObjects);
            body.put("pageable", page.getPageable());
            body.put("totalElements", page.getTotalElements());
            body.put("totalPages", page.getTotalPages());
            body.put("last", page.isLast());
            body.put("size", page.getSize());
            body.put("number", page.getNumber());
            body.put("sort", page.getSort());
            body.put("numberOfElements", page.getNumberOfElements());
            body.put("first", page.isFirst());
            body.put("empty", page.isEmpty());
            return ResponseEntity.ok(body);
        }

        /* Mensaje de error que indica que el contenido no fue encontrado */
        String documentation_url = "";
        String path = httpServletRequest.getRequestURI(); //+ " " + httpServletRequest.getRequestURL().toString();
        ApiError apiError = new ApiError(
                HttpStatus.NOT_FOUND,
                "Resource Not Found",
                path,
                xTraceId,
                documentation_url
        );
        apiError.setSuggestion(
                MessageFormat.format("Intente utilizando otros valores en los parámetros ''{0}'', ''{1}'', ''{2}'', ''{3}'', ''{4}''",
                        MAPPING_TYPE_NAME, SYSTEM_A_NAME, SYSTEM_B_NAME, CODE_NAME, MODE_NAME
                )
        );
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(apiError);
    }

    /**
     * Retorna una lista de objetos <code>MappingObjectDTO</code> a partir de un stream de entidades JPA
     * <code>MapTable</code>.
     * @param  mapTables  Un stream de entidades JPA <code>MapTable</code>.
     * @return Una lista de objetos <code>MappingObjectDTO</code>.
     * @see MappingObjectDTO
     * @see MapTable
     */
    @NotNull
    private static List<MappingObjectDTO> getMappingObjects(Stream<MapTable> mapTables) {
        return mapTables
                .map(mt -> new MappingObjectDTO(
                        mt.getId(),
                        mt.getMappingType(),
                        new MapSystemDTO(mt.getSystemA(), mt.getSystemAType(), mt.getCodeA(), mt.getNameA()),
                        new MapSystemDTO(mt.getSystemB(), mt.getSystemBType(), mt.getCodeB(), mt.getNameB())
                )).toList();
    }
}
