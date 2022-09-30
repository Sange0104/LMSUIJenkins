package stepDefinitions;

import org.junit.Assert;

import baseClass.TestBase;
import io.cucumber.java.en.*;


public class CommonSteps extends TestBase {
	
	@Given("User is logged on to LMS website")
	public void user_is_logged_on_to_LMS_website() throws InterruptedException
	{
	lp.ValidLogin(prop.getProperty("username"), prop.getProperty("password"));	
	}
	
	@Then("User should see a heading with text {string} on the {string} page")
	public void user_should_see_a_heading_with_text_on_the_page(String heading, String module) {
	    
		switch(module) {
		case "Program":
			Assert.assertEquals(heading, pp.ValidateProgramPg());
			break;
		case "Batch":
			Assert.assertEquals(heading, bp.batchPageHeading());
			break;
		case "User":
			Assert.assertEquals(heading, up.userPageHeading());
			break;
		case "Assignment":
			Assert.assertEquals(heading, as.assignPageHeading());
			break;
		default:
			System.out.println("Invalid Module");
		}
	}
	
	@When("User is on {string} page")
	public void user_is_on_page(String module) {
		
			switch(module) {
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
			default:
				System.out.println("Invalid Module");
			}
		}
	
	@Then("User should see the Delete button on the top left hand side of {string} page as Disabled")
	public void user_should_see_the_delete_button_on_the_top_left_hand_side_as_disabled(String module) {
		
		switch(module) {
		case "Program":
			Assert.assertEquals(false, pp.topDeleteButtonStatus());
			break;
		case "Batch":			
			Assert.assertEquals(false, bp.topDeleteButtonStatus());
			break;
		case "User":
			Assert.assertEquals(false, up.isTopDeleteDisable());
			break;
		case "Assignment":
			Assert.assertEquals(false, as.topDeleteButtonStatus());
			break;
		default:
			System.out.println("Invalid Module");
		}
	}
	
	@Then("Text box used for search has text as {string} on {string} page")
	public void text_box_used_for_search_has_text_as(String string, String module) {
		switch(module) {
		case "Program":
			Assert.assertEquals(string, pp.searchText());
			break;
		case "Batch":			
			Assert.assertEquals(string, bp.searchText());
			break;
		case "User":
			Assert.assertEquals(string, up.searchText());
			break;
		case "Assignment":
			Assert.assertEquals(string, as.searchText());
			break;
		default:
			System.out.println("Invalid Module");
		}
	}

	@Then("User should see the footer as {string} on {string} page")
	public void user_should_see_the_footer_as_on_page(String msg, String module) throws InterruptedException {
		Thread.sleep(3000);
		switch(module) {
		case "Program":
			actualmsg = pp.noOfRecords();
			Assert.assertEquals(msg, actualmsg);
			break;
		case "Batch":			
			actualmsg = bp.noOfRecords();
			Assert.assertEquals(msg, actualmsg);
			break;
		case "User":
			actualmsg = up.noOfRecords();
			Assert.assertEquals(msg, actualmsg);
			break;
		case "Assignment":
			actualmsg = as.noOfRecords();
			Assert.assertEquals(msg, actualmsg);
			break;
		default:
			System.out.println("Invalid Module");
		}
		
	}	
}
	


