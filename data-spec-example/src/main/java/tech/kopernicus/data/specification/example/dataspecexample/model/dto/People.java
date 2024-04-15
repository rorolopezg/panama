package tech.kopernicus.data.specification.example.dataspecexample.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * Representa a una persona natural o jurídica.
 */
@Schema(description = "Representa a una persona natural o jurídica.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-08T18:01:06.696186140Z[GMT]")


public class People   {
  @JsonProperty("manId")
  private Long manId = null;

  @JsonProperty("pid")
  private String pid = null;

  @JsonProperty("birthDate")
  private LocalDate birthDate = null;

  @JsonProperty("familyName")
  private String familyName = null;

  @JsonProperty("gender")
  private String gender = null;

  @JsonProperty("givenName")
  private String givenName = null;

  @JsonProperty("legalName")
  private String legalName = null;

  @JsonProperty("nationality")
  private String nationality = null;

  @JsonProperty("registrationDate")
  private OffsetDateTime registrationDate = null;

  @JsonProperty("surname")
  private String surname = null;

  @JsonProperty("addresses")
  @Valid
  private List<Address> addresses = null;

  @JsonProperty("contacts")
  @Valid
  private List<Contact> contacts = null;

  @JsonProperty("identifications")
  @Valid
  private List<IdentificationDocument> identifications = null;

  public People manId(Long manId) {
    this.manId = manId;
    return this;
  }

  /**
   * ID interno generado por el sistema.
   * @return manId
   **/
  @Schema(example = "76565665676", description = "ID interno generado por el sistema.")
  
    public Long getManId() {
    return manId;
  }

  public void setManId(Long manId) {
    this.manId = manId;
  }

  public People pid(String pid) {
    this.pid = pid;
    return this;
  }

  /**
   * Número de cédila de identidad
   * @return pid
   **/
  @Schema(example = "1-88-888", description = "Número de cédila de identidad")
  
    public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public People birthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Fecha de nacimiento de la persona natural o fecha de creación de la empresa.
   * @return birthDate
   **/
  @Schema(example = "Wed Feb 03 00:00:00 GMT 2010", description = "Fecha de nacimiento de la persona natural o fecha de creación de la empresa.")
  
    @Valid
    public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public People familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

  /**
   * Segundo apellido de la persona natural.
   * @return familyName
   **/
  @Schema(example = "Gatica", description = "Segundo apellido de la persona natural.")
  
    public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public People gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Género de la persona natural. No se utiliza en el caso de empresas.
   * @return gender
   **/
  @Schema(example = "1", description = "Género de la persona natural. No se utiliza en el caso de empresas.")
  
    public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public People givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

  /**
   * Nombre de la persona natural.
   * @return givenName
   **/
  @Schema(example = "Rodrigo", description = "Nombre de la persona natural.")
  
    public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public People legalName(String legalName) {
    this.legalName = legalName;
    return this;
  }

  /**
   * Nombre de la empresa.
   * @return legalName
   **/
  @Schema(description = "Nombre de la empresa.")
  
    public String getLegalName() {
    return legalName;
  }

  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }

  public People nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * Nacionalidad.
   * @return nationality
   **/
  @Schema(example = "PA", description = "Nacionalidad.")
  
    public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public People registrationDate(OffsetDateTime registrationDate) {
    this.registrationDate = registrationDate;
    return this;
  }

  /**
   * Get registrationDate
   * @return registrationDate
   **/
  @Schema(example = "2017-07-21T17:32:28Z", description = "")
  
    @Valid
    public OffsetDateTime getRegistrationDate() {
    return registrationDate;
  }

  public void setRegistrationDate(OffsetDateTime registrationDate) {
    this.registrationDate = registrationDate;
  }

  public People surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Primer apellido de la persona natural.
   * @return surname
   **/
  @Schema(example = "López", description = "Primer apellido de la persona natural.")
  
    public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
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
    return Objects.equals(this.manId, people.manId) &&
        Objects.equals(this.pid, people.pid) &&
        Objects.equals(this.birthDate, people.birthDate) &&
        Objects.equals(this.familyName, people.familyName) &&
        Objects.equals(this.gender, people.gender) &&
        Objects.equals(this.givenName, people.givenName) &&
        Objects.equals(this.legalName, people.legalName) &&
        Objects.equals(this.nationality, people.nationality) &&
        Objects.equals(this.registrationDate, people.registrationDate) &&
        Objects.equals(this.surname, people.surname) &&
        Objects.equals(this.addresses, people.addresses) &&
        Objects.equals(this.contacts, people.contacts) &&
        Objects.equals(this.identifications, people.identifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manId, pid, birthDate, familyName, gender, givenName, legalName, nationality, registrationDate, surname, addresses, contacts, identifications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class People {\n");
    
    sb.append("    manId: ").append(toIndentedString(manId)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    registrationDate: ").append(toIndentedString(registrationDate)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
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
