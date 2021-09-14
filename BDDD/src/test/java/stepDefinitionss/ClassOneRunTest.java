package stepDefinitionss;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(  
		
		monochrome=true,
		dryRun=false,
		
	    features = "src/test/java/Featuress",
	    glue="stepDefinitionss" ,
	    
	    tags = "@Important", //it will run whole feature if it applies at the top of the feature in the feature file
	   // tags = "@Smoke,@Regression" , //it will run smoke if it finds and if it finds regression then it will run that also[OR COndition]
	   // tags = {"@Smoke", " @Regression" },  //AND Conditions, it will run both smoke and regression scenarios
	    plugin= {
	    		"pretty",
	    		"html:target/cucumber-htmlreport",
	    		"json:target/cucumber-jsonreport.json",
	    		//"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html",
	    		
	    		
	    		
	    }
	    
		)

public class ClassOneRunTest {

}
