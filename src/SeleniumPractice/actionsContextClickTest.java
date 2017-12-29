package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsContextClickTest {

	public static void main(String[] args) {

		WebDriver wb = new FirefoxDriver();
		wb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wb.get("http://127.0.0.1/login.do");
		wb.findElement(By.name("username")).sendKeys("admin");
		wb.findElement(By.name("pwd")).sendKeys("manager");
		wb.findElement(By.xpath("//input[@type='submit']")).click();

		// find element by xpath for 'Reports' link
		// wb.findElement(By.xpath("))"

		// WebElement web =

		wb.findElement(By.linkText("Reports")).click();

		WebElement wb1 = wb.findElement(By.linkText("Billing Summary Report"));

		Actions act = new Actions(wb);
		act.moveToElement(wb1).contextClick().perform();

		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
				
		// act.keyDown(Keys.SHIFT).moveToElement(wb1).sendKeys("raja").build().perform();  for understanding.
		
	}

}
