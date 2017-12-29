package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//Example for gettext() method

public class Test1 {

	public static void main(String[] args) {

		WebDriver dir = new FirefoxDriver();
		dir.get("http://127.0.0.1/login.do");
		dir.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		dir.findElement(By.name("pwd")).sendKeys("manager1");
		dir.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement wb = dir
				.findElement(By
						.xpath("//span[text()='Username or Password is invalid. Please try again.']"));
		// String str =
		// dir.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again.']")).getText();
		String str = wb.getText();
		System.out.println("**********************");
		System.out.println(str);
		System.out.println("**********************");

	}

}
