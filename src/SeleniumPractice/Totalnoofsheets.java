package SeleniumPractice;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Totalnoofsheets {

	
	public static void main(String[] args)  {
		try{
		FileInputStream fis = new FileInputStream("E:\\ExcelTest.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		int cnt = wb.getNumberOfSheets();
		System.out.println(cnt);
		for(int i=0;i<cnt;i++)
		{
			String sntname = wb.getSheetAt(i).getSheetName();
			System.out.println("sntname"+sntname);
		}
		wb.close();
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
	}

}
