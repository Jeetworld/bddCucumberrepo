package ClassTwo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class stepDef {
	
	
	@Given("^This is given statment of feature$")
	public void This_is_given_statment_of_feature()
	{
		
		System.out.println("This is new code");
		
	}
	
	@When("^This is when statment of feature$")
	public void This_is_when_statment_of_feature()
	{
		
		System.out.println("This is new code when");
		
	}
	

}
