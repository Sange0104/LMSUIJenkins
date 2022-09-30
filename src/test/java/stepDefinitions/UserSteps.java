package stepDefinitions;

//import appHooks.ApplicationHooks;
import baseClass.TestBase;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pageObjects.LoginPage;
import pageObjects.ProgramPage;
import pageObjects.UserPage;


public class UserSteps extends TestBase {
   
	//@Given("User is logged on to LMS website")
	//public void user_opens_url() throws InterruptedException {
		//ah=new ApplicationHooks();
	    //ah.launchBrowser();
	   //lp= new LoginPage(ApplicationHooks.driver);
	    //lp.enterUsername("lms");
	    //lp.enterPassword("lms");
	    //lp.clickLogin();	    
//	}	   	
	
	
	//user.feature To check basic controls are displayed and enable==========//
	
	
	
	@Then("User should see all mandatory fields")
	public void user_should_see_all_mandatory_fields() {
		
		Assert.assertTrue(up.istxtSearchdisplayed());
		Assert.assertTrue(up.istxtSearchenabled());
		Assert.assertTrue(up.isbtnAddUsrdisplayed());
		Assert.assertTrue(up.isbtnAddUsrenabled());
		Assert.assertTrue(up.isCtrlPaginationDisplayed());
		Assert.assertTrue(up.isTopDeleteDisplayed());
		Assert.assertFalse(up.isTopDeleteDisable());	

	}

    //====================================================
	//User_Pagination.feature - To check functionality of pagination control
	
	//@Given("User is on Manage User page")
	//public void user_is_on_manage_user_page() {
	  
	//}
	
	
	@When("User is on first page of Manage User")
	public void user_is_on_first_page_of_manage_user() {
	     up.isOnFirstPage();
	     up.ClickFirstPageLink();
	}
	
	
	@When("Number of records are less than or equal to {int}")
	public void number_of_records_are_less_than_or_equal_to(Integer int1) {
	     
		  up.recordCount();
	}
	
	@Then("Pagination control is disable")
	public void pagination_control_is_disable() {
            up.isCtrlPaginationDisable();
	}

	
	@When("Number of records are more than {int}")
	public void number_of_records_are_more_than(Integer int1) {
		  up.recordCount();
	}


	@Then("Pagination control is enable")
	public void pagination_control_is_enable() {
		Assert.assertTrue(up.isCtrlPaginationEnable());
	    }
	

	@Then("Verify that previous link is disabled")
	public void verify_that_previous_link_is_disabled() {
		   //up.ClickFirstPageLink();
           Assert.assertTrue(up.DisablePrevLink());
//           Assert.assertTrue(up.DisableNextLink());
          

	    }


    @When("User is on the page number {string}")
    	public void user_is_on_the_page_number(String string) {
    	    
    	    up.ClickFirstPageLink();
    	}


    @When("User clicks navigate > button")
    	public void user_clicks_navigate_button() throws InterruptedException {
    	      Thread.sleep(3000);
              up.Clicknextlink();
    	}

    @Then("User navigated to page number {string}")
    	public void user_navigated_to_page_number(String string) {
    	       //up.Clicknextlink();
    	       up.ClickSecondPage();	
    	}


    @When("User is on page number {string}")
    public void user_is_on_page_number(String string) throws InterruptedException {
       Thread.sleep(3000);

    	up.ClickSecondPage();
    }
    
    @When("User clicks navigate < button")
    public void user_clicks_navigate_back_button() {
        up.Clickprevlink();
    }

    @When("User is on last page of Manage User")
    public void user_is_on_last_page_of_manage_user() throws InterruptedException {
    	Thread.sleep(3000);
       // up.ClickLastPageLink();
	    up.ClickFirstPageLink();
	    up.ClickLastPageLink();

    }
    
    @Then("Verify that next link is disabled")
    public void verify_that_next_link_is_disabled() throws InterruptedException {
		Thread.sleep(3000);

       up.ClickLastPageLink();

        Assert.assertTrue(up.DisableNextLink());
    }

    @When("User clicks << icon in pagination")
    public void user_clicks_icon_in_pagination() {
    	   
           up.ClickFirstPageLink();
    }
    
    @Then("User should see the First page of the table")
    public void user_should_see_the_first_page_of_the_table() {
        up.ClickFirstPageLink();
    }

    @When("User clicks >> icon in pagination")
    public void user_clicks_lasticon_in_pagination() {
    	        up.ClickFirstPageLink();
    }
    
