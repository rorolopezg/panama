package cl.kopernicus.springcloud.msvc.catalogs.controllers;

import cl.kopernicus.springcloud.msvc.catalogs.models.mappings.MapSystem;
import cl.kopernicus.springcloud.msvc.catalogs.models.entities.MapTable;
import cl.kopernicus.springcloud.msvc.catalogs.models.mappings.MappingObject;
import cl.kopernicus.springcloud.msvc.catalogs.models.errors.ApiError;
import cl.kopernicus.springcloud.msvc.catalogs.services.ApiCatalogsService;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;
import java.util.*;

@RestController
public class ApiCatalogsController {
    private static final Logger log = (Logger) LoggerFactory.getLogger(ApiCatalogsController.class);
    @Autowired
    private ApiCatalogsService service;
    @Autowired
    private ApplicationContext context;

    @Autowired
    private Environment env;

    @Autowired private HttpServletRequest httpServletRequest;

    private static ResponseEntity<Map<String, String>> validar(BindingResult result) {
        Map<String, String> errores = new HashMap<>();
        result.getFieldErrors().forEach(err -> {
            errores.put(err.getField(), "El campo " + err.getField() + " " + err.getDefaultMessage());
        });
        return ResponseEntity.badRequest().body(errores);
    }

    @GetMapping("/api/mappings")
    public ResponseEntity<?> findMap(
            //@RequestHeader Map<String, String> headers,
            @RequestHeader(name="x-organization-id") String xOrganizationId,
            @RequestHeader(name="x-organization-type") String xOrganizationType,
            @RequestHeader(name="x-client-application") String xClientApplication,
            @RequestHeader(name="x-client-application-flow", required = false) String xClientApplicationFlow,
            @RequestHeader(name="x-trace-id") String xTraceId,
            @RequestHeader(name="x-user") String xUser,
            @RequestParam String mappingType,
            @RequestParam String systemA,
            @RequestParam(required = false) String codeA,
            @RequestParam(required = false) String codeB,
            @RequestParam String systemB,
            @RequestParam(required = false) String mode
    ) {
        String message = MessageFormat
                .format("Params -> mappingType: ''{0}'', systemA: ''{1}'', codeA: ''{2}'', " +
                                "systemB: ''{3}'', codeB: ''{4}'', mode: ''{5}'', " +
                                "Headers -> x-organization-id: {6}, x-organization-type: {7}, x-client-application: {8}, " +
                                "x-client-application-flow: {9}, x-trace-id: {10}, x-user: {11}",
                        mappingType, systemA, codeA, systemB, codeB, mode, xOrganizationId, xOrganizationType,
                        xClientApplication, xClientApplicationFlow, xTraceId, xUser);
        log.info(message);
        Map<String, List<MappingObject>> body = new HashMap<>();
        Optional <List<MapTable>> opt;
        if ("reverse".equalsIgnoreCase(mode))
            opt = service.findBySystemB(mappingType, systemB, codeB, systemA);
        else
            opt = service.findBySystemA(mappingType, systemA, codeA, systemB);
        if (opt.isPresent() && !opt.get().isEmpty()) {
            List<MapTable> mapTables = opt.get();
            List<MappingObject> mappinObjects = mapTables.stream()
                    .map(mt -> new MappingObject (
                                    mt.getId(),
                                    mt.getMappingType(),
                                    new MapSystem(mt.getSystemA(), mt.getSystemAType(), mt.getCodeA(), mt.getNameA()),
                                    new MapSystem(mt.getSystemB(), mt.getSystemBType(), mt.getCodeB(), mt.getNameB())
                    )).toList();
            body.put("content", mappinObjects);
            return ResponseEntity.ok(body);
        }
        String documentation_url = "";
        String path = httpServletRequest.getRequestURI(); //+ " " + httpServletRequest.getRequestURL().toString();
        ApiError apiError = new ApiError(HttpStatus.NOT_FOUND, "Resource Not Found", path, xTraceId, documentation_url);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(apiError);

            /*
            List<MappingObject> mappinObjects = new ArrayList<>();
            for (MapTable mt : mapTables) {
                MapSystem msA = new MapSystem(mt.getSystemA(), mt.getSystemAType(), mt.getCodeA(), mt.getNameA());
                MapSystem msB = new MapSystem(mt.getSystemB(), mt.getSystemBType(), mt.getCodeB(), mt.getNameB());
                MappingObject mo = new MappingObject(msA, msB);
                mo.setId(mt.getId());
                mo.setMappingType(mt.getMappingType());
                mappinObjects.add(mo);
            }
            */
    }

    /*
    @GetMapping("/page/{page}")
    public ResponseEntity<?> listar(@PathVariable Integer page) {
        Pageable pageable = PageRequest.of(page, 3, Page.empty().getSort().ascending());
        return ResponseEntity.ok(service.listar(pageable));
    }
    */
}
