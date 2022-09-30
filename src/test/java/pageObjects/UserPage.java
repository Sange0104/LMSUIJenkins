package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;


public class UserPage {
	WebDriver driver;
	
	public UserPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(xpath="//div[@class='box'][1]")
	WebElement header;
	
	//Add new user button
	@FindBy(xpath="//button[@id='new']")
	WebElement btnAddUsr;
	
	//User Detail frame after clicking add new user
	@FindBy(xpath="//body/app-root[1]/app-user[1]/div[1]/p-dialog[1]/div[1]/div[1]")
	WebElement FrmUsrDetails;
	
	@FindBy(xpath="//input[@placeholder='Search...']")
	WebElement txtSearchbox;
	
	//top delete button
	@FindBy(xpath="//div[1]/button[@icon='pi pi-trash'][1]")
	WebElement btnTopdelete;
	
	//heading checkbox
	@FindBy(xpath="//div[@class='p-checkbox-box']")
	WebElement chkBox1;
	
	//Userid sort
	@FindBy(xpath="//thead/tr[1]/th[2]")
	WebElement btnUsridsort;
	
	//User Name sort
	@FindBy(xpath="//thead/tr[1]/th[3]")
	WebElement btnUsrnamesort;
	
	//Emailid sort
	@FindBy(xpath="//thead/tr[1]/th[4]")
	WebElement btnEmailsort;
	
	//Contact number sort
	@FindBy(xpath="//thead/tr[1]/th[5]")
	WebElement btnContactsort;
	
	//Batch sort
	@FindBy(xpath="//thead/tr[1]/th[6]")
	WebElement btnBatchsort;
	
	//skill sort
	@FindBy(xpath="//thead/tr[1]/th[7]")
	WebElement btnSkillsort;
	
	//User Edit 
	@FindBy(xpath="//tbody/tr[1]/td[8]/div[1]/span[1]/button[1]")
	WebElement btnUsredit;
	
	//User Edit 
	@FindBy(xpath="//tbody/tr[1]/td[8]/div[1]/span[2]/button[1]")
	WebElement btnUsrdelete;
	
	//Pagination webElement
	  @FindBy(xpath="//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']")
	  WebElement CtrlPagination;
	  
	//1st page webElement
	  @FindBy(xpath="//button[contains(text(),'1')]")
	  WebElement btnFirstpage;
	  
	//To check number of records 
	@FindBy(xpath="//tbody/tr/td")
	List <WebElement> tblrecord; 
	
	//prev link < button
	@FindBy(xpath="//body/app-root[1]/app-user[1]/div[1]/mat-card[1]/mat-card-content[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/button[2]/span[1]")
	WebElement btnPrevLink;
	
	//next link > button
	@FindBy(xpath="//body/app-root[1]/app-user[1]/div[1]/mat-card[1]/mat-card-content[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/button[3]/span[1]")
	WebElement btnNextLink;
	
	//last page >> button
	@FindBy(xpath="//body/app-root[1]/app-user[1]/div[1]/mat-card[1]/mat-card-content[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/button[4]")
	WebElement btnLastPageLink;
	
	//First Page << link
	@FindBy(xpath="//body/app-root[1]/app-user[1]/div[1]/mat-card[1]/mat-card-content[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/button[1]")
    WebElement btnFirstPageLink;
	
	
	//First Page 1 button
	@FindBy(xpath="//button[contains(text(),'1')]")
	WebElement btnFirstPage;
	
	//page 2 button
	//@FindBy(xpath="//button[contains(text(),'2')]")
	@FindBy(xpath="//button[@class='p-paginator-page p-paginator-element p-link p-ripple ng-star-inserted p-highlight']")
	WebElement btnSecondPage;
	
	//textbox Search  //body/app-root[1]/app-user[1]/div[1]/mat-card[1]/mat-card-title[1]/div[2]/div[2]/span[1]/input[1]
	@FindBy(xpath="//input[@type='text']")
	WebElement txtSearch;
	
	//Cancel button on User detail page
	@FindBy(xpath="//button[@type='submit'][1]")
	WebElement btnCancel;
	
	//Submit button on user detail page
	@FindBy(xpath="//button[@type='submit'][2]")
	WebElement btnSubmit;
	
	//FirstName on user detail
	@FindBy(xpath="//input[@id='mat-input-2']")
	//@FindBy(xpath="//input[@id='mat-input-78']")
	WebElement txtFname;
	
	//LastName on user detail
	@FindBy(xpath="//input[@id='mat-input-79']")
	WebElement txtLname;
	
	//Email address
	@FindBy(xpath="//input[@id='mat-input-81']")
	WebElement txtEmail;
	
	//Phone Number
	@FindBy(xpath="//input[@id='mat-input-82']")
	WebElement txtPhno;
	
	//Batch
	@FindBy(xpath="//input[@id='mat-input-92']")
	WebElement txtBatch;
	
	//Skill
	@FindBy(xpath="//input[@id='mat-input-89']")
	WebElement txtSkill;
	
