package SeleniumPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprotest {

	
	@DataProvider
	public Object[][] getdata()
	{
		Object data[][] = new Object[2][2];
		data[0][0] = "admin";
		data[0][1] = "manager";
		data[1][0] = "admin";
		data[1][1] = "manager";
		return data;
	}
	
	@Test(dataProvider="getdata")
	public void register(String ur,String pwd)
	{
		System.out.println(ur + pwd);
	}
	}
