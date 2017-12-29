package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linksinpage {

	public static void main(String[] args) {

		WebDriver drv = new FirefoxDriver();
		drv.get("http://google.co.in");
				
		List<WebElement> list = drv.findElements(By.tagName("a"));
		int count = list.size();
		for(int i=0;i<count;i++)
		{
			String text = list.get(i).getAttribute("href");
			System.out.println(text);
		}
		
	}

}
