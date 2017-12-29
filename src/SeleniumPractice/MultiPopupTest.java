package SeleniumPractice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiPopupTest {

public static void main(String[] args) {
	
	WebDriver wb = new FirefoxDriver();
	wb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	wb.get("http://www.popuptest.com")
//	
//	Set<String> allhndls = wb.getWindowHandles();
//	int cnt = allhndls.size();
//	
//	String mainHndl = null;
//	for(String hndl: )
//	
}
}