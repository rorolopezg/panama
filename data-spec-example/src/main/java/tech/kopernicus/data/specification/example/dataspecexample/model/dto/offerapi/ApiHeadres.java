package tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ApiHeadres {
    String xOrganizationId;
    String xOrganizationType;
    String xClientApplication;
    String xTraceId;
    String xUser;
    String xClientApplicationFlow;
}
