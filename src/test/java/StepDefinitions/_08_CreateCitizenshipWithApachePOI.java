package StepDefinitions;

import Pages.DialogContent;
import Utilities.ExcelUtilities;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;

public class _08_CreateCitizenshipWithApachePOI {

    DialogContent dc = new DialogContent();
    @Then("Create a citizenship with Apache POI")
    public void createACitizenshipWithApachePOI() {

        ArrayList<ArrayList<String>> citizenshipData =
                ExcelUtilities.getDataFromExcel("src/test/java/ApachePOI/Resources/ApacheExcel2.xlsx", "testCitizen", 2);


        for (int i = 0; i < citizenshipData.size(); i++) {

            dc.clickMethod(dc.getAddButton());
            dc.sendKeysMethod(dc.getFormNameInput(), citizenshipData.get(i).get(0));
            dc.sendKeysMethod(dc.getCitizenshipShortName(), citizenshipData.get(i).get(1));
            dc.clickMethod(dc.getSaveButton());
            dc.verifyContainsText(dc.getSuccessMessage(), "success");
            dc.wait.until(ExpectedConditions.invisibilityOf(dc.getSuccessMessage()));
        }

    }
}
