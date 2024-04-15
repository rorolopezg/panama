package tech.kopernicus.data.specification.example.dataspecexample.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.constraints.*;

/**
 * Corregimiento
 */
@Schema(description = "Corregimiento")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-08T18:01:06.696186140Z[GMT]")


public class City extends CatalogItem  {
  @JsonProperty("id")
  private Object cityId = null;

  @JsonProperty("name")
  private Object cityName = null;

  @JsonProperty("cityCode")
  private String cityCode = null;

  @JsonProperty("regionId")
  private Long regionId = null;

  public City cityId(Object cityId) {
    this.cityId = cityId;
    return this;
  }

  /**
   * ID interno generado por el sistema.
   * @return cityId
   **/
  @Schema(example = "4", description = "ID interno generado por el sistema.")
  
    public Object getCityId() {
    return cityId;
  }

  public void setCityId(Object cityId) {
    this.cityId = cityId;
  }

  public City cityName(Object cityName) {
    this.cityName = cityName;
    return this;
  }

  /**
   * Nombre del Corregimiento
   * @return cityName
   **/
  @Schema(example = "La Palma", description = "Nombre del Corregimiento")
  
    public Object getCityName() {
    return cityName;
  }

  public void setCityName(Object cityName) {
    this.cityName = cityName;
  }

  public City cityCode(String cityCode) {
    this.cityCode = cityCode;
    return this;
  }

  /**
   * Código del Corregimiento
   * @return cityCode
   **/
  @Schema(example = "7196", description = "Código del Corregimiento")
  
  @Size(max=8)   public String getCityCode() {
    return cityCode;
  }

  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }

  public City regionId(Long regionId) {
    this.regionId = regionId;
    return this;
  }

  /**
   * ID del distrito (Region).
   * @return regionId
   **/
  @Schema(example = "1", description = "ID del distrito (Region).")
  
    public Long getRegionId() {
    return regionId;
  }

  public void setRegionId(Long regionId) {
    this.regionId = regionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    City city = (City) o;
    return Objects.equals(this.cityId, city.cityId) &&
        Objects.equals(this.cityName, city.cityName) &&
        Objects.equals(this.cityCode, city.cityCode) &&
        Objects.equals(this.regionId, city.regionId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cityId, cityName, cityCode, regionId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class City {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    cityId: ").append(toIndentedString(cityId)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
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
