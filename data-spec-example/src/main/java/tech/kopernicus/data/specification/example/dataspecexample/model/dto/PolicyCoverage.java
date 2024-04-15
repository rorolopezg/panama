package tech.kopernicus.data.specification.example.dataspecexample.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * Coberturas contratadas para un InsuredObject en una Policy.
 */
@Schema(description = "Coberturas contratadas para un InsuredObject en una Policy.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-08T18:01:06.696186140Z[GMT]")


public class PolicyCoverage   {
  @JsonProperty("coverageId")
  private BigDecimal coverageId = null;

  @JsonProperty("insuredObjectNum")
  private Long insuredObjectNum = null;

  @JsonProperty("policyId")
  private Long policyId = null;

  @JsonProperty("annexNumber")
  private Long annexNumber = null;

  @JsonProperty("annualPremium")
  private Double annualPremium = null;

  @JsonProperty("coverTypeId")
  private Long coverTypeId = null;

  @JsonProperty("coverTypeCode")
  private String coverTypeCode = null;

  @JsonProperty("coverTypeName")
  private String coverTypeName = null;

  @JsonProperty("coverTypeDescription")
  private String coverTypeDescription = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("discount")
  private Float discount = null;

  @JsonProperty("insuredAmount")
  private BigDecimal insuredAmount = null;

  @JsonProperty("insrBegin")
  private LocalDate insrBegin = null;

  @JsonProperty("insrEnd")
  private LocalDate insrEnd = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("premium")
  private Float premium = null;

  @JsonProperty("premiumType")
  private String premiumType = null;

  @JsonProperty("coverageCommissions")
  @Valid
  private List<PolicyCommission> coverageCommissions = null;

  @JsonProperty("coverageDiscounts")
  @Valid
  private List<PolicyDiscount> coverageDiscounts = null;

  @JsonProperty("coverageLimits")
  @Valid
  private List<PolicyLimit> coverageLimits = null;

  @JsonProperty("coverageRisks")
  @Valid
  private List<PolicyRisk> coverageRisks = null;

  @JsonProperty("coverageTaxes")
  @Valid
  private List<PolicyTax> coverageTaxes = null;

  public PolicyCoverage coverageId(BigDecimal coverageId) {
    this.coverageId = coverageId;
    return this;
  }

  /**
   * ID interno de la cobertura de la póliza, generada por el systema.
   * @return coverageId
   **/
  @Schema(example = "87687678", description = "ID interno de la cobertura de la póliza, generada por el systema.")
  
    @Valid
    public BigDecimal getCoverageId() {
    return coverageId;
  }

  public void setCoverageId(BigDecimal coverageId) {
    this.coverageId = coverageId;
  }

  public PolicyCoverage insuredObjectNum(Long insuredObjectNum) {
    this.insuredObjectNum = insuredObjectNum;
    return this;
  }

  /**
   * Número del objeto asegurado que está asociado a esta cobertura.
   * @return insuredObjectNum
   **/
  @Schema(description = "Número del objeto asegurado que está asociado a esta cobertura.")
  
    public Long getInsuredObjectNum() {
    return insuredObjectNum;
  }

  public void setInsuredObjectNum(Long insuredObjectNum) {
    this.insuredObjectNum = insuredObjectNum;
  }

  public PolicyCoverage policyId(Long policyId) {
    this.policyId = policyId;
    return this;
  }

  /**
   * ID de la póliza asociada a esta cobertura.
   * @return policyId
   **/
  @Schema(description = "ID de la póliza asociada a esta cobertura.")
  
    public Long getPolicyId() {
    return policyId;
  }

  public void setPolicyId(Long policyId) {
    this.policyId = policyId;
  }

  public PolicyCoverage annexNumber(Long annexNumber) {
    this.annexNumber = annexNumber;
    return this;
  }

  /**
   * ID de endoso de la póliza asociada a esta cobertura.
   * @return annexNumber
   **/
  @Schema(description = "ID de endoso de la póliza asociada a esta cobertura.")
  
    public Long getAnnexNumber() {
    return annexNumber;
  }

  public void setAnnexNumber(Long annexNumber) {
    this.annexNumber = annexNumber;
  }

  public PolicyCoverage annualPremium(Double annualPremium) {
    this.annualPremium = annualPremium;
    return this;
  }

  /**
   * For each cover the system keeps premium for the requested duration and annual premium. 
   * @return annualPremium
   **/
  @Schema(example = "1000.0", description = "For each cover the system keeps premium for the requested duration and annual premium. ")
  
    public Double getAnnualPremium() {
    return annualPremium;
  }

