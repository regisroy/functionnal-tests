package functional;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format={"pretty", "html:target/cucumber/html", "json:target/cucumber/json/cucumber.json"})
public class RunCucumberTest {

}