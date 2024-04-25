package tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapicontract;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * Discount
 */
@Schema(description = "Discount")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-25T03:38:38.211297945Z[GMT]")


public class ProductDiscount   {
  @JsonProperty("productDiscountId")
  private String productDiscountId = null;

  @JsonProperty("productDiscountType")
  private String productDiscountType = null;

  @JsonProperty("discountValue")
  private Double discountValue = null;

  @JsonProperty("applied")
  private String applied = null;

  @JsonProperty("tariffDiscount")
  private String tariffDiscount = null;

  @JsonProperty("lumpSumDiscount")
  private String lumpSumDiscount = null;

  public ProductDiscount productDiscountId(String productDiscountId) {
    this.productDiscountId = productDiscountId;
    return this;
  }

  /**
   * ID interno generado por el sistema.
   * @return productDiscountId
   **/
  @Schema(example = "23423", description = "ID interno generado por el sistema.")
  
    public String getProductDiscountId() {
    return productDiscountId;
  }

  public void setProductDiscountId(String productDiscountId) {
    this.productDiscountId = productDiscountId;
  }

  public ProductDiscount productDiscountType(String productDiscountType) {
    this.productDiscountType = productDiscountType;
    return this;
  }

  /**
   * Discount type code
   * @return productDiscountType
   **/
  @Schema(description = "Discount type code")
  
    public String getProductDiscountType() {
    return productDiscountType;
  }

  public void setProductDiscountType(String productDiscountType) {
    this.productDiscountType = productDiscountType;
  }

  public ProductDiscount discountValue(Double discountValue) {
    this.discountValue = discountValue;
    return this;
  }

  /**
   * Discount value. Although it is named \"discount\" it can correct the premium in both directions - decrease and increase. The direction is defined by the discount_value sign. \"-\" is discount, \"+\" is increase 
   * @return discountValue
   **/
  @Schema(description = "Discount value. Although it is named \"discount\" it can correct the premium in both directions - decrease and increase. The direction is defined by the discount_value sign. \"-\" is discount, \"+\" is increase ")
  
    public Double getDiscountValue() {
    return discountValue;
  }

  public void setDiscountValue(Double discountValue) {
    this.discountValue = discountValue;
  }

  public ProductDiscount applied(String applied) {
    this.applied = applied;
    return this;
  }

  /**
   * Flag which defines whether the discount should be applied automatically or explicitly confirmed by the user 
   * @return applied
   **/
  @Schema(description = "Flag which defines whether the discount should be applied automatically or explicitly confirmed by the user ")
  
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
   * Tariff discount with possible values 0|1; 1 - means apply the original discount values from the configuration, 0 - means apply and use the manually overrided discounts 
   * @return tariffDiscount
   **/
  @Schema(description = "Tariff discount with possible values 0|1; 1 - means apply the original discount values from the configuration, 0 - means apply and use the manually overrided discounts ")
  
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
    return Objects.equals(this.productDiscountId, productDiscount.productDiscountId) &&
        Objects.equals(this.productDiscountType, productDiscount.productDiscountType) &&
        Objects.equals(this.discountValue, productDiscount.discountValue) &&
        Objects.equals(this.applied, productDiscount.applied) &&
        Objects.equals(this.tariffDiscount, productDiscount.tariffDiscount) &&
        Objects.equals(this.lumpSumDiscount, productDiscount.lumpSumDiscount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productDiscountId, productDiscountType, discountValue, applied, tariffDiscount, lumpSumDiscount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDiscount {\n");
    
    sb.append("    productDiscountId: ").append(toIndentedString(productDiscountId)).append("\n");
    sb.append("    productDiscountType: ").append(toIndentedString(productDiscountType)).append("\n");
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
