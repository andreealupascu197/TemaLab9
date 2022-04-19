package ro.fasttrackit.temalab9.codeEx2;

import java.time.LocalDateTime;

public class PersonController {
    private Person person;

    public PersonController(Person person) {
        this.person =person;
    }

    public String getFullName() {
        return person.getFirstName() + " " + person.getLastName();
    }

    public int getAge() {
        LocalDateTime date = LocalDateTime.now();
        return date.getYear() - person.getBirthday().getYear();
    }

}
