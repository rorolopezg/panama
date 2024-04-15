package tech.kopernicus.data.specification.example.dataspecexample.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * Límiete asociado a la póliza. Los límites pueden estar asociados a:&lt;br&gt; - Nivel de Policy (póliza).&lt;br&gt; - Nivel de InsuredObject (objeto asegurado).&lt;br&gt; - Nivel de Coverage (cobertura). 
 */
@Schema(description = "Límiete asociado a la póliza. Los límites pueden estar asociados a:<br> - Nivel de Policy (póliza).<br> - Nivel de InsuredObject (objeto asegurado).<br> - Nivel de Coverage (cobertura). ")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-08T18:01:06.696186140Z[GMT]")


public class PolicyLimit extends ProductLimit  {
  @JsonProperty("policyLimitId")
  private Long policyLimitId = null;

  public PolicyLimit policyLimitId(Long policyLimitId) {
    this.policyLimitId = policyLimitId;
    return this;
  }

  /**
   * ID del límite en la póliza.
   * @return policyLimitId
   **/
  @Schema(example = "7657656", description = "ID del límite en la póliza.")
  
    public Long getPolicyLimitId() {
    return policyLimitId;
  }

  public void setPolicyLimitId(Long policyLimitId) {
    this.policyLimitId = policyLimitId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyLimit policyLimit = (PolicyLimit) o;
    return Objects.equals(this.policyLimitId, policyLimit.policyLimitId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyLimitId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyLimit {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    policyLimitId: ").append(toIndentedString(policyLimitId)).append("\n");
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
