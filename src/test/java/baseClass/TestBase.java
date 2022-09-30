package baseClass;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import pageObjects.AssignmentPage;
import pageObjects.BatchPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.ProgramPage;
import pageObjects.RegistrationPage;
import pageObjects.UserPage;
import utilFiles.ConfigReader;

public class TestBase {
	
public static WebDriver driver;

public ConfigReader cr;
public static Properties prop;

public HomePage hp = new HomePage(driver);
public RegistrationPage rp = new RegistrationPage(driver);
public LoginPage lp = new LoginPage(driver);
public ProgramPage pp = new ProgramPage(driver);
public BatchPage bp = new BatchPage(driver);
public UserPage up = new UserPage(driver);
public AssignmentPage as = new AssignmentPage(driver);
//public AttendancePage attd = new AttendancePage(driver);

public static String actualmsg;
public static boolean flag;
public static String [] arr;

}
	
