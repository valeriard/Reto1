package co.com.choucair.formacion.proyectop.tasks;

import co.com.choucair.formacion.proyectop.userinterface.ColorLibForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Complete implements Task {

    public static Complete Theform(String values) {
        return Tasks.instrumented(Complete.class,values);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Valeria Rivera").into(ColorLibForm.BUTTON_REQU),
                Enter.theValue("Valeria123@gmail.com").into(ColorLibForm.BUTTON_EMAIL),
                Enter.theValue("Valeria123").into(ColorLibForm.BUTTON_PASS),
                Enter.theValue("Valeria123").into(ColorLibForm.BUTTON_CONFIRMPASS),
                Enter.theValue("24/06/2013").into(ColorLibForm.BUTTON_DATE),
                Enter.theValue("https://github.com/valeriard?tab=repositories").into(ColorLibForm.BUTTON_URL),
                Enter.theValue("https://github.com/valeriard?tab=repositories").into(ColorLibForm.BUTTON_URL),
                Enter.theValue("123456789").into(ColorLibForm.BUTTON_DIGITS),
                Enter.theValue("8").into(ColorLibForm.BUTTON_RANGE),
                Click.on(ColorLibForm.BUTTON_AGREE),
                Click.on(ColorLibForm.BUTTON_VALIDATE)
        );

    }
}
