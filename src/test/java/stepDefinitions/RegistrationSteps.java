package stepDefinitions;

import org.junit.Assert;

import baseClass.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import pageObjects.RegistrationPage;

public class RegistrationSteps extends TestBase{
	

	@Then("User should see the title of the page as {string}")
	public void user_should_see_the_title_of_the_page_as(String string) {
	 rp.RP_RegistrationformText();
	}
	@When("User enters First Name as {string} and Last Name as {string} and Mobile Number as {string} and Address as\"{int}\" and Street Name as\"Abbey Road\" and City as \"Windsor\" and State as \"New Jersy\" and Zip as \"{int}\" and Birth date as \"<Birth date>\" and UserName as \"JohnSmith\"and Email as \"john.smith\" and Password as \"hello@{int}\"")
	public void user_enters_first_name_as_and_last_name_as_and_mobile_number_as_and_address_as_and_street_name_as_abbey_road_and_city_as_windsor_and_state_as_new_jersy_and_zip_as_and_birth_date_as_birth_date_and_user_name_as_john_smith_and_email_as_john_smith_and_password_as_hello(String FirstName, String LastName, String Address, Integer Street,Integer MobileNumber , Integer Birthdate , Integer zip ) {
	    rp.RP_allFields(FirstName, LastName, arr, Address, Address, arr, Address, Address, arr, FirstName, LastName, Address);
	}
	@When("User clicks on SIGN UP Button")
	public void user_clicks_on_sign_up_button() {
	    rp.RP_SinUpButton();
	}
	
	@Then("User should see a message {string}")
	public void user_should_see_a_message(String message) {
	    String alert = rp.RP_Alert();
		Assert.assertEquals(message,alert);

	}
	
	@Then("user should direct to Sign Up page")
	public void user_should_direct_to_sign_up_page() {
	    
	}
	
	@When("User enters First Name as {string} and Last Name as {string} and Mobile Number as {string} and Address as\"{int}\" and Street Name as\"Abbey Road\" and City as \"Windsor\" and State as \"New Jersy\" and Zip as \"{int}\" and Birth date as \"<Birth date>\" and UserName as \"JohnSmith\"and Email as \"john.smith@gmail.com\" and Password as \"hello@{int}\"")
	public void user_enters_first_name_as_and_last_name_as_and_mobile_number_as_and_address_as_and_street_name_as_abbey_road_and_city_as_windsor_and_state_as_new_jersy_and_zip_as_and_birth_date_as_birth_date_and_user_name_as_john_smith_and_email_as_john_smith_gmail_com_and_password_as_hello(String string, String string2, String string3, Integer int1, Integer int2, Integer int3) {
	   rp.RP_allFields(string, string2, string3, arr, arr);
	}
		
	
	@When("User enters First Name as {string} and Last Name as {string} and Mobile Number as {string} and Address as\"{int}\" and Street Name as\"Abbey Road\" and City as \"Windsor\" and State as \"New Jersy\" and Zip as \"{int}\" and Birth date as \"<Birth date>{string}\"and Email as \"john.smith@gmail.com\" and Password as \"hello@{int}\"")
	public void user_enters_first_name_as_and_last_name_as_and_mobile_number_as_and_address_as_and_street_name_as_abbey_road_and_city_as_windsor_and_state_as_new_jersy_and_zip_as_and_birth_date_as_birth_date_and_email_as_john_smith_gmail_com_and_password_as_hello(String string, String string2, String string3, Integer int1, Integer int2, String string4, Integer int3) {
	
	}
	
	@When("User enters First Name as {string} and Last Name as {string} and Mobile Number as {string} and Address as\"{int}\" and Street Name as\"Abbey Road\" and City as \"Windsor\" and State as \"New Jersy\" and Zip as \"{int}\" and Birth date as \"<Birth date>\" and UserName as \"JohnSmith\"and Email as \"john.smith@gmail.com\" and Password as \"\"")
	public void user_enters_first_name_as_and_last_name_as_and_mobile_number_as_and_address_as_and_street_name_as_abbey_road_and_city_as_windsor_and_state_as_new_jersy_and_zip_as_and_birth_date_as_birth_date_and_user_name_as_john_smith_and_email_as_john_smith_gmail_com_and_password_as(String string, String string2, String string3, Integer int1, Integer int2) {
	    
	}
	
	@Then("User should see error {string}")
	public void user_should_see_error(String error) {
		String alert = rp.RP_Alert();
		Assert.assertEquals(error,alert);
	}

	@When("User clicks on LOGIN IN Button")
	public void user_clicks_on_login_in_button() {
		rp.RP_LoginHereButton();
		
	}

	@Then("User direct to Login in page")
	public void user_direct_to_login_in_page() {
	 LoginPage lp= new LoginPage(driver);
	}	
}