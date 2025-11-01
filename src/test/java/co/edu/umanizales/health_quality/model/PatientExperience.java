package co.edu.umanizales.health_quality.model;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class PatientExperience extends Indicator {

    @Override
    public void calculatePerformance(double value) {
        if (value > getGoal().value()) {
            setStatus(GoalStatus.ABOVE_GOAL);
        } else if (value == getGoal().value()) {
            setStatus(GoalStatus.GOAL);
        } else {
            setStatus(GoalStatus.OUT_OF_GOAL);
        }
    }
}
