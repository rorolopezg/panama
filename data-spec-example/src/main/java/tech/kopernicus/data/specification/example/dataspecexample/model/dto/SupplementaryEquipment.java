package tech.kopernicus.data.specification.example.dataspecexample.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * When the equipment is not included in the price of the insured car/ship, than the equipment must be presented as individually insured object, and the policy will contain two objects, vehicle and additional equipment. 
 */
@Schema(description = "When the equipment is not included in the price of the insured car/ship, than the equipment must be presented as individually insured object, and the policy will contain two objects, vehicle and additional equipment. ")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-08T18:01:06.696186140Z[GMT]")


public class SupplementaryEquipment   {
  @JsonProperty("seId")
  private Long seId = null;

  @JsonProperty("avValue")
  private Float avValue = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("equipmentKind")
  private String equipmentKind = null;

  @JsonProperty("equipmentSubtype")
  private String equipmentSubtype = null;

  @JsonProperty("equipmentType")
  private String equipmentType = null;

  @JsonProperty("ivOver")
  private String ivOver = null;

  @JsonProperty("model")
  private String model = null;

  public SupplementaryEquipment seId(Long seId) {
    this.seId = seId;
    return this;
  }

  /**
   * ID del Equipo Suplementario, generado por el sistema.
   * @return seId
   **/
  @Schema(description = "ID del Equipo Suplementario, generado por el sistema.")
  
    public Long getSeId() {
    return seId;
  }

  public void setSeId(Long seId) {
    this.seId = seId;
  }

  public SupplementaryEquipment avValue(Float avValue) {
    this.avValue = avValue;
    return this;
  }

  /**
   * Valor del equipo suplementario.
   * @return avValue
   **/
  @Schema(example = "10.5", description = "Valor del equipo suplementario.")
  
    public Float getAvValue() {
    return avValue;
  }

  public void setAvValue(Float avValue) {
    this.avValue = avValue;
  }

  public SupplementaryEquipment currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Moneda.
   * @return currency
   **/
  @Schema(example = "USD", description = "Moneda.")
  
    public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public SupplementaryEquipment equipmentKind(String equipmentKind) {
    this.equipmentKind = equipmentKind;
    return this;
  }

  /**
   * Get equipmentKind
   * @return equipmentKind
   **/
  @Schema(description = "")
  
    public String getEquipmentKind() {
    return equipmentKind;
  }

  public void setEquipmentKind(String equipmentKind) {
    this.equipmentKind = equipmentKind;
  }

  public SupplementaryEquipment equipmentSubtype(String equipmentSubtype) {
    this.equipmentSubtype = equipmentSubtype;
    return this;
  }

  /**
   * Get equipmentSubtype
   * @return equipmentSubtype
   **/
  @Schema(description = "")
  
    public String getEquipmentSubtype() {
    return equipmentSubtype;
  }

  public void setEquipmentSubtype(String equipmentSubtype) {
    this.equipmentSubtype = equipmentSubtype;
  }

  public SupplementaryEquipment equipmentType(String equipmentType) {
    this.equipmentType = equipmentType;
    return this;
  }

  /**
   * Get equipmentType
   * @return equipmentType
   **/
  @Schema(description = "")
  
    public String getEquipmentType() {
    return equipmentType;
  }

  public void setEquipmentType(String equipmentType) {
    this.equipmentType = equipmentType;
  }

  public SupplementaryEquipment ivOver(String ivOver) {
    this.ivOver = ivOver;
    return this;
  }

  /**
   * Flag. Shows if the insured value should be accumulated to the object value or not.
   * @return ivOver
   **/
  @Schema(description = "Flag. Shows if the insured value should be accumulated to the object value or not.")
  
    public String getIvOver() {
    return ivOver;
  }

  public void setIvOver(String ivOver) {
    this.ivOver = ivOver;
  }

  public SupplementaryEquipment model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
   **/
  @Schema(description = "")
  
    public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupplementaryEquipment supplementaryEquipment = (SupplementaryEquipment) o;
    return Objects.equals(this.seId, supplementaryEquipment.seId) &&
        Objects.equals(this.avValue, supplementaryEquipment.avValue) &&
        Objects.equals(this.currency, supplementaryEquipment.currency) &&
        Objects.equals(this.equipmentKind, supplementaryEquipment.equipmentKind) &&
        Objects.equals(this.equipmentSubtype, supplementaryEquipment.equipmentSubtype) &&
        Objects.equals(this.equipmentType, supplementaryEquipment.equipmentType) &&
        Objects.equals(this.ivOver, supplementaryEquipment.ivOver) &&
        Objects.equals(this.model, supplementaryEquipment.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seId, avValue, currency, equipmentKind, equipmentSubtype, equipmentType, ivOver, model);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupplementaryEquipment {\n");
    
    sb.append("    seId: ").append(toIndentedString(seId)).append("\n");
    sb.append("    avValue: ").append(toIndentedString(avValue)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    equipmentKind: ").append(toIndentedString(equipmentKind)).append("\n");
    sb.append("    equipmentSubtype: ").append(toIndentedString(equipmentSubtype)).append("\n");
    sb.append("    equipmentType: ").append(toIndentedString(equipmentType)).append("\n");
    sb.append("    ivOver: ").append(toIndentedString(ivOver)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
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
