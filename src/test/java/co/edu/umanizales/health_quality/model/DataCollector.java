package co.edu.umanizales.health_quality.model;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class DataCollector extends Role {

    private String area;

    public DataCollector(String name, String email, String area) {
        super(name, email);
        this.area = area;
    }
}
