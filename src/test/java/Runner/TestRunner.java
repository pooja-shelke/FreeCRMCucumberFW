package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features", // Path of feature file
		glue = "StepDefination", // path of step definition file
		monochrome = true, // Give output in Particular format
				 plugin = {"pretty", // to generate reports
				            "html:target/cucumber/report.html",
				            "json:target/cucumber/report.json",
				            },
				
	   dryRun = false// Check mapping between feature file and step defination file
																									// features and step
																									// definition

)

public class TestRunner {

}
