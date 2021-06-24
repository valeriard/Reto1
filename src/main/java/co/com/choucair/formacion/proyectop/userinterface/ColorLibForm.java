package co.com.choucair.formacion.proyectop.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ColorLibForm extends PageObject {
    public static final Target BUTTON_REQU = Target.the("ingresar nombre")
            .located(By.xpath("//INPUT[@id='required2']"));
    public static final Target BUTTON_EMAIL = Target.the("ingresar e-mail").
            located(By.xpath("//INPUT[@id='email2']"));
    public static final Target BUTTON_PASS = Target.the("Ingresar contraseña").
            located(By.xpath("//INPUT[@id='password2']"));
    public static final Target BUTTON_CONFIRMPASS = Target.the("Confirmar contraseña")
            .located(By.xpath("//INPUT[@id='confirm_password2']"));
    public static final Target BUTTON_DATE = Target.the("fecha")
            .located(By.xpath("//INPUT[@id='date2']"));
    public static final Target BUTTON_URL = Target.the("Pagina web")
            .located(By.xpath("//INPUT[@id='url2']"));
    public static final Target BUTTON_DIGITS = Target.the("identificacion")
            .located(By.xpath("//INPUT[@id='digits']"));
    public static final Target BUTTON_RANGE = Target.the("rango")
            .located(By.xpath("//INPUT[@id='range']"));
    public static final Target BUTTON_AGREE = Target.the("politica de datos")
            .located(By.xpath("//INPUT[@id='agree2']"));
    public static final Target BUTTON_VALIDATE = Target.the("politica de datos")
            .located(By.xpath("(//INPUT[@type='submit'])[2]"));
// FORMULARIO INLINE VALIDATION
    public static final Target BUTTON_REQU2 = Target.the("ingresar nombre")
            .located(By.xpath("//INPUT[@id='required']"));
    public static final Target BUTTON_EMAIL2 = Target.the("ingresar e-mail")
            .located(By.xpath("//INPUT[@id='email']"));
    public static final Target BUTTON_PASS2 = Target.the("Ingresar contraseña").
            located(By.xpath("//INPUT[@id='password']"));
    public static final Target BUTTON_CONFIRMPASS2 = Target.the("Confirmar contraseña")
            .located(By.xpath("//INPUT[@id='confirm_password']"));
    public static final Target BUTTON_DATE2 = Target.the("fecha")
            .located(By.xpath("//INPUT[@id='date']"));
    public static final Target BUTTON_URL2 = Target.the("Pagina web")
            .located(By.xpath("//INPUT[@id='url']"));
    public static final Target BUTTON_AGREE2 = Target.the("politica de datos")
            .located(By.xpath("//INPUT[@id='agree']"));
    public static final Target BUTTON_M3C = Target.the("MINIMO3")
            .located(By.xpath("//INPUT[@id='minsize']"));
    public static final Target BUTTON_M6C = Target.the("MAXIMO 6")
            .located(By.xpath("//INPUT[@id='maxsize']"));
     public static final Target BUTTON_M3 = Target.the("MINIMO 3")
            .located(By.xpath("//INPUT[@id='minNum']"));
    public static final Target BUTTON_M16C = Target.the("MAX16")
            .located(By.xpath("//INPUT[@id='maxNum']"));
    public static final Target BUTTON_VALIDATE2 = Target.the("politica de datos")
            .located(By.xpath("(//INPUT[@type='submit'])[3]"));


}
