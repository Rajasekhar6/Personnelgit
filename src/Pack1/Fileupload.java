package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Fileupload {

	//write a program for Fileupload
	
	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.ie.driver","E:\\IEDriverServer.exe");
		WebDriver wb = new InternetExplorerDriver();
		
		
		//wb.get("http://www.megafileupload.com/");
		Thread.sleep(3000);
		wb.get("http://127.0.0.1/login.do");
		wb.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		wb.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		wb.findElement(By.xpath("//input[@type='submit']")).click();
		// wb.findElement(By.id("uploadfile_0")).sendKeys("E:\\Santhi\\Help content R4 - R5");
		//Thread.sleep(3000);
		//wb.findElement(By.id("terms")).click();
		//Thread.sleep(3000);
		//wb.findElement(By.xpath("//input[@name='send']")).click();
				        
		
	}

}
