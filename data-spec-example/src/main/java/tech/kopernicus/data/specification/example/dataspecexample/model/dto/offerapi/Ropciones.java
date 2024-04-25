package tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Ropciones {
    private String cobertura;
    private String limite;
    private Double deducible;
    private Double prima;
    private Double pctDescuento;
    private Double descuento;
    private Double total;
    private Boolean opcional;
    private Boolean defaultOption;
}
