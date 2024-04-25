package tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapicontract;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * Contact
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-25T03:38:38.211297945Z[GMT]")


public class Contact   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("details")
  private String details = null;

  @JsonProperty("contactNotes")
  private String contactNotes = null;

  @JsonProperty("primaryFlag")
  private String primaryFlag = null;

  public Contact id(Long id) {
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

  public Contact type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Contact type
   * @return type
   **/
  @Schema(example = "Celphone", description = "Contact type")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Contact details(String details) {
    this.details = details;
    return this;
  }

  /**
   * Contact details
   * @return details
   **/
  @Schema(example = "*56974568956", description = "Contact details")
  
    public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public Contact contactNotes(String contactNotes) {
    this.contactNotes = contactNotes;
    return this;
  }

  /**
   * Contact notes
   * @return contactNotes
   **/
  @Schema(example = "Teléfono personal", description = "Contact notes")
  
    public String getContactNotes() {
    return contactNotes;
  }

  public void setContactNotes(String contactNotes) {
    this.contactNotes = contactNotes;
  }

  public Contact primaryFlag(String primaryFlag) {
    this.primaryFlag = primaryFlag;
    return this;
  }

  /**
   * Y|N. By default - N
   * @return primaryFlag
   **/
  @Schema(example = "Y", description = "Y|N. By default - N")
  
    public String getPrimaryFlag() {
    return primaryFlag;
  }

  public void setPrimaryFlag(String primaryFlag) {
    this.primaryFlag = primaryFlag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(this.id, contact.id) &&
        Objects.equals(this.type, contact.type) &&
        Objects.equals(this.details, contact.details) &&
        Objects.equals(this.contactNotes, contact.contactNotes) &&
        Objects.equals(this.primaryFlag, contact.primaryFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, details, contactNotes, primaryFlag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    contactNotes: ").append(toIndentedString(contactNotes)).append("\n");
    sb.append("    primaryFlag: ").append(toIndentedString(primaryFlag)).append("\n");
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
