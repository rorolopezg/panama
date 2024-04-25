package tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapi;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapicontract.OfferRequestBody;

@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Data
public class OfferApiParamIn implements Serializable {
    ApiHeadres headers;
    OfferRequestBody body;
}
