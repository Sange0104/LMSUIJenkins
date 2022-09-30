package pageObjects;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase;
import stepDefinitions.ApplicationHooks;

public class ProgramPage {
	
WebDriver driver;


	
	public ProgramPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//Manage Program heading
	@FindBy(xpath="//mat-card-title[1]/div[1]")
	WebElement header;
	
	
	//top delete
	@FindBy(xpath="//div[2]//button[@icon=\"pi pi-trash\"]")
	WebElement btnTopDelete;

	
	//new program button
	@FindBy(xpath="//button[@id='new']")
	WebElement newprbtn;
	
	//pop up box heading
	@FindBy(xpath="//span[@id='pr_id_77-label']")
	WebElement popupheading;
	
	//Program details box
	@FindBy(xpath="//div[@role=\"dialog\"]")
	WebElement boxProgramDetails;	
	
	//Name text box on pop up
	@FindBy(xpath="//input[@id='programName']")
	WebElement nametxt;
	
	//Description text box on pop up
	@FindBy(xpath="//input[@id='programDescription']")
	WebElement descrptxt;
	
	//Error message on pop up
	@FindBy(xpath="//small[contains(text(),'Name is required.')]")
	WebElement warnmsg;
	
	//Save button on pop up box
	@FindBy(xpath="//span[@class='p-button-label'][contains(text(),'Save')]")
	WebElement btnsave;
	
	//Success msg
	//@FindBy(xpath="//body//app-program[1]/p-confirmdialog[1]")
    //@FindBy(xpath="//div[contains(text),'Successful']")
	@FindBy(xpath="//div[@role=\"alert\"]//div/div[2]")
	WebElement successmsg;
	
	
	//Active Status
			@FindBy(xpath="//div[@class=\"radio ng-star-inserted\"]/div[2]//div[2]")
			WebElement btnActive;
			//Inactive Status
			@FindBy(xpath="//div[@class=\"radio ng-star-inserted\"]/div[3]//div[2]")
			WebElement btnInactive;
	
	//Cancel button on popup
	@FindBy(xpath="//span[@class='p-button-label'][contains(text(),'Cancel')]")
	WebElement btncancel;
	
	
	//Close (X) btn on pop up
	@FindBy(xpath="//button[@tabindex='-1']")
	WebElement btnclose;
	
	//Searchbox
	@FindBy(xpath="//input[@placeholder='Search...']")
	WebElement searchbox;
	
		
	//top delete button
	@FindBy(xpath="//div[1]/button[@icon='pi pi-trash'][1]")
	WebElement topdelbtn;
	
	//heading checkbox
	@FindBy(xpath="//div[@class='p-checkbox-box']")
	WebElement chkbox1;
	
	//Edit icon/button in 1 st row.....tr[1]
	
	@FindBy(xpath="//tbody/tr[1]/td[5]/div[1]/span[1]/button[1]")
	WebElement btnedit1;
	
	//Program name first row
	@FindBy(xpath="//tbody/tr[1]/td[2]")
	WebElement prname;
	
	//Description first row
	@FindBy(xpath="//tbody/tr[1]/td[3]")
	WebElement descrption;
	
	//Edit icons/ buttons 
	@FindBy(xpath="//tbody/tr[1]/td[5]/div[1]/span[1]/button[1]")
			List <WebElement> btnedit;

	
	//To check number of records ----record table xpath
	@FindBy(xpath="//tbody/tr/td")
	List <WebElement> webtbl;
	
	//sort arrow for program name
	@FindBy(xpath="//thead/tr[1]/th[2]/p-sorticon[1]/i[1]")
	WebElement sortprname;
	
	//Program name column
	@FindBy(xpath="//tbody/tr/td[2]")
	List <WebElement> programnmcolumn;
	
	//sort arrow for description
	@FindBy(xpath="//thead/tr[1]/th[3]/p-sorticon[1]/i[1]")
	WebElement sortdescription;
	
	//sort arrow for Status
	@FindBy(xpath="//thead/tr[1]/th[4]/p-sorticon[1]/i[1]")
	WebElement sortstatus;
	
	//Pagination
	
			//Double angle right
			@FindBy(xpath="//p-paginator/div/button[4]/span")
			WebElement btnAngleRight;
			
			//No of Records
			@FindBy(xpath="//div[@class=\"p-datatable-footer ng-star-inserted\"]/div")
			WebElement noOfRecords;

	
	public String ValidateProgramPg()
	{
		
		System.out.println("Headind is " +header.getText());
		return header.getText();
		//System.out.println("Title "+driver.getTitle());
		//return driver.getTitle();
		
	}
	
	//ADD NEW PROGRAM FUNCTIONALITY
	
	public boolean topDeleteButtonStatus() {
		return btnTopDelete.isEnabled();
	}

	
	public void NewProgram()
	{
		newprbtn.click();
	}
	
