package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1 {

	public static void main(String[] args) {
		
		WebDriver wb = new FirefoxDriver();
		wb.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&ltmpl=default");
		wb.manage().window().maximize();
		
		//wb.findElement(By.xpath("//span[@id='BirthMonth']/div[2]/div[@id=':1']/div[@class='goog-menuitem-content']"));
		
		WebElement menu  = wb.findElement(By.xpath("//span[@id='BirthMonth']"));
		Actions act = new Actions(wb);
		
		act.moveToElement(menu).click().perform();
		wb.findElement(By.id(":4")).click();
		
			
		
	}
}
