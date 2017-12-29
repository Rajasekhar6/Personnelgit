package karunakarma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		WebDriver drv = new FirefoxDriver();
		drv.get("http://127.0.0.1/login.do");

		drv.findElement(By.name("username")).sendKeys("admin");
		drv.findElement(By.name("pwd")).sendKeys("manager");
		drv.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(2000);

		String expTitle = "actiTIME - Open Tasks";
		String actTitle = drv.getTitle();

		if (expTitle.equals(actTitle))
			System.out.println("Login is correct.");
		else
			System.out.println("Login is not correct.");

		drv.findElement(By.xpath("//input[@value='Add New Tasks']")).click();
		WebElement CustDD = drv.findElement(By.name("customerId"));
		Select CustSel = new Select(CustDD);
		CustSel.selectByValue("0");
		drv.findElement(By.name("customerName")).sendKeys("Ram123");
		drv.findElement(By.name("projectName")).sendKeys("AmericanSI");
		drv.findElement(By.name("task[0].name")).sendKeys("Adding Task");
		drv.findElement(By.name("task[0].deadline")).sendKeys("Mar 25, 2015"); // in
																				// future
																				// we
																				// will
																				// do
																				// this
																				// exercise

		WebElement BillType = drv.findElement(By.name("task[0].billingType"));
		Select BillSelect = new Select(BillType);
		BillSelect.selectByVisibleText("Billable");

		drv.findElement(By.xpath("//input[@value='Create Tasks']")).click();
		String ConfirmMsg = drv.findElement(
				By.xpath("(//span[@class='successmsg'])[3]")).getText();

		if (ConfirmMsg.contains("1 new task was added to the customer"))
			System.out.println("Task is added successfully");
		else
			System.out.println("Task creation failed");

		drv.findElement(By.xpath("//img[@class='logoutImg']")).click();
		System.out.println("Logout successfully done");
	}
}

