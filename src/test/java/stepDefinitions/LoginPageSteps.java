package stepDefinitions;

import org.junit.Assert;

import baseClass.TestBase;
import io.cucumber.java.en.*;
import pageObjects.LoginPage;

public class LoginPageSteps extends TestBase{
	
	LoginPage lp = new LoginPage(driver);
	
	@Given("User is on the browser")
	public void user_is_on_the_browser() {
		
	}

	@When("User opens the LMS Website")
	public void user_opens_the_lms_website() {
	
	}

	@Then("User should see the Login page")
	public void user_should_see_the_login_page() {
		LoginPage lp = new LoginPage(driver);
	}

	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		//ah= new ApplicationHooks();
		//ah.launchBrowser();
		LoginPage lp = new LoginPage(ApplicationHooks.driver);
		
	}
	
	@When("User enters {string} and {string}")
	//@When("^user enters (.*) and (.*)$")
	public void user_enters_(String username, String password){
		lp.enterUsername(username);
		lp.enterPassword(password);
	}
	
	

	/*
	 * When("^user enters (.*) and (.*)$") 
	 * public void user_enters_pooja_and(String
	 * username, String password) throws InterruptedException {
	 * driver.findElement(By.id("name")).sendKeys(username); Thread.sleep(3000);
	 * driver.findElement(By.id("password")).sendKeys(password); Thread.sleep(3000);
	 */


	@When("User clicks on Login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		Thread.sleep(3000);
		lp.clickLogin();
	}

	@Then("User lands on Home page")
	public void user_lands_on_home_page() {
           lp.clickLogout();
	}
	
	//@Given("User is on the login Page")
	//public void user_is_on_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	//}
	
	
	
	@Then("User should receive the message {string}")
	public void user_should_receive_the_message(String errmsg) {
	   
		String error=lp.errorMsg();
		Assert.assertEquals(errmsg , error);
				
	}

}