    @Then("User should see the Last page of the table")
    public void user_should_see_the_last_page_of_the_table() throws InterruptedException {
    	Thread.sleep(3000);
        up.ClickLastPageLink();
    }

   //=======================================================================================================

    
  //Add New User


    @Given("User clicks on add new user button")
    public void user_clicks_on_add_new_user_button() {
    	//up.UserPageURL();
    	//hp.clickuser();
    	up.ClickAddNewUsr();
    }
    
    @Given("User Details frame pop up")
    public void user_details_frame_pop_up() throws InterruptedException {
    	up.DisplayUsrDetails();
    	up.EnableDisplay();
    	Thread.sleep(3000);
    } 
   
    
   
    
    
    @When("User enters First Name as {string} and Last Name as {string} and Email as {string} and Phone number as {string} and Email as {string} and Batch as {string} and Skill as {string} and Username as {string} and Password as {string}")
    public void user_enters_first_name_as_and_last_name_as_and_email_as_and_phone_number_as_and_email_as_and_batch_as_and_skill_as_and_username_as_and_password_as(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) throws InterruptedException {
       //	Thread.sleep(3000);
        up.InputValidDetails("FirstName", "LastName", "Email", "Phno", "Batch", "Skill", "Username", "Password");

    }

    @Then("Message displayed : {string}")
    public void user_gets_message(String string) {
		  actualmsg =up.Successmsg();
		  Assert.assertTrue((actualmsg.contains("Successful")));
    }

    
    
    @When("The user clicks on {string} button")
    public void The_user_clicks_on_valid_save_button(String string) {
    
    }
    
    
    @Then("Record of the newly created {string} is displayed")
    public void record_of_the_newly_created_is_displayed(String string) {
      
    }
    
    
    @When("User clicks on Submit button")
    public void user_clicks_on_submit_button() throws InterruptedException {
    	   up.ClickSubmit();
           Thread.sleep(3000);
    }


   

   
    @When("The user Clicks on Cancel button")
    public void user_clicks_on_cancel_button() throws InterruptedException {
       up.ClickAddNewUsr();
       up.ClickCancel();
		Thread.sleep(3000);

    }
    
    @Then("User can see User Details form disappears")
    public void user_can_see_user_details_form_disappears() {
       //up.DisplayUsrDetails();
    }

    
//============================================================================================================
    
    //Search Functionality on User Page

    @When("User enters  <name phrase> into search box.")
    	public void user_enters_name_phrase_into_search_box() {
    	      up.SerachInputByName();
    	}

    @Then("Entries for <name phrase> are shown")
    	public void entries_for_name_phrase_are_shown() {
    	}


    @When("User enters <email phrase> into search box")
    	public void user_enters_email_phrase_into_search_box() {
    	}

    @Then("Entries for <email phrase> are shown")
    	public void entries_for_email_phrase_are_shown() {
    	}


    @When("User enters <contact number phrase> into search box")
    	public void user_enters_contact_number_phrase_into_search_box() {
    	}


    @Then("Entries for <contact number phrase> are shown")
    	public void entries_for_contact_number_phrase_are_shown() {
    	}


    @When("User enters <batch phrase> into search box")
    	public void user_enters_batch_phrase_into_search_box() {
    	}

    @Then("Entries for <batch phrase> are shown")
    	public void entries_for_batch_phrase_are_shown() {
    	}



    @When("User enters <skill phrase> into search box")
    	public void user_enters_skill_phrase_into_search_box() {
    	}


    @Then("Entries for <skill phrase> are shown")
    	public void entries_for_skill_phrase_are_shown() {
    	}
//===========================================================================================================================
    
