package karunakarma;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test10_popup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver drv = new FirefoxDriver();
		drv.get("http://127.0.0.1/login.do");
		drv.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		drv.findElement(By.name("username")).sendKeys("admin");
		drv.findElement(By.name("pwd")).sendKeys("manager");
		drv.findElement(By.xpath("//input[@type='submit']")).click();
				
		drv.findElement(By.xpath("(//tr[td[a[text()='Task']]])//td[7]")).click();
		
		Alert alrt = drv.switchTo().alert();
		String text = alrt.getText();
		System.out.println(text);
		alrt.dismiss();


	}

}
