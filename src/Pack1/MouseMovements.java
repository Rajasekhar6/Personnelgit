package Pack1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovements {

	public static void main(String[] args) {

		WebDriver wb = new FirefoxDriver();
		wb.get("http://127.0.0.1/login.do");
//		WebElement we = wb.findElement(By.name("username"));
//      .sendKeys("admin");
		Actions act = new Actions(wb);
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("admin");
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("manager");
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.ENTER).perform();
		}

}
