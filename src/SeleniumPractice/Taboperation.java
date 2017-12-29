package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Taboperation {

	
	public static void main(String[] args)
	{
		WebDriver wb = new FirefoxDriver();
		wb.get("http://127.0.0.1/login.do");
		WebElement un = wb.findElement(By.name("username"));
		un.sendKeys("admin");
				
		Actions act = new Actions(wb);
		act.sendKeys(un,Keys.TAB).perform();
		wb.findElement(By.name("pwd")).sendKeys("manager");
		
	}
}