	//UserName on user details
	@FindBy(xpath="//input[@id='mat-input-94']")
	WebElement txtUsername;

	//password on user details
	@FindBy(xpath="//input[@id='mat-input-95']")
	WebElement txtPassword;
	
	//Searchbox
		@FindBy(xpath="//input[@placeholder='Search...']")
		WebElement searchbox;

	//Single delete third entry //tbody/tr[3]/td[8]/div[1]/span[2]/button[1]
		
	//No of Records
	 @FindBy(xpath="//div[@class=\"p-datatable-footer ng-star-inserted\"]/div")
				WebElement noOfRecords;
	 
	 
		public String UserPageURL() {
			return driver.getCurrentUrl();
		}

				
     public String noOfRecords() {				
    	 return noOfRecords.getText();
		}
     
 	@FindBy(xpath="//div[@role='alert']")
 	WebElement successmsg;  
 	public String Successmsg() {
		System.out.println(successmsg.getText());
		return successmsg.getText();
	}
	
	////span[contains(text(),'Showing 1 to 4 of 4 entries')]  ==
	public String userPageHeading() {
		return header.getText();
	}
	
	public String searchText()
	{
		 return searchbox.getAttribute("placeholder");
	}
	
	public boolean istxtSearchdisplayed(){
		return txtSearchbox.isDisplayed();
	}
	
	public boolean istxtSearchenabled(){
		return txtSearchbox.isEnabled();
	}
	
	public boolean isbtnAddUsrdisplayed(){
		return btnAddUsr.isDisplayed();
	}
	
	public boolean isbtnAddUsrenabled(){
		return btnAddUsr.isEnabled();
	}
	
	public boolean isCtrlPaginationDisplayed() {
		return CtrlPagination.isDisplayed();
	}
	
	public boolean isTopDeleteDisplayed() {
		return btnTopdelete.isDisplayed();
	}
	
	public boolean isTopDeleteDisable() {
		return btnTopdelete.isEnabled();
	}
	
	public boolean isCtrlPaginationDisable() {
	    return CtrlPagination.isEnabled();
	}
	
	public void isOnFirstPage() {
		btnFirstpage.isEnabled();
		
	}
	
	public boolean isCtrlPaginationEnable() {
		return CtrlPagination.isEnabled();
	}
	
	public boolean recordCount()
	{
		
	      int n = tblrecord.size();
	      if (n<=5)
	      	{
	    	  return true;
	      	}
	      else {
	    	  return false;
	      }    	  
	}
	
	
	public void Clickprevlink()
	{
		btnPrevLink.click();
	}
	
	public boolean DisablePrevLink()
	{
		return btnPrevLink.isEnabled();
		
	}
	
	public void Clicknextlink()
	{
		btnNextLink.click();
	}
	
	public boolean isSecondPageEnable()
	{
		return btnSecondPage.isEnabled();
	}
	
	public boolean DisableNextLink()
	{
		return btnNextLink.isEnabled();
	}
	public void ClickLastPageLink()
	{
		btnLastPageLink.click();
	}
	
	public void ClickFirstPageLink()
	{
		//btnFirstPageLink.click();
		
		btnFirstPage.click();
	}
	
	public void ClickSecondPage()
	{
		btnSecondPage.click();
	}
	
	public void SerachInputByName()
	{
		txtSearch.sendKeys("John");
		
	}
	
	public void ClickAddNewUsr()
	{
		btnAddUsr.click();
	}
	
	public void DisplayUsrDetails()
	{
		FrmUsrDetails.isDisplayed();
	}
	
	public void EnableDisplay()
	{
		FrmUsrDetails.isEnabled();
	}
	public void ClickCancel()
	{
		btnCancel.click();
	}
	

	public void InputValidDetails(String FirstName, String LastName, String Email, String phno, String batch, String skill, String UsrName, String pwd )
	{
		txtFname.clear();
		txtLname.clear();
		txtEmail.clear();
		txtPhno.clear();
		txtBatch.clear();
		txtSkill.clear();
		txtUsername.clear();
		txtPassword.clear();		
		txtFname.sendKeys(FirstName);
		txtLname.sendKeys(LastName);
		txtEmail.sendKeys(Email);
		txtPhno.sendKeys(phno);
		txtBatch.sendKeys(batch);
		txtSkill.sendKeys(skill);
		txtUsername.sendKeys(UsrName);
		txtPassword.sendKeys(pwd);
		
	}
	
	public void ClickSubmit()
	{
		btnSubmit.click();	
	}
	
	public void nameIsRequiredMsg() {
	      Alert a = driver.switchTo().alert();
	      //get alert text
	      String s = a.getText();
	      System.out.println("Alert text is: " + s);
	      //input text to alert
	      a.sendKeys("Enter Valid Data");
	      //dismiss alert
	      a.dismiss();
	     // c.click();
	      //accept alert
	      a.accept();
	      driver.quit();

	}
	
}