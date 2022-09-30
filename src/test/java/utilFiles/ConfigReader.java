package utilFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import baseClass.TestBase;

public class ConfigReader extends TestBase{
	
 //static Properties prop;
	
public ConfigReader() {
	prop = new Properties();
	try {
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/Configuration/config.properties");
		prop.load(ip);
	}
	catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	catch(IOException e) {
		e.printStackTrace();
	}
			
	}


public String getApplicationURL()
{
	String url=prop.getProperty("url");
	System.out.println("URL is " + url);
	return url;
}

public String getBrowser()
{
	String browser=prop.getProperty("browser");
	System.out.println("Browser is " + browser);
	return browser;
}


	

}
