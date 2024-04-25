package tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapicontract;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * Representa a una persona natural o jurídica.
 */
@Schema(description = "Representa a una persona natural o jurídica.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-25T03:38:38.211297945Z[GMT]")


public class People extends PeopleHeader  {
  @JsonProperty("gender")
  private String peopleGender = null;

  @JsonProperty("nationality")
  private String peopleNationality = null;

  @JsonProperty("registrationDate")
  private OffsetDateTime peopleRegistrationDate = null;

  @JsonProperty("addresses")
  @Valid
  private List<Address> addresses = null;

  @JsonProperty("contacts")
  @Valid
  private List<Contact> contacts = null;

  @JsonProperty("identifications")
  @Valid
  private List<IdentificationDocument> identifications = null;

  public People peopleGender(String peopleGender) {
    this.peopleGender = peopleGender;
    return this;
  }

  /**
   * Género de la persona natural. No se utiliza en el caso de empresas.
   * @return peopleGender
   **/
  @Schema(example = "1", description = "Género de la persona natural. No se utiliza en el caso de empresas.")
  
    public String getPeopleGender() {
    return peopleGender;
  }

  public void setPeopleGender(String peopleGender) {
    this.peopleGender = peopleGender;
  }

  public People peopleNationality(String peopleNationality) {
    this.peopleNationality = peopleNationality;
    return this;
  }

  /**
   * Nacionalidad.
   * @return peopleNationality
   **/
  @Schema(example = "PA", description = "Nacionalidad.")
  
    public String getPeopleNationality() {
    return peopleNationality;
  }

  public void setPeopleNationality(String peopleNationality) {
    this.peopleNationality = peopleNationality;
  }

  public People peopleRegistrationDate(OffsetDateTime peopleRegistrationDate) {
    this.peopleRegistrationDate = peopleRegistrationDate;
    return this;
  }

  /**
   * Get peopleRegistrationDate
   * @return peopleRegistrationDate
   **/
  @Schema(example = "2017-07-21T17:32:28Z", description = "")
  
    @Valid
    public OffsetDateTime getPeopleRegistrationDate() {
    return peopleRegistrationDate;
  }

  public void setPeopleRegistrationDate(OffsetDateTime peopleRegistrationDate) {
    this.peopleRegistrationDate = peopleRegistrationDate;
  }

  public People addresses(List<Address> addresses) {
    this.addresses = addresses;
    return this;
  }

  public People addAddressesItem(Address addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<Address>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

  /**
   * Lista de direcciones de la persona.
   * @return addresses
   **/
  @Schema(description = "Lista de direcciones de la persona.")
      @Valid
    public List<Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }

  public People contacts(List<Contact> contacts) {
    this.contacts = contacts;
    return this;
  }

  public People addContactsItem(Contact contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<Contact>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

  /**
   * Lista de medios de contacto de la persona. Ejemplo: mail, teléfono, etc.
   * @return contacts
   **/
  @Schema(description = "Lista de medios de contacto de la persona. Ejemplo: mail, teléfono, etc.")
      @Valid
    public List<Contact> getContacts() {
    return contacts;
  }

  public void setContacts(List<Contact> contacts) {
    this.contacts = contacts;
  }

  public People identifications(List<IdentificationDocument> identifications) {
    this.identifications = identifications;
    return this;
  }

  public People addIdentificationsItem(IdentificationDocument identificationsItem) {
    if (this.identifications == null) {
      this.identifications = new ArrayList<IdentificationDocument>();
    }
    this.identifications.add(identificationsItem);
    return this;
  }

  /**
   * Lista de documentos de identificación de la persona
   * @return identifications
   **/
  @Schema(description = "Lista de documentos de identificación de la persona")
      @Valid
    public List<IdentificationDocument> getIdentifications() {
    return identifications;
  }

  public void setIdentifications(List<IdentificationDocument> identifications) {
    this.identifications = identifications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    People people = (People) o;
    return Objects.equals(this.peopleGender, people.peopleGender) &&
        Objects.equals(this.peopleNationality, people.peopleNationality) &&
        Objects.equals(this.peopleRegistrationDate, people.peopleRegistrationDate) &&
        Objects.equals(this.addresses, people.addresses) &&
        Objects.equals(this.contacts, people.contacts) &&
        Objects.equals(this.identifications, people.identifications) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(peopleGender, peopleNationality, peopleRegistrationDate, addresses, contacts, identifications, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class People {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    peopleGender: ").append(toIndentedString(peopleGender)).append("\n");
    sb.append("    peopleNationality: ").append(toIndentedString(peopleNationality)).append("\n");
    sb.append("    peopleRegistrationDate: ").append(toIndentedString(peopleRegistrationDate)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    identifications: ").append(toIndentedString(identifications)).append("\n");
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
