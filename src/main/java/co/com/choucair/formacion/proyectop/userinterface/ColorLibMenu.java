package co.com.choucair.formacion.proyectop.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ColorLibMenu extends PageObject {
    public static final Target FORMS_BOTON = Target.the("Buscar el formulario")
            .located(By.xpath("(//A[@href='javascript:;'])[3]"));
    public static final Target VALIDATION_BOTON = Target.the("Boton que llega al formulario")
            .located(By.xpath("(//A[@href='form-validation.html'])[2]"));
    public static final Target NAME_FORM = Target.the("Nombre del  formulario")
            .located(By.xpath("//H5[text()='Block Validation']"));
    public static final Target NAME_FORM2 = Target.the("Nombre del  formulario")
            .located(By.xpath("//H5[text()='Inline Validation']"));
}

