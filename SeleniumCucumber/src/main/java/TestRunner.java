import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/src/test/login.feature",glue={"/src/main/java/StepDefinations/LoginStepDefinitions.java"}
)
public class TestRunner {


}
