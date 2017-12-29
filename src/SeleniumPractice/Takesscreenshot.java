package SeleniumPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Takesscreenshot {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		WebDriver wb = new FirefoxDriver();
		wb.get("http://google.com");
		FirefoxDriver ff = (FirefoxDriver)wb;
File scr =	ff.getScreenshotAs(OutputType.FILE);

File dest = new File("D:/Raja Personel/Learnings/failNov7th.png");

FileUtils.moveFile(scr, dest);
		
		
		
	}

}
