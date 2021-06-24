package co.com.choucair.formacion.proyectop.tasks;

import co.com.choucair.formacion.proyectop.userinterface.ColorLibForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Completeother implements Task {

    public static Completeother theform(String values) {
        return Tasks.instrumented(Completeother.class,values);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Valeria Rivera").into(ColorLibForm.BUTTON_REQU2),
                Enter.theValue("Valeria123@gmail.com").into(ColorLibForm.BUTTON_EMAIL2),
                Enter.theValue("Valeria123").into(ColorLibForm.BUTTON_PASS2),
                Enter.theValue("Valeria123").into(ColorLibForm.BUTTON_CONFIRMPASS2),
                Enter.theValue("24/06/2013").into(ColorLibForm.BUTTON_DATE2),
                Enter.theValue("https://github.com/valeriard?tab=repositories").into(ColorLibForm.BUTTON_URL2),
                Click.on(ColorLibForm.BUTTON_AGREE2),
                Enter.theValue("123").into(ColorLibForm.BUTTON_M3C),
                Enter.theValue("12345").into(ColorLibForm.BUTTON_M6C),
                Enter.theValue("123").into(ColorLibForm.BUTTON_M3),
                Enter.theValue("123456789").into(ColorLibForm.BUTTON_M16C),
                Click.on(ColorLibForm.BUTTON_VALIDATE2)
        );

    }
}
