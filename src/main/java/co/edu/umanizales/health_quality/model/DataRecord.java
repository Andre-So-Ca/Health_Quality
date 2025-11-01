package co.edu.umanizales.health_quality.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataRecord {

    private String id;
    private String recordDate;
    private List<String> indicatorIds; // Aggregation
    private double value;
}
