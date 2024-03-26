package cl.kopernicus.springcloud.msvc.catalogs.models.mappings;

import java.io.Serializable;
import java.util.Objects;

public class MapSystem implements Serializable {
    private String systemName;
    private String systemType;
    private String code;
    private String value;

    public MapSystem() {
        super();
    }

    public MapSystem(String systemName, String systemType, String code, String value) {
        this();
        this.systemName = systemName;
        this.systemType = systemType;
        this.code = code;
        this.value = value;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getSystemType() {
        return systemType;
    }

    public void setSystemType(String systemType) {
        this.systemType = systemType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MapSystem mapSystem = (MapSystem) o;
        return Objects.equals(systemName, mapSystem.systemName) && Objects.equals(systemType, mapSystem.systemType) && Objects.equals(code, mapSystem.code) && Objects.equals(value, mapSystem.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(systemName, systemType, code, value);
    }
}
