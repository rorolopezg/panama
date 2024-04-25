package tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapicontract;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * Offer option.
 */
@Schema(description = "Offer option.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-25T03:38:38.211297945Z[GMT]")


public class OfferOption extends OfferOptionHeader  {
  @JsonProperty("coverages")
  @Valid
  private List<ProductCoverage> coverages = null;

  public OfferOption coverages(List<ProductCoverage> coverages) {
    this.coverages = coverages;
    return this;
  }

  public OfferOption addCoveragesItem(ProductCoverage coveragesItem) {
    if (this.coverages == null) {
      this.coverages = new ArrayList<ProductCoverage>();
    }
    this.coverages.add(coveragesItem);
    return this;
  }

  /**
   * Get coverages
   * @return coverages
   **/
  @Schema(description = "")
      @Valid
    public List<ProductCoverage> getCoverages() {
    return coverages;
  }

  public void setCoverages(List<ProductCoverage> coverages) {
    this.coverages = coverages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferOption offerOption = (OfferOption) o;
    return Objects.equals(this.coverages, offerOption.coverages) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coverages, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferOption {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    coverages: ").append(toIndentedString(coverages)).append("\n");
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
