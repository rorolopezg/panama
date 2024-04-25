package tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapicontract;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * Cláusulas del producto de seguro.
 */
@Schema(description = "Cláusulas del producto de seguro.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-25T03:38:38.211297945Z[GMT]")


public class ProductEndorsement   {
  @JsonProperty("productEndorsementId")
  private String productEndorsementId = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("endorsementCode")
  private String endorsementCode = null;

  @JsonProperty("endorsementSubType")
  private String endorsementSubType = null;

  @JsonProperty("endorsementType")
  private String endorsementType = null;

  @JsonProperty("endorsementsOrder")
  private Integer endorsementsOrder = null;

  @JsonProperty("registrationDate")
  private OffsetDateTime registrationDate = null;

  public ProductEndorsement productEndorsementId(String productEndorsementId) {
    this.productEndorsementId = productEndorsementId;
    return this;
  }

  /**
   * ID interno generado por el sistema.
   * @return productEndorsementId
   **/
  @Schema(example = "232434", description = "ID interno generado por el sistema.")
  
    public String getProductEndorsementId() {
    return productEndorsementId;
  }

  public void setProductEndorsementId(String productEndorsementId) {
    this.productEndorsementId = productEndorsementId;
  }

  public ProductEndorsement text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Text of the endorsement. Can be updated.
   * @return text
   **/
  @Schema(description = "Text of the endorsement. Can be updated.")
  
    public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public ProductEndorsement endorsementCode(String endorsementCode) {
    this.endorsementCode = endorsementCode;
    return this;
  }

  /**
   * Code as defined in product configurator. It is required.
   * @return endorsementCode
   **/
  @Schema(description = "Code as defined in product configurator. It is required.")
  
    public String getEndorsementCode() {
    return endorsementCode;
  }

  public void setEndorsementCode(String endorsementCode) {
    this.endorsementCode = endorsementCode;
  }

  public ProductEndorsement endorsementSubType(String endorsementSubType) {
    this.endorsementSubType = endorsementSubType;
    return this;
  }

  /**
   * Endorsement subtype. Possible values are defined in hs_endorsement_subtype. Can be modified from service 
   * @return endorsementSubType
   **/
  @Schema(description = "Endorsement subtype. Possible values are defined in hs_endorsement_subtype. Can be modified from service ")
  
    public String getEndorsementSubType() {
    return endorsementSubType;
  }

  public void setEndorsementSubType(String endorsementSubType) {
    this.endorsementSubType = endorsementSubType;
  }

  public ProductEndorsement endorsementType(String endorsementType) {
    this.endorsementType = endorsementType;
    return this;
  }

  /**
   * Endorsement type as defined in product configurator. It is not allowed to change it. 
   * @return endorsementType
   **/
  @Schema(description = "Endorsement type as defined in product configurator. It is not allowed to change it. ")
  
    public String getEndorsementType() {
    return endorsementType;
  }

  public void setEndorsementType(String endorsementType) {
    this.endorsementType = endorsementType;
  }

  public ProductEndorsement endorsementsOrder(Integer endorsementsOrder) {
    this.endorsementsOrder = endorsementsOrder;
    return this;
  }

  /**
   * Endorsement order as defined in product configurator. It is not allowed to change it.
   * @return endorsementsOrder
   **/
  @Schema(example = "1", description = "Endorsement order as defined in product configurator. It is not allowed to change it.")
  
    public Integer getEndorsementsOrder() {
    return endorsementsOrder;
  }

  public void setEndorsementsOrder(Integer endorsementsOrder) {
    this.endorsementsOrder = endorsementsOrder;
  }

  public ProductEndorsement registrationDate(OffsetDateTime registrationDate) {
    this.registrationDate = registrationDate;
    return this;
  }

  /**
   * Get registrationDate
   * @return registrationDate
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getRegistrationDate() {
    return registrationDate;
  }

  public void setRegistrationDate(OffsetDateTime registrationDate) {
    this.registrationDate = registrationDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductEndorsement productEndorsement = (ProductEndorsement) o;
    return Objects.equals(this.productEndorsementId, productEndorsement.productEndorsementId) &&
        Objects.equals(this.text, productEndorsement.text) &&
        Objects.equals(this.endorsementCode, productEndorsement.endorsementCode) &&
        Objects.equals(this.endorsementSubType, productEndorsement.endorsementSubType) &&
        Objects.equals(this.endorsementType, productEndorsement.endorsementType) &&
        Objects.equals(this.endorsementsOrder, productEndorsement.endorsementsOrder) &&
        Objects.equals(this.registrationDate, productEndorsement.registrationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productEndorsementId, text, endorsementCode, endorsementSubType, endorsementType, endorsementsOrder, registrationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductEndorsement {\n");
    
    sb.append("    productEndorsementId: ").append(toIndentedString(productEndorsementId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    endorsementCode: ").append(toIndentedString(endorsementCode)).append("\n");
    sb.append("    endorsementSubType: ").append(toIndentedString(endorsementSubType)).append("\n");
    sb.append("    endorsementType: ").append(toIndentedString(endorsementType)).append("\n");
    sb.append("    endorsementsOrder: ").append(toIndentedString(endorsementsOrder)).append("\n");
    sb.append("    registrationDate: ").append(toIndentedString(registrationDate)).append("\n");
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
