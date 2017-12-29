package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllItemspractice {

		public static void main(String[] args) {
	
WebDriver wb = new FirefoxDriver();
wb.get("http://127.0.0.1/login.do");
wb.findElement(By.name("username")).sendKeys("admin");
wb.findElement(By.name("pwd")).sendKeys("manager");
wb.findElement(By.xpath("//input[@type='submit']")).click();

//WebElement we = wb.findElement(By.name("customerProject.shownCustomer"));
WebElement we = wb.findElement(By.xpath("//select[@name='customerProject.shownCustomer']"));

Select selobj = new Select(we);
selobj.selectByValue("1");
	}

}
