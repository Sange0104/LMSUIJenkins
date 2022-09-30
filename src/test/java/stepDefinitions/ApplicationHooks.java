package stepDefinitions;

import java.time.Duration;
import baseClass.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilFiles.ConfigReader;

	public class ApplicationHooks extends TestBase{

	ConfigReader cr = new ConfigReader();

	@Before
	public void launchBrowser() throws InterruptedException{

		String browser = cr.getBrowser();

		switch(browser)
		{
		case "chrome":
			driver = WebDriverManager.chromedriver().create();
			//WebDriverManager.chromedriver().setup();
			//tlDriver.set(new ChromeDriver());
			System.out.println("Browser launched");
			break;
			
		case "firefox":
			driver = WebDriverManager.firefoxdriver().create();
			break;
			
		case "edge":
			driver = WebDriverManager.edgedriver().create();
			break;
			
		default:
			driver = null;
			break;
		}
		
		//driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		
		//implicit wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//open url
		String url = cr.getApplicationURL();
		driver.get(url);
	}
	
	@After	
	public void tearDown() {
		driver.quit();
	}
		
	}

