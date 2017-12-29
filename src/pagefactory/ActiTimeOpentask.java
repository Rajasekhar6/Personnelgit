package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActiTimeOpentask {

	@FindBy(xpath="//input[@value='Add New Tasks']")
	private WebElement addtask;
	
	public WebElement addnewtask()
	{
		return addtask;
	}
	
}
