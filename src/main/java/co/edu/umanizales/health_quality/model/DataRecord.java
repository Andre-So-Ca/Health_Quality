package co.edu.umanizales.health_quality.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataRecord {

    private String id;
    private LocalDate recordDate;
    private double value;
    private String source;
    private Indicator indicator;
}
