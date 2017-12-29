package karunakarma;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		WebDriver dir = new FirefoxDriver();
		dir.get("http://www.citibank.co.in/");
		WebElement wb = dir.findElement(By.xpath("//div[text()='Select a Product:']"));
		wb.click();
		dir.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
			List<WebElement> alloptions = wb.findElements(By.xpath("//div[@class='applyDiv']/ul/li/a"));
			alloptions.get(1).click();
			int cnt = alloptions.size();
			
			System.out.println("Total links :" + cnt);
			for (int i=0;i<cnt;i++)
			{
				String str = alloptions.get(i).getText();
				System.out.println(str);		
			}
		

	}
}
