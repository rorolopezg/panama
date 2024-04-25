package tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapicontract;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;

/**
 * Barrio
 */
@Schema(description = "Barrio")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-25T03:38:38.211297945Z[GMT]")


public class Neighborhood extends CatalogItem  {
  @JsonProperty("id")
  private Object neighborhoodId = null;

  @JsonProperty("name")
  private Object neighborhoodName = null;

  @JsonProperty("cityCode")
  private String cityCode = null;

  @JsonProperty("cityId")
  private Long cityId = null;

  public Neighborhood neighborhoodId(Object neighborhoodId) {
    this.neighborhoodId = neighborhoodId;
    return this;
  }

  /**
   * ID interno generado por el sistema.
   * @return neighborhoodId
   **/
  @Schema(example = "4", description = "ID interno generado por el sistema.")
  
    public Object getNeighborhoodId() {
    return neighborhoodId;
  }

  public void setNeighborhoodId(Object neighborhoodId) {
    this.neighborhoodId = neighborhoodId;
  }

  public Neighborhood neighborhoodName(Object neighborhoodName) {
    this.neighborhoodName = neighborhoodName;
    return this;
  }

  /**
   * Nombre del barrio
   * @return neighborhoodName
   **/
  @Schema(example = "La Palma", description = "Nombre del barrio")
  
    public Object getNeighborhoodName() {
    return neighborhoodName;
  }

  public void setNeighborhoodName(Object neighborhoodName) {
    this.neighborhoodName = neighborhoodName;
  }

  public Neighborhood cityCode(String cityCode) {
    this.cityCode = cityCode;
    return this;
  }

  /**
   * Código del barrio
   * @return cityCode
   **/
  @Schema(example = "7196", description = "Código del barrio")
  
  @Size(max=8)   public String getCityCode() {
    return cityCode;
  }

  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }

  public Neighborhood cityId(Long cityId) {
    this.cityId = cityId;
    return this;
  }

  /**
   * ID del corregimiento (City).
   * @return cityId
   **/
  @Schema(example = "1", description = "ID del corregimiento (City).")
  
    public Long getCityId() {
    return cityId;
  }

  public void setCityId(Long cityId) {
    this.cityId = cityId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Neighborhood neighborhood = (Neighborhood) o;
    return Objects.equals(this.neighborhoodId, neighborhood.neighborhoodId) &&
        Objects.equals(this.neighborhoodName, neighborhood.neighborhoodName) &&
        Objects.equals(this.cityCode, neighborhood.cityCode) &&
        Objects.equals(this.cityId, neighborhood.cityId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(neighborhoodId, neighborhoodName, cityCode, cityId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Neighborhood {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    neighborhoodId: ").append(toIndentedString(neighborhoodId)).append("\n");
    sb.append("    neighborhoodName: ").append(toIndentedString(neighborhoodName)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    cityId: ").append(toIndentedString(cityId)).append("\n");
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