    //Single Delete   

//    @Given("User clicks on <Delete> button")
//    	public void user_clicks_on_delete_button() {
//    	
//    	
//    	}


//    @Given("Confirm deletion popup opens")
//    	public void confirm_deletion_popup_opens() {
//    	
//    	}

//    @When("User clicks <Yes> button")
//    	public void user_clicks_yes_button() {
//    	
//    	}

//    @Then("User can see {string} message")
//    	public void user_can_see_message(String string) {
//    	
//    	}
//
//    @When("User clicks <No> button")
//    	public void user_clicks_no_button() {
//    	
//    	}
//
//    @Then("User can see Confirm Deletion form disappears")
//    	public void user_can_see_confirm_deletion_form_disappears() {
//    	
//    	
//    	}

//=================================================================================================================================
   //Multiple Delete
    
//    @Given("User selects mulptiple Users using checkbox")
//    public void user_selects_mulptiple_users_using_checkbox() {
//        
//    }
//    @When("User clicks on <Delete> button on top left corner")
//    public void user_clicks_on_delete_button_on_top_left_corner() {
//            }
//    
//    
//
//    @When("User clicks <Yes> button	for multiple entries")
//    	public void user_clicks_yes_button_for_multiple_entries() {
//    	}
//
//
//    @When("User clicks <No> button for multiple entries")
//    	public void user_clicks_no_button_for_multiple_entries() {
//    	}    
//    
//    @Then("User lands on Confirm Deletion form")
//    public void user_lands_on_confirm_deletion_form() {
//        
//    }
//================================================================================================================
    //Sort Feature
    

//@When("User clicks on the Ascending arrow \\(down ) near to the User name")
//public void user_clicks_on_the_ascending_arrow_down_near_to_the_user_name() {
//}
//
//
//@Then("User can see the results in Ascending order of User name")
//public void user_can_see_the_results_in_ascending_order_of_user_name() {
//}
//
//
//@When("User clicks on the Ascending arrow \\(down ) near to the User ID")
//public void user_clicks_on_the_ascending_arrow_down_near_to_the_user_id() {
//}
//
//@Then("User can see the results in Ascending order of User ID")
//public void user_can_see_the_results_in_ascending_order_of_user_id() {
//}
//
//
//@When("User clicks on the Ascending arrow \\(down ) near to the email address")
//public void user_clicks_on_the_ascending_arrow_down_near_to_the_email_address() {
//}
//
//
//@Then("User can see the results in Ascending order of Email address")
//public void user_can_see_the_results_in_ascending_order_of_email_address() {
//}
//
//
//@When("User clicks on the Ascending arrow \\(down ) near to the contact number")
//public void user_clicks_on_the_ascending_arrow_down_near_to_the_contact_number() {
//    
//}
//
//
//
//@Then("User can see the results in Ascending order of Contact number")
//public void user_can_see_the_results_in_ascending_order_of_contact_number() {
//}
//
//
//
//@When("User clicks on the Ascending arrow \\(down ) near to the Batch")
//public void user_clicks_on_the_ascending_arrow_down_near_to_the_batch() {
//}
//
//
//@Then("User can see the results in Ascending order of batch")
//public void user_can_see_the_results_in_ascending_order_of_batch() {
//}
//
//
//
//@When("User clicks on the Ascending arrow \\(down ) near to the User Skill")
//public void user_clicks_on_the_ascending_arrow_down_near_to_the_user_skill() {
//}
//
//
//@Then("User can see the results in Ascending order of User skill")
//public void user_can_see_the_results_in_ascending_order_of_user_skill() {
//}
//
//
//@When("User clicks on the Descending arrow \\(down ) near to the User name")
//public void user_clicks_on_the_descending_arrow_down_near_to_the_user_name() {
//}
//
//
//@Then("User can see the results in Descending order of User name")
//public void user_can_see_the_results_in_descending_order_of_user_name() {
//}
//
//
//
//@When("User clicks on the Descending arrow \\(down ) near to the User ID")
//public void user_clicks_on_the_descending_arrow_down_near_to_the_user_id() {
//}
//
//
//@Then("User can see the results in Descending order of User ID")
//public void user_can_see_the_results_in_descending_order_of_user_id() {
//}
//
//
//@When("User clicks on the Descending arrow \\(down ) near to the email address")
//public void user_clicks_on_the_descending_arrow_down_near_to_the_email_address() {
//}
//
//
//@Then("User can see the results in Descending order of Email address")
//public void user_can_see_the_results_in_descending_order_of_email_address() {
//}
//
//
//
//@When("User clicks on the Descending arrow \\(down ) near to the contact number")
//public void user_clicks_on_the_descending_arrow_down_near_to_the_conatact_number() {
//}
//
//
//@Then("User can see the results in Descending order of Contact number")
//public void user_can_see_the_results_in_descending_order_of_contact_number() {
//}
//
//
//
//@When("User clicks on the Descending arrow \\(down ) near to Batch")
//public void user_clicks_on_the_descending_arrow_down_near_to_batch() {
//}
//
//@Then("User can see the results in Descending order of batch")
//public void user_can_see_the_results_in_Descending_order_of_batch() {
//}
//
//
//@When("User clicks on the Descending arrow \\(down ) near to the User Skill")
//public void user_clicks_on_the_descending_arrow_down_near_to_the_user_skill() {
//}
//
//
//@Then("User can see the results in Descending order of User skill")
//public void user_can_see_the_results_in_descending_order_of_user_skill() {
//}


//=================================================================================================














    


    

















	
	
	
	
	
}