package sid.mapping.mapping_heritage.entities;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
@DiscriminatorColumn(name = "PROF")
public class Enseignant extends Person{
    private String matiere;
}
