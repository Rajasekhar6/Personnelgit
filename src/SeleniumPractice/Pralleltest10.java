package SeleniumPractice;
//*******************************
// REFER XML - testparalles.xml
//*******************************
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Pralleltest10 {
	@Parameters("browser")
	@Test
	public void testusername(String bwType) {
	WebDriver driver = null;
	if (bwType.equalsIgnoreCase("ff")) {
		driver = new FirefoxDriver();
		} else if(bwType.equalsIgnoreCase("ie")) 
		{
			System.setProperty("webdriver.ie.driver",
					"D:/Softwares/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.get("http://127.0.0.1/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.name("username"));
		for (int i = 1; i <= 100; i++) {
			ele.sendKeys("admin" + i);
			ele.clear();
		}

	}

}
