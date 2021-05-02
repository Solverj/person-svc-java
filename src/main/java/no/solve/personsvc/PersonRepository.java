package no.solve.personsvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Person> getPersons() {
        final String query = "select * from person";

        return jdbcTemplate.query(query,
                (rs, rowNum) ->
                        new Person(
                                rs.getInt("id"),
                                rs.getString("name"),
                                rs.getInt("phone"),
                                rs.getString("address")
                        )
        );
    }
}
