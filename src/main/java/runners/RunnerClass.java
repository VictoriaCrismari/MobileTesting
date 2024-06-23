package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:/Users/crism/IdeaProjects/AppiumBatch18/src/main/resources/features",
        glue = "steps",
        dryRun = false,
        tags = "@smoke"
)

public class RunnerClass {
}