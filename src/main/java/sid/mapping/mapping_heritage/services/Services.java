package sid.mapping.mapping_heritage.services;

import sid.mapping.mapping_heritage.entities.Person;


public interface Services {
Person addNewPerson(Person person);
//Person addNewPerson(Person person);
Person findByUsername(String name);
}
