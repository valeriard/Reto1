package co.com.choucair.formacion.proyectop.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ColorLoginPage extends PageObject {
    public static final Target USER_BOTON= Target.the("Ingresar usuario")
            .located(By.xpath("(//INPUT[@type='text'])[1]"));
    public static final Target PASSWORD_BOTON=Target.the("Ingresar contraseña")
            .located(By.xpath("(//INPUT[@type='password'])[1]"));
    public static final Target LOGUIN_BOTON=Target.the("OK")
            .located(By.xpath("//BUTTON[@class='btn btn-lg btn-primary btn-block'][text()='Sign in']"));

}
