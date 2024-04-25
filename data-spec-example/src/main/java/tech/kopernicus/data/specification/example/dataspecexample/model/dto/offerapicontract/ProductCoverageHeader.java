package tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapicontract;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * Coberturas configuradas para el producto de seguro.
 */
@Schema(description = "Coberturas configuradas para el producto de seguro.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-25T03:38:38.211297945Z[GMT]")

public class ProductCoverageHeader {
  @JsonProperty("productCoverageId")
  private String productCoverageId = null;

  @JsonProperty("productCoverageCode")
  private String productCoverageCode = null;

  @JsonProperty("productCoverName")
  private String productCoverName = null;

  @JsonProperty("productCoverDescription")
  private String productCoverDescription = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("mandatory")
  private Boolean mandatory = null;

  @JsonProperty("validFrom")
  private LocalDate validFrom = null;

  @JsonProperty("validTo")
  private LocalDate validTo = null;

  @JsonProperty("registrationDate")
  private LocalDate registrationDate = null;

  @JsonProperty("coverType")
  private String coverType = null;

  public ProductCoverageHeader productCoverageId(String productCoverageId) {
    this.productCoverageId = productCoverageId;
    return this;
  }

  /**
   * ID interno generado por el sistema.
   * 
   * @return productCoverageId
   **/
  @Schema(example = "23423", description = "ID interno generado por el sistema. ")

  public String getProductCoverageId() {
    return productCoverageId;
  }

  public void setProductCoverageId(String productCoverageId) {
    this.productCoverageId = productCoverageId;
  }

  public ProductCoverageHeader productCoverageCode(String productCoverageCode) {
    this.productCoverageCode = productCoverageCode;
    return this;
  }

  /**
   * Identificador único que le da el negocio a la cobertura asociada a un
   * producto. Usualmente obedece a una nomenclatura que permite distinguir
   * fácilmente a la cobertura por parte de usuarios expertos en la materia.
   * 
   * @return productCoverageCode
   **/
  @Schema(example = "COV01", description = "Identificador único que le da el negocio a la cobertura asociada a un producto. Usualmente obedece a una nomenclatura que permite distinguir fácilmente a la cobertura por parte de usuarios expertos en la materia. ")

  public String getProductCoverageCode() {
    return productCoverageCode;
  }

  public void setProductCoverageCode(String productCoverageCode) {
    this.productCoverageCode = productCoverageCode;
  }

  public ProductCoverageHeader productCoverName(String productCoverName) {
    this.productCoverName = productCoverName;
    return this;
  }

  /**
   * Nombre de la cobertura, amigable para el cliente final.
   * 
   * @return productCoverName
   **/
  @Schema(example = "Exámenes diagnósticos", description = "Nombre de la cobertura, amigable para el cliente final. ")

  public String getProductCoverName() {
    return productCoverName;
  }

  public void setProductCoverName(String productCoverName) {
    this.productCoverName = productCoverName;
  }

  public ProductCoverageHeader productCoverDescription(String productCoverDescription) {
    this.productCoverDescription = productCoverDescription;
    return this;
  }

  /**
   * Get productCoverDescription
   * 
   * @return productCoverDescription
   **/
  @Schema(example = "Descripción de la cobertura. Texto que explica en qué consiste la cobertura. ", description = "")

  public String getProductCoverDescription() {
    return productCoverDescription;
  }

  public void setProductCoverDescription(String productCoverDescription) {
    this.productCoverDescription = productCoverDescription;
  }

  public ProductCoverageHeader currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Moneda.
   * 
   * @return currency
   **/
  @Schema(example = "USD", description = "Moneda.")

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public ProductCoverageHeader mandatory(Boolean mandatory) {
    this.mandatory = mandatory;
    return this;
  }

  /**
   * true cuando una cobertura es obligatoria. false en caso contrario.
   * 
   * @return mandatory
   **/
  @Schema(example = "true", description = "true cuando una cobertura es obligatoria. false en caso contrario.")

