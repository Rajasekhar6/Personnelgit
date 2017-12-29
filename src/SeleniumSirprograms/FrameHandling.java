package SeleniumSirprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameHandling {

	public static void main(String[] args) {
		
		WebDriver wb = new FirefoxDriver();
		wb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wb.get("https://jqueryui.com/selectable/");
		WebElement ele = wb.findElement(By.className("demo-frame"));
		wb.switchTo().frame(ele);
		wb.findElement(By.xpath("//li[text()='Item 3'])")).click();
		wb.switchTo().defaultContent();
		
		
		// If element is not find - No such element exception - unable to locate element is displayed.
		
		
		
		

	}

}
