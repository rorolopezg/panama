package tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapicontract;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * Objeto vehículo que es cubierto por el seguro. La estructura equivalente en INSIS 10.4 es OCAR_TYPE.&lt;br&gt; El scheme equivalente en INSIS 11.3 es OCar. 
 */
@Schema(description = "Objeto vehículo que es cubierto por el seguro. La estructura equivalente en INSIS 10.4 es OCAR_TYPE.<br> El scheme equivalente en INSIS 11.3 es OCar. ")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-25T03:38:38.211297945Z[GMT]")


public class VehicleCar extends VehicleCarHeader  {
  @JsonProperty("age")
  private Integer age = null;

  @JsonProperty("bonusMalus")
  private Double bonusMalus = null;

  @JsonProperty("chassis")
  private String chassis = null;

  @JsonProperty("doors")
  private Integer doors = null;

  @JsonProperty("engine")
  private String engine = null;

  @JsonProperty("enginePower")
  private Float enginePower = null;

  @JsonProperty("engineType")
  private String engineType = null;

  @JsonProperty("fuelType")
  private String fuelType = null;

  @JsonProperty("make")
  private String make = null;

  @JsonProperty("model")
  private String model = null;

  @JsonProperty("newCar")
  private Boolean newCar = null;

  @JsonProperty("seatsNum")
  private Integer seatsNum = null;

  @JsonProperty("subtype")
  private String subtype = null;

  @JsonProperty("tonage")
  private Float tonage = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("usage")
  private String usage = null;

  @JsonProperty("value")
  private Float value = null;

  @JsonProperty("objectType")
  private ObjectType objectType = null;

  @JsonProperty("supplementaryEquipment")
  @Valid
  private List<SupplementaryEquipment> supplementaryEquipment = null;

  public VehicleCar age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * Age of the car in years.
   * @return age
   **/
  @Schema(example = "5", description = "Age of the car in years.")
  
    public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public VehicleCar bonusMalus(Double bonusMalus) {
    this.bonusMalus = bonusMalus;
    return this;
  }

  /**
   * Bonus malus. Possible values: ID from H_BONUS_MALUS.<br> El atributo equivalente en INSIS 10.4 es renewal.<br> El atributo equivalente en INSIS 11.3 es renewableFlag. 
   * @return bonusMalus
   **/
  @Schema(description = "Bonus malus. Possible values: ID from H_BONUS_MALUS.<br> El atributo equivalente en INSIS 10.4 es renewal.<br> El atributo equivalente en INSIS 11.3 es renewableFlag. ")
  
    public Double getBonusMalus() {
    return bonusMalus;
  }

  public void setBonusMalus(Double bonusMalus) {
    this.bonusMalus = bonusMalus;
  }

  public VehicleCar chassis(String chassis) {
    this.chassis = chassis;
    return this;
  }

  /**
   * Número de chasis.
   * @return chassis
   **/
  @Schema(example = "WEIWQUIEOIEOI", description = "Número de chasis.")
  
    public String getChassis() {
    return chassis;
  }

  public void setChassis(String chassis) {
    this.chassis = chassis;
  }

  public VehicleCar doors(Integer doors) {
    this.doors = doors;
    return this;
  }

  /**
   * Número de puertas del automóvil.
   * @return doors
   **/
  @Schema(example = "5", description = "Número de puertas del automóvil.")
  
    public Integer getDoors() {
    return doors;
  }

  public void setDoors(Integer doors) {
    this.doors = doors;
  }

  public VehicleCar engine(String engine) {
    this.engine = engine;
    return this;
  }

  /**
   * Número de motor.
   * @return engine
   **/
  @Schema(example = "234242342342", description = "Número de motor.")
  
    public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public VehicleCar enginePower(Float enginePower) {
    this.enginePower = enginePower;
    return this;
  }

  /**
   * Caballos de fuerza.
   * @return enginePower
   **/
  @Schema(example = "100.0", description = "Caballos de fuerza.")
  
    public Float getEnginePower() {
    return enginePower;
  }

