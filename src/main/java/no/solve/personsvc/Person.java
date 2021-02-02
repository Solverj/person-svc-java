package no.solve.personsvc;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Person {

    private int id;
    private String name;
    private Integer phone;
    private String address;
}
