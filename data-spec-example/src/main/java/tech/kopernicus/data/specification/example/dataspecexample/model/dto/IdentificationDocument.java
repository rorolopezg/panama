package tech.kopernicus.data.specification.example.dataspecexample.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * Datos del documento de identificación de una persona.
 */
@Schema(description = "Datos del documento de identificación de una persona.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-08T18:01:06.696186140Z[GMT]")


public class IdentificationDocument   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("documentId")
  private String documentId = null;

  @JsonProperty("documentSerialNumber")
  private String documentSerialNumber = null;

  @JsonProperty("identificatioDocumentType")
  private IdentificationDocumentType identificatioDocumentType = null;

  public IdentificationDocument id(Long id) {
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

  public IdentificationDocument documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Get documentId
   * @return documentId
   **/
  @Schema(description = "")
  
    public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public IdentificationDocument documentSerialNumber(String documentSerialNumber) {
    this.documentSerialNumber = documentSerialNumber;
    return this;
  }

  /**
   * Get documentSerialNumber
   * @return documentSerialNumber
   **/
  @Schema(description = "")
  
    public String getDocumentSerialNumber() {
    return documentSerialNumber;
  }

  public void setDocumentSerialNumber(String documentSerialNumber) {
    this.documentSerialNumber = documentSerialNumber;
  }

  public IdentificationDocument identificatioDocumentType(IdentificationDocumentType identificatioDocumentType) {
    this.identificatioDocumentType = identificatioDocumentType;
    return this;
  }

  /**
   * Get identificatioDocumentType
   * @return identificatioDocumentType
   **/
  @Schema(description = "")
  
    @Valid
    public IdentificationDocumentType getIdentificatioDocumentType() {
    return identificatioDocumentType;
  }

  public void setIdentificatioDocumentType(IdentificationDocumentType identificatioDocumentType) {
    this.identificatioDocumentType = identificatioDocumentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentificationDocument identificationDocument = (IdentificationDocument) o;
    return Objects.equals(this.id, identificationDocument.id) &&
        Objects.equals(this.documentId, identificationDocument.documentId) &&
        Objects.equals(this.documentSerialNumber, identificationDocument.documentSerialNumber) &&
        Objects.equals(this.identificatioDocumentType, identificationDocument.identificatioDocumentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, documentId, documentSerialNumber, identificatioDocumentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentificationDocument {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documentSerialNumber: ").append(toIndentedString(documentSerialNumber)).append("\n");
    sb.append("    identificatioDocumentType: ").append(toIndentedString(identificatioDocumentType)).append("\n");
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
