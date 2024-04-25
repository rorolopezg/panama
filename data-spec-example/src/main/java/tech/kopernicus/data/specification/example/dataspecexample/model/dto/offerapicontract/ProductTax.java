package tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapicontract;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * Tax
 */
@Schema(description = "Tax")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-25T03:38:38.211297945Z[GMT]")


public class ProductTax   {
  @JsonProperty("productTaxId")
  private String productTaxId = null;

  @JsonProperty("applied")
  private Boolean applied = null;

  @JsonProperty("calcRule")
  private String calcRule = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("efectiveFrom")
  private OffsetDateTime efectiveFrom = null;

  @JsonProperty("efectiveTo")
  private OffsetDateTime efectiveTo = null;

  @JsonProperty("fractRule")
  private String fractRule = null;

  @JsonProperty("included")
  private Boolean included = null;

  @JsonProperty("manualTaxRate")
  private Boolean manualTaxRate = null;

  @JsonProperty("orderNo")
  private Integer orderNo = null;

  @JsonProperty("taxAmount")
  private Float taxAmount = null;

  @JsonProperty("taxRate")
  private Float taxRate = null;

  @JsonProperty("taxType")
  private String taxType = null;

  @JsonProperty("whRule")
  private Boolean whRule = null;

  public ProductTax productTaxId(String productTaxId) {
    this.productTaxId = productTaxId;
    return this;
  }

  /**
   * ID interno generado por el sistema.
   * @return productTaxId
   **/
  @Schema(example = "23423", description = "ID interno generado por el sistema.")
  
    public String getProductTaxId() {
    return productTaxId;
  }

  public void setProductTaxId(String productTaxId) {
    this.productTaxId = productTaxId;
  }

  public ProductTax applied(Boolean applied) {
    this.applied = applied;
    return this;
  }

  /**
   * Get applied
   * @return applied
   **/
  @Schema(example = "true", description = "")
  
    public Boolean isApplied() {
    return applied;
  }

  public void setApplied(Boolean applied) {
    this.applied = applied;
  }

  public ProductTax calcRule(String calcRule) {
    this.calcRule = calcRule;
    return this;
  }

  /**
   * Dimension of the calculation rule - possible values:<br> - Percent: percentage of premium.<br> - Value: flat amount.<br> - Annual: amount per year.<br> - FRM: according to Formula (the formula calculation is defined in userexit_gen_prem_taxes).<br> - TRF: According to special tariff table (calculation is defined in userexit_gen_prem_taxes). 
   * @return calcRule
   **/
  @Schema(description = "Dimension of the calculation rule - possible values:<br> - Percent: percentage of premium.<br> - Value: flat amount.<br> - Annual: amount per year.<br> - FRM: according to Formula (the formula calculation is defined in userexit_gen_prem_taxes).<br> - TRF: According to special tariff table (calculation is defined in userexit_gen_prem_taxes). ")
  
    public String getCalcRule() {
    return calcRule;
  }

  public void setCalcRule(String calcRule) {
    this.calcRule = calcRule;
  }

  public ProductTax currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Moneda.
   * @return currency
   **/
  @Schema(example = "USD", description = "Moneda.")
  
    public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public ProductTax efectiveFrom(OffsetDateTime efectiveFrom) {
    this.efectiveFrom = efectiveFrom;
    return this;
  }

  /**
   * For long term some of taxes can be valid for a particular period. The date is a policy anniversary date before which the tax is not applied. 
   * @return efectiveFrom
   **/
  @Schema(description = "For long term some of taxes can be valid for a particular period. The date is a policy anniversary date before which the tax is not applied. ")
  
    @Valid
    public OffsetDateTime getEfectiveFrom() {
    return efectiveFrom;
  }

  public void setEfectiveFrom(OffsetDateTime efectiveFrom) {
    this.efectiveFrom = efectiveFrom;
  }

  public ProductTax efectiveTo(OffsetDateTime efectiveTo) {
    this.efectiveTo = efectiveTo;
    return this;
  }

  /**
   * For long term some of taxes can be valid for a particular period. The date is a policy anniversary date after which the tax is not applied 
   * @return efectiveTo
   **/
  @Schema(description = "For long term some of taxes can be valid for a particular period. The date is a policy anniversary date after which the tax is not applied ")
  
    @Valid
    public OffsetDateTime getEfectiveTo() {
    return efectiveTo;
  }

  public void setEfectiveTo(OffsetDateTime efectiveTo) {
    this.efectiveTo = efectiveTo;
  }

  public ProductTax fractRule(String fractRule) {
    this.fractRule = fractRule;
    return this;
  }

  /**
   * Defines whether for the tax/fee the system will generate separate row in prem_inst_fract(Y|N). 
   * @return fractRule
   **/
  @Schema(description = "Defines whether for the tax/fee the system will generate separate row in prem_inst_fract(Y|N). ")
  
    public String getFractRule() {
    return fractRule;
  }

