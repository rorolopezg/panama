package tech.kopernicus.data.specification.example.dataspecexample.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * Estructura que contiene la solicitud de ofertas de seguro de Movilidad.
 */
@Schema(description = "Estructura que contiene la solicitud de ofertas de seguro de Movilidad.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-08T18:01:06.696186140Z[GMT]")


public class OfferRequestBody   {
  @JsonProperty("productId")
  private String productId = null;

  @JsonProperty("ramo")
  private String ramo = null;

  @JsonProperty("subramo")
  private String subramo = null;

  @JsonProperty("car")
  private VehicleCar car = null;

  @JsonProperty("insured")
  private Client insured = null;

  @JsonProperty("agent")
  private Agent agent = null;

  public OfferRequestBody productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * ID del producto o plan de Movilidad.
   * @return productId
   **/
  @Schema(example = "6544", description = "ID del producto o plan de Movilidad.")
  
    public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public OfferRequestBody ramo(String ramo) {
    this.ramo = ramo;
    return this;
  }

  /**
   * Ramo.
   * @return ramo
   **/
  @Schema(example = "XXX", description = "Ramo.")
  
    public String getRamo() {
    return ramo;
  }

  public void setRamo(String ramo) {
    this.ramo = ramo;
  }

  public OfferRequestBody subramo(String subramo) {
    this.subramo = subramo;
    return this;
  }

  /**
   * Subramo.
   * @return subramo
   **/
  @Schema(example = "YYY", description = "Subramo.")
  
    public String getSubramo() {
    return subramo;
  }

  public void setSubramo(String subramo) {
    this.subramo = subramo;
  }

  public OfferRequestBody car(VehicleCar car) {
    this.car = car;
    return this;
  }

  /**
   * Get car
   * @return car
   **/
  @Schema(description = "")
  
    @Valid
    public VehicleCar getCar() {
    return car;
  }

  public void setCar(VehicleCar car) {
    this.car = car;
  }

  public OfferRequestBody insured(Client insured) {
    this.insured = insured;
    return this;
  }

  /**
   * Get insured
   * @return insured
   **/
  @Schema(description = "")
  
    @Valid
    public Client getInsured() {
    return insured;
  }

  public void setInsured(Client insured) {
    this.insured = insured;
  }

  public OfferRequestBody agent(Agent agent) {
    this.agent = agent;
    return this;
  }

  /**
   * Get agent
   * @return agent
   **/
  @Schema(description = "")
  
    @Valid
    public Agent getAgent() {
    return agent;
  }

  public void setAgent(Agent agent) {
    this.agent = agent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferRequestBody offerRequestBody = (OfferRequestBody) o;
    return Objects.equals(this.productId, offerRequestBody.productId) &&
        Objects.equals(this.ramo, offerRequestBody.ramo) &&
        Objects.equals(this.subramo, offerRequestBody.subramo) &&
        Objects.equals(this.car, offerRequestBody.car) &&
        Objects.equals(this.insured, offerRequestBody.insured) &&
        Objects.equals(this.agent, offerRequestBody.agent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, ramo, subramo, car, insured, agent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferRequestBody {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    ramo: ").append(toIndentedString(ramo)).append("\n");
    sb.append("    subramo: ").append(toIndentedString(subramo)).append("\n");
    sb.append("    car: ").append(toIndentedString(car)).append("\n");
    sb.append("    insured: ").append(toIndentedString(insured)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
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
