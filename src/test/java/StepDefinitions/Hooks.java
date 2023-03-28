package StepDefinitions;

import Utilities.DriverClass;
import Utilities.ExcelUtilities;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;
import java.time.LocalDateTime;


public class Hooks {

    LocalDateTime startDateTime;
    @Before
    public void beforeScenario() {
        System.out.println("Scenario has started.");
        startDateTime = LocalDateTime.now();
    }

    @After
    public void afterScenario(Scenario scenario) {
        System.out.println("Scenario has ended.");
        LocalDateTime endTime = LocalDateTime.now();
        Duration duration = Duration.between(startDateTime, endTime);
        if (scenario.isFailed()) {
            final byte[] byteImage = ((TakesScreenshot) DriverClass.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(byteImage, "image/png", scenario.getName());
            ExcelUtilities.writeInExcel("src/test/java/ApachePOI/Resources/CampusReport.xlsx", scenario, startDateTime, endTime, duration);
        }
        ExcelUtilities.writeInExcel("src/test/java/ApachePOI/Resources/CampusReport.xlsx", scenario, startDateTime, endTime, duration);
        DriverClass.quitDriver();

    }

//    @BeforeStep
//    public void beforeStep(){
//        System.out.println("Step has started.");
//    }
//
//    @AfterStep
//    public void afterStep(){
//        System.out.println("Step has ended.");
//    }
}



// Save the screenshot to our computer
//            TakesScreenshot takesScreenshot = (TakesScreenshot) DriverClass.getDriver();
//            File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
//            LocalDateTime timeOfError = LocalDateTime.now();
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMddyyyHHmmss");
//            try {
//                FileUtils.copyFile(file, new File("src/test/java/Screenshots/screenshot"+timeOfError.format(formatter)+".png"));
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }