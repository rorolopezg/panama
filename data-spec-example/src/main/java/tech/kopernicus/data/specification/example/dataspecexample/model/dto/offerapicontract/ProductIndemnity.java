package tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapicontract;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * Franchise or Deductible
 */
@Schema(description = "Franchise or Deductible")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-25T03:38:38.211297945Z[GMT]")


public class ProductIndemnity   {
  @JsonProperty("productIndemnityId")
  private String productIndemnityId = null;

  @JsonProperty("productIndemnitycode")
  private String productIndemnitycode = null;

  @JsonProperty("flagDefault")
  private Boolean flagDefault = null;

  @JsonProperty("flagMandatory")
  private Boolean flagMandatory = null;

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
  private Double franchiseValue = null;

  public ProductIndemnity productIndemnityId(String productIndemnityId) {
    this.productIndemnityId = productIndemnityId;
    return this;
  }

  /**
   * ID interno generado por el sistema.
   * @return productIndemnityId
   **/
  @Schema(example = "23423", description = "ID interno generado por el sistema.")
  
    public String getProductIndemnityId() {
    return productIndemnityId;
  }

  public void setProductIndemnityId(String productIndemnityId) {
    this.productIndemnityId = productIndemnityId;
  }

  public ProductIndemnity productIndemnitycode(String productIndemnitycode) {
    this.productIndemnitycode = productIndemnitycode;
    return this;
  }

  /**
   * Get productIndemnitycode
   * @return productIndemnitycode
   **/
  @Schema(example = "FR01", description = "")
  
    public String getProductIndemnitycode() {
    return productIndemnitycode;
  }

  public void setProductIndemnitycode(String productIndemnitycode) {
    this.productIndemnitycode = productIndemnitycode;
  }

  public ProductIndemnity flagDefault(Boolean flagDefault) {
    this.flagDefault = flagDefault;
    return this;
  }

  /**
   * Get flagDefault
   * @return flagDefault
   **/
  @Schema(example = "true", description = "")
  
    public Boolean isFlagDefault() {
    return flagDefault;
  }

  public void setFlagDefault(Boolean flagDefault) {
    this.flagDefault = flagDefault;
  }

  public ProductIndemnity flagMandatory(Boolean flagMandatory) {
    this.flagMandatory = flagMandatory;
    return this;
  }

  /**
   * Get flagMandatory
   * @return flagMandatory
   **/
  @Schema(example = "true", description = "")
  
    public Boolean isFlagMandatory() {
    return flagMandatory;
  }

  public void setFlagMandatory(Boolean flagMandatory) {
    this.flagMandatory = flagMandatory;
  }

  public ProductIndemnity franchiseCurrency(String franchiseCurrency) {
    this.franchiseCurrency = franchiseCurrency;
    return this;
  }

  /**
   * Moneda.
   * @return franchiseCurrency
   **/
  @Schema(example = "USD", description = "Moneda.")
  
    public String getFranchiseCurrency() {
    return franchiseCurrency;
  }

  public void setFranchiseCurrency(String franchiseCurrency) {
    this.franchiseCurrency = franchiseCurrency;
  }

  public ProductIndemnity franchiseDimension(String franchiseDimension) {
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

  public ProductIndemnity franchiseMax(Float franchiseMax) {
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

  public ProductIndemnity franchiseMin(Float franchiseMin) {
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

  public ProductIndemnity franchiseType(String franchiseType) {
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

  public ProductIndemnity franchiseValue(Double franchiseValue) {
    this.franchiseValue = franchiseValue;
    return this;
  }

  /**
   * Get franchiseValue
   * @return franchiseValue
   **/
  @Schema(example = "5.5", description = "")
  
    public Double getFranchiseValue() {
    return franchiseValue;
  }

  public void setFranchiseValue(Double franchiseValue) {
    this.franchiseValue = franchiseValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductIndemnity productIndemnity = (ProductIndemnity) o;
    return Objects.equals(this.productIndemnityId, productIndemnity.productIndemnityId) &&
        Objects.equals(this.productIndemnitycode, productIndemnity.productIndemnitycode) &&
        Objects.equals(this.flagDefault, productIndemnity.flagDefault) &&
        Objects.equals(this.flagMandatory, productIndemnity.flagMandatory) &&
        Objects.equals(this.franchiseCurrency, productIndemnity.franchiseCurrency) &&
        Objects.equals(this.franchiseDimension, productIndemnity.franchiseDimension) &&
        Objects.equals(this.franchiseMax, productIndemnity.franchiseMax) &&
        Objects.equals(this.franchiseMin, productIndemnity.franchiseMin) &&
        Objects.equals(this.franchiseType, productIndemnity.franchiseType) &&
        Objects.equals(this.franchiseValue, productIndemnity.franchiseValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productIndemnityId, productIndemnitycode, flagDefault, flagMandatory, franchiseCurrency, franchiseDimension, franchiseMax, franchiseMin, franchiseType, franchiseValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductIndemnity {\n");
    
    sb.append("    productIndemnityId: ").append(toIndentedString(productIndemnityId)).append("\n");
    sb.append("    productIndemnitycode: ").append(toIndentedString(productIndemnitycode)).append("\n");
    sb.append("    flagDefault: ").append(toIndentedString(flagDefault)).append("\n");
    sb.append("    flagMandatory: ").append(toIndentedString(flagMandatory)).append("\n");
    sb.append("    franchiseCurrency: ").append(toIndentedString(franchiseCurrency)).append("\n");
    sb.append("    franchiseDimension: ").append(toIndentedString(franchiseDimension)).append("\n");
    sb.append("    franchiseMax: ").append(toIndentedString(franchiseMax)).append("\n");
    sb.append("    franchiseMin: ").append(toIndentedString(franchiseMin)).append("\n");
    sb.append("    franchiseType: ").append(toIndentedString(franchiseType)).append("\n");
    sb.append("    franchiseValue: ").append(toIndentedString(franchiseValue)).append("\n");
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
