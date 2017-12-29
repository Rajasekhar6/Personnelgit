package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageHandle {

	
	public static void main(String[] args) throws Exception{
		
		WebDriver wb = new FirefoxDriver();
		wb.get("http://www.irctc.co.in");
		Thread.sleep(3000);
		String txt = wb.getWindowHandle();
		
		System.out.println(txt);
		
		
}
}
