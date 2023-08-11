package sid.mapping.mapping_heritage.entities;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
@DiscriminatorColumn(name = "ETUD")
public class Etudiant extends Person{
    private double note;
}
