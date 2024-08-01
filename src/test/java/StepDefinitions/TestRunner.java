package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/Features",
        glue = {"CucumberJava"},
        monochrome = true,
        plugin = {"pretty", "html:target/reports/Reports.html"},
        tags = "@SmokeTest")
public class TestRunner {
}
