package SeleniumPractice;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Excise1 {

	public static void main(String[] args) {

		
		WebDriver wb = new FirefoxDriver();
		wb.get("http://127.0.0.1/login.do");
		WebElement wbele = wb.findElement(By.name("username"));
	    try
	    {
	    	if(wbele.isEnabled());
	    	wbele.sendKeys("admin");
	    		    	
	    }
	    catch(NoSuchElementException nsee)
	    {
	    	System.out.println(" Testing to string method ::"+nsee.toString());
	    	
	    }
	   }

}
