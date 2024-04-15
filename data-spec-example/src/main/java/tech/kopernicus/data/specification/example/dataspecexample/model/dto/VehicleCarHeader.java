package tech.kopernicus.data.specification.example.dataspecexample.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * VehicleCarHeader
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-08T18:01:06.696186140Z[GMT]")


public class VehicleCarHeader   {
  @JsonProperty("vehicleId")
  private Long vehicleId = null;

  @JsonProperty("vehicleType")
  private VehicleType vehicleType = null;

  @JsonProperty("colour")
  private String colour = null;

  @JsonProperty("productionYear")
  private Integer productionYear = null;

  @JsonProperty("regNo")
  private String regNo = null;

  public VehicleCarHeader vehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

  /**
   * ID interno generado por el sistema. En INSIS 11.3 el atributo equivalente es \"objectId\".  
   * @return vehicleId
   **/
  @Schema(example = "889787", description = "ID interno generado por el sistema. En INSIS 11.3 el atributo equivalente es \"objectId\".  ")
  
    public Long getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }

  public VehicleCarHeader vehicleType(VehicleType vehicleType) {
    this.vehicleType = vehicleType;
    return this;
  }

  /**
   * Get vehicleType
   * @return vehicleType
   **/
  @Schema(description = "")
  
    @Valid
    public VehicleType getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(VehicleType vehicleType) {
    this.vehicleType = vehicleType;
  }

  public VehicleCarHeader colour(String colour) {
    this.colour = colour;
    return this;
  }

  /**
   * Car colour.<br> In INSIS, possible values: Id from H_COLOURS. 
   * @return colour
   **/
  @Schema(example = "ROJO", description = "Car colour.<br> In INSIS, possible values: Id from H_COLOURS. ")
  
    public String getColour() {
    return colour;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  public VehicleCarHeader productionYear(Integer productionYear) {
    this.productionYear = productionYear;
    return this;
  }

  /**
   * Año de producción en 4 dígitos.
   * minimum: 1000
   * maximum: 9999
   * @return productionYear
   **/
  @Schema(example = "2023", description = "Año de producción en 4 dígitos.")
  
  @Min(1000) @Max(9999)   public Integer getProductionYear() {
    return productionYear;
  }

  public void setProductionYear(Integer productionYear) {
    this.productionYear = productionYear;
  }

  public VehicleCarHeader regNo(String regNo) {
    this.regNo = regNo;
    return this;
  }

  /**
   * Registration (plate) number of the car.
   * @return regNo
   **/
  @Schema(example = "TYRTRD", description = "Registration (plate) number of the car.")
  
    public String getRegNo() {
    return regNo;
  }

  public void setRegNo(String regNo) {
    this.regNo = regNo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleCarHeader vehicleCarHeader = (VehicleCarHeader) o;
    return Objects.equals(this.vehicleId, vehicleCarHeader.vehicleId) &&
        Objects.equals(this.vehicleType, vehicleCarHeader.vehicleType) &&
        Objects.equals(this.colour, vehicleCarHeader.colour) &&
        Objects.equals(this.productionYear, vehicleCarHeader.productionYear) &&
        Objects.equals(this.regNo, vehicleCarHeader.regNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicleId, vehicleType, colour, productionYear, regNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleCarHeader {\n");
    
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
    sb.append("    vehicleType: ").append(toIndentedString(vehicleType)).append("\n");
    sb.append("    colour: ").append(toIndentedString(colour)).append("\n");
    sb.append("    productionYear: ").append(toIndentedString(productionYear)).append("\n");
    sb.append("    regNo: ").append(toIndentedString(regNo)).append("\n");
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
