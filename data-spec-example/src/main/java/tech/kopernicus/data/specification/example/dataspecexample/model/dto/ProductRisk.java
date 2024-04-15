package tech.kopernicus.data.specification.example.dataspecexample.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * ProductRisk
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-08T18:01:06.696186140Z[GMT]")


public class ProductRisk   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("franchiseCurrency")
  private String franchiseCurrency = null;

  @JsonProperty("franchiseDimension")
  private String franchiseDimension = null;

  @JsonProperty("franchiseMax")
  private Float franchiseMax = null;

  @JsonProperty("franchiseMin")
  private Float franchiseMin = null;

  @JsonProperty("franchiseType")
  private String franchiseType = null;

  @JsonProperty("franchiseValue")
  private Float franchiseValue = null;

  @JsonProperty("limits")
  @Valid
  private List<ProductLimit> limits = null;

  @JsonProperty("riskGroup")
  private String riskGroup = null;

  @JsonProperty("riskType")
  private String riskType = null;

  public ProductRisk id(Long id) {
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

  public ProductRisk franchiseCurrency(String franchiseCurrency) {
    this.franchiseCurrency = franchiseCurrency;
    return this;
  }

  /**
   * Moneda.
   * @return franchiseCurrency
   **/
  @Schema(description = "Moneda.")
  
    public String getFranchiseCurrency() {
    return franchiseCurrency;
  }

  public void setFranchiseCurrency(String franchiseCurrency) {
    this.franchiseCurrency = franchiseCurrency;
  }

  public ProductRisk franchiseDimension(String franchiseDimension) {
    this.franchiseDimension = franchiseDimension;
    return this;
  }

  /**
   * Franchise dimension from the nomenclature table HST_FRANCHISE_DIMENSION.
   * @return franchiseDimension
   **/
  @Schema(description = "Franchise dimension from the nomenclature table HST_FRANCHISE_DIMENSION.")
  
    public String getFranchiseDimension() {
    return franchiseDimension;
  }

  public void setFranchiseDimension(String franchiseDimension) {
    this.franchiseDimension = franchiseDimension;
  }

  public ProductRisk franchiseMax(Float franchiseMax) {
    this.franchiseMax = franchiseMax;
    return this;
  }

  /**
   * Get franchiseMax
   * @return franchiseMax
   **/
  @Schema(description = "")
  
    public Float getFranchiseMax() {
    return franchiseMax;
  }

  public void setFranchiseMax(Float franchiseMax) {
    this.franchiseMax = franchiseMax;
  }

  public ProductRisk franchiseMin(Float franchiseMin) {
    this.franchiseMin = franchiseMin;
    return this;
  }

  /**
   * Get franchiseMin
   * @return franchiseMin
   **/
  @Schema(description = "")
  
    public Float getFranchiseMin() {
    return franchiseMin;
  }

  public void setFranchiseMin(Float franchiseMin) {
    this.franchiseMin = franchiseMin;
  }

  public ProductRisk franchiseType(String franchiseType) {
    this.franchiseType = franchiseType;
    return this;
  }

  /**
   * Franchise type from the nomenclature table HST_FRANCHISE_TYPE.
   * @return franchiseType
   **/
  @Schema(description = "Franchise type from the nomenclature table HST_FRANCHISE_TYPE.")
  
    public String getFranchiseType() {
    return franchiseType;
  }

  public void setFranchiseType(String franchiseType) {
    this.franchiseType = franchiseType;
  }

  public ProductRisk franchiseValue(Float franchiseValue) {
    this.franchiseValue = franchiseValue;
    return this;
  }

  /**
   * Get franchiseValue
   * @return franchiseValue
   **/
  @Schema(description = "")
  
    public Float getFranchiseValue() {
    return franchiseValue;
  }

  public void setFranchiseValue(Float franchiseValue) {
    this.franchiseValue = franchiseValue;
  }

  public ProductRisk limits(List<ProductLimit> limits) {
    this.limits = limits;
    return this;
  }

  public ProductRisk addLimitsItem(ProductLimit limitsItem) {
    if (this.limits == null) {
      this.limits = new ArrayList<ProductLimit>();
    }
    this.limits.add(limitsItem);
    return this;
  }

  /**
   * Get limits
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

  public ProductRisk riskGroup(String riskGroup) {
    this.riskGroup = riskGroup;
    return this;
  }

  /**
   * The group in which the risk belongs to.
   * @return riskGroup
   **/
  @Schema(description = "The group in which the risk belongs to.")
  
    public String getRiskGroup() {
    return riskGroup;
  }

  public void setRiskGroup(String riskGroup) {
    this.riskGroup = riskGroup;
  }

  public ProductRisk riskType(String riskType) {
    this.riskType = riskType;
    return this;
  }

  /**
   * Unique identifier of the risk.
   * @return riskType
   **/
  @Schema(description = "Unique identifier of the risk.")
  
    public String getRiskType() {
    return riskType;
  }

  public void setRiskType(String riskType) {
    this.riskType = riskType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductRisk productRisk = (ProductRisk) o;
    return Objects.equals(this.id, productRisk.id) &&
        Objects.equals(this.franchiseCurrency, productRisk.franchiseCurrency) &&
        Objects.equals(this.franchiseDimension, productRisk.franchiseDimension) &&
        Objects.equals(this.franchiseMax, productRisk.franchiseMax) &&
        Objects.equals(this.franchiseMin, productRisk.franchiseMin) &&
        Objects.equals(this.franchiseType, productRisk.franchiseType) &&
        Objects.equals(this.franchiseValue, productRisk.franchiseValue) &&
        Objects.equals(this.limits, productRisk.limits) &&
        Objects.equals(this.riskGroup, productRisk.riskGroup) &&
        Objects.equals(this.riskType, productRisk.riskType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, franchiseCurrency, franchiseDimension, franchiseMax, franchiseMin, franchiseType, franchiseValue, limits, riskGroup, riskType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductRisk {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    franchiseCurrency: ").append(toIndentedString(franchiseCurrency)).append("\n");
    sb.append("    franchiseDimension: ").append(toIndentedString(franchiseDimension)).append("\n");
    sb.append("    franchiseMax: ").append(toIndentedString(franchiseMax)).append("\n");
    sb.append("    franchiseMin: ").append(toIndentedString(franchiseMin)).append("\n");
    sb.append("    franchiseType: ").append(toIndentedString(franchiseType)).append("\n");
    sb.append("    franchiseValue: ").append(toIndentedString(franchiseValue)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    riskGroup: ").append(toIndentedString(riskGroup)).append("\n");
    sb.append("    riskType: ").append(toIndentedString(riskType)).append("\n");
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
