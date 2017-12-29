package SeleniumSirprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEbrowser {

	public static void main(String[] args) {

		String path = "E://Softwares//IEDriverServer.exe";
		System.setProperty("WebDriver.ie.Driver", path);

		WebDriver wb = new InternetExplorerDriver();
		wb.get("http://127.0.0.1/login.do");
		wb.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		wb.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		wb.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
