package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A {

		public static void main(String[] args) throws Exception {
		WebDriver wb = new FirefoxDriver();
		wb.get("https://www.google.co.in");
		
		wb.findElement(By.id("gbqfq")).sendKeys("Selenium");
		wb.findElement(By.id("gbqfba")).click(); 
		wb.manage().timeouts().wait(3000);
		wb.close();
		

	}

}
