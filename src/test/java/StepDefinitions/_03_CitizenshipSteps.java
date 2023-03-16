package StepDefinitions;

import Pages.DialogContent;
import Pages.Navigation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _03_CitizenshipSteps {

    DialogContent dc = new DialogContent();
    Navigation nv = new Navigation();

    @Given("Navigate to Citizenships page")
    public void navigateToCitizenshipsPage() {
        nv.clickMethod(nv.getSetupBtn());
        nv.clickMethod(nv.getParameterBtn());
        nv.clickMethod(nv.getCitizenshipButton());
    }

    @Then("Enter citizenship name as {string} and citizenship short name as {string}")
    public void enterCitizenshipNameAsAndCitizenshipShortNameAs(String citizenshipName, String citizenshipShortname) {
        dc.sendKeysMethod(dc.getFormNameInput(), citizenshipName);
        dc.sendKeysMethod(dc.getCitizenshipShortName(), citizenshipShortname);
    }

    @And("Search for Citizenship with name as {string} and short name as {string}")
    public void searchForCitizenshipWithNameAsAndShortNameAs(String citizenshipName, String citizenshipShortname) {
        dc.sendKeysMethod(dc.getNameSearch(), citizenshipName);
        dc.sendKeysMethod(dc.getCitizenshipShortNameSearch(), citizenshipShortname);

    }

    @And("Delete citizenship")
    public void deleteCitizenship() {
        dc.clickMethod(dc.getSearchButton());
        dc.wait.until(ExpectedConditions.not(ExpectedConditions.numberOfElementsToBe(By.cssSelector("ms-delete-button[class='ng-star-inserted']"), 10)));
        dc.clickMethod(dc.getDeleteButton());
        dc.clickMethod(dc.getConfirmDeleteButton());
    }
}
