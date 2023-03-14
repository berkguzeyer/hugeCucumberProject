package StepDefinitions;

import Pages.DialogContent;
import Pages.Navigation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_CountrySteps {


    Navigation nv = new Navigation();
    DialogContent dc = new DialogContent();

    @And("Navigate to Country Page")
    public void navigateToCountryPage() {
        nv.clickMethod(nv.getSetupBtn());
        nv.clickMethod(nv.getParameterBtn());
        nv.clickMethod(nv.getCountriesBtn());
    }

    @When("Create a new country")
    public void createANewCountry() {
        nv.clickMethod(dc.getAddButton());
        nv.sendKeysMethod(dc.getFormNameInput(), "TestCountry123456");
        nv.sendKeysMethod(dc.getFormCodeInput(), "4799");
        nv.clickMethod(dc.getSaveButton());
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        nv.verifyContainsText(dc.getSuccessMessage(), "successfully");
    }
}
