package stepDefinitions;

import org.junit.Assert;

import baseClass.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AssignmentPage;
import pageObjects.AttendancePage;
import pageObjects.BatchPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.ProgramPage;
import pageObjects.UserPage;

public class HomePageSteps extends TestBase{
	
	
	@Given("User landed on the Homepage after logging into the LMS website")
	public void user_landed_on_the_homepage_after_logging_into_the_lms_website() {
	
	}
	
	@Then("User should see a title with text {string} on the Home page")
	public void user_should_see_a_title_with_text_on_the_home_page(String title) {
		hp.TitleValidationTest();
		
	   Assert.assertEquals("LMS", title);
	}
	
	@Then("All the tabs present are displayed")
	public void all_the_tabs_present_are_displayed() {
		 hp.ValidateProgrambtn();
		    hp.Validatebatchbtn();
		    hp.Validateuserbtn();
		    hp.Validateassignbtn();
		    hp.Validateattendbtn();
		    hp.Validatelogoutbtn();
	}
	
	@When("User clicks on {string} button on the menu bar")
	public void user_clicks_on_button_on_the_menu_bar(String click) throws InterruptedException {
		Thread.sleep(2000);
		switch(click) {
		case "Program":
			hp.clickProgram();
			break;
		case "Batch":
			hp.clickbatch();
			break;
		case "User":
			hp.clickuser();
			break;
		case "Assignment":
			hp.clickassg();
			break;
		case "Attendance":
			hp.clickattd();
			break;
		case "Logout":
			hp.clickLogout();
			break;
		default:
			System.out.println("Invalid Module");
		}
	
	}
	
	@Then("User should land on {string} page")
	public void user_should_land_on_page(String module) throws InterruptedException {
		
		Thread.sleep(3000);
		switch(module) {
		case "Program":
			 new ProgramPage(driver);
			break;
		case "Batch":
			new BatchPage(driver);
			break;
		case "User":
			new UserPage(driver);
			break;
		case "Assignment":
			new AssignmentPage(driver);
			break;
		case "Attendance":
			new AttendancePage(driver);
			break;
		case "Logout":
			new HomePage(driver);
			break;
		default:
			System.out.println("Invalid Module");
	}
}
}