package co.edu.umanizales.health_quality.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TechnicalSheet {

    private String code;
    private String definition;
    private String formula;
    private String dataSource;
}
