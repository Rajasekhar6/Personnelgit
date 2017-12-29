//page factory for TestScript_001 Refer this program.

package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActiTimeLoginPage {

	@FindBy(name="username")
	private WebElement varUsername;
	
	@FindBy(name="pwd")
	private WebElement varPwd;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement varLoginbutton;
	
	public WebElement userTextbox()
	{
		return varUsername;		
	}
	public WebElement pwdTextbox()
	{
		return varPwd;
	}
	public WebElement loginButton()
	{
		return varLoginbutton;
	}
	
}
