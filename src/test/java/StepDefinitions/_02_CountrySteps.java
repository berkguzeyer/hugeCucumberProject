package StepDefinitions;

import Pages.DialogContent;
import Pages.Navigation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
        nv.sendKeysMethod(dc.getFormNameInput(), "TEST321321321321");
        nv.sendKeysMethod(dc.getFormCodeInput(), "TEST321321321321");
        dc.waitUntilClickable(dc.getSaveButton());
        nv.clickMethod(dc.getSaveButton());
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        nv.verifyContainsText(dc.getSuccessMessage(), "successfully");
    }

    @When("Delete country")
    public void deleteCountry() {
        dc.sendKeysMethod(dc.getNameSearch(),"TEST321321321321");
        dc.sendKeysMethod(dc.getCodeSearch(),"TEST321321321321");
        dc.clickMethod(dc.getSearchButton());
        dc.wait.until(ExpectedConditions.not(ExpectedConditions.numberOfElementsToBe(By.cssSelector("ms-delete-button[class='ng-star-inserted']"), 10)));
        dc.clickMethod(dc.getDeleteButton());
        dc.clickMethod(dc.getConfirmDeleteButton());
    }

    @And("Click on add button")
    public void clickOnAddButton() {
        dc.clickMethod(dc.getAddButton());
    }

    @When("Enter country name as {string} and code as {string}")
    public void enterCountryNameAsAndCodeAs(String countryName, String countryCode) {
        dc.sendKeysMethod(dc.getFormNameInput(), countryName);
        dc.sendKeysMethod(dc.getFormCodeInput(), countryCode);
    }

    @And("Click on save button")
    public void clickOnSaveButton() {
        dc.clickMethod(dc.getSaveButton());
    }
}
