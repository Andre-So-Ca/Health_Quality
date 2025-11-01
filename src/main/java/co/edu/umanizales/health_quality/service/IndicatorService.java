package co.edu.umanizales.health_quality.service;

import co.edu.umanizales.health_quality.model.Indicator;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class IndicatorService {

    private final List<Indicator> indicators = new ArrayList<>();

    public void addIndicator(Indicator indicator) {
        indicators.add(indicator);
    }

    public List<Indicator> getAllIndicators() {
        return indicators;
    }

    public Indicator getIndicatorById(String id) {
        return indicators.stream()
                .filter(i -> i.getId() != null && i.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public boolean deleteIndicator(String id) {
        return indicators.removeIf(i -> i.getId() != null && i.getId().equals(id));
    }
}
