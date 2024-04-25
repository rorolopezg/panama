package tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapicontract;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.constraints.*;

/**
 * Provincia
 */
@Schema(description = "Provincia")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-25T03:38:38.211297945Z[GMT]")


public class State extends CatalogItem  {
  @JsonProperty("id")
  private Object stateId = null;

  @JsonProperty("name")
  private Object stateName = null;

  @JsonProperty("stateCode")
  private String stateCode = null;

  @JsonProperty("countryId")
  private String countryId = null;

  public State stateId(Object stateId) {
    this.stateId = stateId;
    return this;
  }

  /**
   * ID interno generado por el sistema.
   * @return stateId
   **/
  @Schema(example = "123", description = "ID interno generado por el sistema.")
  
    public Object getStateId() {
    return stateId;
  }

  public void setStateId(Object stateId) {
    this.stateId = stateId;
  }

  public State stateName(Object stateName) {
    this.stateName = stateName;
    return this;
  }

  /**
   * Nombre de la Provincia
   * @return stateName
   **/
  @Schema(example = "Darien", description = "Nombre de la Provincia")
  
    public Object getStateName() {
    return stateName;
  }

  public void setStateName(Object stateName) {
    this.stateName = stateName;
  }

  public State stateCode(String stateCode) {
    this.stateCode = stateCode;
    return this;
  }

  /**
   * Código de la Provincia
   * @return stateCode
   **/
  @Schema(example = "PA-8", description = "Código de la Provincia")
  
  @Size(max=8)   public String getStateCode() {
    return stateCode;
  }

  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }

  public State countryId(String countryId) {
    this.countryId = countryId;
    return this;
  }

  /**
   * ID del país.
   * @return countryId
   **/
  @Schema(example = "1", description = "ID del país.")
  
    public String getCountryId() {
    return countryId;
  }

  public void setCountryId(String countryId) {
    this.countryId = countryId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    State state = (State) o;
    return Objects.equals(this.stateId, state.stateId) &&
        Objects.equals(this.stateName, state.stateName) &&
        Objects.equals(this.stateCode, state.stateCode) &&
        Objects.equals(this.countryId, state.countryId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stateId, stateName, stateCode, countryId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class State {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    stateId: ").append(toIndentedString(stateId)).append("\n");
    sb.append("    stateName: ").append(toIndentedString(stateName)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
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
