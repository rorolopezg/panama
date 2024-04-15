package tech.kopernicus.data.specification.example.dataspecexample.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * Límites del producto.
 */
@Schema(description = "Límites del producto.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-08T18:01:06.696186140Z[GMT]")


public class ProductLimit   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("name")
  private String name = null;

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

  public ProductLimit id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * ID interno generado por el sistema.
   * @return id
   **/
  @Schema(example = "23423", description = "ID interno generado por el sistema.")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ProductLimit code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   **/
  @Schema(example = "LIM01", description = "")
  
    public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ProductLimit name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nombre del límite.
   * @return name
   **/
  @Schema(example = "10,000.0/50,000.0", description = "Nombre del límite.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
    return Objects.equals(this.id, productLimit.id) &&
        Objects.equals(this.code, productLimit.code) &&
        Objects.equals(this.name, productLimit.name) &&
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
    return Objects.hash(id, code, name, description, lossType, limitType, amount, currency, dimesion, _default);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductLimit {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
