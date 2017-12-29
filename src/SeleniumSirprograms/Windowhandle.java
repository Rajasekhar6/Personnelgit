package SeleniumSirprograms;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowhandle {
	public static void main(String[] args) {

		WebDriver wb = new FirefoxDriver();
		wb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wb.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		//String mainHndl = wb.getWindowHandle();
		wb.findElement(By.linkText("contact Us")).click();
		
		// get all the hndls currently opened in desktop
		Set<String> allHdnls = wb.getWindowHandles();
		Iterator<String> it = allHdnls.iterator();
		String mainpage = it.next();
		String childpage = it.next();
		
		// Switch to child browser using handle
		wb.switchTo().window(childpage);
		String title = wb.getTitle();
		System.out.println(title);
		// close the child browser
		wb.close();
		// switch back to main page
		wb.switchTo().window(mainpage);
		wb.findElement(By.id("usernameId")).sendKeys("Raja1980");
		
		

	}

}