  public void setAnnualPremium(Double annualPremium) {
    this.annualPremium = annualPremium;
  }

  public PolicyCoverage coverTypeId(Long coverTypeId) {
    this.coverTypeId = coverTypeId;
    return this;
  }

  /**
   * ID interno el tipo de cobertura, generado por el sistema.<br> Coresponde a un \"ProductCoverage.id\".  
   * @return coverTypeId
   **/
  @Schema(example = "23423", description = "ID interno el tipo de cobertura, generado por el sistema.<br> Coresponde a un \"ProductCoverage.id\".  ")
  
    public Long getCoverTypeId() {
    return coverTypeId;
  }

  public void setCoverTypeId(Long coverTypeId) {
    this.coverTypeId = coverTypeId;
  }

  public PolicyCoverage coverTypeCode(String coverTypeCode) {
    this.coverTypeCode = coverTypeCode;
    return this;
  }

  /**
   * Corresponde a un \"ProductCoverage.code\".
   * @return coverTypeCode
   **/
  @Schema(example = "COV01", description = "Corresponde a un \"ProductCoverage.code\".")
  
    public String getCoverTypeCode() {
    return coverTypeCode;
  }

  public void setCoverTypeCode(String coverTypeCode) {
    this.coverTypeCode = coverTypeCode;
  }

  public PolicyCoverage coverTypeName(String coverTypeName) {
    this.coverTypeName = coverTypeName;
    return this;
  }

  /**
   * Nombre de la cobertura, amigable para el cliente final. 
   * @return coverTypeName
   **/
  @Schema(example = "Exámenes diagnósticos", description = "Nombre de la cobertura, amigable para el cliente final. ")
  
    public String getCoverTypeName() {
    return coverTypeName;
  }

  public void setCoverTypeName(String coverTypeName) {
    this.coverTypeName = coverTypeName;
  }

  public PolicyCoverage coverTypeDescription(String coverTypeDescription) {
    this.coverTypeDescription = coverTypeDescription;
    return this;
  }

  /**
   * Get coverTypeDescription
   * @return coverTypeDescription
   **/
  @Schema(example = "Descripción de la cobertura. Texto que explica en qué consiste la cobertura. ", description = "")
  
    public String getCoverTypeDescription() {
    return coverTypeDescription;
  }

  public void setCoverTypeDescription(String coverTypeDescription) {
    this.coverTypeDescription = coverTypeDescription;
  }

  public PolicyCoverage currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Moneda
   * @return currency
   **/
  @Schema(example = "USD", description = "Moneda")
  
    public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public PolicyCoverage discount(Float discount) {
    this.discount = discount;
    return this;
  }

  /**
   * The final correction of the premium which is result of all applied discounts and loadingsin gen_risk_discount. Premium calculation procedure accumulates (calculates) the result of the all applied correction in gen_risk_discount and sets the field gen_risk_covered.discount with the calculated result. premium = <rate(tariff_percent)> * <discount>. 
   * @return discount
   **/
  @Schema(example = "125.5", description = "The final correction of the premium which is result of all applied discounts and loadingsin gen_risk_discount. Premium calculation procedure accumulates (calculates) the result of the all applied correction in gen_risk_discount and sets the field gen_risk_covered.discount with the calculated result. premium = <rate(tariff_percent)> * <discount>. ")
  
    public Float getDiscount() {
    return discount;
  }

  public void setDiscount(Float discount) {
    this.discount = discount;
  }

  public PolicyCoverage insuredAmount(BigDecimal insuredAmount) {
    this.insuredAmount = insuredAmount;
    return this;
  }

  /**
   * Suma asegurada a nivel de cobertura contratada.
   * @return insuredAmount
   **/
  @Schema(example = "10000.0", description = "Suma asegurada a nivel de cobertura contratada.")
  
    @Valid
    public BigDecimal getInsuredAmount() {
    return insuredAmount;
  }

  public void setInsuredAmount(BigDecimal insuredAmount) {
    this.insuredAmount = insuredAmount;
  }

  public PolicyCoverage insrBegin(LocalDate insrBegin) {
    this.insrBegin = insrBegin;
    return this;
  }

  /**
   * Inicio de vigencia de la cobertura contratada.
   * @return insrBegin
   **/
  @Schema(description = "Inicio de vigencia de la cobertura contratada.")
  
    @Valid
    public LocalDate getInsrBegin() {
    return insrBegin;
  }

  public void setInsrBegin(LocalDate insrBegin) {
    this.insrBegin = insrBegin;
  }

  public PolicyCoverage insrEnd(LocalDate insrEnd) {
    this.insrEnd = insrEnd;
    return this;
  }

