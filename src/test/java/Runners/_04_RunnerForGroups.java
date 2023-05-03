package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest", //Runs features that only have this annotation/tag
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin = {"pretty", "html:target/site/cucumber-pretty", "json:target/cucumber/cucumber.json"}
)
public class _04_RunnerForGroups extends AbstractTestNGCucumberTests {
}