  public void setFractRule(String fractRule) {
    this.fractRule = fractRule;
  }

  public ProductTax included(Boolean included) {
    this.included = included;
    return this;
  }

  /**
   * Defines whether tax/fee is included in the premium or should be calculated separately(true | false). Default value true. 
   * @return included
   **/
  @Schema(example = "true", description = "Defines whether tax/fee is included in the premium or should be calculated separately(true | false). Default value true. ")
  
    public Boolean isIncluded() {
    return included;
  }

  public void setIncluded(Boolean included) {
    this.included = included;
  }

  public ProductTax manualTaxRate(Boolean manualTaxRate) {
    this.manualTaxRate = manualTaxRate;
    return this;
  }

  /**
   * Defines whether the tax/fee rate is entered manually by the user or is according to the configuration rules(true | false). Default value true. 
   * @return manualTaxRate
   **/
  @Schema(example = "true", description = "Defines whether the tax/fee rate is entered manually by the user or is according to the configuration rules(true | false). Default value true. ")
  
    public Boolean isManualTaxRate() {
    return manualTaxRate;
  }

  public void setManualTaxRate(Boolean manualTaxRate) {
    this.manualTaxRate = manualTaxRate;
  }

  public ProductTax orderNo(Integer orderNo) {
    this.orderNo = orderNo;
    return this;
  }

  /**
   * Calculation order.
   * @return orderNo
   **/
  @Schema(example = "1", description = "Calculation order.")
  
    public Integer getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(Integer orderNo) {
    this.orderNo = orderNo;
  }

  public ProductTax taxAmount(Float taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

  /**
   * Tax/Fee amount.
   * @return taxAmount
   **/
  @Schema(description = "Tax/Fee amount.")
  
    public Float getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(Float taxAmount) {
    this.taxAmount = taxAmount;
  }

  public ProductTax taxRate(Float taxRate) {
    this.taxRate = taxRate;
    return this;
  }

  /**
   * Tax/Fee rate.
   * @return taxRate
   **/
  @Schema(example = "17.0", description = "Tax/Fee rate.")
  
    public Float getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(Float taxRate) {
    this.taxRate = taxRate;
  }

  public ProductTax taxType(String taxType) {
    this.taxType = taxType;
    return this;
  }

  /**
   * Tax code.
   * @return taxType
   **/
  @Schema(example = "TAX01", description = "Tax code.")
  
    public String getTaxType() {
    return taxType;
  }

  public void setTaxType(String taxType) {
    this.taxType = taxType;
  }

  public ProductTax whRule(Boolean whRule) {
    this.whRule = whRule;
    return this;
  }

  /**
   * Defines whether the corresponding tax/fee will be collected by the IC or will be retained by the payer(true | false). Default value false. 
   * @return whRule
   **/
  @Schema(example = "true", description = "Defines whether the corresponding tax/fee will be collected by the IC or will be retained by the payer(true | false). Default value false. ")
  
    public Boolean isWhRule() {
    return whRule;
  }

  public void setWhRule(Boolean whRule) {
    this.whRule = whRule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductTax productTax = (ProductTax) o;
    return Objects.equals(this.productTaxId, productTax.productTaxId) &&
        Objects.equals(this.applied, productTax.applied) &&
        Objects.equals(this.calcRule, productTax.calcRule) &&
        Objects.equals(this.currency, productTax.currency) &&
        Objects.equals(this.efectiveFrom, productTax.efectiveFrom) &&
        Objects.equals(this.efectiveTo, productTax.efectiveTo) &&
        Objects.equals(this.fractRule, productTax.fractRule) &&
        Objects.equals(this.included, productTax.included) &&
        Objects.equals(this.manualTaxRate, productTax.manualTaxRate) &&
        Objects.equals(this.orderNo, productTax.orderNo) &&
        Objects.equals(this.taxAmount, productTax.taxAmount) &&
        Objects.equals(this.taxRate, productTax.taxRate) &&
        Objects.equals(this.taxType, productTax.taxType) &&
        Objects.equals(this.whRule, productTax.whRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productTaxId, applied, calcRule, currency, efectiveFrom, efectiveTo, fractRule, included, manualTaxRate, orderNo, taxAmount, taxRate, taxType, whRule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductTax {\n");
    
    sb.append("    productTaxId: ").append(toIndentedString(productTaxId)).append("\n");
    sb.append("    applied: ").append(toIndentedString(applied)).append("\n");
    sb.append("    calcRule: ").append(toIndentedString(calcRule)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    efectiveFrom: ").append(toIndentedString(efectiveFrom)).append("\n");
    sb.append("    efectiveTo: ").append(toIndentedString(efectiveTo)).append("\n");
    sb.append("    fractRule: ").append(toIndentedString(fractRule)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    manualTaxRate: ").append(toIndentedString(manualTaxRate)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
    sb.append("    whRule: ").append(toIndentedString(whRule)).append("\n");
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
