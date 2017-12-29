package karunakarma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// selecting an item from the list box
		
		WebDriver dir = new FirefoxDriver();
		dir.get("http://127.0.0.1/login.do");
		dir.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		dir.findElement(By.name("pwd")).sendKeys("manager");
		dir.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		dir.findElement(By.xpath("//a[text()='Reports']")).click();
		WebElement wb = dir.findElement(By.name("users"));
		Select selobj = new Select(wb);
		//selobj.selectByVisibleText("kakumanu, Lakshman ");
		//selobj.selectByVisibleText("kakumanu, Rajaa ");
		selobj.selectByIndex(0);
		selobj.selectByIndex(1);
		
		
		
		
		

	}

}
