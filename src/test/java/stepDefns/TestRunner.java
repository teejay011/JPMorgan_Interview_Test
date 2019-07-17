package stepDefns;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
        //tags = "@test",
        monochrome = true
)
public class TestRunner {
}
