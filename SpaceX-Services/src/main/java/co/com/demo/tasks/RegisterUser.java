package co.com.demo.tasks;

import co.com.demo.interactions.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterUser implements Task {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;

    public RegisterUser(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EnterFirstName.withValue(firstName),
                EnterLastName.withValue(lastName),
                EnterEmail.withValue(email),
                EnterPassword.withValue(password),
                ClickCreateAccountButton.button()
        );
    }

    public static RegisterUser withDetails(String firstName, String lastName, String email, String password) {
        return instrumented(RegisterUser.class, firstName, lastName, email, password);
    }
}
