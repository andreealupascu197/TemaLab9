package ro.fasttrackit.temalab9.codeEx2;

import java.time.LocalDateTime;
import java.util.Date;

public class DatabaseAdmin extends Employee {
    private String dbTechnology;

    public DatabaseAdmin(
            String firstName,
            String lastName,
            LocalDateTime birthday,
            String address,
            LocalDateTime dateOfEmployment,
            String position,
            String dbTechnology
    ) {
        super(firstName, lastName, birthday, address, dateOfEmployment, position);
        this.dbTechnology = dbTechnology;
    }

    @Override
    public String getAddress() {
        return "db admin " + super.getAddress();
    }
}
