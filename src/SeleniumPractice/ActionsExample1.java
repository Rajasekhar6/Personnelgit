package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExample1 {

		public static void main(String[] args) {
	
			WebDriver wb = new FirefoxDriver();
			wb.get("http://www.flipkart.com/");
			wb.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			WebElement webe = wb.findElement(By.xpath("//span[text()='Books & Media']"));
			Actions act = new Actions(wb);
			act.moveToElement(webe).perform();
			act.contextClick(webe).perform();
			}

}
