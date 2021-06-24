package co.com.choucair.formacion.proyectop.tasks;


import co.com.choucair.formacion.proyectop.userinterface.ColorLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login  implements Task {

    public static Login OnthePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("demo").into(ColorLoginPage.USER_BOTON),
                Enter.theValue("demo").into(ColorLoginPage.PASSWORD_BOTON),
                Click.on(ColorLoginPage.LOGUIN_BOTON));
    }
}
