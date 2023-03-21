package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles"}, //if you prove the package path, it will run the whole package
        glue = {"StepDefinitions"}
)
public class _03_RunnerForAllFeatures extends AbstractTestNGCucumberTests {
}
