package sid.mapping.mapping_heritage;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sid.mapping.mapping_heritage.entities.Enseignant;
import sid.mapping.mapping_heritage.entities.Etudiant;
import sid.mapping.mapping_heritage.services.Services;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
@AllArgsConstructor
public class MappingHeritageApplication implements CommandLineRunner{

private Services services;
//private Personrepository personrepository;
    public static void main(String[] args) {
        SpringApplication.run(MappingHeritageApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Stream.of("Willy","Edson","Valdesd")
                .forEach(et->{
                    var e = new Etudiant();
                    e.setName(et);
                    e.setNote(14);
                    e.setBirthDay(new Date());
                    services.addNewPerson(e);
                });

        Stream.of("Placide","Landry","Joel")
                .forEach(et->{
                    var p = new Enseignant();
                    p.setName(et);
                    if (Math.random()>0.5)
                    {
                        p.setMatiere("Computer Sciences");
                    }else
                    {
                        p.setMatiere("Physiques");
                    }
                    p.setBirthDay(new Date());
                    services.addNewPerson(p);
                });

    }
}
