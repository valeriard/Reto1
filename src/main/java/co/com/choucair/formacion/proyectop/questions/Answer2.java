package co.com.choucair.formacion.proyectop.questions;

import co.com.choucair.formacion.proyectop.userinterface.ColorLibMenu;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer2 implements Question<Boolean> {

    private String question2;

    public Answer2(String question2) {
        this.question2 = question2;
    }

    public static Answer2 toThe(String question2) {
        return new Answer2(question2);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String NombreForm = Text.of(ColorLibMenu.NAME_FORM2).viewedBy(actor).asString();
        if (question2.equals(NombreForm)) {
            result = false;
        }else {
            result = true;
        }
        return result;
    }
}

