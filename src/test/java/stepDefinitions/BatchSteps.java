package stepDefinitions;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.junit.Assert;

import baseClass.TestBase;
import io.cucumber.java.en.*;

public class BatchSteps extends TestBase{
	String key = RandomStringUtils.randomAlphabetic(5);
	int classes = RandomUtils.nextInt();
	
	@Given("User clicks on Edit button")
	public void user_clicks_on_edit_button() {
		bp.editField();
	}
	@Given("User is on Batch details page pop-up box")
	public void user_is_on_batch_details_page_pop_up_box(){
		flag = bp.batchDetailsPopUp();
		Assert.assertEquals(true, flag);;
	}
	@When("User edits {string}")
	public void user_edits(String field) throws InterruptedException {
		switch(field)
		{
		case "Name":
			bp.enterBatchName(key);
		break;
		
		case "Description":
			bp.enterDescription(key);
		break;
		
		case "Program Name":
			bp.enterProgramName();
		break;
		
		case "Status":
			Thread.sleep(3000);
			bp.editStatus();
		break;
	
		case "No of classes":
			bp.enterNoOfClasses(Integer.toString(classes));
		break;
				
		default:
		System.out.println("Invalid message");
		break;
		}
	}
	@When("User clicks on {string} button")
	public void user_clicks_on_button(String string) throws InterruptedException {
		
		if (string.equals("Save"))
		{
			bp.saveButtonClick();
		}
		else if (string.equals("Cancel"))
		{
			bp.cancelButtonClick();
			Thread.sleep(3000);
		}
		else if (string.equals("A New Batch"))
		{
			bp.addNewBatchClick();
		}
		else
			System.out.println("Invalid button");
	}
	@Then("User can see edited {string}")
	public void user_can_see_edited(String field) throws InterruptedException  {
		switch(field)
		{
		case "Name":
			Thread.sleep(3000);
			Assert.assertEquals(true, bp.recordBatchNameEdit(key));
		break;
		
		case "Description":
			Thread.sleep(3000);
			Assert.assertEquals(true, bp.recordDescription(key));
		break;
		
		case "Program Name":
			//Thread.sleep(3000);
			//Assert.assertEquals(true, bp.recordProgramName());
		break;
		
		case "Status":
			Thread.sleep(3000);
			Assert.assertEquals(false, bp.recordStatus());
		break;
	
		case "No of classes":
			Thread.sleep(3000);
			Assert.assertEquals(true, bp.recordNoOfClasses(Integer.toString(classes)));
		break;
				
		default:
		System.out.println("Invalid message");
		break;
		}
	}
	@Then("User can see Successful {string} alert")
	public void user_can_see_alert(String expectedmsg) throws InterruptedException {
		
		actualmsg=bp.alertBatchCreated();		
		Assert.assertEquals(expectedmsg,actualmsg);
	}
	@Then("User can see Batch Details are not updated")
	public void user_can_see_batch_details_are_not_updated() {
		Assert.assertEquals(false, bp.recordBatchNameEdit(key));
	}
	@When("User searches and verifies the newly updated {string}")
	public void user_searches_and_verifies_the_newly_updated(String string) {
		bp.boxSearch(key);
		bp.recordBatchNameSearch(key);
	}
	@Then("User verifies the details are correctly updated")
	public void user_verifies_the_details_are_correctly_updated() {

	}
	@Then("User gets a message {string}")
	public void user_gets_a_message(String msg) throws InterruptedException {
		switch(msg)
		{
		case "Name is required.":
		actualmsg=bp.nameIsRequiredMsg();
		Assert.assertEquals(msg, actualmsg);
		break;
		
		case "batch created":
		Assert.assertEquals(msg, bp.alertBatchCreated());
		break;
		
		default:
		System.out.println("Invalid message");
		break;
		}
	}
	@Then("User can see Batch Details form disappears")
	public void user_can_see_batch_details_form_disappears() {
		flag = bp.batchDetailsPopUp();
		Assert.assertEquals(false, flag);;
	}
	@When("User enters {string} in text box {string}")
	public void user_enters_in_text_box(String details, String boxName) {
		switch(boxName)
		{
		case "Batch Name":
			bp.enterBatchName(key);
			break;
			
		case "Description":
			bp.enterDescription(details);
			break;
			
		case "No of classes":
			bp.enterNoOfClasses(details);
			break;
			
		default:
			System.out.println("Invalid text box");
			break;
		}
	}
	@When("User selects Program name")
	public void user_selects_program_name() throws InterruptedException{
		bp.enterProgramName();
	}
	@When("User selects {string} using radio button")
	public void user_selects_using_radio_button(String btn) throws InterruptedException {
		if(btn.equals("Active")) {
			Thread.sleep(3000);
			bp.activeButtonClick();
		}
		else if(btn.equals("Inactive")) {
			Thread.sleep(3000);
			bp.inactiveButtonClick();
		}
		else {
			System.out.println("Invalid input");
		}
	}
	@Then("Records of the newly created {string} is displayed")
	public void records_of_the_newly_created_is_displayed(String batchName) throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertEquals(true, bp.recordBatchName(key));
	
	}
}
