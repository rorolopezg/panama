package tech.kopernicus.data.specification.example.dataspecexample.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * Discount
 */
@Schema(description = "Discount")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-08T18:01:06.696186140Z[GMT]")


public class ProductDiscount   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("discountType")
  private String discountType = null;

  @JsonProperty("discountValue")
  private Integer discountValue = null;

  @JsonProperty("applied")
  private String applied = null;

  @JsonProperty("tariffDiscount")
  private String tariffDiscount = null;

  @JsonProperty("lumpSumDiscount")
  private String lumpSumDiscount = null;

  public ProductDiscount id(Long id) {
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

  public ProductDiscount discountType(String discountType) {
    this.discountType = discountType;
    return this;
  }

  /**
   * Get discountType
   * @return discountType
   **/
  @Schema(description = "")
  
    public String getDiscountType() {
    return discountType;
  }

  public void setDiscountType(String discountType) {
    this.discountType = discountType;
  }

  public ProductDiscount discountValue(Integer discountValue) {
    this.discountValue = discountValue;
    return this;
  }

  /**
   * Get discountValue
   * @return discountValue
   **/
  @Schema(description = "")
  
    public Integer getDiscountValue() {
    return discountValue;
  }

  public void setDiscountValue(Integer discountValue) {
    this.discountValue = discountValue;
  }

  public ProductDiscount applied(String applied) {
    this.applied = applied;
    return this;
  }

  /**
   * Get applied
   * @return applied
   **/
  @Schema(description = "")
  
    public String getApplied() {
    return applied;
  }

  public void setApplied(String applied) {
    this.applied = applied;
  }

  public ProductDiscount tariffDiscount(String tariffDiscount) {
    this.tariffDiscount = tariffDiscount;
    return this;
  }

  /**
   * Get tariffDiscount
   * @return tariffDiscount
   **/
  @Schema(description = "")
  
    public String getTariffDiscount() {
    return tariffDiscount;
  }

  public void setTariffDiscount(String tariffDiscount) {
    this.tariffDiscount = tariffDiscount;
  }

  public ProductDiscount lumpSumDiscount(String lumpSumDiscount) {
    this.lumpSumDiscount = lumpSumDiscount;
    return this;
  }

  /**
   * Lump sum for discount in non-life
   * @return lumpSumDiscount
   **/
  @Schema(description = "Lump sum for discount in non-life")
  
    public String getLumpSumDiscount() {
    return lumpSumDiscount;
  }

  public void setLumpSumDiscount(String lumpSumDiscount) {
    this.lumpSumDiscount = lumpSumDiscount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDiscount productDiscount = (ProductDiscount) o;
    return Objects.equals(this.id, productDiscount.id) &&
        Objects.equals(this.discountType, productDiscount.discountType) &&
        Objects.equals(this.discountValue, productDiscount.discountValue) &&
        Objects.equals(this.applied, productDiscount.applied) &&
        Objects.equals(this.tariffDiscount, productDiscount.tariffDiscount) &&
        Objects.equals(this.lumpSumDiscount, productDiscount.lumpSumDiscount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, discountType, discountValue, applied, tariffDiscount, lumpSumDiscount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDiscount {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
    sb.append("    discountValue: ").append(toIndentedString(discountValue)).append("\n");
    sb.append("    applied: ").append(toIndentedString(applied)).append("\n");
    sb.append("    tariffDiscount: ").append(toIndentedString(tariffDiscount)).append("\n");
    sb.append("    lumpSumDiscount: ").append(toIndentedString(lumpSumDiscount)).append("\n");
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
