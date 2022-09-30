package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AttendancePage {
WebDriver driver;
	
	public AttendancePage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
}