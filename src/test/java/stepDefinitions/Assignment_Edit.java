package stepDefinitions;

import org.junit.Assert;

import baseClass.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class Assignment_Edit extends TestBase{

	@Given("User is on Assignment Details form")
	public void user_is_on_assignment_details_form() throws InterruptedException {
		lp.ValidLogin(prop.getProperty("username"), prop.getProperty("password"));	
		as.clickAssignment();
		as.editAssignments();
	}
	
	@When("User edits the Name")
	public void user_edits_the_name() {
		
		as.setAssignName();

	}
	
	@Then("User can see the updated Name")
	public void user_can_see_the_updated_name() {
		  Assert.assertTrue(as.editNameisDisplayed());
		
		
			
	}
	
	@When("User edits Description")
	public void user_edits_description() {
		//as.editAssignments();
		as.EditDescription();
		as.setAssignName();
		as.clickSave();
	}
	@Then("User can see updated Description")
	public void user_can_see_updated_description() {
		String edited = as.ConfirmDescr();
		
		Assert.assertEquals("Python Programming Language", edited);
	}

	@When("User edits Grade")
	public void user_edits_grade() {
		//as.editAssignments();
		as.EditDescription();
		as.setAssignName();
		as.setNewGrade();
	}
	@Then("User can see updated Grade")
	public void user_can_see_updated_grade() {
		 Assert.assertTrue(as.editGradeisDisplayed());
	}
	
	@When("User edits Due Date")
	public void user_edits_due_date() {
		//as.editAssignments();
		as.EditDescription();
		as.setAssignName();
		as.setNewGrade();
		as.assignDueDate();
	}
	@Then("User can see updated Due Date")
	public void user_can_see_updated_due_date() {
	
	}

	@When("User clicks <Cancel> button edit")
	public void user_clicks_cancel_button_edit() {
		as.clickCancel();
	}
	

	
	@When("User clicks <Save> button edit")
	public void user_clicks_save_button_edit() {
		as.EditDescription();
		as.setAssignName();
		as.setNewGrade();
		as.assignDueDate();
		as.clickSave();
	}


	@Then("User can see {string} edit message")
	public void user_can_see_edit_message(String expectedmsg) {
		
		 
		  actualmsg =as.Successmsg();
		 // Assert.assertTrue(expectedmsg, actualmsg.contains("Successful"));
		Assert.assertTrue(actualmsg.contains("Successful"));
	}

}