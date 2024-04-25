package tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapicontract;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * Representa a un intermediario (corredor o broker).
 */
@Schema(description = "Representa a un intermediario (corredor o broker).")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-25T03:38:38.211297945Z[GMT]")


public class Agent extends People  {
  @JsonProperty("agentId")
  private Long agentId = null;

  @JsonProperty("agentNumber")
  private String agentNumber = null;

  @JsonProperty("hireDate")
  private LocalDate hireDate = null;

  @JsonProperty("fireDate")
  private LocalDate fireDate = null;

  @JsonProperty("state")
  private String state = null;

  public Agent agentId(Long agentId) {
    this.agentId = agentId;
    return this;
  }

  /**
   * ID interno generado por el sistema.
   * @return agentId
   **/
  @Schema(example = "2342345", description = "ID interno generado por el sistema.")
  
    public Long getAgentId() {
    return agentId;
  }

  public void setAgentId(Long agentId) {
    this.agentId = agentId;
  }

  public Agent agentNumber(String agentNumber) {
    this.agentNumber = agentNumber;
    return this;
  }

  /**
   * Número del agente.
   * @return agentNumber
   **/
  @Schema(example = "657657", description = "Número del agente.")
  
    public String getAgentNumber() {
    return agentNumber;
  }

  public void setAgentNumber(String agentNumber) {
    this.agentNumber = agentNumber;
  }

  public Agent hireDate(LocalDate hireDate) {
    this.hireDate = hireDate;
    return this;
  }

  /**
   * Fecha de contratación del agente.
   * @return hireDate
   **/
  @Schema(example = "Mon May 21 00:00:00 GMT 2001", description = "Fecha de contratación del agente.")
  
    @Valid
    public LocalDate getHireDate() {
    return hireDate;
  }

  public void setHireDate(LocalDate hireDate) {
    this.hireDate = hireDate;
  }

  public Agent fireDate(LocalDate fireDate) {
    this.fireDate = fireDate;
    return this;
  }

  /**
   * Fecha de desvinculación del agente.
   * @return fireDate
   **/
  @Schema(description = "Fecha de desvinculación del agente.")
  
    @Valid
    public LocalDate getFireDate() {
    return fireDate;
  }

  public void setFireDate(LocalDate fireDate) {
    this.fireDate = fireDate;
  }

  public Agent state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Estado del agente. Ejemplo: Cancelled, Active.
   * @return state
   **/
  @Schema(example = "Active", description = "Estado del agente. Ejemplo: Cancelled, Active.")
  
    public String getState() {
    return state;
  }

  public void setState(String state) {
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
    Agent agent = (Agent) o;
    return Objects.equals(this.agentId, agent.agentId) &&
        Objects.equals(this.agentNumber, agent.agentNumber) &&
        Objects.equals(this.hireDate, agent.hireDate) &&
        Objects.equals(this.fireDate, agent.fireDate) &&
        Objects.equals(this.state, agent.state) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, agentNumber, hireDate, fireDate, state, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Agent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    agentNumber: ").append(toIndentedString(agentNumber)).append("\n");
    sb.append("    hireDate: ").append(toIndentedString(hireDate)).append("\n");
    sb.append("    fireDate: ").append(toIndentedString(fireDate)).append("\n");
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
