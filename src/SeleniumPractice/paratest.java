package SeleniumPractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//********************************
// REFER XML testngparameter.xml
//********************************
public class paratest {

	@Parameters("brw")
	@Test
	public void test1(String brwtype)

	{
	System.out.println(brwtype + "USING THIS BROWSER");	
	}

}
