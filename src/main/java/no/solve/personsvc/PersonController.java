package no.solve.personsvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class PersonController {

    @GetMapping(path = "/")
    public String getStatus() {
        return "{\"status\": \"UP\"}";
    }
}
