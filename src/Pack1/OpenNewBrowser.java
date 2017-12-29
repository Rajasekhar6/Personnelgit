package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenNewBrowser {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		WebDriver wb = new FirefoxDriver();
		wb.get("http://127.0.0.1/login.do");
		Thread.sleep(2000);
		wb.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		wb.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		wb.findElement(By.xpath("//input[@type='submit']")).click();
		
		WebElement wbobj = wb.findElement(By.linkText("Reports"));
		Actions act = new Actions(wb);
		act.contextClick(wbobj).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		
		

	}

}
