package testSuite;

//******************************************
//  pagefactory package - ActiTimeLoginPage
//******************************************

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import pagefactory.ActiTimeLoginPage;
import pagefactory.ActiTimeOpentask;

public class TestScript_001 {

	public static void main(String[] args) {
		
		WebDriver drv = new FirefoxDriver();
		drv.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		drv.get("http://127.0.0.1/login.do");
		//initial page factory class
		ActiTimeLoginPage pag = PageFactory.initElements(drv,ActiTimeLoginPage.class);
		pag.userTextbox().sendKeys("admin");
		pag.pwdTextbox().sendKeys("manager");
		pag.loginButton().click();	
		
		ActiTimeOpentask pag1 = PageFactory.initElements(drv, ActiTimeOpentask.class);
				pag1.addnewtask().click();
				
	}
	}
