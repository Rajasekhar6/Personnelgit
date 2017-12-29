package karunakarma;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		WebDriver dir = new FirefoxDriver();
		dir.get("http://127.0.0.1/login.do");
		dir.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		dir.findElement(By.name("pwd")).sendKeys("manager");
		dir.findElement(By.xpath("//input[@type='submit']")).click();
		
		List<WebElement> alllinks = dir.findElements(By.xpath("//a"));
		int count = alllinks.size();
		System.out.println("Total links : "+count);
		for(int i=0;i<count;i++)
		{
			String txt = alllinks.get(i).getText();
			System.out.println(i+")"+txt);
		}
		
		

	}

}
