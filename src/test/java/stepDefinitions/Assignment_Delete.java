package stepDefinitions;

import org.junit.Assert;

import baseClass.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Assignment_Delete extends TestBase {
	
	
	@Given("When User is on <Module> page")
	public void when_user_is_on_module_page() {
		as.clickAssignment();
	}
	
	//Single file deletion
	@Given("User clicks on <Delete> button")
	public void user_clicks_on_delete_button() {
	    as.deleteSingleRecord();
	    as.deleteConfirmation();
	}

	@Given("Confirm deletion popup opens")
	public void confirm_deletion_popup_opens() {
		//flag = as.deleteConfirmation();
	   // Assert.assertTrue(flag);
		
	}

	@When("User clicks <Yes> button")
	public void user_clicks_yes_button() throws Exception {
		as.clickYesforDelete();
		Thread.sleep(2000);
	}
	
	
	@Then("User can see {string} delete message")
	public void user_can_see_delete_message(String expectedmsg) {
		actualmsg=as.Deletemsg();
		Assert.assertTrue(expectedmsg, actualmsg.contains("Successful"));
		
	}



	@When("User clicks <No> button")
	public void user_clicks_no_button() {
	  as.clickNoforDelete();
	}

	@Then("User can see Confirm Deletion form disappears")
	public void user_can_see_confirm_deletion_form_disappears() {
	
	}

	//Multiple Assignments deletion
	
	@Given("User selects more than one checkbox")
	public void user_selects_more_than_one_checkbox() {
		as.checkBoxSelect();
	}

	@When("User clicks on <Delete> button on top left corner")
	public void user_clicks_on_delete_button_on_top_left_corner() {
	   as.topDeleteButtonClick();
	   flag = as.topDeleteButtonStatus();
	   Assert.assertTrue(flag);
	}

	@Then("User lands on Confirm Deletion form")
	public void user_lands_on_confirm_deletion_form() {
		
		boolean display = as.deleteConfirmation();
		if(display) {
			as.clickYesforDelete();
		}
		else {
			as.clickNoforDelete();
		}
		
						
		}
	
		}