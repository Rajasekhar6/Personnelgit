package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MyGenUtils {
	WebDriver driver;
	
	public WebDriver getDriver(String brwtype , String mypath)
	{
	
	  if(brwtype.equals("firefox"))
	  {
		 driver = new FirefoxDriver();
		 
	  }else if(brwtype.equals("ie"))
	  {
		 String path="./executables/IEDriverServer.exe"; 
		 System.setProperty("webdriver.ie.driver",path);
		 driver = new InternetExplorerDriver();
	  }else
	  {
        driver = new HtmlUnitDriver();		  
	  }
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  driver.get(mypath);
	  
	  return driver;
	}

}

















