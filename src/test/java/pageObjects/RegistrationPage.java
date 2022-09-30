package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
WebDriver driver;
	
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	} 
		
		@FindBy(xpath="//*[contains(text(),'Registration Form')]")
		WebElement RegistrationformText;	
		@FindBy(name="First Name")
		WebElement txtFirstName;
		@FindBy(name="Last Name")
		WebElement txtLastName;	
		@FindBy(id="Address")
		WebElement txtAddress;
		@FindBy(name="Street")
		WebElement txtStreet;	
		@FindBy(id="Zip")
		WebElement txtzip;
		@FindBy(name="City")
		WebElement txtcity;	
		@FindBy(name="state")
		WebElement txtstate;
		@FindBy(name="Mobile Number")
		WebElement txtMobileNumber;
		@FindBy(name="Birth date")
		WebElement txtBirthdate;
		@FindBy(xpath="//input[@value='Sign Up']")
		WebElement btnSignUp;
		@FindBy(name="UserName")
		WebElement txtUserName;
		@FindBy(name="Email")
		WebElement txtEmail;
		@FindBy(name="Password")
		WebElement txtpassword;
		@FindBy(xpath="//div[@class='alert alert-primary']")
		WebElement alert;
		@FindBy(xpath="//*[contains(text(),'Log in here')]")
		WebElement btnLoginHere;

		public void RP_title() {
			RegistrationformText.isDisplayed();
		}

		public void RP_allFields(String FirstName, String LastName, CharSequence[] MobileNumber, String Address,String Street,CharSequence[] zip,String state,String city,CharSequence[] Birthdate, String Email,String Username, String Password) {
			txtFirstName.sendKeys(FirstName);
			txtLastName.sendKeys(LastName);
			txtAddress.sendKeys(Address);
			txtStreet.sendKeys(Street);
			txtzip.sendKeys(zip);
			txtcity.sendKeys(city);
			txtstate.sendKeys(state);
			txtMobileNumber.sendKeys(MobileNumber);
			txtBirthdate.sendKeys(Birthdate);
			txtEmail.sendKeys(Email);
			txtUserName.sendKeys(Username);
			txtpassword.sendKeys(Password);

		}

		public void RP_SinUpButton() {
			btnSignUp.click();
	
		}

		public String RP_Alert() {
			return alert.getText();
		}
		public String RP_RegistrationformText() {
			return RegistrationformText.getText();
		}

		public void RP_LoginHereButton() {
			btnLoginHere.click();
		}
		//public void RP_allFields(String FirstName, String LastName, String Address, String Street, Integer zip, String city, String State, Integer MobileNumbe, Integer Birthdate, String Email, String Username, String password  ) {

		public void RP_allFields(String firstName, String lastName, String address, CharSequence[] street, CharSequence[] zip) {
			txtFirstName.sendKeys(firstName);
			txtLastName.sendKeys(lastName);
			txtAddress.sendKeys(address);
			txtStreet.sendKeys(street);
			txtzip.sendKeys(zip);
			
		}
		
		
		}
	