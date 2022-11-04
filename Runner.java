package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"./src/test/java"},
		glue = "stepDefinantion",
		
		dryRun = false,
		monochrome=true,
		
		plugin= {
				"pretty","html:target/htmlreport/report.html"
		}
		)

public class Runner extends AbstractTestNGCucumberTests {

}