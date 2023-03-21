package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature",
                "src/test/java/FeatureFiles/_02_Country.feature"},
        glue = {"StepDefinitions"},
        dryRun = true // when true: It only checks if your steps are defined and no problems
                      // when false: It runs your codes normally


)
public class _02_RunnerForMultipleFeatures extends AbstractTestNGCucumberTests {

}
