package sid.mapping.mapping_heritage.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sid.mapping.mapping_heritage.entities.Person;
import sid.mapping.mapping_heritage.repository.Personrepository;

@Service
@Transactional
@AllArgsConstructor
public class ServicesImpl implements Services {

    private Personrepository personrepository;
    @Override
    public Person addNewPerson(Person person) {
         Person person1=findByUsername(person.getName());
         if (person1.equals(person1))
         {
             System.out.println("Person present in database");
         }

             return personrepository.save(person);
    }

    @Override
    public Person findByUsername(String name) {
        return personrepository.findByName(name);
    }
}
