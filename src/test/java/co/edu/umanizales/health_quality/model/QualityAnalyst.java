package co.edu.umanizales.health_quality.model;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class QualityAnalyst extends Role {

    private String specialty;

    public QualityAnalyst(String name, String email, String specialty) {
        super(name, email);
        this.specialty = specialty;
    }
}
