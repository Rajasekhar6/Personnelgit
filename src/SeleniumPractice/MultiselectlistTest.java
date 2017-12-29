package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//Used getDriver method from "GenUtilsTest1.java" class

public class MultiselectlistTest {

	
	public static void main(String[] args) {

		WebDriver drvobj = GenUtilsTest1.getDriver("firefox", "http://127.0.0.1/login.do");
				
		drvobj.findElement(By.name("username")).sendKeys("admin");
		drvobj.findElement(By.name("pwd")).sendKeys("manager");
		drvobj.findElement(By.xpath("//input[@type='submit']")).click();

		drvobj.findElement(By.linkText("Reports")).click();

		WebElement wel = drvobj.findElement(By.xpath("//select[@name='users']"));

		Select selobj = new Select(wel);
		List<WebElement> listobj = selobj.getOptions();

		int cnt = listobj.size();
		for (int i = 0; i <= cnt; i++) {
			listobj.get(i).click();
		}

	}
}
