package testSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FlipkartTestcase {

	WebDriver drv;
	@BeforeMethod
	@Parameters("{browser}")
	
	public void invokeBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
		drv = new FirefoxDriver();
		}
	
	else if(browser.equalsIgnoreCase("ie"))
	{
		String path = "D:\\Softwares\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver",path);
		drv = new InternetExplorerDriver();
	}
	else
		{
		//(browser.equalsIgnoreCase("chrome"));
		
		String path1 = "D:\\Softwares\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver",path1);
				drv = new ChromeDriver();
			}
		drv.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		drv.get("http://127.0.0.1/login.do");
	}
	@Test
	public void testMethod() throws Exception
	{
		drv.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(3000);
		drv.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
		drv.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		
		
	}
	
	@AfterMethod	
	public void cleanup()
	{
		drv.close();
	}
}

	
	
	