  public void setEnginePower(Float enginePower) {
    this.enginePower = enginePower;
  }

  public VehicleCar engineType(String engineType) {
    this.engineType = engineType;
    return this;
  }

  /**
   * Tipo de motor.<br> En INSIS los posibles valores están en las tablas: ENGINE_TYPE from H_ENGINE_TYPE. 
   * @return engineType
   **/
  @Schema(description = "Tipo de motor.<br> En INSIS los posibles valores están en las tablas: ENGINE_TYPE from H_ENGINE_TYPE. ")
  
    public String getEngineType() {
    return engineType;
  }

  public void setEngineType(String engineType) {
    this.engineType = engineType;
  }

  public VehicleCar fuelType(String fuelType) {
    this.fuelType = fuelType;
    return this;
  }

  /**
   * Tipo de combustible. 
   * @return fuelType
   **/
  @Schema(description = "Tipo de combustible. ")
  
    public String getFuelType() {
    return fuelType;
  }

  public void setFuelType(String fuelType) {
    this.fuelType = fuelType;
  }

  public VehicleCar make(String make) {
    this.make = make;
    return this;
  }

  /**
   * Marca del automóvil.
   * @return make
   **/
  @Schema(example = "KIA", description = "Marca del automóvil.")
  
    public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public VehicleCar model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Modelo del automóvil.
   * @return model
   **/
  @Schema(example = "CERATO", description = "Modelo del automóvil.")
  
    public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public VehicleCar newCar(Boolean newCar) {
    this.newCar = newCar;
    return this;
  }

  /**
   * Get newCar
   * @return newCar
   **/
  @Schema(example = "true", description = "")
  
    public Boolean isNewCar() {
    return newCar;
  }

  public void setNewCar(Boolean newCar) {
    this.newCar = newCar;
  }

  public VehicleCar seatsNum(Integer seatsNum) {
    this.seatsNum = seatsNum;
    return this;
  }

  /**
   * Number of seats.
   * @return seatsNum
   **/
  @Schema(example = "5", description = "Number of seats.")
  
    public Integer getSeatsNum() {
    return seatsNum;
  }

  public void setSeatsNum(Integer seatsNum) {
    this.seatsNum = seatsNum;
  }

  public VehicleCar subtype(String subtype) {
    this.subtype = subtype;
    return this;
  }

  /**
   * Car subtype.<br> In INSIS, depends on object type and car type. Values: Id from H_OBJREP_OBJECT_SUBTYPE. 
   * @return subtype
   **/
  @Schema(description = "Car subtype.<br> In INSIS, depends on object type and car type. Values: Id from H_OBJREP_OBJECT_SUBTYPE. ")
  
    public String getSubtype() {
    return subtype;
  }

  public void setSubtype(String subtype) {
    this.subtype = subtype;
  }

  public VehicleCar tonage(Float tonage) {
    this.tonage = tonage;
    return this;
  }

  /**
   * Tonage.
   * @return tonage
   **/
  @Schema(example = "2.5", description = "Tonage.")
  
    public Float getTonage() {
    return tonage;
  }

  public void setTonage(Float tonage) {
    this.tonage = tonage;
  }

  public VehicleCar type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Car type.<br> In INSIS, depends on object type. Values: Id from H_OBJREP_OBJECT_KIND. 
   * @return type
   **/
  @Schema(example = "SEDAN", description = "Car type.<br> In INSIS, depends on object type. Values: Id from H_OBJREP_OBJECT_KIND. ")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public VehicleCar usage(String usage) {
    this.usage = usage;
    return this;
  }

  /**
   * Car usage.<br> In INSIS, possible values: 1 Personal; 6 Rent-a-car; 17 Commercial; ID from h_car_usage. 
   * @return usage
   **/
  @Schema(example = "Particular", description = "Car usage.<br> In INSIS, possible values: 1 Personal; 6 Rent-a-car; 17 Commercial; ID from h_car_usage. ")
  
    public String getUsage() {
    return usage;
  }

