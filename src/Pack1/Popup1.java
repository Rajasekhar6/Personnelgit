package Pack1;

//

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Popup1 {
	
	public static void main(String[] args) throws Exception{

	WebDriver wb = new FirefoxDriver();
	wb.get("http://127.0.0.1/login.do");
	wb.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	wb.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	wb.findElement(By.xpath("//input[@type='submit']")).click();
	WebElement listobj = wb.findElement(By.xpath("//select[@name='customerProject.shownCustomer']"));
	Select selobj = new Select(listobj);
	
	
	

	}
}

