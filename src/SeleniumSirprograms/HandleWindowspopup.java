package SeleniumSirprograms;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWindowspopup {

// 
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver wb = new FirefoxDriver();
		wb.get("http://127.0.0.1/login.do");
		wb.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		wb.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		wb.findElement(By.xpath("//input[@type='submit']")).click();
		wb.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		wb.findElement(By.linkText("Reports")).click();
		wb.findElement(By.name("genCSV")).click();
		//call .exe file to execute from Eclipse
		String path = "C:\\Users\\acer\\Desktop\\Winpopup.exe"; 
		Process p = Runtime.getRuntime().exec(path);
		p.waitFor();
		Thread.sleep(2000);
	}

}
