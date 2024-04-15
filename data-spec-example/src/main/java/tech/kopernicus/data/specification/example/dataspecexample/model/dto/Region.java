package tech.kopernicus.data.specification.example.dataspecexample.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * Distrito
 */
@Schema(description = "Distrito")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-08T18:01:06.696186140Z[GMT]")


public class Region extends CatalogItem  {
  @JsonProperty("id")
  private Object regionId = null;

  @JsonProperty("name")
  private Object regionName = null;

  @JsonProperty("regionCode")
  private String regionCode = null;

  @JsonProperty("stateId")
  private Long stateId = null;

  public Region regionId(Object regionId) {
    this.regionId = regionId;
    return this;
  }

  /**
   * ID interno generado por el sistema.
   * @return regionId
   **/
  @Schema(example = "1", description = "ID interno generado por el sistema.")
  
    public Object getRegionId() {
    return regionId;
  }

  public void setRegionId(Object regionId) {
    this.regionId = regionId;
  }

  public Region regionName(Object regionName) {
    this.regionName = regionName;
    return this;
  }

  /**
   * Nombre del Distrito
   * @return regionName
   **/
  @Schema(example = "Chepigana", description = "Nombre del Distrito")
  
    public Object getRegionName() {
    return regionName;
  }

  public void setRegionName(Object regionName) {
    this.regionName = regionName;
  }

  public Region regionCode(String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

  /**
   * Código del Distrito
   * @return regionCode
   **/
  @Schema(example = "7196", description = "Código del Distrito")
  
    public String getRegionCode() {
    return regionCode;
  }

  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }

  public Region stateId(Long stateId) {
    this.stateId = stateId;
    return this;
  }

  /**
   * ID de la Provincia (State).
   * @return stateId
   **/
  @Schema(example = "1", description = "ID de la Provincia (State).")
  
    public Long getStateId() {
    return stateId;
  }

  public void setStateId(Long stateId) {
    this.stateId = stateId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Region region = (Region) o;
    return Objects.equals(this.regionId, region.regionId) &&
        Objects.equals(this.regionName, region.regionName) &&
        Objects.equals(this.regionCode, region.regionCode) &&
        Objects.equals(this.stateId, region.stateId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regionId, regionName, regionCode, stateId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Region {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
    sb.append("    stateId: ").append(toIndentedString(stateId)).append("\n");
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
