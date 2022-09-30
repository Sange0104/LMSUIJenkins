package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//span[contains(text(),'LMS - Learning Management System')]") 
	@CacheLookup
	WebElement title;
	
	@FindBy(xpath="//app-header/mat-toolbar[1]/button[1]/span[1]")
	@CacheLookup
	WebElement prgbtn ;
	
	@FindBy(xpath="//span[contains(text(),'Batch')]")
	@CacheLookup
	WebElement btchbtn ;
	
	@FindBy(xpath="//span[contains(text(),'User')]")
	@CacheLookup
	WebElement usrbtn ;
	
	@FindBy(xpath="//span[contains(text(),'Assignment')]")
	@CacheLookup
	WebElement assgbtn ;
	
	@FindBy(xpath="//span[contains(text(),'Attendance')]")
	@CacheLookup
	WebElement attdbtn ;
	
	@FindBy(xpath="//span[contains(text(),'Logout')]")
	WebElement btnlogout;
	
	
	
	
	public String TitleValidationTest() {
	   title.isDisplayed();
	return driver.getTitle();
	   
	 }
	
	public void ValidateProgrambtn(){
		prgbtn.isDisplayed();
	}

	public void Validatebatchbtn(){
		btchbtn.isDisplayed();
	}
	public void Validateuserbtn() {
		usrbtn.isDisplayed();
}
	public void Validateassignbtn() {
		assgbtn.isDisplayed();
		
	}
	public void Validateattendbtn() {
		attdbtn.isDisplayed();
	}
	public void Validatelogoutbtn() {
		btnlogout.isDisplayed();
	}
	
	public ProgramPage clickProgram(){
		prgbtn.click();
	return new ProgramPage(driver);
	}

	public BatchPage clickbatch(){
		btchbtn.click();
	return new BatchPage(driver);
	}

	public UserPage clickuser() {
		usrbtn.click();
	return new UserPage(driver);
	}

	public AssignmentPage clickassg() {
		assgbtn.click();
	return new AssignmentPage(driver);
	}
	public AttendancePage clickattd() {
		attdbtn.click();
	return new AttendancePage(driver);
	
	}
	public LoginPage clickLogout()
	{
		btnlogout.click();
	return new LoginPage(driver);
}
	
}