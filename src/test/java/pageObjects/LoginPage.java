package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		System.out.println("In Login Page");
	}
	
	@FindBy(id = "username")
	WebElement txtusername;
	
	@FindBy(id = "password")
	WebElement txtpassword;
	
	@FindBy(id = "login")
	@CacheLookup
	WebElement btnlogin;
	
	@FindBy(id="errormessage")
	@CacheLookup
	WebElement errmsg;
	
	@FindBy(xpath="//span[contains(text(),'Logout')]")
	WebElement btnlogout;
	
	public String login_title() {
		return driver.getTitle();
	}
	
	public void enterUsername(String user) {
		txtusername.clear();
		txtusername.sendKeys(user);
	}
	
	public void enterPassword(String password) {
		txtpassword.clear();
		txtpassword.sendKeys(password);
	}
	
	public void ValidLogin(String user, String password)
	{
		txtusername.clear();
		txtusername.sendKeys(user);
		txtpassword.clear();
		txtpassword.sendKeys(password);
		btnlogin.click();
				
	}
	
	public String errorMsg()
	{
		return errmsg.getText();
		
	}
	
	
	public HomePage clickLogin()
	{
		btnlogin.click();
		return new HomePage(driver);

	}
	
	public LoginPage clickLogout()
	{
		btnlogout.click();
		return new LoginPage(driver);

	}

}
