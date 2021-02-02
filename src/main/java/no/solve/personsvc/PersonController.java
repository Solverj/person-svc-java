package no.solve.personsvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/")
public class PersonController {

    private final PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/persons")
    public List<Person> getPersons(){
        return personRepository.getPersons();
    }

    @GetMapping(path = "/")
    public String getStatus(){
        return "{\"status\": \"UP\"}";
    }
}
