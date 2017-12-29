package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Findtotallinks {

		public static void main(String[] args) {
		
			WebDriver wb = new FirefoxDriver();
			wb.get("https://login.salesforce.com");
			System.out.println("Link count with tag name");
			System.out.println(wb.findElements(By.tagName("a")).size());
			System.out.println("Link count with xpath");
			System.out.println(wb.findElements(By.xpath("//a")).size());
			

	}

}
