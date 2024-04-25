package tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapicontract;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * Cliente.
 */
@Schema(description = "Cliente.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-25T03:38:38.211297945Z[GMT]")


public class Client extends People  {
  @JsonProperty("clientId")
  private Long clientId = null;

  @JsonProperty("age")
  private Integer age = null;

  @JsonProperty("maritalStatus")
  private String maritalStatus = null;

  @JsonProperty("riskRating")
  private BigDecimal riskRating = null;

  @JsonProperty("segment")
  private String segment = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("occupation")
  private Object occupation = null;

  @JsonProperty("pep")
  private Object pep = null;

  public Client clientId(Long clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * ID interno generado por el sistema.
   * @return clientId
   **/
  @Schema(example = "234234", description = "ID interno generado por el sistema.")
  
    public Long getClientId() {
    return clientId;
  }

  public void setClientId(Long clientId) {
    this.clientId = clientId;
  }

  public Client age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * Edad del cliente.
   * @return age
   **/
  @Schema(example = "32", description = "Edad del cliente.")
  
    public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Client maritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
    return this;
  }

  /**
   * Estado civil del cliente.
   * @return maritalStatus
   **/
  @Schema(example = "SINGLE", description = "Estado civil del cliente.")
  
    public String getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public Client riskRating(BigDecimal riskRating) {
    this.riskRating = riskRating;
    return this;
  }

  /**
   * Clasificación de riesgo del cliente.
   * @return riskRating
   **/
  @Schema(description = "Clasificación de riesgo del cliente.")
  
    @Valid
    public BigDecimal getRiskRating() {
    return riskRating;
  }

  public void setRiskRating(BigDecimal riskRating) {
    this.riskRating = riskRating;
  }

  public Client segment(String segment) {
    this.segment = segment;
    return this;
  }

  /**
   * Segmento del cliente.
   * @return segment
   **/
  @Schema(example = "Premium", description = "Segmento del cliente.")
  
    public String getSegment() {
    return segment;
  }

  public void setSegment(String segment) {
    this.segment = segment;
  }

  public Client status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Estado oficial del cliente.   Para un cliente persona natural:    - Alive   - Deceased    Para un cliente empresa:    - Active   - Bankrupt   - Inactive 
   * @return status
   **/
  @Schema(example = "Alive", description = "Estado oficial del cliente.   Para un cliente persona natural:    - Alive   - Deceased    Para un cliente empresa:    - Active   - Bankrupt   - Inactive ")
  
    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Client occupation(Object occupation) {
    this.occupation = occupation;
    return this;
  }

  /**
   * Ocupación
   * @return occupation
   **/
  @Schema(description = "Ocupación")
  
    public Object getOccupation() {
    return occupation;
  }

  public void setOccupation(Object occupation) {
    this.occupation = occupation;
  }

  public Client pep(Object pep) {
    this.pep = pep;
    return this;
  }

  /**
   * Información para personas políticamente expuestas.
   * @return pep
   **/
  @Schema(description = "Información para personas políticamente expuestas.")
  
    public Object getPep() {
    return pep;
  }

  public void setPep(Object pep) {
    this.pep = pep;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Client client = (Client) o;
    return Objects.equals(this.clientId, client.clientId) &&
        Objects.equals(this.age, client.age) &&
        Objects.equals(this.maritalStatus, client.maritalStatus) &&
        Objects.equals(this.riskRating, client.riskRating) &&
        Objects.equals(this.segment, client.segment) &&
        Objects.equals(this.status, client.status) &&
        Objects.equals(this.occupation, client.occupation) &&
        Objects.equals(this.pep, client.pep) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, age, maritalStatus, riskRating, segment, status, occupation, pep, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Client {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
    sb.append("    riskRating: ").append(toIndentedString(riskRating)).append("\n");
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    occupation: ").append(toIndentedString(occupation)).append("\n");
    sb.append("    pep: ").append(toIndentedString(pep)).append("\n");
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
