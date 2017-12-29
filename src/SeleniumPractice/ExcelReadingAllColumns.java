package SeleniumPractice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadingAllColumns {
	
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("E://ExcelTest.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		Sheet sht = wb.getSheet("POI");
		int rwcnt = sht.getLastRowNum();
		for(int i=0;i<=rwcnt;i++)
		{
			String names = sht.getRow(i).getCell(i).getStringCellValue();
			System.out.println(names);
		}
		}
}
