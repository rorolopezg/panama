package tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapicontract;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * Tipo de vehículo.. 
 */
@Schema(description = "Tipo de vehículo.. ")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-25T03:38:38.211297945Z[GMT]")


public class VehicleType   {
  @JsonProperty("vehicleTypeId")
  private String vehicleTypeId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  public VehicleType vehicleTypeId(String vehicleTypeId) {
    this.vehicleTypeId = vehicleTypeId;
    return this;
  }

  /**
   * ID interno generado por el sistema. 
   * @return vehicleTypeId
   **/
  @Schema(example = "889787", description = "ID interno generado por el sistema. ")
  
    public String getVehicleTypeId() {
    return vehicleTypeId;
  }

  public void setVehicleTypeId(String vehicleTypeId) {
    this.vehicleTypeId = vehicleTypeId;
  }

  public VehicleType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nombre del tiupo de vehículo.
   * @return name
   **/
  @Schema(example = "Car", description = "Nombre del tiupo de vehículo.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VehicleType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Descripción del tipo de vehículo.
   * @return description
   **/
  @Schema(description = "Descripción del tipo de vehículo.")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleType vehicleType = (VehicleType) o;
    return Objects.equals(this.vehicleTypeId, vehicleType.vehicleTypeId) &&
        Objects.equals(this.name, vehicleType.name) &&
        Objects.equals(this.description, vehicleType.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicleTypeId, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleType {\n");
    
    sb.append("    vehicleTypeId: ").append(toIndentedString(vehicleTypeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
