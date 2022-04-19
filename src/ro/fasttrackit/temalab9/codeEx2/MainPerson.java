package ro.fasttrackit.temalab9.codeEx2;

import java.time.LocalDateTime;

public class MainPerson {
    public static void main(String[] args) {
        Person firstEmployee = new Programmer(
                "Andrei",
                "Popescu",
                LocalDateTime.of(1997, 5, 21, 0, 0),
                "Cluj",
                LocalDateTime.of(2020, 2, 15, 0, 0),
                "WebDeveloper",
                "romana");

        PersonController controller = new PersonController(firstEmployee);
        System.out.println(controller.getFullName());
        System.out.println(controller.getAge());
    }
}
