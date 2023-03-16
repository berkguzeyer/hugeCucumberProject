package StepDefinitions;

import Pages.DialogContent;
import Utilities.BasicDriver;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _01_LoginSteps {

    DialogContent dialogContent = new DialogContent(); // in order to reach DialogContent class's variables

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        BasicDriver.getDriver().get("https://test.mersys.io/");
        BasicDriver.getDriver().manage().window().maximize();
        BasicDriver.getDriver().manage().deleteAllCookies();
    }

    @When("Enter username and password")
    public void enter_username_and_password() {
        dialogContent.waitUntilVisible(dialogContent.getLoginUsername());
//        wait.until(ExpectedConditions.visibilityOf(dialogContent.getLoginUsername()));
        dialogContent.sendKeysMethod(dialogContent.getLoginUsername(), "turkeyts");
        dialogContent.sendKeysMethod(dialogContent.getLoginPassword(), "TechnoStudy123");
//        dialogContent.getLoginUsername().sendKeys("turkeyts");
//        dialogContent.getLoginPassword().sendKeys("TechnoStudy123");
    }

    @When("Click on Login Button")
    public void click_on_login_button() {
        dialogContent.clickMethod(dialogContent.getLoginButton());
//        dialogContent.getLoginButton().click();
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {
        dialogContent.waitUntilVisible(dialogContent.getDashboardText());
        Assert.assertTrue(dialogContent.getDashboardText().isDisplayed());
//        dialogContent.clickMethod(dialogContent.getAcceptCookies());
    }


}
