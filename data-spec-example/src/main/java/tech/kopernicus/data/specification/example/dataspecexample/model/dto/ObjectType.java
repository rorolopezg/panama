package tech.kopernicus.data.specification.example.dataspecexample.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * Tipo de objeto.
 */
@Schema(description = "Tipo de objeto.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-08T18:01:06.696186140Z[GMT]")


public class ObjectType   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("registrationDate")
  private LocalDate registrationDate = null;

  public ObjectType id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * ID interno generado por el sistema.
   * @return id
   **/
  @Schema(example = "889787", description = "ID interno generado por el sistema.")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ObjectType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nombre del tipo de objeto.
   * @return name
   **/
  @Schema(description = "Nombre del tipo de objeto.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ObjectType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Descripción del tipo de objeto.
   * @return description
   **/
  @Schema(description = "Descripción del tipo de objeto.")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ObjectType registrationDate(LocalDate registrationDate) {
    this.registrationDate = registrationDate;
    return this;
  }

  /**
   * Fecha de registro en el sistema core.
   * @return registrationDate
   **/
  @Schema(example = "Mon Jan 01 00:00:00 GMT 2024", description = "Fecha de registro en el sistema core.")
  
    @Valid
    public LocalDate getRegistrationDate() {
    return registrationDate;
  }

  public void setRegistrationDate(LocalDate registrationDate) {
    this.registrationDate = registrationDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectType objectType = (ObjectType) o;
    return Objects.equals(this.id, objectType.id) &&
        Objects.equals(this.name, objectType.name) &&
        Objects.equals(this.description, objectType.description) &&
        Objects.equals(this.registrationDate, objectType.registrationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, registrationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    registrationDate: ").append(toIndentedString(registrationDate)).append("\n");
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
