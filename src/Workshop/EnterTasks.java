package Workshop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

	public class EnterTasks {
		
		public static void main(String[] args) throws Exception{

		WebDriver wb = new FirefoxDriver();
		wb.get("http://127.0.0.1/login.do");
		Thread.sleep(2000);
		wb.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		wb.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		wb.findElement(By.xpath("//input[@type='submit']")).click();
		String titile = wb.getTitle();
		System.out.println(titile);
		wb.findElement(By.xpath("//input[@value='Add New Tasks']")).click();
		
		WebElement listobj = wb.findElement(By.xpath("//select[@name='customerId']"));
		Select seleobj = new Select(listobj);
		seleobj.selectByVisibleText("Raja");
		
        WebElement listobj1 = wb.findElement(By.xpath("//select[@name='projectId']"));
		Select seleobj1 = new Select(listobj1);
		seleobj1.selectByVisibleText("ATT");
		
		wb.findElement(By.xpath("//a[@href='javascript:addRows(10);']")).click();
		
		List<WebElement> alltext = wb.findElements(By.xpath("//a[@title='Click to enter task description']/preceding-sibling::*"));
		int sz = alltext.size();
		int j =0;
		for(int i=0;i<sz;i++)
		{
			alltext.get(i).sendKeys("Task"+(++j));
		}
		}
		
		
		
			
	}


