package tech.kopernicus.data.specification.example.dataspecexample.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * PolicyRisk
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-08T18:01:06.696186140Z[GMT]")


public class PolicyRisk extends ProductRisk  {
  @JsonProperty("policyRiskId")
  private Long policyRiskId = null;

  public PolicyRisk policyRiskId(Long policyRiskId) {
    this.policyRiskId = policyRiskId;
    return this;
  }

  /**
   * Get policyRiskId
   * @return policyRiskId
   **/
  @Schema(description = "")
  
    public Long getPolicyRiskId() {
    return policyRiskId;
  }

  public void setPolicyRiskId(Long policyRiskId) {
    this.policyRiskId = policyRiskId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyRisk policyRisk = (PolicyRisk) o;
    return Objects.equals(this.policyRiskId, policyRisk.policyRiskId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyRiskId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyRisk {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    policyRiskId: ").append(toIndentedString(policyRiskId)).append("\n");
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
