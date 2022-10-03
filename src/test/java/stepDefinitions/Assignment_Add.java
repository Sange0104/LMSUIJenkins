package stepDefinitions;

import org.junit.Assert;

import baseClass.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Assignment_Add extends TestBase {
		
	
	@And("User clicks on Assignment tab")
	public void user_clicks_on_assignment_tab() {
		as.clickAssignment();
	}

	@And("User is on Assignment page")
	public void user_is_on_assignment_page() throws InterruptedException {

		String Expheader = "Manage Assignment";
		String Actheader = as.assignPageHeading();		
		Assert.assertEquals(Expheader,Actheader);
		System.out.println(Actheader);
		
	
	}
	
	//Assignment Add steps
	    
    @When("User clicks A New Assignment button")
	public void user_clicks_a_new_assignment_button() {
    	as.clickNewAssign();
	}
    
    @Then("user can see Assignment details form")
    public void user_can_see_assignment_details_form() {
	 
    	flag = as.assignDetailsPopup();
    	Assert.assertTrue(flag);
	}
    
	@When("User clicks Save button without entering data")
	public void user_clicks_save_button_without_entering_data() {
		as.clickNewAssign();
		as.clickSave();
		}
	
	@Then("User gets message {string}")
	public void user_gets_message(String expected) throws InterruptedException {
		//msg = "Name is required.";
		String actual = as.validateNamefield();
	  Assert.assertTrue(actual.contains("Name"));
	  Thread.sleep(2000);
		}
	
	@When("user enters Assignment name")
	public void user_enters_assignment_name() {
		as.clickNewAssign();
		as.setAssignName();
		as.clickSave();
		}
		
	@Then("User can see {string} entered") 
	public void user_can_see_entered(String expectedName) {
	
	}
		 
	
	  @When("user enters Assignment description") 
	  public void user_enters_assignment_description() { 
		  as.clickNewAssign();
		  as.setAssignName();
		  as.setAssignDesc();
	  }
	    	  
	  @When("user enters assignment grade") 
	  public void user_enters_assignment_grade() { 
		 as.clickNewAssign();
		 as.setAssignName();
		  as.setNewGrade();
		  as.clickSave();
		  
	  }
	  
	  @Then("user can see {string} entered")

		public void user_can_see_entered1(String expectedgrade) {
		 
		 
	  }
   
	  @When("user enters assignment due date") 
	  public void user_enters_assignment_due_date() { 
		  
		  as.clickNewAssign();
		  as.setAssignName();
		  as.assignDueDate();
		  as.clickSave();
		  }
	  
	  @Then("user can see \"Assignment due date'") 
	  public void user_can_see_assignment_due_date() { 
		  
		 
	  }
	  
	  @When("User clicks on <Cancel> button") 
	  public void user_clicks_on_cancel_button()
	  {  
		  as.clickNewAssign();
		  as.setAssignName();
		  as.clickCancel();
	  }
	  
	  @Then("User can see Assignment Details form disappears") 
	  public void user_can_see_assignment_details_form_disappears() { 
		  
	  }
	  
	  @When("User clicks the <Save> button") 
	  public void user_clicks_the_save_button() { 
		  as.clickNewAssign();
		  as.setAssignName();
		  as.setAssignDesc();
		  as.setNewGrade();
		  as.assignDueDate();
		  as.clickSave();
		  
	  }
	  
	  @Then("User can see {string} message") 
	  public void user_can_see_message(String expectedmsg) { 
		  actualmsg =as.Successmsg();
		  
		  //Assert.assertEquals(expectedmsg, (actualmsg.contains("Successful")));
		  	Assert.assertTrue((actualmsg.contains("Successful")));
	  }
	  
	  //Search
	  
	  @When("User clicks on search with <name phrase> into search box.")
		public void user_clicks_on_search_with_name_phrase_into_search_box(String string) {
		    
		  
		}
	  
	  @Then("Text box used for search has text as {string}")
	  public void text_box_used_for_search_has_text_as(String string) {
		  Assert.assertEquals(string, as.searchText());
	      
	  }



	  //Sort
	  
	  
}
		  
	  
	  