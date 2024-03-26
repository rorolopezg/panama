package cl.kopernicus.springcloud.msvc.catalogs.models.mappings;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MappingObject implements Serializable {
    private Long id;
    private String mappingType;

    private List<MapSystem> mappings;

    public MappingObject() {
        super();
        mappings = new ArrayList<>();
    }

    public MappingObject(MapSystem systemA, MapSystem systemB) {
        this();
        mappings.add(systemA);
        mappings.add(systemB);
    }

    public MappingObject(Long id, String mappingType, MapSystem systemA, MapSystem systemB) {
        this(systemA, systemB);
        this.id = id;
        this.mappingType = mappingType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMappingType() {
        return mappingType;
    }

    public void setMappingType(String mappingType) {
        this.mappingType = mappingType;
    }

    public List<MapSystem> getMappings() {
        return mappings;
    }

    public void setMappings(List<MapSystem> mappings) {
        this.mappings = mappings;
    }
}
