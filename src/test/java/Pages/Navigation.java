package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navigation extends MyMethods { // always extend from "Pages" so you won't have to create to many objects for MyMethods class

    public Navigation() {
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupBtn;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameterBtn;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    private WebElement countriesBtn;

    @FindBy(xpath = "//a[@href='/citizenships/list']")
    private WebElement citizenshipButton;

     @FindBy(xpath = "(//span[text()='Fees'])[1]")
    private WebElement feesButton;



    public WebElement getFeesButton() {
        return feesButton;
    }

    public WebElement getCitizenshipButton() {
        return citizenshipButton;
    }

    public WebElement getSetupBtn() {
        return setupBtn;
    }

    public WebElement getParameterBtn() {
        return parameterBtn;
    }

    public WebElement getCountriesBtn() {
        return countriesBtn;
    }
}
