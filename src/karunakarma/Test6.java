package karunakarma;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test6 {

	public static void main(String[] args) throws Exception {

		WebDriver dir = new FirefoxDriver();
		dir.get("http://127.0.0.1/login.do");
		dir.findElement(By.cssSelector("input[name='username']")).sendKeys(
				"admin");
		dir.findElement(By.name("pwd")).sendKeys("manager");
		dir.findElement(By.xpath("//input[@type='submit']")).click();
	//	Thread.sleep(3000);
		WebElement wb = dir.findElement(By
				.xpath("//select[@name='customerProject.shownCustomer']"));
		System.out.println("++++++++++++");
		System.out.println(wb.getText());
		System.out.println("++++++++++++");
		Select seleobj = new Select(wb);
		List<WebElement> list = seleobj.getOptions();
		int count = list.size();
		for (int i = 0; i < count; i++) {
			String data = list.get(i).getText();
			System.out.println(data);
		}

	}

}
