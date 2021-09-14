package stepDefinitionss;


	import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	public class ClassOneCode {
		
		
		@Before
		public void start_up_method()
		{
			
			
			System.out.println("This is Before MEthod run");
		}
		
		@Given("^I am here to login to FB and on Login page$")
		public void i_am_here_to_login_to_FB_and_on_Login_page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new PendingException();
		    
		    System.out.println("This is Background code");
		}

		@When("^I am on Dec page \"([^\"]*)\"$")
		public void i_am_on_Dec_page(String arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new PendingException();
		    System.out.println("This is when code");
		}

		@When("^login with AUS user$")
		public void login_with_AUS_user() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			 System.out.println("This is when code");
		}

		@Then("^system allow me to complete the PFBR application$")
		public void system_allow_me_to_complete_the_PFBR_application() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			 System.out.println("This is then code");
		}

		@When("^when i enter the data in datable$")
		public void when_i_enter_the_data_in_datable(DataTable table) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			
			List<List<String>> data = table.raw();
			
			String value1 = data.get(1).get(0);
			String value2 = data.get(1).get(1);
			String value3 = data.get(1).get(2);
			
			String value4 = data.get(2).get(0);
			String value5 = data.get(2).get(1);
			String value6 = data.get(2).get(2);
			 System.out.println("This is value1 = "+value1);
			 System.out.println("This is value2 = "+value2);
			 System.out.println("This is value3 = "+value3);
			 
			 System.out.println("This is value4 = "+value4);
			 System.out.println("This is value5 = "+value5);
			 System.out.println("This is value6 = "+value6);
		}
		
		
		@Given("^this is given of outline sc$")
		public void this_is_given_of_outline_sc() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new PendingException();
		}

		@When("^enter \"([^\"]*)\"$")
		public void enter(String arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		   System.out.println("This is sce outline value "+arg1);
		}

		@When("^password \"([^\"]*)\"$")
		public void password(String arg2) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("This is sce outline value "+arg2);
		}


			@After
			public void tear_down_method()
			{
				
				
				System.out.println("This is After  MEthod run");
			}
		
		
		

	}


