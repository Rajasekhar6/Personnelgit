package karunakarma;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		WebDriver wb = new FirefoxDriver();
		wb.get("http://127.0.0.1/login.do");
		wb.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		wb.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		wb.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		
		
		String text = wb.findElement(By.xpath("(//td[@class='listtblcell'][1])[1]")).getText();
		System.out.println(text);
		System.out.println("++++++++++++++++++++");
		List<WebElement> text1 = wb.findElements(By.xpath("(//table)[21]/descendant::a"));
		int count = text1.size();
		
		for(int i = 0;i<count;i++)
		{
			String data = text1.get(i).getText();
			System.out.println(data);
		}
		
		
		

	}

}