  /**
   * Término de vigencia de la cobertura contratada.
   * @return insrEnd
   **/
  @Schema(description = "Término de vigencia de la cobertura contratada.")
  
    @Valid
    public LocalDate getInsrEnd() {
    return insrEnd;
  }

  public void setInsrEnd(LocalDate insrEnd) {
    this.insrEnd = insrEnd;
  }

  public PolicyCoverage state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Estado de la cobertura contratada.
   * @return state
   **/
  @Schema(description = "Estado de la cobertura contratada.")
  
    public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public PolicyCoverage premium(Float premium) {
    this.premium = premium;
    return this;
  }

  /**
   * Prima total asociada a la cobertura contratada.
   * @return premium
   **/
  @Schema(example = "100.0", description = "Prima total asociada a la cobertura contratada.")
  
    public Float getPremium() {
    return premium;
  }

  public void setPremium(Float premium) {
    this.premium = premium;
  }

  public PolicyCoverage premiumType(String premiumType) {
    this.premiumType = premiumType;
    return this;
  }

  /**
   * Tipo de Prima.
   * @return premiumType
   **/
  @Schema(description = "Tipo de Prima.")
  
    public String getPremiumType() {
    return premiumType;
  }

  public void setPremiumType(String premiumType) {
    this.premiumType = premiumType;
  }

  public PolicyCoverage coverageCommissions(List<PolicyCommission> coverageCommissions) {
    this.coverageCommissions = coverageCommissions;
    return this;
  }

  public PolicyCoverage addCoverageCommissionsItem(PolicyCommission coverageCommissionsItem) {
    if (this.coverageCommissions == null) {
      this.coverageCommissions = new ArrayList<PolicyCommission>();
    }
    this.coverageCommissions.add(coverageCommissionsItem);
    return this;
  }

  /**
   * Get coverageCommissions
   * @return coverageCommissions
   **/
  @Schema(description = "")
      @Valid
    public List<PolicyCommission> getCoverageCommissions() {
    return coverageCommissions;
  }

  public void setCoverageCommissions(List<PolicyCommission> coverageCommissions) {
    this.coverageCommissions = coverageCommissions;
  }

  public PolicyCoverage coverageDiscounts(List<PolicyDiscount> coverageDiscounts) {
    this.coverageDiscounts = coverageDiscounts;
    return this;
  }

  public PolicyCoverage addCoverageDiscountsItem(PolicyDiscount coverageDiscountsItem) {
    if (this.coverageDiscounts == null) {
      this.coverageDiscounts = new ArrayList<PolicyDiscount>();
    }
    this.coverageDiscounts.add(coverageDiscountsItem);
    return this;
  }

  /**
   * Get coverageDiscounts
   * @return coverageDiscounts
   **/
  @Schema(description = "")
      @Valid
    public List<PolicyDiscount> getCoverageDiscounts() {
    return coverageDiscounts;
  }

  public void setCoverageDiscounts(List<PolicyDiscount> coverageDiscounts) {
    this.coverageDiscounts = coverageDiscounts;
  }

  public PolicyCoverage coverageLimits(List<PolicyLimit> coverageLimits) {
    this.coverageLimits = coverageLimits;
    return this;
  }

  public PolicyCoverage addCoverageLimitsItem(PolicyLimit coverageLimitsItem) {
    if (this.coverageLimits == null) {
      this.coverageLimits = new ArrayList<PolicyLimit>();
    }
    this.coverageLimits.add(coverageLimitsItem);
    return this;
  }

  /**
   * Get coverageLimits
   * @return coverageLimits
   **/
  @Schema(description = "")
      @Valid
    public List<PolicyLimit> getCoverageLimits() {
    return coverageLimits;
  }

  public void setCoverageLimits(List<PolicyLimit> coverageLimits) {
    this.coverageLimits = coverageLimits;
  }

  public PolicyCoverage coverageRisks(List<PolicyRisk> coverageRisks) {
    this.coverageRisks = coverageRisks;
    return this;
  }

  public PolicyCoverage addCoverageRisksItem(PolicyRisk coverageRisksItem) {
    if (this.coverageRisks == null) {
      this.coverageRisks = new ArrayList<PolicyRisk>();
    }
    this.coverageRisks.add(coverageRisksItem);
    return this;
  }

  /**
   * Get coverageRisks
   * @return coverageRisks
   **/
  @Schema(description = "")
      @Valid
    public List<PolicyRisk> getCoverageRisks() {
    return coverageRisks;
  }

  public void setCoverageRisks(List<PolicyRisk> coverageRisks) {
    this.coverageRisks = coverageRisks;
  }

