package SeleniumPractice;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CountNoOfSheets {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("E:\\ExcelTest.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		int shtcount = wb.getNumberOfSheets();
		for(int i=0;i<shtcount;i++)
		{
			String shtname = wb.getSheetAt(i).getSheetName();
			System.out.println(shtname);
		}
		//wb.close();
		
	}
	
}
