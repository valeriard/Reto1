package co.com.choucair.formacion.proyectop.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/proyectoP.feature",
        tags = "@scenarios",
        glue = "co.com.choucair.formacion.proyectop.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}

