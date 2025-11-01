package co.edu.umanizales.health_quality.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
 public abstract class Indicator {
    private String id;
    private String name;
    private String description;
    private TechnicalSheet technicalSheet; // Composition
    private Goal goal;                     // Association
    private GoalStatus status;
    private List<DataRecord> dataRecords;
    public abstract void calculatePerformance(double value);
}
