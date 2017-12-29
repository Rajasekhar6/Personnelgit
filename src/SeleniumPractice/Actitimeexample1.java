package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actitimeexample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		WebDriver wb = new FirefoxDriver();
		wb.get("http://127.0.0.1/login.jsp");
		wb.manage().window().maximize();
		
		wb.findElement(By.name("username")).sendKeys("admin");
		String type = wb.findElement(By.name("pwd")).getAttribute("type");
		System.out.println(type);
		//wb.findElement(By.xpath("//input[@type='submit']")).click();
}

}
