package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
public class Testrunner {
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features ="\\APItest\\src\\test\\resources\\features",
			glue= {"stepDefinitions"},
			dryRun= true
			)
	public class TestRunner {
	}

} 
