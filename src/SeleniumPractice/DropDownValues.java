package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownValues {

	public static void main(String[] args) {
		WebDriver wb = new FirefoxDriver();
		wb.get("http://127.0.0.1/login.do");
		wb.findElement(By.name("username")).sendKeys("admin");
		wb.findElement(By.name("pwd")).sendKeys("manager");
		wb.findElement(By.xpath("//input[@type='submit']")).click();
		wb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement listobj = wb.findElement(By.xpath("//select[@name='customerProject.shownCustomer']"));

		Select selobj = new Select(listobj);
		selobj.selectByVisibleText("kkk");
	
		List<WebElement> listoptions = selobj.getOptions();
		int count = listoptions.size();
		for (int i = 0; i < count; i++) {
			String text = listoptions.get(i).getText();
			System.out.println(text);
		}
	}
}
