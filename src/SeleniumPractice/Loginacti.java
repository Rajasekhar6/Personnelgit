package SeleniumPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Loginacti {

	public static void main(String[] args) throws IOException {

		WebDriver wb = new FirefoxDriver();
		wb.get("http://127.0.0.1/login.do");
		wb.manage().window().maximize();
			
		FileInputStream fis = new FileInputStream("D:/Raja Personel/TestData.xlsx");
		XSSFWorkbook wd = new XSSFWorkbook(fis);
		XSSFSheet sf = wd.getSheet("TestData");
		String uid = sf.getRow(1).getCell(0).getStringCellValue();
		String pwd = sf.getRow(1).getCell(1).getStringCellValue();
		System.out.println("+++++++++");
		System.out.println(uid);
		System.out.println(pwd);
		/*	XSSFRow row = sf.getRow(1);
		XSSFCell cell  = row.getCell(1);
		String text = cell.getStringCellValue(); */
		
		wb.findElement(By.name("username")).sendKeys(uid);
		wb.findElement(By.name("pwd")).sendKeys(pwd);
		wb.findElement(By.xpath("//input[@type='submit']")).click();
		
		}

}
