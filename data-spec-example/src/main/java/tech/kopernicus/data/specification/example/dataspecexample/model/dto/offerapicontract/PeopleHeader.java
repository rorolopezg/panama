package tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapicontract;

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
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-25T03:38:38.211297945Z[GMT]")


public class PeopleHeader   {
  @JsonProperty("manId")
  private Long manId = null;

  @JsonProperty("pid")
  private String pid = null;

  @JsonProperty("birthDate")
  private LocalDate birthDate = null;

  @JsonProperty("familyName")
  private String familyName = null;

  @JsonProperty("firstSurname")
  private String firstSurname = null;

  @JsonProperty("gender")
  private String gender = null;

  @JsonProperty("givenName")
  private String givenName = null;

  @JsonProperty("legalName")
  private String legalName = null;

  @JsonProperty("middleName")
  private String middleName = null;

  @JsonProperty("nationality")
  private String nationality = null;

  @JsonProperty("peopleType")
  private String peopleType = null;

  @JsonProperty("registrationDate")
  private OffsetDateTime registrationDate = null;

  @JsonProperty("secondSurname")
  private String secondSurname = null;

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

  public PeopleHeader firstSurname(String firstSurname) {
    this.firstSurname = firstSurname;
    return this;
  }

  /**
   * Primer apellido de la persona natural (o apellido paterno). No se utiliza en el caso de empresas. 
   * @return firstSurname
   **/
  @Schema(example = "López", description = "Primer apellido de la persona natural (o apellido paterno). No se utiliza en el caso de empresas. ")
  
    public String getFirstSurname() {
    return firstSurname;
  }

  public void setFirstSurname(String firstSurname) {
    this.firstSurname = firstSurname;
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
   * Nombre de la persona natural. No se utiliza en el caso de empresas. 
   * @return givenName
   **/
  @Schema(example = "Rodrigo", description = "Nombre de la persona natural. No se utiliza en el caso de empresas. ")
  
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

  public PeopleHeader middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Segúndo nombre de la persona natural. No se utiliza en el caso de empresas. 
   * @return middleName
   **/
  @Schema(description = "Segúndo nombre de la persona natural. No se utiliza en el caso de empresas. ")
  
    public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
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

  public PeopleHeader peopleType(String peopleType) {
    this.peopleType = peopleType;
    return this;
  }

  /**
   * Indica si se trata de una persona natural o jurídica.
   * @return peopleType
   **/
  @Schema(example = "LEGAL", description = "Indica si se trata de una persona natural o jurídica.")
  
    public String getPeopleType() {
    return peopleType;
  }

  public void setPeopleType(String peopleType) {
    this.peopleType = peopleType;
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

  public PeopleHeader secondSurname(String secondSurname) {
    this.secondSurname = secondSurname;
    return this;
  }

  /**
   * Segundo apellido de la persona natural (o apellido materno). No se utiliza en el caso de empresas. 
   * @return secondSurname
   **/
  @Schema(example = "Gatica", description = "Segundo apellido de la persona natural (o apellido materno). No se utiliza en el caso de empresas. ")
  
    public String getSecondSurname() {
    return secondSurname;
  }

  public void setSecondSurname(String secondSurname) {
    this.secondSurname = secondSurname;
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
        Objects.equals(this.firstSurname, peopleHeader.firstSurname) &&
        Objects.equals(this.gender, peopleHeader.gender) &&
        Objects.equals(this.givenName, peopleHeader.givenName) &&
        Objects.equals(this.legalName, peopleHeader.legalName) &&
        Objects.equals(this.middleName, peopleHeader.middleName) &&
        Objects.equals(this.nationality, peopleHeader.nationality) &&
        Objects.equals(this.peopleType, peopleHeader.peopleType) &&
        Objects.equals(this.registrationDate, peopleHeader.registrationDate) &&
        Objects.equals(this.secondSurname, peopleHeader.secondSurname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manId, pid, birthDate, familyName, firstSurname, gender, givenName, legalName, middleName, nationality, peopleType, registrationDate, secondSurname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeopleHeader {\n");
    
    sb.append("    manId: ").append(toIndentedString(manId)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    firstSurname: ").append(toIndentedString(firstSurname)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    peopleType: ").append(toIndentedString(peopleType)).append("\n");
    sb.append("    registrationDate: ").append(toIndentedString(registrationDate)).append("\n");
    sb.append("    secondSurname: ").append(toIndentedString(secondSurname)).append("\n");
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
