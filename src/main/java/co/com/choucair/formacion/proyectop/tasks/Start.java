package co.com.choucair.formacion.proyectop.tasks;

import co.com.choucair.formacion.proyectop.userinterface.ColorLibPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Start implements Task {

    private ColorLibPage colorLibPage;

    public static Start TheWebsiteColorLib() {
        return Tasks.instrumented(Start.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(colorLibPage));
    }
}
