package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Quikraddad {

	public static void main(String[] args) {
		;
		
		FirefoxProfile ff = new FirefoxProfile();
		ff.setAcceptUntrustedCertificates(false);
		
		WebDriver wb = new FirefoxDriver(ff);
		
		
		

	}

}
