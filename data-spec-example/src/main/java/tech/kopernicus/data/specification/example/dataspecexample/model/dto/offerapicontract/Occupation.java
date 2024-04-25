package tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapicontract;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * Ocupación.
 */
@Schema(description = "Ocupación.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-25T03:38:38.211297945Z[GMT]")


public class Occupation extends CatalogItem  {
  @JsonProperty("id")
  private Object occupationId = null;

  @JsonProperty("name")
  private Object occupationName = null;

  @JsonProperty("description")
  private String occupationDescription = null;

  public Occupation occupationId(Object occupationId) {
    this.occupationId = occupationId;
    return this;
  }

  /**
   * ID interno generado por el sistema.
   * @return occupationId
   **/
  @Schema(example = "1", description = "ID interno generado por el sistema.")
  
    public Object getOccupationId() {
    return occupationId;
  }

  public void setOccupationId(Object occupationId) {
    this.occupationId = occupationId;
  }

  public Occupation occupationName(Object occupationName) {
    this.occupationName = occupationName;
    return this;
  }

  /**
   * Nombre de la ocupación.
   * @return occupationName
   **/
  @Schema(example = "Arquitecto", description = "Nombre de la ocupación.")
  
    public Object getOccupationName() {
    return occupationName;
  }

  public void setOccupationName(Object occupationName) {
    this.occupationName = occupationName;
  }

  public Occupation occupationDescription(String occupationDescription) {
    this.occupationDescription = occupationDescription;
    return this;
  }

  /**
   * Descripción de la ocupación.
   * @return occupationDescription
   **/
  @Schema(description = "Descripción de la ocupación.")
  
    public String getOccupationDescription() {
    return occupationDescription;
  }

  public void setOccupationDescription(String occupationDescription) {
    this.occupationDescription = occupationDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Occupation occupation = (Occupation) o;
    return Objects.equals(this.occupationId, occupation.occupationId) &&
        Objects.equals(this.occupationName, occupation.occupationName) &&
        Objects.equals(this.occupationDescription, occupation.occupationDescription) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(occupationId, occupationName, occupationDescription, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Occupation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    occupationId: ").append(toIndentedString(occupationId)).append("\n");
    sb.append("    occupationName: ").append(toIndentedString(occupationName)).append("\n");
    sb.append("    occupationDescription: ").append(toIndentedString(occupationDescription)).append("\n");
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
