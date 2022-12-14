import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "StepDefinition",
        features = "src/test/resources/features",
        tags = "@Test"
)

public class RunnerTest {
}