  public PolicyCoverage coverageTaxes(List<PolicyTax> coverageTaxes) {
    this.coverageTaxes = coverageTaxes;
    return this;
  }

  public PolicyCoverage addCoverageTaxesItem(PolicyTax coverageTaxesItem) {
    if (this.coverageTaxes == null) {
      this.coverageTaxes = new ArrayList<PolicyTax>();
    }
    this.coverageTaxes.add(coverageTaxesItem);
    return this;
  }

  /**
   * Get coverageTaxes
   * @return coverageTaxes
   **/
  @Schema(description = "")
      @Valid
    public List<PolicyTax> getCoverageTaxes() {
    return coverageTaxes;
  }

  public void setCoverageTaxes(List<PolicyTax> coverageTaxes) {
    this.coverageTaxes = coverageTaxes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyCoverage policyCoverage = (PolicyCoverage) o;
    return Objects.equals(this.coverageId, policyCoverage.coverageId) &&
        Objects.equals(this.insuredObjectNum, policyCoverage.insuredObjectNum) &&
        Objects.equals(this.policyId, policyCoverage.policyId) &&
        Objects.equals(this.annexNumber, policyCoverage.annexNumber) &&
        Objects.equals(this.annualPremium, policyCoverage.annualPremium) &&
        Objects.equals(this.coverTypeId, policyCoverage.coverTypeId) &&
        Objects.equals(this.coverTypeCode, policyCoverage.coverTypeCode) &&
        Objects.equals(this.coverTypeName, policyCoverage.coverTypeName) &&
        Objects.equals(this.coverTypeDescription, policyCoverage.coverTypeDescription) &&
        Objects.equals(this.currency, policyCoverage.currency) &&
        Objects.equals(this.discount, policyCoverage.discount) &&
        Objects.equals(this.insuredAmount, policyCoverage.insuredAmount) &&
        Objects.equals(this.insrBegin, policyCoverage.insrBegin) &&
        Objects.equals(this.insrEnd, policyCoverage.insrEnd) &&
        Objects.equals(this.state, policyCoverage.state) &&
        Objects.equals(this.premium, policyCoverage.premium) &&
        Objects.equals(this.premiumType, policyCoverage.premiumType) &&
        Objects.equals(this.coverageCommissions, policyCoverage.coverageCommissions) &&
        Objects.equals(this.coverageDiscounts, policyCoverage.coverageDiscounts) &&
        Objects.equals(this.coverageLimits, policyCoverage.coverageLimits) &&
        Objects.equals(this.coverageRisks, policyCoverage.coverageRisks) &&
        Objects.equals(this.coverageTaxes, policyCoverage.coverageTaxes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coverageId, insuredObjectNum, policyId, annexNumber, annualPremium, coverTypeId, coverTypeCode, coverTypeName, coverTypeDescription, currency, discount, insuredAmount, insrBegin, insrEnd, state, premium, premiumType, coverageCommissions, coverageDiscounts, coverageLimits, coverageRisks, coverageTaxes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyCoverage {\n");
    
    sb.append("    coverageId: ").append(toIndentedString(coverageId)).append("\n");
    sb.append("    insuredObjectNum: ").append(toIndentedString(insuredObjectNum)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    annexNumber: ").append(toIndentedString(annexNumber)).append("\n");
    sb.append("    annualPremium: ").append(toIndentedString(annualPremium)).append("\n");
    sb.append("    coverTypeId: ").append(toIndentedString(coverTypeId)).append("\n");
    sb.append("    coverTypeCode: ").append(toIndentedString(coverTypeCode)).append("\n");
    sb.append("    coverTypeName: ").append(toIndentedString(coverTypeName)).append("\n");
    sb.append("    coverTypeDescription: ").append(toIndentedString(coverTypeDescription)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    insuredAmount: ").append(toIndentedString(insuredAmount)).append("\n");
    sb.append("    insrBegin: ").append(toIndentedString(insrBegin)).append("\n");
    sb.append("    insrEnd: ").append(toIndentedString(insrEnd)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    premium: ").append(toIndentedString(premium)).append("\n");
    sb.append("    premiumType: ").append(toIndentedString(premiumType)).append("\n");
    sb.append("    coverageCommissions: ").append(toIndentedString(coverageCommissions)).append("\n");
    sb.append("    coverageDiscounts: ").append(toIndentedString(coverageDiscounts)).append("\n");
    sb.append("    coverageLimits: ").append(toIndentedString(coverageLimits)).append("\n");
    sb.append("    coverageRisks: ").append(toIndentedString(coverageRisks)).append("\n");
    sb.append("    coverageTaxes: ").append(toIndentedString(coverageTaxes)).append("\n");
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
