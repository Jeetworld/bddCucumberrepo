package ClassTwo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(  
		
		monochrome=true,
		dryRun=false,
		
	    features = "src/test/java/ClassTwo/",
	    glue= "ClassTwo" ,
	    
	    plugin= {
	    		"pretty",
	    		"html:target/cucumber-htmlreportdd",
	    		"json:target/cucumber-jsonreportss.json",
	    		
	    		
	    		
	    }
	    
		)


public class RunTest {

}
