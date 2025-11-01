package co.edu.umanizales.health_quality.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
 public abstract class Indicator {
    private String id;
    private String name;
    private String description;
    private TechnicalSheet technicalSheet; // Composition
    private Goal goal;                     // Association
    private GoalStatus status;             // Enum: OUT_OF_GOAL, GOAL, ABOVE_GOAL
    public abstract void calculatePerformance(double value);
}
