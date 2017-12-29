package SeleniumSirprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Divpopup {

	public static void main(String[] args) throws Exception {
		
		WebDriver wb = new FirefoxDriver();
		wb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wb.get("http://127.0.0.1/login.do");
		wb.findElement(By.name("username")).sendKeys("admin");
		wb.findElement(By.name("pwd")).sendKeys("manager");
		wb.findElement(By.xpath("//input[@type='submit']")).click();
		
 		//For indexing we need to provide () bracket see below,
		//For Parent element we need to find [ ]
		wb.findElement(By.xpath("(//a[@title='Click to edit task description'])[1]")).click();
		Thread.sleep(3000);
		wb.findElement(By.name("comment")).sendKeys("This is div pop up");
		Thread.sleep(3000);
		//wb.findElement(By.id("scbutton")).click();
		wb.findElement(By.name("nccbutton")).click();
		wb.switchTo().alert().accept();
	}
}
