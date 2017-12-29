package SeleniumPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//*******************************************
//Reading data from excel and writing to excel
//*******************************************

public class Excelreadingtest {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("D:/Raja Personel/Excelreadwritetest.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sht = wb.getSheet("TestData");
		String username = sht.getRow(1).getCell(0).getStringCellValue();
		String pwd = sht.getRow(1).getCell(1).getStringCellValue();
		System.out.println(username + "     "+ pwd);
		
		sht.getRow(1).createCell(2).setCellValue("passed");
		FileOutputStream fos = new FileOutputStream("D:/Raja Personel/Excelreadwritetest.xlsx");
		wb.write(fos);
		
		fos.close();
		fis.close();
	}

}
