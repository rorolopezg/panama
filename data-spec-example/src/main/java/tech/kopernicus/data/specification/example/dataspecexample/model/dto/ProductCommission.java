package tech.kopernicus.data.specification.example.dataspecexample.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * Comisión configurada a nivel del producto.
 */
@Schema(description = "Comisión configurada a nivel del producto.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-08T18:01:06.696186140Z[GMT]")


public class ProductCommission   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("dimension")
  private String dimension = null;

  @JsonProperty("holdCommission")
  private String holdCommission = null;

  @JsonProperty("value")
  private Float value = null;

  @JsonProperty("onInstall")
  private String onInstall = null;

  @JsonProperty("registrationDate")
  private LocalDate registrationDate = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("validFrom")
  private LocalDate validFrom = null;

  @JsonProperty("validTo")
  private LocalDate validTo = null;

  public ProductCommission id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * ID interno generado por el sistema.
   * @return id
   **/
  @Schema(example = "234234566", description = "ID interno generado por el sistema.")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ProductCommission currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Moneda.
   * @return currency
   **/
  @Schema(example = "USD", description = "Moneda.")
  
  @Size(max=16)   public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public ProductCommission dimension(String dimension) {
    this.dimension = dimension;
    return this;
  }

  /**
   * Commission dimension.
   * @return dimension
   **/
  @Schema(description = "Commission dimension.")
  
  @Size(max=8)   public String getDimension() {
    return dimension;
  }

  public void setDimension(String dimension) {
    this.dimension = dimension;
  }

  public ProductCommission holdCommission(String holdCommission) {
    this.holdCommission = holdCommission;
    return this;
  }

  /**
   * .
   * @return holdCommission
   **/
  @Schema(description = ".")
  
  @Size(max=8)   public String getHoldCommission() {
    return holdCommission;
  }

  public void setHoldCommission(String holdCommission) {
    this.holdCommission = holdCommission;
  }

  public ProductCommission value(Float value) {
    this.value = value;
    return this;
  }

  /**
   * Commission value.
   * @return value
   **/
  @Schema(example = "100", description = "Commission value.")
  
    public Float getValue() {
    return value;
  }

  public void setValue(Float value) {
    this.value = value;
  }

  public ProductCommission onInstall(String onInstall) {
    this.onInstall = onInstall;
    return this;
  }

  /**
   * .
   * @return onInstall
   **/
  @Schema(description = ".")
  
  @Size(max=8)   public String getOnInstall() {
    return onInstall;
  }

  public void setOnInstall(String onInstall) {
    this.onInstall = onInstall;
  }

  public ProductCommission registrationDate(LocalDate registrationDate) {
    this.registrationDate = registrationDate;
    return this;
  }

  /**
   * .
   * @return registrationDate
   **/
  @Schema(example = "Sun May 20 00:00:00 GMT 2001", description = ".")
  
    @Valid
    public LocalDate getRegistrationDate() {
    return registrationDate;
  }

  public void setRegistrationDate(LocalDate registrationDate) {
    this.registrationDate = registrationDate;
  }

  public ProductCommission type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Commission type.
   * @return type
   **/
  @Schema(description = "Commission type.")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ProductCommission validFrom(LocalDate validFrom) {
    this.validFrom = validFrom;
    return this;
  }

  /**
   * Date after which the commission is valid. Insis sets policy/annex insurance begin date in ValidFrom. 
   * @return validFrom
   **/
  @Schema(example = "Mon May 21 00:00:00 GMT 2001", description = "Date after which the commission is valid. Insis sets policy/annex insurance begin date in ValidFrom. ")
  
    @Valid
    public LocalDate getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(LocalDate validFrom) {
    this.validFrom = validFrom;
  }

  public ProductCommission validTo(LocalDate validTo) {
    this.validTo = validTo;
    return this;
  }

  /**
   * Date untill the commission is valid. Insis calculates ValidTo. 
   * @return validTo
   **/
  @Schema(example = "Thu Jun 21 00:00:00 GMT 2001", description = "Date untill the commission is valid. Insis calculates ValidTo. ")
  
    @Valid
    public LocalDate getValidTo() {
    return validTo;
  }

  public void setValidTo(LocalDate validTo) {
    this.validTo = validTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductCommission productCommission = (ProductCommission) o;
    return Objects.equals(this.id, productCommission.id) &&
        Objects.equals(this.currency, productCommission.currency) &&
        Objects.equals(this.dimension, productCommission.dimension) &&
        Objects.equals(this.holdCommission, productCommission.holdCommission) &&
        Objects.equals(this.value, productCommission.value) &&
        Objects.equals(this.onInstall, productCommission.onInstall) &&
        Objects.equals(this.registrationDate, productCommission.registrationDate) &&
        Objects.equals(this.type, productCommission.type) &&
        Objects.equals(this.validFrom, productCommission.validFrom) &&
        Objects.equals(this.validTo, productCommission.validTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, currency, dimension, holdCommission, value, onInstall, registrationDate, type, validFrom, validTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductCommission {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    holdCommission: ").append(toIndentedString(holdCommission)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    onInstall: ").append(toIndentedString(onInstall)).append("\n");
    sb.append("    registrationDate: ").append(toIndentedString(registrationDate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
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
