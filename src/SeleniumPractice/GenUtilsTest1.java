package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

// Called this method in "MultiselectlistTest.java"

public class GenUtilsTest1 {

	static WebDriver wb;

	public static WebDriver getDriver(String drvobj, String url) {

		WebDriver wb = null;
		
		if (drvobj.equals("firefox")) {
			wb = new FirefoxDriver();

		} else {
			drvobj.equals("ie");
			String path = "./executables/IEDriverServer.exe";
			System.setProperty("webDriver.ie.driver", path);
			wb = new InternetExplorerDriver();
		}
		wb.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wb.get(url);
		return wb;
		
	}
}
