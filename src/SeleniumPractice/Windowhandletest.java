package SeleniumPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowhandletest {

	public static void main(String[] args) {
		
		WebDriver wb = new FirefoxDriver();
		
		wb.get("https://irctc.co.in");
		
		wb.findElement(By.linkText("Contact Us")).click();
		
	Set<String> allhandles =	wb.getWindowHandles();
	
	String pwindow = allhandles.iterator().next();
	String cwindow = allhandles.iterator().next();
	wb.switchTo().window(cwindow);
	
	WebElement ele = wb.findElement(By.xpath("//a[text()='etickets@irctc.co.in']"));
	String childwinlinktext = ele.getText();
	System.out.println("child window link text"+ childwinlinktext);
	wb.switchTo().window(pwindow);
	
	WebElement ele1 = wb.findElement(By.name("j_username"));
	
	String parentwintext = ele1.getText();
	
	System.out.println("parent windo text"+ parentwintext);
		
		
		
		
	}
	
}
