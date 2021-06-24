package co.com.choucair.formacion.proyectop.tasks;

import co.com.choucair.formacion.proyectop.userinterface.ColorLibMenu;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Enterokay implements Task {

    public static Enterokay toTheForm() {
        return Tasks.instrumented(Enterokay.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ColorLibMenu.FORMS_BOTON),
                Click.on(ColorLibMenu.VALIDATION_BOTON)
                        );
    }
}
