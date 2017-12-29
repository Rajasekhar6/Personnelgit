package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multitest1 {

	
	public static void main(String[] args) {
		
		WebDriver drv = new FirefoxDriver();
		drv.get("http://flipkart.com");
		drv.manage().window().maximize();
	List<WebElement> count = drv.findElements(By.tagName("a"));
	int nooflinks = count.size();
	System.out.println("+++++++++++++");
	System.out.println(nooflinks);
	System.out.println("++++++++++++");
	
	for(int i=0;i<=nooflinks-1;i++)
	{
		String text =count.get(i).getText();
		System.out.println(text);
	}
	
	}

}
