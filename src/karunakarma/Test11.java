package karunakarma;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver drv = new FirefoxDriver();
		drv.get("http://127.0.0.1/login.do");
		drv.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Login
		drv.findElement(By.name("username")).sendKeys("admin");
		drv.findElement(By.name("pwd")).sendKeys("manager");
		drv.findElement(By.xpath("//input[@type='submit']")).click();
		drv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Click on Add New Tasks button
		drv.findElement(By.xpath("//input[@value='Add New Tasks']")).click();
		drv.findElement(By.name("task[0].name")).sendKeys("test123");
		//Click Logout
		drv.findElement(By.xpath("//img[@class='logoutImg']")).click();
		//find DIV popup is visible
		try{
		//drv.findElement(By.xpath("//span[@class='dhtml_popup_title']"));
		drv.findElement(By.id("RemainOnThePageButton")).click();
		}
		catch(NoSuchElementException exc)
		{     System.out.println("DIV popup is not present");    }
		String actTiltle = drv.getTitle();
		if(actTiltle.equals("actiTIME - Add New Tasks"))
			System.out.println("Call back is success");
		else
			System.out.println("Call back is fail");
	}      


	}


