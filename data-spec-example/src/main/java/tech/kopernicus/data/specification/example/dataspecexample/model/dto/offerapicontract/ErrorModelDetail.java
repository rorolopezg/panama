package tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapicontract;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * ErrorModelDetail
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-25T03:38:38.211297945Z[GMT]")


public class ErrorModelDetail   {
  @JsonProperty("object")
  private String object = null;

  @JsonProperty("field")
  private String field = null;

  @JsonProperty("rejectedValue")
  private String rejectedValue = null;

  @JsonProperty("message")
  private String message = null;

  public ErrorModelDetail object(String object) {
    this.object = object;
    return this;
  }

  /**
   * Get object
   * @return object
   **/
  @Schema(example = "Client", description = "")
  
    public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public ErrorModelDetail field(String field) {
    this.field = field;
    return this;
  }

  /**
   * Get field
   * @return field
   **/
  @Schema(example = "email", description = "")
  
    public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public ErrorModelDetail rejectedValue(String rejectedValue) {
    this.rejectedValue = rejectedValue;
    return this;
  }

  /**
   * Get rejectedValue
   * @return rejectedValue
   **/
  @Schema(example = "@gmail.com", description = "")
  
    public String getRejectedValue() {
    return rejectedValue;
  }

  public void setRejectedValue(String rejectedValue) {
    this.rejectedValue = rejectedValue;
  }

  public ErrorModelDetail message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   **/
  @Schema(example = "El campo email debe contener un email válido.", description = "")
  
    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorModelDetail errorModelDetail = (ErrorModelDetail) o;
    return Objects.equals(this.object, errorModelDetail.object) &&
        Objects.equals(this.field, errorModelDetail.field) &&
        Objects.equals(this.rejectedValue, errorModelDetail.rejectedValue) &&
        Objects.equals(this.message, errorModelDetail.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, field, rejectedValue, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorModelDetail {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    rejectedValue: ").append(toIndentedString(rejectedValue)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
