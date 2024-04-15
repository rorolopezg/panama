package tech.kopernicus.data.specification.example.dataspecexample.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * Información de personas políticamente expuestas (PEP)
 */
@Schema(description = "Información de personas políticamente expuestas (PEP)")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-08T18:01:06.696186140Z[GMT]")


public class PEP   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("isPEP")
  private Boolean isPEP = null;

  @JsonProperty("position")
  private String position = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  public PEP id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * ID interno generado por el sistema.
   * @return id
   **/
  @Schema(example = "23423", description = "ID interno generado por el sistema.")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public PEP isPEP(Boolean isPEP) {
    this.isPEP = isPEP;
    return this;
  }

  /**
   * Indica si la persona es PEP
   * @return isPEP
   **/
  @Schema(example = "true", description = "Indica si la persona es PEP")
  
    public Boolean isIsPEP() {
    return isPEP;
  }

  public void setIsPEP(Boolean isPEP) {
    this.isPEP = isPEP;
  }

  public PEP position(String position) {
    this.position = position;
    return this;
  }

  /**
   * Get position
   * @return position
   **/
  @Schema(example = "MINISTRO", description = "")
  
    public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public PEP startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
   **/
  @Schema(example = "Fri Jul 21 00:00:00 GMT 2017", description = "")
  
    @Valid
    public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public PEP endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   **/
  @Schema(example = "Sat Mar 21 00:00:00 GMT 2020", description = "")
  
    @Valid
    public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PEP PEP = (PEP) o;
    return Objects.equals(this.id, PEP.id) &&
        Objects.equals(this.isPEP, PEP.isPEP) &&
        Objects.equals(this.position, PEP.position) &&
        Objects.equals(this.startDate, PEP.startDate) &&
        Objects.equals(this.endDate, PEP.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isPEP, position, startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PEP {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isPEP: ").append(toIndentedString(isPEP)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
