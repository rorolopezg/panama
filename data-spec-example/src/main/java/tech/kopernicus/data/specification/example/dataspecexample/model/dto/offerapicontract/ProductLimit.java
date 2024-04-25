package tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapicontract;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * Límites del producto.
 */
@Schema(description = "Límites del producto.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-25T03:38:38.211297945Z[GMT]")


public class ProductLimit   {
  @JsonProperty("productLimitId")
  private String productLimitId = null;

  @JsonProperty("productLimitCode")
  private String productLimitCode = null;

  @JsonProperty("productLimitName")
  private String productLimitName = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("lossType")
  private String lossType = null;

  @JsonProperty("limitType")
  private String limitType = null;

  @JsonProperty("amount")
  private Float amount = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("dimesion")
  private String dimesion = null;

  @JsonProperty("default")
  private Boolean _default = null;

  public ProductLimit productLimitId(String productLimitId) {
    this.productLimitId = productLimitId;
    return this;
  }

  /**
   * ID interno generado por el sistema.
   * @return productLimitId
   **/
  @Schema(example = "23423", description = "ID interno generado por el sistema.")
  
    public String getProductLimitId() {
    return productLimitId;
  }

  public void setProductLimitId(String productLimitId) {
    this.productLimitId = productLimitId;
  }

  public ProductLimit productLimitCode(String productLimitCode) {
    this.productLimitCode = productLimitCode;
    return this;
  }

  /**
   * Get productLimitCode
   * @return productLimitCode
   **/
  @Schema(example = "LIM01", description = "")
  
    public String getProductLimitCode() {
    return productLimitCode;
  }

  public void setProductLimitCode(String productLimitCode) {
    this.productLimitCode = productLimitCode;
  }

  public ProductLimit productLimitName(String productLimitName) {
    this.productLimitName = productLimitName;
    return this;
  }

  /**
   * Nombre del límite.
   * @return productLimitName
   **/
  @Schema(example = "10,000.0/50,000.0", description = "Nombre del límite.")
  
    public String getProductLimitName() {
    return productLimitName;
  }

  public void setProductLimitName(String productLimitName) {
    this.productLimitName = productLimitName;
  }

  public ProductLimit description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Descripción del límite \"amigable para el humano\".
   * @return description
   **/
  @Schema(example = "10,000.0/50,000.0", description = "Descripción del límite \"amigable para el humano\".")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductLimit lossType(String lossType) {
    this.lossType = lossType;
    return this;
  }

  /**
   * Tipo de pérdida.
   * @return lossType
   **/
  @Schema(description = "Tipo de pérdida.")
  
    public String getLossType() {
    return lossType;
  }

  public void setLossType(String lossType) {
    this.lossType = lossType;
  }

  public ProductLimit limitType(String limitType) {
    this.limitType = limitType;
    return this;
  }

  /**
   * Tipo de límite.
   * @return limitType
   **/
  @Schema(description = "Tipo de límite.")
  
    public String getLimitType() {
    return limitType;
  }

  public void setLimitType(String limitType) {
    this.limitType = limitType;
  }

  public ProductLimit amount(Float amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Monto o cantidad del límite.
   * @return amount
   **/
  @Schema(description = "Monto o cantidad del límite.")
  
    public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public ProductLimit currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Moneda.
   * @return currency
   **/
  @Schema(example = "PAB", description = "Moneda.")
  
    public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public ProductLimit dimesion(String dimesion) {
    this.dimesion = dimesion;
    return this;
  }

  /**
   * Dimensión del límite.
   * @return dimesion
   **/
  @Schema(example = "P", description = "Dimensión del límite.")
  
    public String getDimesion() {
    return dimesion;
  }

  public void setDimesion(String dimesion) {
    this.dimesion = dimesion;
  }

  public ProductLimit _default(Boolean _default) {
    this._default = _default;
    return this;
  }

  /**
   * Get _default
   * @return _default
   **/
  @Schema(example = "true", description = "")
  
    public Boolean isDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductLimit productLimit = (ProductLimit) o;
    return Objects.equals(this.productLimitId, productLimit.productLimitId) &&
        Objects.equals(this.productLimitCode, productLimit.productLimitCode) &&
        Objects.equals(this.productLimitName, productLimit.productLimitName) &&
        Objects.equals(this.description, productLimit.description) &&
        Objects.equals(this.lossType, productLimit.lossType) &&
        Objects.equals(this.limitType, productLimit.limitType) &&
        Objects.equals(this.amount, productLimit.amount) &&
        Objects.equals(this.currency, productLimit.currency) &&
        Objects.equals(this.dimesion, productLimit.dimesion) &&
        Objects.equals(this._default, productLimit._default);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productLimitId, productLimitCode, productLimitName, description, lossType, limitType, amount, currency, dimesion, _default);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductLimit {\n");
    
    sb.append("    productLimitId: ").append(toIndentedString(productLimitId)).append("\n");
    sb.append("    productLimitCode: ").append(toIndentedString(productLimitCode)).append("\n");
    sb.append("    productLimitName: ").append(toIndentedString(productLimitName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lossType: ").append(toIndentedString(lossType)).append("\n");
    sb.append("    limitType: ").append(toIndentedString(limitType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    dimesion: ").append(toIndentedString(dimesion)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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
