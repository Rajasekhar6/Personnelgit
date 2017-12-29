package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Citibank {

		public static void main(String[] args) {
	
			WebDriver wb = new FirefoxDriver();
			wb.get("http://www.citibank.co.in/");
			
		    wb.findElement(By.xpath("//div[@class='applyTxt']")).click();
			wb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//	Select sel = new Select(wele);
		List<WebElement> alloptions = wb.findElements(By.xpath("//div[@class='applyDiv']//ul//li//a"));
			// List<WebElement> alloptions = wb.findElements(By.xpath("//div[@class='applyDiv']/ul/li/a"));
			int cnt = alloptions.size();
			
			// System.out.println(cnt);
			for (int i=0;i<cnt;i++)
			{
				String str = alloptions.get(i).getText();
				System.out.println(str);		
			}
		
			}

	}


