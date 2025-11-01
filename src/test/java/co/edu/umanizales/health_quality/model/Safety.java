package co.edu.umanizales.health_quality.model;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class Safety extends Indicator {

    @Override
    public void calculatePerformance(double value) {
        if (value >= getGoal().value()) {
            setStatus(GoalStatus.ABOVE_GOAL);
        } else {
            setStatus(GoalStatus.OUT_OF_GOAL);
        }
    }
}
