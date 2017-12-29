package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		WebDriver wd = new FirefoxDriver();
		WebDriverWait wb = new WebDriverWait(wd,1000);
		wb.pollingEvery(2000, TimeUnit.SECONDS);
		wb.until(ExpectedConditions.presenceOfElementLocated(By.id("name")));
		
		
	}

}
