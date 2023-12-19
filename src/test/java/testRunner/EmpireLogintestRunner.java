package testRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class EmpireLogintestRunner {
	
	@RunWith(Cucumber.class)
	@CucumberOptions
	        (
	        		features = "./Features/EmpireHomeLogin.feature",
	        		glue = "stepDefinitions",
	        		dryRun = false,
	        		monochrome =true,
	        		plugin = {"pretty","html:test-output"}
	        		
	        		
	        		
	        		
			)
	public class LoginTestRunner {

	}

}
