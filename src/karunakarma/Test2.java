package karunakarma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// Example for getAttribute method 

public class Test2 {

	public static void main(String[] args) {
		WebDriver dir = new FirefoxDriver();
		dir.get("http://127.0.0.1/login.do");
		dir.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
	String str1 = 	dir.findElement(By.cssSelector("input[name='username']")).getAttribute("value");
	String str2 = dir.findElement(By.name("pwd")).getAttribute("style");
	
	System.out.println(str1);
	System.out.println(str2);
	//	dir.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
