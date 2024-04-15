package tech.kopernicus.data.specification.example.dataspecexample.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * Comisión de la Póliza.
 */
@Schema(description = "Comisión de la Póliza.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-08T18:01:06.696186140Z[GMT]")


public class PolicyCommission extends ProductCommission  {
  @JsonProperty("policyCommissionId")
  private Long policyCommissionId = null;

  public PolicyCommission policyCommissionId(Long policyCommissionId) {
    this.policyCommissionId = policyCommissionId;
    return this;
  }

  /**
   * ID interno generado por el sistema.
   * @return policyCommissionId
   **/
  @Schema(example = "234234566", description = "ID interno generado por el sistema.")
  
    public Long getPolicyCommissionId() {
    return policyCommissionId;
  }

  public void setPolicyCommissionId(Long policyCommissionId) {
    this.policyCommissionId = policyCommissionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyCommission policyCommission = (PolicyCommission) o;
    return Objects.equals(this.policyCommissionId, policyCommission.policyCommissionId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyCommissionId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyCommission {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    policyCommissionId: ").append(toIndentedString(policyCommissionId)).append("\n");
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
