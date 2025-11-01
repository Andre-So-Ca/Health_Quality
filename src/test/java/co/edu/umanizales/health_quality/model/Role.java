package co.edu.umanizales.health_quality.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Role {

    private String name;
    private String email;
}
