package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature"}, // the feature files I want to run
        glue = {"StepDefinitions"} //package for all steps

)
public class _01_TestRunner extends AbstractTestNGCucumberTests {

}
