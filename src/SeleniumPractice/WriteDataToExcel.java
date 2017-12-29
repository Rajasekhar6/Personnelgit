package SeleniumPractice;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToExcel {

	
	public static void main(String[] args) throws Exception {
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sht = wb.createSheet("Demo1");
		XSSFRow row = sht.createRow(0);
		XSSFCell cell = row.createCell(0);
		XSSFCell cell1 = row.createCell(1);
		cell.setCellValue("POI");
		cell1.setCellValue("Welcome");
		FileOutputStream fos = new FileOutputStream("E:\\ExcelTest.xlsx");
		wb.write(fos);
		fos.close();		
	}
}
