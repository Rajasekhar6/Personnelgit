package karunakarma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test4 {

	public static void main(String[] args) {

		WebDriver dir = new FirefoxDriver();
		dir.get("http://127.0.0.1/login.do");
		try {
			WebElement logo = dir.findElement(By.xpath("//div[@id='logo']"));
			System.out.println(logo.isDisplayed());
			WebElement login = dir.findElement(By.className("logintext"));
			System.out.println(login.isDisplayed());
			WebElement user = dir.findElement(By.name("username"));
			System.out.println(user.isDisplayed());
			WebElement button = dir.findElement(By
					.xpath("//input[@type='submit']"));
			System.out.println(button.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
