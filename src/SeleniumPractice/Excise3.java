package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Excise3 {
	public static void main(String[] args) {
		
		WebDriver wb = new FirefoxDriver();
		
		wb.findElement(By.id("sss")).getTagName();
		
		
		
	}
}
