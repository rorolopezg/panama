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
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapi.ApiHeadres;
import tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapi.OfferApiOut;
import tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapi.OfferApiParamIn;
import tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapi.Ropciones;
import tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapicontract.OfferOption;
import tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapicontract.OfferRequestBody;
import tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapicontract.OfferResponseBody;
import tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapicontract.ProductCoverage;
import tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapicontract.ProductDiscount;
import tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapicontract.ProductIndemnity;
import tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapicontract.ProductLimit;
import tech.kopernicus.data.specification.example.dataspecexample.model.entities.cursos.Curso;
import tech.kopernicus.data.specification.example.dataspecexample.model.entities.oracle.CustSiseRamo;
import tech.kopernicus.data.specification.example.dataspecexample.model.entities.oracle.People;
import tech.kopernicus.data.specification.example.dataspecexample.model.entities.phones.Phone;
import tech.kopernicus.data.specification.example.dataspecexample.model.errors.ApiError;
import tech.kopernicus.data.specification.example.dataspecexample.services.cursos.CursosService;
import tech.kopernicus.data.specification.example.dataspecexample.services.people.SegurosServiceImpl;
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
    private final SegurosServiceImpl segurosService;

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
        return ResponseEntity.ok(segurosService.findAll());
    }

    @GetMapping("people2")
    public ResponseEntity<List<People>> getPeoplez2() {
        return ResponseEntity.ok(segurosService.executeProcedure());
    }

    @GetMapping("people3")
    public void getPeoplez3() throws SQLException {
        segurosService.callTestProcedure();
    }

    @GetMapping("people4")
    public List<People> getPeople4() throws SQLException {
        return segurosService.findByProcedure("uno");
    }

    @GetMapping("ramos")
    public List<CustSiseRamo> getRamos(Integer ramo) throws SQLException {
        return segurosService.getRamos(ramo);
    }

    @GetMapping("cursos")
    public ResponseEntity<List<Curso>> getCursos( ) {
        return ResponseEntity.ok(cursosService.findAll());
    }

    @PostMapping("offers")
    public ResponseEntity<?> offerAPI(
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
        log.info("Iniciando offerAPI");
        OfferApiParamIn paramIn = new OfferApiParamIn();
        OfferResponseBody response = new OfferResponseBody();
        @SuppressWarnings("unused")
        OfferOption offerOption = null;
        String accept = request.getHeader("Accept");

        if (accept != null && accept.contains("application/json")) {
            try {
                paramIn.setHeaders(new ApiHeadres(xOrganizationId, xOrganizationType, xClientApplication, xTraceId, xUser, xClientApplicationFlow));
                paramIn.setBody(body);
                OfferApiOut apiOut = segurosService.getOffers(paramIn);

                if ("N".equalsIgnoreCase(apiOut.getOk()))
                    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(createBussinesError(xTraceId, null, "Asegurado", "Vehículo", "Plan", "Ramo"));

                offerOption = new OfferOption();
                List <OfferOption> aList = apiOut.getOpcionA().stream().map(r -> buildOfferOption("A", r)).toList();
                List <OfferOption> bList = apiOut.getOpcionA().stream().map(r -> buildOfferOption("B", r)).toList();
                List <OfferOption> cList = apiOut.getOpcionA().stream().map(r -> buildOfferOption("C", r)).toList();

                response.addAllOptionsItem(aList);
                response.addAllOptionsItem(bList);
                response.addAllOptionsItem(cList);
                return ResponseEntity.ok(response);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<OfferResponseBody>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    private OfferOption buildOfferOption(String optionName, Ropciones r) {
        OfferOption o = new OfferOption();
        o.setName(optionName);
        ProductCoverage coverage = new ProductCoverage();
        coverage.setProductCoverageCode(r.getCobertura());
        ProductLimit limit = new ProductLimit();
        limit.productLimitName(r.getLimite());
        limit.setDefault(r.getDefaultOption());
        coverage.addLimitsItem(limit);
        ProductIndemnity indemnity = new ProductIndemnity();
        indemnity.setFranchiseValue(r.getDeducible());
        coverage.addFranchisesItem(indemnity);
        coverage.setPremium(r.getPrima());
        ProductDiscount discount = new ProductDiscount();
        discount.setDiscountValue(r.getPctDescuento());
        discount.setProductDiscountType("%");
        coverage.addDiscountsItem(discount);
        discount = new ProductDiscount();
        discount.setDiscountValue(r.getDescuento());
        discount.setProductDiscountType("AMOUNT");
        coverage.addDiscountsItem(discount);
        coverage.setTotalPremium(r.getTotal());
        coverage.setMandatory(!r.getOpcional());
        o.addCoveragesItem(coverage);
        return o;
    }

    @NotNull
    private ApiError createResourceNotFoundError(String xTraceId, String documentation_url, String ... parameters) {
        String path = request.getRequestURI();
        StringBuilder suggestion = new StringBuilder("Intente utilizando otros valores en los parámetros: ");
        for (String parameter : parameters)
            suggestion.append("'").append(parameter).append("',");

        suggestion = new StringBuilder(suggestion.substring(0, suggestion.length() - 1));

        ApiError apiError = new ApiError(
                HttpStatus.NOT_FOUND,
                "Resource Not Found",
                path,
                xTraceId,
                documentation_url
        );
        apiError.setSuggestion(suggestion.toString());
        return apiError;
    }

    @NotNull
    private ApiError createBussinesError(String xTraceId, String documentation_url, String ... parameters) {
        String path = request.getRequestURI();
        ApiError apiError = new ApiError(
                HttpStatus.BAD_REQUEST,
                "Se ha encontrado un error al generar la oferta de seguros.",
                path,
                xTraceId,
                documentation_url
        );
        StringBuilder suggestion = new StringBuilder("Intente utilizando otros valores en los parámetros: ");
        for (String parameter : parameters)
            suggestion.append("'").append(parameter).append("',");

        suggestion = new StringBuilder(suggestion.substring(0, suggestion.length() - 1));
        apiError.setSuggestion(suggestion.toString());
        return apiError;
    }
}
