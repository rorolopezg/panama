package tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapicontract;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * Estructura que contiene las ofertas de seguro de Movilidad.
 */
@Schema(description = "Estructura que contiene las ofertas de seguro de Movilidad.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-25T03:38:38.211297945Z[GMT]")


public class OfferResponseBody   {
  @JsonProperty("offerId")
  private Long offerId = null;

  @JsonProperty("options")
  @Valid
  private List<OfferOption> options = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("message")
  private String message = null;

  public OfferResponseBody offerId(Long offerId) {
    this.offerId = offerId;
    return this;
  }

  /**
   * ID interno de la Oferta, generado por el sistema.
   * @return offerId
   **/
  @Schema(example = "30", description = "ID interno de la Oferta, generado por el sistema.")
  
    public Long getOfferId() {
    return offerId;
  }

  public void setOfferId(Long offerId) {
    this.offerId = offerId;
  }

  public OfferResponseBody options(List<OfferOption> options) {
    this.options = options;
    return this;
  }

  public OfferResponseBody addOptionsItem(OfferOption optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<OfferOption>();
    }
    this.options.add(optionsItem);
    return this;
  }

  public OfferResponseBody addAllOptionsItem(List<OfferOption> optionList) {
    if (this.options == null) {
      this.options = new ArrayList<OfferOption>();
    }
    this.options.addAll(optionList);
    return this;
  }

  /**
   * Get options
   * @return options
   **/
  @Schema(description = "")
      @Valid
    public List<OfferOption> getOptions() {
    return options;
  }

  public void setOptions(List<OfferOption> options) {
    this.options = options;
  }

  public OfferResponseBody status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Resultado de la operación.
   * @return status
   **/
  @Schema(example = "OK", description = "Resultado de la operación.")
  
    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public OfferResponseBody message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Mensaje devuelto por el Back-End.
   * @return message
   **/
  @Schema(example = "Operación exitosa.", description = "Mensaje devuelto por el Back-End.")
  
    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferResponseBody offerResponseBody = (OfferResponseBody) o;
    return Objects.equals(this.offerId, offerResponseBody.offerId) &&
        Objects.equals(this.options, offerResponseBody.options) &&
        Objects.equals(this.status, offerResponseBody.status) &&
        Objects.equals(this.message, offerResponseBody.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, options, status, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferResponseBody {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
