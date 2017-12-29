package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwaittest {

	public static void main(String[] args) {

		WebDriver wb = new FirefoxDriver();
		wb.get("http://127.0.0.1/login.do");
		wb.manage().window().maximize();
		
		WebDriverWait ww = new WebDriverWait(wb,2000);
		ww.pollingEvery(2000, TimeUnit.SECONDS);
		ww.until(ExpectedConditions.presenceOfElementLocated(By.id("ddddd")));
		
		wb.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		
		
		
	}

}
