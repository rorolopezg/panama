package tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapicontract;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * Coberturas configuradas para el producto de seguro.
 */
@Schema(description = "Coberturas configuradas para el producto de seguro.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-25T03:38:38.211297945Z[GMT]")

public class ProductCoverage extends ProductCoverageHeader {
  @JsonProperty("premium")
  private Double premium = null;

  @JsonProperty("premiumType")
  private String premiumType = null;

  @JsonProperty("discounts")
  @Valid
  private List<ProductDiscount> discounts = null;

  @JsonProperty("limits")
  @Valid
  private List<ProductLimit> limits = null;

  @JsonProperty("franchises")
  @Valid
  private List<ProductIndemnity> franchises = null;

  @JsonProperty("risks")
  @Valid
  private List<ProductRisk> risks = null;

  @JsonProperty("taxes")
  @Valid
  private List<ProductTax> taxes = null;

  @JsonProperty("totalPremium")
  private Double totalPremium = null;

  @JsonProperty("endorsements")
  @Valid
  private List<ProductEndorsement> endorsements = null;

  public ProductCoverage premium(Double premium) {
    this.premium = premium;
    return this;
  }

  /**
   * Prima pura asociada a la cobertura contratada.
   * 
   * @return premium
   **/
  @Schema(example = "100.0", description = "Prima pura asociada a la cobertura contratada.")

  public Double getPremium() {
    return premium;
  }

  public void setPremium(Double premium) {
    this.premium = premium;
  }

  public ProductCoverage premiumType(String premiumType) {
    this.premiumType = premiumType;
    return this;
  }

  /**
   * Tipo de Prima.
   * 
   * @return premiumType
   **/
  @Schema(description = "Tipo de Prima.")

  public String getPremiumType() {
    return premiumType;
  }

  public void setPremiumType(String premiumType) {
    this.premiumType = premiumType;
  }

  public ProductCoverage discounts(List<ProductDiscount> discounts) {
    this.discounts = discounts;
    return this;
  }

  public ProductCoverage addDiscountsItem(ProductDiscount discountsItem) {
    if (this.discounts == null) {
      this.discounts = new ArrayList<ProductDiscount>();
    }
    this.discounts.add(discountsItem);
    return this;
  }

  /**
   * Get discounts
   * 
   * @return discounts
   **/
  @Schema(description = "")
  @Valid
  public List<ProductDiscount> getDiscounts() {
    return discounts;
  }

  public void setDiscounts(List<ProductDiscount> discounts) {
    this.discounts = discounts;
  }

  public ProductCoverage limits(List<ProductLimit> limits) {
    this.limits = limits;
    return this;
  }

  public ProductCoverage addLimitsItem(ProductLimit limitsItem) {
    if (this.limits == null) {
      this.limits = new ArrayList<ProductLimit>();
    }
    this.limits.add(limitsItem);
    return this;
  }

  /**
   * Get limits
   * 
   * @return limits
   **/
  @Schema(description = "")
  @Valid
  public List<ProductLimit> getLimits() {
    return limits;
  }

  public void setLimits(List<ProductLimit> limits) {
    this.limits = limits;
  }

  public ProductCoverage franchises(List<ProductIndemnity> franchises) {
    this.franchises = franchises;
    return this;
  }

  public ProductCoverage addFranchisesItem(ProductIndemnity franchisesItem) {
    if (this.franchises == null) {
      this.franchises = new ArrayList<ProductIndemnity>();
    }
    this.franchises.add(franchisesItem);
    return this;
  }

  /**
   * Get franchises
   * 
   * @return franchises
   **/
  @Schema(description = "")
  @Valid
  public List<ProductIndemnity> getFranchises() {
    return franchises;
  }

  public void setFranchises(List<ProductIndemnity> franchises) {
    this.franchises = franchises;
  }

  public ProductCoverage risks(List<ProductRisk> risks) {
    this.risks = risks;
    return this;
  }

  public ProductCoverage addRisksItem(ProductRisk risksItem) {
    if (this.risks == null) {
      this.risks = new ArrayList<ProductRisk>();
    }
    this.risks.add(risksItem);
    return this;
  }

  /**
   * Get risks
   * 
   * @return risks
   **/
  @Schema(description = "")
  @Valid
  public List<ProductRisk> getRisks() {
    return risks;
  }

  public void setRisks(List<ProductRisk> risks) {
    this.risks = risks;
  }

  public ProductCoverage taxes(List<ProductTax> taxes) {
    this.taxes = taxes;
    return this;
  }

  public ProductCoverage addTaxesItem(ProductTax taxesItem) {
    if (this.taxes == null) {
      this.taxes = new ArrayList<ProductTax>();
    }
    this.taxes.add(taxesItem);
    return this;
  }

  /**
   * Get taxes
   * 
   * @return taxes
   **/
  @Schema(description = "")
  @Valid
  public List<ProductTax> getTaxes() {
    return taxes;
  }

  public void setTaxes(List<ProductTax> taxes) {
    this.taxes = taxes;
  }

  public ProductCoverage totalPremium(Double totalPremium) {
    this.totalPremium = totalPremium;
    return this;
  }

  /**
   * Prima total asociada a la cobertura contratada.
   * 
   * @return totalPremium
   **/
  @Schema(example = "90.0", description = "Prima total asociada a la cobertura contratada.")

  public Double getTotalPremium() {
    return totalPremium;
  }

  public void setTotalPremium(Double totalPremium) {
    this.totalPremium = totalPremium;
  }

  public ProductCoverage endorsements(List<ProductEndorsement> endorsements) {
    this.endorsements = endorsements;
    return this;
  }

  public ProductCoverage addEndorsementsItem(ProductEndorsement endorsementsItem) {
    if (this.endorsements == null) {
      this.endorsements = new ArrayList<ProductEndorsement>();
    }
    this.endorsements.add(endorsementsItem);
    return this;
  }

  /**
   * Get endorsements
   * 
   * @return endorsements
   **/
  @Schema(description = "")
  @Valid
  public List<ProductEndorsement> getEndorsements() {
    return endorsements;
  }

  public void setEndorsements(List<ProductEndorsement> endorsements) {
    this.endorsements = endorsements;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductCoverage productCoverage = (ProductCoverage) o;
    return Objects.equals(this.premium, productCoverage.premium) &&
        Objects.equals(this.premiumType, productCoverage.premiumType) &&
        Objects.equals(this.discounts, productCoverage.discounts) &&
        Objects.equals(this.limits, productCoverage.limits) &&
        Objects.equals(this.franchises, productCoverage.franchises) &&
        Objects.equals(this.risks, productCoverage.risks) &&
        Objects.equals(this.taxes, productCoverage.taxes) &&
        Objects.equals(this.totalPremium, productCoverage.totalPremium) &&
        Objects.equals(this.endorsements, productCoverage.endorsements) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(premium, premiumType, discounts, limits, franchises, risks, taxes, totalPremium, endorsements,
        super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductCoverage {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    premium: ").append(toIndentedString(premium)).append("\n");
    sb.append("    premiumType: ").append(toIndentedString(premiumType)).append("\n");
    sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    franchises: ").append(toIndentedString(franchises)).append("\n");
    sb.append("    risks: ").append(toIndentedString(risks)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    totalPremium: ").append(toIndentedString(totalPremium)).append("\n");
    sb.append("    endorsements: ").append(toIndentedString(endorsements)).append("\n");
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
