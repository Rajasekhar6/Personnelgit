package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popup {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		 
        driver.get("http://www.popuptest.com/popuptest2.html");
       
	driver.close();
	
	}

}