  public void setUsage(String usage) {
    this.usage = usage;
  }

  public VehicleCar value(Float value) {
    this.value = value;
    return this;
  }

  /**
   * Car value.
   * @return value
   **/
  @Schema(example = "5000.0", description = "Car value.")
  
    public Float getValue() {
    return value;
  }

  public void setValue(Float value) {
    this.value = value;
  }

  public VehicleCar objectType(ObjectType objectType) {
    this.objectType = objectType;
    return this;
  }

  /**
   * Get objectType
   * @return objectType
   **/
  @Schema(description = "")
  
    @Valid
    public ObjectType getObjectType() {
    return objectType;
  }

  public void setObjectType(ObjectType objectType) {
    this.objectType = objectType;
  }

  public VehicleCar supplementaryEquipment(List<SupplementaryEquipment> supplementaryEquipment) {
    this.supplementaryEquipment = supplementaryEquipment;
    return this;
  }

  public VehicleCar addSupplementaryEquipmentItem(SupplementaryEquipment supplementaryEquipmentItem) {
    if (this.supplementaryEquipment == null) {
      this.supplementaryEquipment = new ArrayList<SupplementaryEquipment>();
    }
    this.supplementaryEquipment.add(supplementaryEquipmentItem);
    return this;
  }

  /**
   * Get supplementaryEquipment
   * @return supplementaryEquipment
   **/
  @Schema(description = "")
      @Valid
    public List<SupplementaryEquipment> getSupplementaryEquipment() {
    return supplementaryEquipment;
  }

  public void setSupplementaryEquipment(List<SupplementaryEquipment> supplementaryEquipment) {
    this.supplementaryEquipment = supplementaryEquipment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleCar vehicleCar = (VehicleCar) o;
    return Objects.equals(this.age, vehicleCar.age) &&
        Objects.equals(this.bonusMalus, vehicleCar.bonusMalus) &&
        Objects.equals(this.chassis, vehicleCar.chassis) &&
        Objects.equals(this.doors, vehicleCar.doors) &&
        Objects.equals(this.engine, vehicleCar.engine) &&
        Objects.equals(this.enginePower, vehicleCar.enginePower) &&
        Objects.equals(this.engineType, vehicleCar.engineType) &&
        Objects.equals(this.fuelType, vehicleCar.fuelType) &&
        Objects.equals(this.make, vehicleCar.make) &&
        Objects.equals(this.model, vehicleCar.model) &&
        Objects.equals(this.newCar, vehicleCar.newCar) &&
        Objects.equals(this.seatsNum, vehicleCar.seatsNum) &&
        Objects.equals(this.subtype, vehicleCar.subtype) &&
        Objects.equals(this.tonage, vehicleCar.tonage) &&
        Objects.equals(this.type, vehicleCar.type) &&
        Objects.equals(this.usage, vehicleCar.usage) &&
        Objects.equals(this.value, vehicleCar.value) &&
        Objects.equals(this.objectType, vehicleCar.objectType) &&
        Objects.equals(this.supplementaryEquipment, vehicleCar.supplementaryEquipment) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, bonusMalus, chassis, doors, engine, enginePower, engineType, fuelType, make, model, newCar, seatsNum, subtype, tonage, type, usage, value, objectType, supplementaryEquipment, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleCar {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    bonusMalus: ").append(toIndentedString(bonusMalus)).append("\n");
    sb.append("    chassis: ").append(toIndentedString(chassis)).append("\n");
    sb.append("    doors: ").append(toIndentedString(doors)).append("\n");
    sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
    sb.append("    enginePower: ").append(toIndentedString(enginePower)).append("\n");
    sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
    sb.append("    fuelType: ").append(toIndentedString(fuelType)).append("\n");
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    newCar: ").append(toIndentedString(newCar)).append("\n");
    sb.append("    seatsNum: ").append(toIndentedString(seatsNum)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    tonage: ").append(toIndentedString(tonage)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    supplementaryEquipment: ").append(toIndentedString(supplementaryEquipment)).append("\n");
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
