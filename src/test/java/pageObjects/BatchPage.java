package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BatchPage {
	
		WebDriver driver;
		String[] arr;
		boolean flag;
		
		public BatchPage(WebDriver driver) {
			this.driver =driver;
			PageFactory.initElements(driver, this);
		}
		
		//Heading
		@FindBy(xpath="//mat-card-title/div[1]")
		WebElement header;
		//Top Delete Button
		@FindBy(xpath="//div[2]//button[@icon=\"pi pi-trash\"]")
		WebElement btnTopDelete;
		//Search Button
		@FindBy(xpath="//input [@placeholder=\"Search...\"]")
		WebElement boxSearch;
		//Top Check Box
		@FindBy(xpath="//div[@class=\"p-checkbox-box\"]")
		WebElement topCheckBox;
		//Down Check Box
		@FindBy(xpath="//div[@class=\"p-checkbox-box p-component\"]")
		public List <WebElement> downCheckBox;
		//A New Batch Button
		@FindBy(id="new")
		WebElement btnNewBatch;	
		//Batch Name Column
		@FindBy(xpath="//th[@psortablecolumn=\"batchName\"]")
		WebElement colBatchName;
		//Batch Description Column
		@FindBy(xpath="//th[@psortablecolumn=\"batchDescription\"]")
		WebElement colBatchDescription;
		//Batch Status Column
		@FindBy(xpath="//th[@psortablecolumn=\"batchStatus\"]")
		WebElement colBatchStatus;
		//No of Classes Column
		@FindBy(xpath="//th[@psortablecolumn=\"batchNoOfClasses\"]")
		WebElement colNoOfClasses;
		//Program Name Column
		@FindBy(xpath="//th[@psortablecolumn=\"programName\"]")
		WebElement colprogramName;
		//Sort Button
		@FindBy(xpath="//i[@class=\"p-sortable-column-icon pi pi-fw pi-sort-alt\"]")
		public List <WebElement> btnSort;
		//Edit Delete Text
		@FindBy(xpath="//th[contains(text(),'Edit Delete')]")
		WebElement txtEditDelete;
		
		//Side Edit Button
		@FindBy(xpath="//span/button[@icon=\"pi pi-pencil\"]")
		public List <WebElement> btnSideEdit;
		//Side Delete Button
		@FindBy(xpath="//span/button[@icon=\"pi pi-trash\"]")
		public List <WebElement> btnSideDelete;
		//No of Records
		@FindBy(xpath="//div[@class=\"p-datatable-footer ng-star-inserted\"]/div")
		WebElement noOfRecords;
		
		//Batch name of all Records
		@FindBy(xpath="//tr[@class=\"ng-star-inserted\"]//td[2]")
		public List <WebElement> recordBatchName;
		//Description of all Records
		@FindBy(xpath="//tr[@class=\"ng-star-inserted\"]//td[3]")
		public List <WebElement> recordDescription;
		//Program Name of all Records
		@FindBy(xpath="//tr[@class=\"ng-star-inserted\"]//td[6]")
		public List <WebElement> recordProgramName;
		//Status of all Records
		@FindBy(xpath="//tr[@class=\"ng-star-inserted\"]//td[4]")
		public List <WebElement> recordStatus;
		//No of classes of all Records
		@FindBy(xpath="//tr[@class=\"ng-star-inserted\"]//td[5]")
		public List <WebElement> recordNoOfClasses;
		
		
		//**************Batch Details Box WebElements*******************************************
			
		//Batch Details Box
		@FindBy(xpath="//div[@role=\"dialog\"]")
		WebElement boxBatchDetails;		
		//Batch Name Field
		@FindBy(id="batchName")
		WebElement batchName;
		//Description Field
		@FindBy(id="batchDescription")
		WebElement batchDescription;
		//Program Name Field
		@FindBy(xpath="//div[@role=\"button\"]/span")
		@CacheLookup
		WebElement programName;
		//Program Name select
		@FindBy(xpath="//ul[@role=\"listbox\"]//p-dropdownitem[2]//li/span")
		@CacheLookup
		WebElement selectProgramName;
		
		//Active Status
		@FindBy(xpath="//div[@class=\"radio ng-star-inserted\"]/div[2]//div[2]")
		WebElement btnActive;
		//Inactive Status
		@FindBy(xpath="//div[@class=\"radio ng-star-inserted\"]/div[3]//div[2]")
		WebElement btnInactive;
		//No of Classes
		@FindBy(id="batchNoOfClasses")
		WebElement noOfClasses;		
		//Save Button
		@FindBy(xpath="//button[@label=\"Save\"]")
		WebElement btnSave;
		//Cancel Button
		@FindBy(xpath="//button[@label=\"Cancel\"]")
		WebElement btnCancel;
		//Name is required Message
		@FindBy(xpath="//div//small")
		WebElement msgNameIsRequired;
		//Successful Message
		@FindBy(xpath="//div[@role=\"alert\"]//div/div[1]")
		WebElement msgSuccessful;
		//Batch Created Message
		@FindBy(xpath="//div[@role=\"alert\"]//div/div[2]")
		WebElement msgBatchCreated;
		
		// Delete Confirm Box WebElements

		//Delete Confirm Box
		@FindBy(xpath="//div/span[contains(text(),\"Confirm\")]")
		WebElement boxDeleteConfirm;
		//Yes Button
		@FindBy(xpath="//span[contains(text(),\"Yes\")]")
		WebElement btnYes;
		//No Button
		@FindBy(xpath="//dspan[contains(text(),\"No\")]")
		WebElement btnNo;	
		
		//Pagination
		
		//Double angle right
		@FindBy(xpath="//p-paginator/div/button[4]/span")
		WebElement btnAngleRight;
		
		
		
		//********************Batch Page Methods*********************************
		
		public String batchPageURL() {
			return driver.getCurrentUrl();
		}
		
		public String batchPageHeading() {
			return header.getText();
		}
		public String searchText() {
			return boxSearch.getAttribute("placeholder");
		}
		
		public void topDeleteButtonClick() {
			btnTopDelete.click();
		}
		public boolean topDeleteButtonStatus() {
			return btnTopDelete.isEnabled();
		}
		public void sideDeleteButtonClick() {
			int totalDeleteBtns = btnSideDelete.size();
			for(int i=0;i<=totalDeleteBtns;i++)
			{
				btnSideDelete.get(i).click();
			}
			
		}
		
		public String noOfRecords() {
			return noOfRecords.getText();
		}
		
		public void addNewBatchClick(){
			btnNewBatch.click();
		}
		
		public boolean batchDetailsPopUp(){
			try {
					Thread.sleep(3000);
					if (boxBatchDetails.isDisplayed())
					return true;
				}
			catch (Exception e) {
				return false;
			}
			return false;
		}
		
		public void saveButtonClick() {
			btnSave.click();
		}
		
		public void cancelButtonClick() {
			btnCancel.click();
		}
		
		public String nameIsRequiredMsg() {
			return msgNameIsRequired.getText();
		}
		
		public void enterBatchName(String batch) {
			batchName.clear();
			batchName.sendKeys(batch);
		}
		public void enterDescription(String details) {
			batchDescription.clear();
			batchDescription.sendKeys(details);			
		}
		public void enterNoOfClasses(String details) {
			noOfClasses.clear();
			noOfClasses.sendKeys(details);
		}
		
		public void enterProgramName() throws InterruptedException {
			programName.click();
			Thread.sleep(3000);
			selectProgramName.click();;	
			Thread.sleep(3000);
		}
		public String alertSuccessful() {
			return msgSuccessful.getText();
		}
		public String alertBatchCreated() throws InterruptedException {
			Thread.sleep(3000);
			return msgBatchCreated.getText();
		}
		
		public void activeButtonClick() throws InterruptedException {
			Thread.sleep(3000);
			btnActive.click();
		}
		public void inactiveButtonClick() throws InterruptedException {
			Thread.sleep(3000);
			btnInactive.click();
		}

			
		public boolean recordBatchName(String batchName) {
			btnAngleRight.click();
			int size = recordBatchName.size();
			//System.out.println((recordBatchName.get(size-1)).getText());
			return ((recordBatchName.get(size-1)).getText()).contains(batchName);
		}
		
		
		//******************************************************************************
		
		//Edit Feature
		
		public void editStatus() throws InterruptedException {
			if(btnActive.isEnabled()) {				
				btnInactive.click();
				Thread.sleep(3000);
			}
			else if(btnInactive.isEnabled()) {
				btnActive.click();
				Thread.sleep(3000);
			}
			else {
				btnActive.click();
				Thread.sleep(3000);
			}
		}
			//Editting second record
		public void editField() {		
			(btnSideEdit.get(1)).click();		
		}
		//User can see edited Batch Name of second record
		public boolean recordBatchNameEdit(String key) {
			System.out.println("KEY: "+ key);
			System.out.println("RECORD: "+ (recordBatchName.get(1)).getText());
			return ((recordBatchName.get(1)).getText()).contains(key);
		}
		//User can see edited Description of second record
		public boolean recordDescription(String key) {
			System.out.println("KEY: "+ key);
			System.out.println("RECORD: "+ (recordDescription.get(1)).getText());
			return ((recordDescription.get(1)).getText()).contains(key);
		}
		//User can see edited No of classes of second record
		public boolean recordNoOfClasses(String key) {
			System.out.println("KEY: "+ key);
			System.out.println("RECORD: "+ (recordNoOfClasses.get(1)).getText());
			return ((recordNoOfClasses.get(1)).getText()).contains(key);
		}
		//User can see edited Program Name of second record
		public boolean recordProgramName() {
			System.out.println("KEY: " + "EditedProgram");
			System.out.println("RECORD: "+ (recordProgramName.get(1)).getText());
			return ((recordProgramName.get(1)).getText()).contains("EditedProgram");
		}
		//User can see edited Status of second record
		public boolean recordStatus() {
			System.out.println("RECORD: "+ (recordStatus.get(1)).getText());
			return ((recordStatus.get(1)).getText().isBlank());
		}
		
		public void boxSearch(String key) {
			boxSearch.sendKeys(key);
		}
		//User can see searched Batch Name
		public boolean recordBatchNameSearch(String key) {
			System.out.println("KEY: "+ key);
			System.out.println("RECORD: "+ (recordBatchName.get(0)).getText());
			return ((recordBatchName.get(0)).getText()).contains(key);
		}	
}
