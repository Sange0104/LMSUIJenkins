package stepDefinitions;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.junit.Assert;

import baseClass.TestBase;
import io.cucumber.java.en.*;
import pageObjects.LoginPage;
import pageObjects.ProgramPage;

public class ProgramSteps extends TestBase {
	
	String key = RandomStringUtils.randomAlphabetic(5);
	int classes = RandomUtils.nextInt();

	public static String edited;
	//Add New Program feature
	
	

	@And("User is on Manage Program page")
	public void user_is_on_manage_program_page() {
	   
        pp=new ProgramPage(ApplicationHooks.driver);
        
        //pp=new ProgramPage(driver);
	    
	    //Thread.sleep(2000);
	    String header= pp.ValidateProgramPg();
	    Assert.assertEquals("Manage Program", header);
	}




	/*@Then("User should see the text as {string} below the table")
	public void user_should_see_the_text_as_below_the_table(String string) {
	    
	}*/
   
	
		
	
	@And("User clicks <A New Program> button")
	public void user_clicks_a_new_program_button() {
	    pp.NewProgram();
	}
	
	@Then("Program Details pop box opens")
	public void program_details_pop_box_opens() {
		
		flag=pp.programDetailsPopUp();
	   // String heading=pp.PopUpDisplayed();
	   Assert.assertTrue(flag); 
	   // Assert.assertEquals("Program Details", heading);
	}
	
	
	
	@When("User clicks <Save> button without entering data")
	public void user_clicks_save_button_without_entering_data() {
	    pp.EmptySubmission();
	}
	@Then("User gets warning message {string}")
	public void user_gets_warning_message(String expectedmsg) {
	    actualmsg=pp.WarnMessage();
	    
	    Assert.assertEquals(expectedmsg, actualmsg);
	    
	}

	
	@When("User enters <Name> and <Description> in text box")
	public void user_enters_name_and_Description_in_text_box() {
	   
		pp.AddName();
		pp.AddDescrption();
		
	}
	
	
	
	@And("User selects <Status> using radiobutton")
	public void user_selects_status_using_radiobutton() {
	    
		pp.SelectRadioActbtn();
	}
		
	@And("User clicks <Save> button")
	public void user_clicks_save_button() {
	    
		pp.ClickSave();
	}

	@Then("User gets success message Successful {string}")
	public void user_gets_success_message(String expectedmsg) throws InterruptedException {
	    
		actualmsg=pp.Successmsg();
		
		//Assert.assertEquals(expectedmsg, actualmsg);
		
		Assert.assertEquals(expectedmsg,actualmsg);
	}

	
	@When("User clicks <Cancel> button")
	public void user_clicks_cancel_button() {
	   pp.ClickCancel();
	}
	
	@Then("User can see Program Details form disappears")
	public void user_can_see_program_details_form_disappears() {
	    
	}

	
	@When("User clicks on <X>")
	public void user_clicks_on_x() {
	     pp.ClickX();
	}
	@Then("Pop up box gets closed")
	public void pop_up_box_gets_closed() {
	    
	}


// Program Edit Feature
	
	
	@Given("User clicks on <Edit> button")
	public void user_clicks_on_edit_button() {
	//	pp.EditName();
	    pp.ClickEdit();
	}
	
	@When("User edits Name")
	public void user_edits_name() {
	    pp.EditName();
	}
	
	@Then("User can see updated Name")
	public void user_can_see_updated_name() {
		edited=pp.ConfirmNameEdit();
		
		Assert.assertEquals("Python99", edited);
	    
	}
	
	
	@When("User edits Program description")
	public void user_edits_program_description() {
	    pp.EditDescription();
	}
	
	@And("selects the Save button")
	public void selects_the_save_button() {
		pp.ClickSave();
	    
	}
	
	
	
	@Then("User can see updated description")
	public void user_can_see_updated_description() {
	    edited= pp.ConfirmDescr();
	    
	    Assert.assertEquals("Python Programming Language", edited);
	}
	
	
	
//	@When("User changes status")
//	public void user_changes_status() {
//		//pp.editStatus();
//	  
//	}
//	
//	@Then("User can see updated Status")
//	public void user_can_see_updated_status() {
//	   
//	}
//	
//	
//	
	@Then("User can see the Successful {string} message")
	public void user_can_see_the_message(String expectedmsg) throws InterruptedException {
		 actualmsg =pp.Successmsg();
		 Assert.assertEquals(expectedmsg,actualmsg);
	}


//PROGRAM SORT FEATURE
	
	
	@When("User clicks onthe Ascending arrow \\(down ) near to the Program name")
	public void user_clicks_onthe_ascending_arrow_down_near_to_the_program_name() {
	  pp.ProgramNmSort();;
	}
	@Then("User can see the results in Ascending order of Program name")
	public void user_can_see_the_results_in_ascending_order_of_program_name() {
	 // boolean output1=pp.ConfirmSort();
	  
	 // Assert.assertEquals(output1, true);
	}

	
	@When("User clicks onthe Ascending arrow \\(down ) near to the Program Description")
	public void user_clicks_onthe_ascending_arrow_down_near_to_the_program_description() {
	    
	}
	
	@Then("User can see the results in Ascending order of Program Description")
	public void user_can_see_the_results_in_ascending_order_of_program_description() {
	    
	}

	
	@When("User clicks on the Ascending arrow \\(down ) near to the Program Status")
	public void user_clicks_on_the_ascending_arrow_down_near_to_the_program_status() {
	   }
	@Then("User can see the results in Ascending order of Program Status")
	public void user_can_see_the_results_in_ascending_order_of_program_status() {
	 }
	
	@When("User clicks onthe Descending arrow \\(down ) near to the Program name")
	public void user_clicks_onthe_descending_arrow_down_near_to_the_program_name() {
	    }
	@Then("User can see the results in Descending order of Program name")
	public void user_can_see_the_results_in_descending_order_of_program_name() {
	}
	
	@When("User clicks onthe Descending arrow \\(down ) near to the Program Description")
	public void user_clicks_onthe_descending_arrow_down_near_to_the_program_description() {
	}
	@Then("User can see the results in Descending order of Program Description")
	public void user_can_see_the_results_in_descending_order_of_program_description() {
	 }

	
	@When("User clicks onthe Descending arrow \\(down ) near to the Program Status")
	public void user_clicks_onthe_descending_arrow_down_near_to_the_program_status() {
	}
	@Then("User can see the results in Descending order of Program Status")
	public void user_can_see_the_results_in_descending_order_of_program_status() {
	}




}