package IntegrationTest;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
      
        features = "src/test/resources/features/featuresBunnings/BunningsTest/TestCases/TestcaseBunnings.feature


)
public class CucumberTestSuite {

}
