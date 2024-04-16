package tech.kopernicus.data.specification.example.dataspecexample.model.entities.oracle;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Array;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedStoredProcedureQueries;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.StoredProcedureParameter;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
          name = "FETCH_PEOPLE",
          procedureName = "RMLG_PKG.TEST_2",
          parameters = {
                  @StoredProcedureParameter(type = String.class, mode = ParameterMode.IN),
                  @StoredProcedureParameter(type = void.class, mode = ParameterMode.REF_CURSOR)
          }
    )
})
    
@Entity
@Table(name = "people")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class People implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column()
    private Long id;
    
    private String name;
    private String value;

    public People(BigDecimal id, String name, String value) {
        this.id = id.longValue();
        this.name = name;
        this.value = value;
    }
    
}
