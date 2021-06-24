package co.com.choucair.formacion.proyectop.questions;

import co.com.choucair.formacion.proyectop.userinterface.ColorLibMenu;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Question<Boolean> toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String NombreForm = Text.of(ColorLibMenu.NAME_FORM).viewedBy(actor).asString();
        if (question.equals(NombreForm)) {
            result = false;
        }else {
            result = true;
        }
        return result;

    }
}
