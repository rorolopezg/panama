package tech.kopernicus.data.specification.example.dataspecexample.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * PeopleHeader
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-08T18:01:06.696186140Z[GMT]")


public class PeopleHeader   {
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

  public PeopleHeader manId(Long manId) {
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

  public PeopleHeader pid(String pid) {
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

  public PeopleHeader birthDate(LocalDate birthDate) {
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

  public PeopleHeader familyName(String familyName) {
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

  public PeopleHeader gender(String gender) {
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

  public PeopleHeader givenName(String givenName) {
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

  public PeopleHeader legalName(String legalName) {
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

  public PeopleHeader nationality(String nationality) {
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

  public PeopleHeader registrationDate(OffsetDateTime registrationDate) {
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

  public PeopleHeader surname(String surname) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeopleHeader peopleHeader = (PeopleHeader) o;
    return Objects.equals(this.manId, peopleHeader.manId) &&
        Objects.equals(this.pid, peopleHeader.pid) &&
        Objects.equals(this.birthDate, peopleHeader.birthDate) &&
        Objects.equals(this.familyName, peopleHeader.familyName) &&
        Objects.equals(this.gender, peopleHeader.gender) &&
        Objects.equals(this.givenName, peopleHeader.givenName) &&
        Objects.equals(this.legalName, peopleHeader.legalName) &&
        Objects.equals(this.nationality, peopleHeader.nationality) &&
        Objects.equals(this.registrationDate, peopleHeader.registrationDate) &&
        Objects.equals(this.surname, peopleHeader.surname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manId, pid, birthDate, familyName, gender, givenName, legalName, nationality, registrationDate, surname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeopleHeader {\n");
    
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
