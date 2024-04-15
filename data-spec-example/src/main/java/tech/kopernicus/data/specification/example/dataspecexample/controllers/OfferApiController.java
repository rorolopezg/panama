package tech.kopernicus.data.specification.example.dataspecexample.controllers;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import tech.kopernicus.data.specification.example.dataspecexample.model.dto.OfferRequestBody;
import tech.kopernicus.data.specification.example.dataspecexample.model.dto.OfferResponseBody;
import tech.kopernicus.data.specification.example.dataspecexample.model.entities.cursos.Curso;
import tech.kopernicus.data.specification.example.dataspecexample.model.entities.oracle.People;
import tech.kopernicus.data.specification.example.dataspecexample.model.entities.phones.Phone;
import tech.kopernicus.data.specification.example.dataspecexample.services.cursos.CursosService;
import tech.kopernicus.data.specification.example.dataspecexample.services.people.PeopleServiceImpl;
import tech.kopernicus.data.specification.example.dataspecexample.services.phones.PhoneService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/movilidad/")
@RequiredArgsConstructor
public class OfferApiController {
    private static final Logger log = LoggerFactory.getLogger(OfferApiController.class);

    @Autowired
    private final PhoneService phoneService;

    @Autowired
    private final CursosService cursosService;

    @Autowired
    private final PeopleServiceImpl peopleService;

    @Autowired
    private HttpServletRequest request;

    @GetMapping("phones")
    public ResponseEntity<List<Phone>> getPhones(
            @RequestParam(required = false) String phoneBrand,
            @RequestParam(required = false) String phoneName
    ) {
        return ResponseEntity.ok(phoneService.findAllPhones(phoneName, phoneBrand));
    }

    @GetMapping("people")
    public ResponseEntity<List<People>> getPeople() {
        return ResponseEntity.ok(peopleService.findAll());
    }

    @GetMapping("people2")
    public ResponseEntity<List<People>> getPeoplez2() {
        return ResponseEntity.ok(peopleService.executeProcedure());
    }

    @GetMapping("people3")
    public void getPeoplez3() throws SQLException {
        peopleService.callTestProcedure();
    }

    @GetMapping("cursos")
    public ResponseEntity<List<Curso>> getCursos( ) {
        return ResponseEntity.ok(cursosService.findAll());
    }

    @PostMapping("offers")
    public ResponseEntity<OfferResponseBody> offerAPI(
        @Parameter(in = ParameterIn.HEADER, description = "ID de Organización (por ejemplo ID de Broker)." ,required=true,schema=@Schema()) 
        @RequestHeader(value="x-organization-id", required=true) String xOrganizationId
        ,@Parameter(in = ParameterIn.HEADER, description = "Tipo de organización." ,required=true,schema=@Schema()) 
        @RequestHeader(value="x-organization-type", required=true) String xOrganizationType
        ,@Parameter(in = ParameterIn.HEADER, description = "Aplicación cliente desde donde se invocó al API. " ,required=true,schema=@Schema()) 
        @RequestHeader(value="x-client-application", required=true) String xClientApplication
        ,@Parameter(in = ParameterIn.HEADER, description = "" ,required=true,schema=@Schema()) 
        @RequestHeader(value="x-trace-id", required=true) String xTraceId
        ,@Parameter(in = ParameterIn.HEADER, description = "Username del usuario que está conectado a la aplicación cliente cuando se invoca al API. " ,required=true,schema=@Schema()) 
        @RequestHeader(value="x-user", required=true) String xUser
        ,@Parameter(in = ParameterIn.HEADER, description = "Indica el Flow de la aplicación cliente desde donde se invocó al API. " ,schema=@Schema()) 
        @RequestHeader(value="x-client-application-flow", required=false) String xClientApplicationFlow
        ,@Parameter(in = ParameterIn.DEFAULT, description = "Solicitud de generación de oferta de un seguro de Movilidad.", schema=@Schema()) 
        @io.swagger.v3.oas.annotations.parameters.RequestBody
        @Valid @RequestBody OfferRequestBody body
    ) {
            String accept = request.getHeader("Accept");
            if (accept != null && accept.contains("application/json")) {
                try {
                    return ResponseEntity.ok(new OfferResponseBody());
                } catch (Exception e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<OfferResponseBody>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
    
            return new ResponseEntity<OfferResponseBody>(HttpStatus.NOT_IMPLEMENTED);
    }
}
