package cucumberpackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "C:\\Users\\ADMIN\\git\\cucumber_1\\Cucumber1\\src\\test\\java\\cucumberpackage\\A.feature", 
		
	glue = "cucumberpackage",
	tags = "@tag1",
		

		dryRun = false, monochrome = true

)

public class Testrunner {

}
