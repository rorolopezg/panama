package tech.kopernicus.data.specification.example.dataspecexample.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * Dirección Física
 */
@Schema(description = "Dirección Física")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-08T18:01:06.696186140Z[GMT]")


public class Address   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("address")
  private String address = null;

  @JsonProperty("addressType")
  private AddressType addressType = null;

  @JsonProperty("apartment")
  private String apartment = null;

  @JsonProperty("blockNo")
  private String blockNo = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("invoiceYN")
  private String invoiceYN = null;

  @JsonProperty("mailYN")
  private String mailYN = null;

  @JsonProperty("notes")
  private String notes = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("primaryFlag")
  private String primaryFlag = null;

  @JsonProperty("quarterName")
  private String quarterName = null;

  @JsonProperty("streetName")
  private String streetName = null;

  @JsonProperty("streetNo")
  private String streetNo = null;

  @JsonProperty("zipCode")
  private String zipCode = null;

  @JsonProperty("city")
  private City city = null;

  @JsonProperty("country")
  private Country country = null;

  @JsonProperty("region")
  private Region region = null;

  @JsonProperty("state")
  private State state = null;

  public Address id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * ID interno generado por el sistema.
   * @return id
   **/
  @Schema(example = "4873", description = "ID interno generado por el sistema.")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Address address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Dirección física.<br> Full address. In some cases, address is set internally by concatenating address details. 
   * @return address
   **/
  @Schema(example = "Av. Republica del Perú 10707", description = "Dirección física.<br> Full address. In some cases, address is set internally by concatenating address details. ")
  
  @Size(max=1024)   public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Address addressType(AddressType addressType) {
    this.addressType = addressType;
    return this;
  }

  /**
   * Get addressType
   * @return addressType
   **/
  @Schema(description = "")
  
    @Valid
    public AddressType getAddressType() {
    return addressType;
  }

  public void setAddressType(AddressType addressType) {
    this.addressType = addressType;
  }

  public Address apartment(String apartment) {
    this.apartment = apartment;
    return this;
  }

  /**
   * Casa
   * @return apartment
   **/
  @Schema(description = "Casa")
  
    public String getApartment() {
    return apartment;
  }

  public void setApartment(String apartment) {
    this.apartment = apartment;
  }

  public Address blockNo(String blockNo) {
    this.blockNo = blockNo;
    return this;
  }

  /**
   * Número de Bloque
   * @return blockNo
   **/
  @Schema(description = "Número de Bloque")
  
    public String getBlockNo() {
    return blockNo;
  }

  public void setBlockNo(String blockNo) {
    this.blockNo = blockNo;
  }

  public Address email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email asociado a la dirección
   * @return email
   **/
  @Schema(example = "demo@gmail.com", description = "Email asociado a la dirección")
  
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Address invoiceYN(String invoiceYN) {
    this.invoiceYN = invoiceYN;
    return this;
  }

  /**
   * Y o N
   * @return invoiceYN
   **/
  @Schema(example = "Y", description = "Y o N")
  
    public String getInvoiceYN() {
    return invoiceYN;
  }

  public void setInvoiceYN(String invoiceYN) {
    this.invoiceYN = invoiceYN;
  }

  public Address mailYN(String mailYN) {
    this.mailYN = mailYN;
    return this;
  }

  /**
   * Y o N
   * @return mailYN
   **/
  @Schema(example = "Y", description = "Y o N")
  
    public String getMailYN() {
    return mailYN;
  }

  public void setMailYN(String mailYN) {
    this.mailYN = mailYN;
  }

  public Address notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Notas respecto a la dirección
   * @return notes
   **/
  @Schema(example = "MIGRADO", description = "Notas respecto a la dirección")
  
    public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public Address phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Teléfono de la dirección
   * @return phone
   **/
  @Schema(example = "+56941234568", description = "Teléfono de la dirección")
  
    public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Address primaryFlag(String primaryFlag) {
    this.primaryFlag = primaryFlag;
    return this;
  }

  /**
   * Y o N
   * @return primaryFlag
   **/
  @Schema(example = "Y", description = "Y o N")
  
    public String getPrimaryFlag() {
    return primaryFlag;
  }

  public void setPrimaryFlag(String primaryFlag) {
    this.primaryFlag = primaryFlag;
  }

  public Address quarterName(String quarterName) {
    this.quarterName = quarterName;
    return this;
  }

  /**
   * Barrio
   * @return quarterName
   **/
  @Schema(description = "Barrio")
  
    public String getQuarterName() {
    return quarterName;
  }

  public void setQuarterName(String quarterName) {
    this.quarterName = quarterName;
  }

  public Address streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

  /**
   * Calle
   * @return streetName
   **/
  @Schema(description = "Calle")
  
    public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public Address streetNo(String streetNo) {
    this.streetNo = streetNo;
    return this;
  }

  /**
   * Número de calle
   * @return streetNo
   **/
  @Schema(description = "Número de calle")
  
    public String getStreetNo() {
    return streetNo;
  }

  public void setStreetNo(String streetNo) {
    this.streetNo = streetNo;
  }

  public Address zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  /**
   * Get zipCode
   * @return zipCode
   **/
  @Schema(example = "02001.", description = "")
  
  @Size(max=32)   public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public Address city(City city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
   **/
  @Schema(description = "")
  
    @Valid
    public City getCity() {
    return city;
  }

  public void setCity(City city) {
    this.city = city;
  }

  public Address country(Country country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   **/
  @Schema(description = "")
  
    @Valid
    public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public Address region(Region region) {
    this.region = region;
    return this;
  }

  /**
   * Get region
   * @return region
   **/
  @Schema(description = "")
  
    @Valid
    public Region getRegion() {
    return region;
  }

  public void setRegion(Region region) {
    this.region = region;
  }

  public Address state(State state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   **/
  @Schema(description = "")
  
    @Valid
    public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.id, address.id) &&
        Objects.equals(this.address, address.address) &&
        Objects.equals(this.addressType, address.addressType) &&
        Objects.equals(this.apartment, address.apartment) &&
        Objects.equals(this.blockNo, address.blockNo) &&
        Objects.equals(this.email, address.email) &&
        Objects.equals(this.invoiceYN, address.invoiceYN) &&
        Objects.equals(this.mailYN, address.mailYN) &&
        Objects.equals(this.notes, address.notes) &&
        Objects.equals(this.phone, address.phone) &&
        Objects.equals(this.primaryFlag, address.primaryFlag) &&
        Objects.equals(this.quarterName, address.quarterName) &&
        Objects.equals(this.streetName, address.streetName) &&
        Objects.equals(this.streetNo, address.streetNo) &&
        Objects.equals(this.zipCode, address.zipCode) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.region, address.region) &&
        Objects.equals(this.state, address.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, address, addressType, apartment, blockNo, email, invoiceYN, mailYN, notes, phone, primaryFlag, quarterName, streetName, streetNo, zipCode, city, country, region, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    apartment: ").append(toIndentedString(apartment)).append("\n");
    sb.append("    blockNo: ").append(toIndentedString(blockNo)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    invoiceYN: ").append(toIndentedString(invoiceYN)).append("\n");
    sb.append("    mailYN: ").append(toIndentedString(mailYN)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    primaryFlag: ").append(toIndentedString(primaryFlag)).append("\n");
    sb.append("    quarterName: ").append(toIndentedString(quarterName)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    streetNo: ").append(toIndentedString(streetNo)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
