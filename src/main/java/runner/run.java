package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features = "src/test/resources/MakeMyTrip/MakeMyTrip.feature", glue = "StepDefination")
public class run extends AbstractTestNGCucumberTests {
	

}
