package tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapi;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Data
public class OfferApiOut implements Serializable{
    List<Ropciones> opcionA;
    List<Ropciones> opcionB;
    List<Ropciones> opcionC;
    String ok;
    String mensaje;
}
