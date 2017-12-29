package karunakarma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test3 {

	public static void main(String[] args) {

		WebDriver dir = new FirefoxDriver();
		dir.get("http://127.0.0.1/login.do");
		dir.findElement(By.cssSelector("input[name='username']")).sendKeys(
				"admin");
		dir.findElement(By.name("pwd")).sendKeys("manager");
		dir.findElement(By.xpath("//input[@type='submit']")).click();

		WebElement errmsg = dir.findElement(By.className("errormsg"));

		String abc = errmsg.getText();
		String expError = "Username or Password is invalid. Please try again.";
		if (abc.equalsIgnoreCase(expError)) {
			System.out.println("Credentials are incorrect");
		} else {
			System.out.println("Login successfull");
		}
	}
}
