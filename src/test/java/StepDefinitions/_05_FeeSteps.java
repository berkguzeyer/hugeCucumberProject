package StepDefinitions;

import Pages.DialogContent;
import Pages.Navigation;
import Utilities.BasicDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class _05_FeeSteps {

    Navigation nv = new Navigation();
    DialogContent dc = new DialogContent();

    @Given("Navigate to the fee page")
    public void navigateToTheFeePage() {
        nv.clickMethod(nv.getSetupBtn());
        nv.clickMethod(nv.getParameterBtn());
        nv.clickMethod(nv.getFeesButton());
    }

    @And("Fill the add fee form")
    public void fillTheAddFeeForm(DataTable dataTable) {
        List<String> dataList = dataTable.asList(String.class);
        dc.sendKeysMethod(dc.getFormNameInput(), dataList.get(0));
        dc.sendKeysMethod(dc.getFormCodeInput(), dataList.get(1));
        dc.sendKeysMethod(dc.getIntegrationCodeInput(), dataList.get(2));
        dc.sendKeysMethod(dc.getPriorityInput(), dataList.get(3));

        Actions actions = new Actions(BasicDriver.getDriver());
        Action action = actions.keyDown(Keys.TAB).keyUp(Keys.TAB).build();
        action.perform();
    }

    @Given("Search for the fee")
    public void searchForTheFee(DataTable dataTable) {
        List<String> dataList = dataTable.asList(String.class);
        dc.sendKeysMethod(dc.getNameSearch(), dataList.get(0));
        dc.sendKeysMethod(dc.getCodeSearch(), dataList.get(1));
        dc.sendKeysMethod(dc.getPrioritySearchInput(), dataList.get(2));
        dc.clickMethod(dc.getSearchButton());
    }

    @When("Delete fee")
    public void deleteFee() {
        dc.wait.until(ExpectedConditions.not(ExpectedConditions.numberOfElementsToBe(By.cssSelector("ms-delete-button[class='ng-star-inserted']"), 10)));
        dc.clickMethod(dc.getDeleteButton());
        dc.clickMethod(dc.getConfirmDeleteButton());
    }
}
