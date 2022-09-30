package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssignmentPage {
	WebDriver driver;
	
	public AssignmentPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	//Click Assignment tab
	@FindBy(xpath = "//span[contains(text(),'Assignment')]")  //button[@class='mat-focus-indicator mat-button mat-button-base'][4],/html/body/app-root/app-header/mat-toolbar/button[4]/span[1]") 
	@CacheLookup
	WebElement btnAssignment;
	
	/*@FindBy(xpath = "//div[contains(text(),' Manage Assignment')]")   //getTitle in Assignment page
	@CacheLookup
	WebElement titleAssignment;*/
	
	//Search
	@FindBy(xpath = "//body/app-root[1]/app-assignment[1]/div[1]/mat-card[1]/mat-card-title[1]/div[2]/div[2]/span[1]/input[1]")  //input[@placeholder = 'Search...']
	@CacheLookup
	WebElement txtSearch;
	
	//Click New Assignment 
	@FindBy(xpath = "//span[contains(text(),'A New Assignment')]")
	@CacheLookup
	WebElement btnNewAssignment;
	
	//Name
	@FindBy(xpath = "//input[@id ='assignment']")
	@CacheLookup
	WebElement txtassignName;
	
	//Description
	@FindBy(xpath = "//*[@id=\'assignmentDescription\']")
	@CacheLookup
	WebElement txtassignDesc;
	
	//Grade
	@FindBy(id ="assignmentGraderId")
	@CacheLookup
	WebElement txtassignGrade;
	
	//Due date
	@FindBy(xpath = "//input[@id='icon']")
	@CacheLookup
	WebElement txtassignDate;
	
	//Save in popup window
	@FindBy(xpath = "//span[contains(text(),'Save')]")
	@CacheLookup
	WebElement btnSave;
	
	//Cancel in popup window
	@FindBy(xpath = "//span[contains(text(),'Cancel')]")
	@CacheLookup
	WebElement btnCancel;
	
	//Edit icon
	@FindBy(xpath = "//tbody/tr[1]/td[6]/div[1]/span[1]/button[1]/span[1]")  ///html/body/app-root/app-assignment/div/mat-card/mat-card-content/p-table/div/div[1]/table/tbody/tr[2]/td[6]/div/span[1]/button/span[1]
	@CacheLookup
	WebElement btnEdit; 
	
	//Single Delete icon
	@FindBy(xpath = "//tbody/tr[1]/td[6]/div[1]/span[2]/button[1]") ////button[@class='p-button-rounded p-button-danger p-button p-component p-button-icon-only']/span[1]']
	@CacheLookup
	WebElement btnDelete;   //tbody/tr[1]/td[6]/div[1]/span[2]/button[1]
	
	//Multiple Delete
	@FindBy(xpath = "//tbody/tr[1]/td[1]/p-tablecheckbox[1]/div[1]/div[2]")
	WebElement multiChkboxDelete;
	
	//Confirmation msgbox pop up
	@FindBy(xpath = "//body/app-root[1]/app-assignment[1]/p-confirmdialog[1]/div[1]/div[1]/div[1]")
	WebElement deleteConfirmPopup;
	
	//Click Yes for deletion
	@FindBy(xpath = "//span[contains(text(),\"Yes\")]")
	WebElement deleteYes;
	
	//Click No for deletion
	@FindBy(xpath = "//span[contains(text(),\"No\")]")
	WebElement deleteNo;
	
	//Manage-not working
	@FindBy(xpath = "//tbody/tr[1]/td[5]/button[1]/span[1]")  ////span[contains(text(),'Manage')]
	@CacheLookup
	WebElement btnManage;
	
	//Select Check box
	@FindBy(xpath = "//tbody/tr[2]/td[1]/p-tablecheckbox[1]/div[1]/div[2]") 
	@CacheLookup
	WebElement btnChkbox;		
	
	@FindBy(xpath = "/html/body/app-root/app-assignment/div/mat-card/mat-card-content/p-table/div/div[1]/table/thead/tr/th[3]/p-sorticon/i")  //Sorting
	@CacheLookup
	WebElement btnSort;			
	
	//Error msg for name validation
	@FindBy(xpath = "//div//small")	//small[contains(text(),'Name is required.')] "//div//small"
	@CacheLookup
	WebElement lblEmptyName;
	
	@FindBy(xpath ="//div[@role='alert']")		//Save Alert box
	@CacheLookup
	WebElement boxAlert;
	
	//Heading
	@FindBy(xpath = "//body/app-root[1]/app-assignment[1]/div[1]/mat-card[1]/mat-card-title[1]/div[1]")
	WebElement header;
	
	//Assignment details popup
	@FindBy (xpath="//div[@role=\"dialog\"]")    
	WebElement boxAssignDetails;
	
	//Top delete button
	@FindBy(xpath="//div[2]//button[@icon=\"pi pi-trash\"]")
	WebElement btnTopDelete;
	
	//Search textbox
	@FindBy(xpath = "//body/app-root[1]/app-assignment[1]/div[1]/mat-card[1]/mat-card-title[1]/div[2]/div[2]/span[1]/input[1]")
	WebElement boxSearch;
	
	//Successful Message
	@FindBy(xpath="//div[@role=\"alert\"]//div/div[1]")
	//@FindBy(xpath="/p-toastitem/div/div/div/div[1]")
	WebElement msgSuccessful;
	//Batch Created Message
	//@FindBy(xpath="/p-toastitem/div/div/div/div[2]")
	@FindBy(xpath="//div[@role=\"alert\"]//div/div[2]")
	WebElement msgBatchCreated;

	//No of Records
			@FindBy(xpath="//div[@class=\"p-datatable-footer ng-star-inserted\"]/div")
			WebElement noOfRecords;
	
	
	public String noOfRecords() {
		return noOfRecords.getText();
	}
	

	
	public String searchText() {
		return boxSearch.getAttribute("placeholder");
	}
	
	public boolean topDeleteButtonStatus() {
		return btnTopDelete.isEnabled();
	}
	
	
	//Single record deletion
	public void deleteSingleRecord() {
		btnDelete.isEnabled();
		btnDelete.click();
	}
	
	public void checkBoxSelect() {
		multiChkboxDelete.click();
	}
	

	
	//for multiple record deletion
	public void topDeleteButtonClick() {
		btnTopDelete.click();
	}
	
	public boolean deleteConfirmation() {
		try {
			if(deleteConfirmPopup.isDisplayed()) {
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}
	
	public void clickYesforDelete() {
		deleteYes.click();
	}
	
	public void clickNoforDelete() {
		deleteNo.click();
	}
	
	public String assignPageHeading() {
		return header.getText();
	}
	
	

	public String validateNamefield()
	{
	
		return lblEmptyName.getText();
				
	}
	
	//click Assigment tab
	public void validateAssignBtn() {
		btnAssignment.isDisplayed();
		btnAssignment.click();
	}
	
	public AssignmentPage clickAssignment() {
		btnAssignment.click();
	return new AssignmentPage(driver);
	}
	
	public void enterSearch() {
		txtSearch.clear();
		txtSearch.sendKeys("SQL" +Keys.ENTER);
	}
	
	
	public void clickNewAssign() {
		btnNewAssignment.click();
	}
	
	public boolean assignDetailsPopup() {
		try {
			if(boxAssignDetails.isDisplayed()) {
				return true;
			}
				
		} catch (Exception e) {
			return false;
		}
		return false;
	}
	public void setAssignName() {
			
		txtassignName.clear();
		txtassignName.sendKeys("Name");
	
	}
	
	public String getAssignName() {
		return txtassignName.getText();
	}
		
		public void setAssignDesc() {
			txtassignDesc.clear();
			txtassignDesc.sendKeys("Description");
		}

		public String getAssignDesc() {
			return txtassignDesc.getText();
		}
		
		public void setNewGrade() {
			txtassignGrade.clear();
			txtassignGrade.sendKeys("Grade");
		}
		
		public String getAssignGrade() {
			return txtassignGrade.getText();
		}

		
	public void assignDueDate() {
		txtassignDate.sendKeys("28/09/2022");
		
	}
	
	public void clickSave() {
		btnSave.click();
	}
	
	
	public void clickCancel() {
		btnCancel.click();
	}
	
	@FindBy(xpath="//div[@role='alert']")
	WebElement successmsg;
	
	public String Successmsg() {
		System.out.println(successmsg.getText());
		return successmsg.getText();
	}
	
	@FindBy(xpath = "//div[@role='alert']")
	WebElement deletemsg;
	
	public String Deletemsg() {
		return deletemsg.getText();
	}

	
	public void sortAssignment() {
		btnSort.click();
	}
	
	
	public void editAssignments() {
		btnEdit.isEnabled();
		btnEdit.click();
			
	}
	 public void EditDescription()
	 {
		 txtassignDesc.clear();
		 txtassignDesc.sendKeys("Python Programming Language");
	 }
	
	
	//Description first row
		@FindBy(xpath="//tbody/tr[1]/td[3]")
		WebElement descrption;
		
		public String ConfirmDescr() 
		 {
			 return descrption.getText();
		 }
	
		

	
	public void selectCheckbox() {
		btnChkbox.click();
	}
	
	public boolean SelectCheckbox() {
		return btnChkbox.isDisplayed();
		
	}
	
	public void popUpAlert() {

        boxAlert.getText();
	}

	public boolean editNameisDisplayed() {
		return txtassignName.isDisplayed();
	}
	
	public boolean editdescisDisplayed() {
		return txtassignDesc.isDisplayed();
	}
	
	public boolean editGradeisDisplayed() {
		return txtassignGrade.isDisplayed();
	}

	
}