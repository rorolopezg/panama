package tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapicontract;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.constraints.*;

/**
 * País
 */
@Schema(description = "País")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-25T03:38:38.211297945Z[GMT]")


public class Country extends CatalogItem  {
  @JsonProperty("id")
  private Object countryId = null;

  @JsonProperty("name")
  private Object countryName = null;

  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("phoneCode")
  private String phoneCode = null;

  public Country countryId(Object countryId) {
    this.countryId = countryId;
    return this;
  }

  /**
   * ID interno generado por el sistema.
   * @return countryId
   **/
  @Schema(example = "1", description = "ID interno generado por el sistema.")
  
    public Object getCountryId() {
    return countryId;
  }

  public void setCountryId(Object countryId) {
    this.countryId = countryId;
  }

  public Country countryName(Object countryName) {
    this.countryName = countryName;
    return this;
  }

  /**
   * Nombre del país
   * @return countryName
   **/
  @Schema(example = "Panamá", description = "Nombre del país")
  
    public Object getCountryName() {
    return countryName;
  }

  public void setCountryName(Object countryName) {
    this.countryName = countryName;
  }

  public Country countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Código del país
   * @return countryCode
   **/
  @Schema(example = "PA", description = "Código del país")
  
  @Size(max=8)   public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Country phoneCode(String phoneCode) {
    this.phoneCode = phoneCode;
    return this;
  }

  /**
   * Prefijo telefónico del país
   * @return phoneCode
   **/
  @Schema(example = "+507", description = "Prefijo telefónico del país")
  
  @Size(max=8)   public String getPhoneCode() {
    return phoneCode;
  }

  public void setPhoneCode(String phoneCode) {
    this.phoneCode = phoneCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Country country = (Country) o;
    return Objects.equals(this.countryId, country.countryId) &&
        Objects.equals(this.countryName, country.countryName) &&
        Objects.equals(this.countryCode, country.countryCode) &&
        Objects.equals(this.phoneCode, country.phoneCode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryId, countryName, countryCode, phoneCode, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Country {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    phoneCode: ").append(toIndentedString(phoneCode)).append("\n");
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
