package co.edu.umanizales.health_quality.model;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class Opportunity extends Indicator {

    @Override
    public void calculatePerformance(double value) {
        if (value < getGoal().value()) {
            setStatus(GoalStatus.OUT_OF_GOAL);
        } else if (value == getGoal().value()) {
            setStatus(GoalStatus.GOAL);
        } else {
            setStatus(GoalStatus.ABOVE_GOAL);
        }
    }
}

