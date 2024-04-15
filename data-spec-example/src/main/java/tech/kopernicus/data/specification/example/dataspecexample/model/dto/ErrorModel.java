package tech.kopernicus.data.specification.example.dataspecexample.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * ErrorModel
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-08T18:01:06.696186140Z[GMT]")


public class ErrorModel   {
  @JsonProperty("status")
  private String status = null;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("trace")
  private String trace = null;

  @JsonProperty("requestId")
  private String requestId = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("documentationUrl")
  private String documentationUrl = null;

  @JsonProperty("suggestion")
  private String suggestion = null;

  @JsonProperty("errorDetails")
  private ErrorModelDetail errorDetails = null;

  public ErrorModel status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(example = "404", required = true, description = "")
      @NotNull

    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ErrorModel timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public ErrorModel message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   **/
  @Schema(example = "Not Found", description = "")
  
    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorModel trace(String trace) {
    this.trace = trace;
    return this;
  }

  /**
   * Get trace
   * @return trace
   **/
  @Schema(description = "")
  
    public String getTrace() {
    return trace;
  }

  public void setTrace(String trace) {
    this.trace = trace;
  }

  public ErrorModel requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * Get requestId
   * @return requestId
   **/
  @Schema(example = "550e8400-e29b-41d4-a716-446655440000", description = "")
  
    public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public ErrorModel path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
   **/
  @Schema(example = "/api/catalogs", description = "")
  
    public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ErrorModel documentationUrl(String documentationUrl) {
    this.documentationUrl = documentationUrl;
    return this;
  }

  /**
   * Get documentationUrl
   * @return documentationUrl
   **/
  @Schema(example = "https://api.example.com/docs/errors", description = "")
  
    public String getDocumentationUrl() {
    return documentationUrl;
  }

  public void setDocumentationUrl(String documentationUrl) {
    this.documentationUrl = documentationUrl;
  }

  public ErrorModel suggestion(String suggestion) {
    this.suggestion = suggestion;
    return this;
  }

  /**
   * Get suggestion
   * @return suggestion
   **/
  @Schema(example = "Please check if the user ID is correct or refer to our documentation at https://api.example.com/docs/errors#RESOURCE_NOT_FOUND for more information. ", description = "")
  
    public String getSuggestion() {
    return suggestion;
  }

  public void setSuggestion(String suggestion) {
    this.suggestion = suggestion;
  }

  public ErrorModel errorDetails(ErrorModelDetail errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Get errorDetails
   * @return errorDetails
   **/
  @Schema(description = "")
  
    @Valid
    public ErrorModelDetail getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorModelDetail errorDetails) {
    this.errorDetails = errorDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorModel errorModel = (ErrorModel) o;
    return Objects.equals(this.status, errorModel.status) &&
        Objects.equals(this.timestamp, errorModel.timestamp) &&
        Objects.equals(this.message, errorModel.message) &&
        Objects.equals(this.trace, errorModel.trace) &&
        Objects.equals(this.requestId, errorModel.requestId) &&
        Objects.equals(this.path, errorModel.path) &&
        Objects.equals(this.documentationUrl, errorModel.documentationUrl) &&
        Objects.equals(this.suggestion, errorModel.suggestion) &&
        Objects.equals(this.errorDetails, errorModel.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, timestamp, message, trace, requestId, path, documentationUrl, suggestion, errorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorModel {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    trace: ").append(toIndentedString(trace)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    documentationUrl: ").append(toIndentedString(documentationUrl)).append("\n");
    sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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
