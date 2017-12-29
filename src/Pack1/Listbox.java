package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {

	public static void main(String[] args) throws Exception {
		WebDriver wb = new FirefoxDriver();
		wb.get("http://127.0.0.1/login.do");
		wb.findElement(By.name("username")).sendKeys("admin");
		wb.findElement(By.name("pwd")).sendKeys("manager");
		//wb.findElement(By.xpath("//input[@type='username']"));
		wb.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		
		WebElement lisobj = wb.findElement(By.name("customerProject.shownCustomer"));
		Select sel = new Select(lisobj);
		sel.selectByValue("1");
		wb.findElement(By.xpath("//input[@value='Add New Tasks']")).click();
		}

}
