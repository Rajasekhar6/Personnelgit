package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selecttest1 {

	public static void main(String[] args) {
	
		WebDriver wb = new FirefoxDriver();
		wb.get("http://127.0.0.1/login.do");
		wb.manage().window().maximize();
		wb.findElement(By.name("username")).sendKeys("admin");
		wb.findElement(By.name("pwd")).sendKeys("manager");
		wb.findElement(By.xpath("//input[@type='submit']")).click();
		
		wb.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		WebElement ele = wb.findElement(By.xpath("//select[@name='customerProject.shownCustomer']"));
		
		Select sel = new Select(ele);
		List<WebElement> alloptions = sel.getOptions();
		
		int count = alloptions.size();
		for(int i =0; i<=count-1;i++)
		{
			String text = alloptions.get(i).getText();
			System.out.println(text);
		}
		}

}
