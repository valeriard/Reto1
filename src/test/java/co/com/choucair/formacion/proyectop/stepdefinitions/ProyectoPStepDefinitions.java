package co.com.choucair.formacion.proyectop.stepdefinitions;

import co.com.choucair.formacion.proyectop.questions.Answer;
import co.com.choucair.formacion.proyectop.questions.Answer2;
import co.com.choucair.formacion.proyectop.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ProyectoPStepDefinitions {

    @Before
    public void initialConfiguration(){
        setTheStage(new OnlineCast());
    }

    @Given("^valeria wants to learn automation colorlib$")
    public void valeriaWantsToLearnAutomationColorlib()  {
        theActorCalled("valeria").wasAbleTo(Start.TheWebsiteColorLib(), Login.OnthePage());

    }

    @When("^he verify the completion of the (.*) screen$")
    public void heVerifyTheCompletionOfTheBlockValidationScreen(String question)  {
        theActorInTheSpotlight().attemptsTo(Enterokay.toTheForm());
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }

    @And("^she verify the completion of the (.*) screen$")
    public void sheVerifyTheCompletionOfTheInlineValidationScreen(String question2) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer2.toThe(question2)));

    }

    @Then("^verify that the form enters (.*) and is filled  correctly$")
    public void verifyThatTheFormEntersValuesAndIsFilledCorrectly(String values) {
        theActorInTheSpotlight().attemptsTo(Complete.Theform(values),
                Completeother.theform(values)
                );
        }

}
