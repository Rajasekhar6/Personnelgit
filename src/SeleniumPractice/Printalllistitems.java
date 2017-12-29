package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Printalllistitems {

	public static void main(String[] args) {

		WebDriver wb = new FirefoxDriver();
		wb.get("http://127.0.0.1/login.do");
		wb.manage().window().maximize();
		
		//wb.findElement(By.name("username")).sendKeys("admin");
		wb.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		wb.findElement(By.name("pwd")).sendKeys("manager");
		wb.findElement(By.xpath("//input[@type='submit']")).click();

		WebElement web = wb.findElement(By.name("customerProject.shownCustomer"));

		Select selobj = new Select(web);
		List<WebElement> listobj = selobj.getOptions();
		int cnt = listobj.size();
		
		System.out.println("Total items"+ cnt);
		
		for (int i = 0; i < cnt; i++) {
			String text = listobj.get(i).getText();
			System.out.println(text);
		}
	}
}