  public Boolean isMandatory() {
    return mandatory;
  }

  public void setMandatory(Boolean mandatory) {
    this.mandatory = mandatory;
  }

  public ProductCoverageHeader validFrom(LocalDate validFrom) {
    this.validFrom = validFrom;
    return this;
  }

  /**
   * Fecha a partir de la cual esta cobertura está disponible para su
   * comercialización.
   * 
   * @return validFrom
   **/
  @Schema(example = "Mon Jan 01 00:00:00 GMT 2024", description = "Fecha a partir de la cual esta cobertura está disponible para su comercialización.")

  @Valid
  public LocalDate getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(LocalDate validFrom) {
    this.validFrom = validFrom;
  }

  public ProductCoverageHeader validTo(LocalDate validTo) {
    this.validTo = validTo;
    return this;
  }

  /**
   * Fecha límite para efectos de comercialización de la cobertura.
   * 
   * @return validTo
   **/
  @Schema(description = "Fecha límite para efectos de comercialización de la cobertura.")

  @Valid
  public LocalDate getValidTo() {
    return validTo;
  }

  public void setValidTo(LocalDate validTo) {
    this.validTo = validTo;
  }

  public ProductCoverageHeader registrationDate(LocalDate registrationDate) {
    this.registrationDate = registrationDate;
    return this;
  }

  /**
   * Fecha de registro en el sistema core.
   * 
   * @return registrationDate
   **/
  @Schema(example = "Mon Jan 01 00:00:00 GMT 2024", description = "Fecha de registro en el sistema core.")

  @Valid
  public LocalDate getRegistrationDate() {
    return registrationDate;
  }

  public void setRegistrationDate(LocalDate registrationDate) {
    this.registrationDate = registrationDate;
  }

  public ProductCoverageHeader coverType(String coverType) {
    this.coverType = coverType;
    return this;
  }

  /**
   * Tipo de cobertura.
   * 
   * @return coverType
   **/
  @Schema(example = "Vida", description = "Tipo de cobertura.")

  public String getCoverType() {
    return coverType;
  }

  public void setCoverType(String coverType) {
    this.coverType = coverType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductCoverageHeader productCoverageHeader = (ProductCoverageHeader) o;
    return Objects.equals(this.productCoverageId, productCoverageHeader.productCoverageId) &&
        Objects.equals(this.productCoverageCode, productCoverageHeader.productCoverageCode) &&
        Objects.equals(this.productCoverName, productCoverageHeader.productCoverName) &&
        Objects.equals(this.productCoverDescription, productCoverageHeader.productCoverDescription) &&
        Objects.equals(this.currency, productCoverageHeader.currency) &&
        Objects.equals(this.mandatory, productCoverageHeader.mandatory) &&
        Objects.equals(this.validFrom, productCoverageHeader.validFrom) &&
        Objects.equals(this.validTo, productCoverageHeader.validTo) &&
        Objects.equals(this.registrationDate, productCoverageHeader.registrationDate) &&
        Objects.equals(this.coverType, productCoverageHeader.coverType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productCoverageId, productCoverageCode, productCoverName, productCoverDescription, currency,
        mandatory, validFrom, validTo, registrationDate, coverType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductCoverageHeader {\n");

    sb.append("    productCoverageId: ").append(toIndentedString(productCoverageId)).append("\n");
    sb.append("    productCoverageCode: ").append(toIndentedString(productCoverageCode)).append("\n");
    sb.append("    productCoverName: ").append(toIndentedString(productCoverName)).append("\n");
    sb.append("    productCoverDescription: ").append(toIndentedString(productCoverDescription)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
    sb.append("    registrationDate: ").append(toIndentedString(registrationDate)).append("\n");
    sb.append("    coverType: ").append(toIndentedString(coverType)).append("\n");
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