	public void PopUp()
	{
		{
	        String parentwin= driver.getWindowHandle();
			
	        Set<String> windows = driver.getWindowHandles();
			
			Iterator<String> it = windows.iterator();
			
			String childwin="";
			while (it.hasNext())
				   childwin = it.next();
			if(!parentwin.equalsIgnoreCase(childwin))
			{
				driver.switchTo().window(childwin);
								
			}
					
			//nametxt.sendKeys("SDET99");
			//descrptxt.sendKeys("2 hours twice a week");
			//btnradioact.click();
			//btnsave.click();
			
		}
	}
		
		public boolean programDetailsPopUp(){
			try {
					if (boxProgramDetails.isDisplayed())
					return true;
				}
			catch (Exception e) {
				return false;
			}
			return false;
		}
		
	
		
	public void EmptySubmission()
	{
     		
		PopUp();
				
		nametxt.clear();
		descrptxt.clear();
		
		btnsave.click();
	}
	
	public String WarnMessage()
	{
		return warnmsg.getText();
	}
	
		
	public void AddName()
	{
		PopUp();
		nametxt.sendKeys("SDET99");
	}
	
	public void AddDescrption()
	{
		PopUp();
		descrptxt.sendKeys("2 hours twice a week");
	}
	 public void SelectRadioActbtn()
	 {
		 btnActive.click();
	 }
	 
	 public void SelectRadioInctbtn()
	 {
		 btnInactive.click();
	 }
	 
	 public void ClickSave()
	 {
		 btnsave.click();
	 }
	 
	 public String Successmsg() throws InterruptedException
	 {
		 Thread.sleep(3000);
		 System.out.println(successmsg.getText());
		return successmsg.getText();
		 
	 }
	 
	 public void ClickCancel()
	 {
		 btncancel.click();
	 }
	 
	 public void ClickX()
	 {
		 btnclose.click();
	 }
	 
	 
	 //EDIT FUNCTIONALITY
	 
	 
	 public void EditFunction()
	{
		 	 
		 
		 int total = btnedit.size();
		 
		 System.out.println("Total number of Edit buttons "+total);
		 for(int i=0; i<=total-1; i++)
		 {			 
			 btnedit.get(i).click();
		     int j=0;
		     PopUp();
		     nametxt.clear();
		     nametxt.sendKeys("SDET"+j);
	          j++;
			 btnsave.click();
			//btncancel.click();
		}
	}
	 
	 
			
				
				 
	 public void ClickEdit()
	 {
		 btnedit1.click();
		 PopUp();
	 }
	 
	 public void EditName()
	 {
		 nametxt.clear();
		 nametxt.sendKeys("Python99");
		 //btnsave.click();
		 
		 System.out.println("Program name :"+prname.getText());
	 }
	 
	 public String ConfirmNameEdit()
	 {
		 return prname.getText();
	 }
	 
	 public void EditDescription()
	 {
		 descrptxt.clear();
		 descrptxt.sendKeys("Python Programming Language");
	 }
	 
	 public String ConfirmDescr() 
	 {
		 return descrption.getText();
	 }
	 	 
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
	 
	 public String searchText() {
			return searchbox.getAttribute("placeholder");
		}

	 
	 
	 //SORT 
	 
	 public boolean ProgramNmSort()
	 {
		 boolean output;
		 
 List <WebElement> reclist=  programnmcolumn;
		 
		 String strArry1 [] = new String[reclist.size()];
			for(int i=0; i < reclist.size(); i++)
			{
				strArry1[i]=reclist.get(i).getText();
				
				System.out.println("Records are "+strArry1[i]);
				
			}
			
		 sortprname.click();
		// sortstatus.click();
		 
		 
 List <WebElement> sortreclist=  programnmcolumn;
		 
		 String strArry [] = new String[sortreclist.size()];
			for(int i=0; i < reclist.size(); i++)
			{
				strArry[i]=sortreclist.get(i).getText();
				
				System.out.println("Sorted Records are "+strArry[i]);
				
			}
			
			
			boolean sortFunctionality = true;
			
			System.out.println("Total records= "+strArry.length);
			outer: 
			for(int i=0; i < strArry.length;i++)
			{System.out.println("Inside loop i "+i);
				for(int j=i+1; j <= strArry.length;j++)
				{ System.out.println("Inside loop j "+j);
					int result = strArry[j].compareTo(strArry1[i]);
					if(!(result > 0))
					{
							System.out.println("Data in the Table is not SORTED::" +strArry[j]+":::"+ strArry1[i]);
							sortFunctionality=false;
							break outer;
					}
					else
					{
						 System.out.println("Data in the Table is SORTED::" +strArry[j]+":::"+ strArry1[i]);
					}
				}
			}	output=sortFunctionality;		
		

		return output;
		
 }
	 public String noOfRecords() {
			return noOfRecords.getText();
		}

	 
	 public void DescriptionSort()
	 {
		 sortdescription.click();
	 }
	 
	 public void StatusSort()
	 {
		 sortstatus.click();
	 }

	
		
	 }