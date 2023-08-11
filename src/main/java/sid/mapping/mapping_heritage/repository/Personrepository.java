package sid.mapping.mapping_heritage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sid.mapping.mapping_heritage.entities.Person;

public interface Personrepository extends JpaRepository<Person, Long> {
    Person findByName(String name);
}
