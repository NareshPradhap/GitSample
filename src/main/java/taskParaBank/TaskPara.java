package taskParaBank;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

public class TaskPara extends TaskBase {
	
	
	
	@BeforeClass
	private void beforeClass() {
		getDriver();
		launchURL("https://parabank.parasoft.com/parabank/index.htm");
		click(new TaskPom().getRegister());

	}
	
	@AfterClass
	
	private void afterClass() {
		System.out.println("After Class");
		closeBrowser();

	}
	
	@BeforeMethod
	
	private void beforeMethod() {
		System.out.println("Before Method");
		Date d = new Date();
		System.out.println(d);

	}
	
	@AfterMethod
	
	private void afterMethod() {
		System.out.println("After Method");
		Date d = new Date();
		System.out.println(d);

	}
	
	
	@Test
	
	private void test1() throws IOException, InterruptedException {
		System.out.println("Test 1");
		insertType(new TaskPom().getTxt1stName(), getData(0, 0));
		insertType(new TaskPom().getTxtLastName(), getData(0, 1));
		insertType(new TaskPom().getTxtaddress(), getData(0, 2));
		insertType(new TaskPom().getTxtCity(), getData(0, 3));
		insertType(new TaskPom().getTxtState(), getData(0, 4));
		insertType(new TaskPom().getTxtZipCode(), getData(0, 5));
		insertType(new TaskPom().getTxtPhNo(), getData(0, 6));
		insertType(new TaskPom().getTxtSsn(), getData(0, 7));
		insertType(new TaskPom().getTxtRegUName(), getData(1, 0));
		insertType(new TaskPom().getTxtRegPass(), getData(1, 1));
		insertType(new TaskPom().getTxtRegConPass(), getData(1, 2));
		click(new TaskPom().getBtnregister());
		Thread.sleep(3000);
		
		click(new TaskPom().getBtnLogout());
		
	}
	
	@Test
	
	private void test2() throws IOException, InterruptedException {
		System.out.println("Test 2");
		
		insertType(new TaskPom().getTxtUserName(), getData(0, 0));
		insertType(new TaskPom().getTxtpass(), "17Jun");
		click(new TaskPom().getBtnLogin());
		Thread.sleep(3000);
		
		click(new TaskPom().getNewAcct());
		
		Thread.sleep(3000);
		
		WebElement acctType = driver.findElement(By.id("type"));
		Select s = new Select(acctType);
		s.selectByVisibleText("SAVINGS");
		
		WebElement chooseAcct = driver.findElement(By.id("fromAccountId"));
		Select s1 = new Select(chooseAcct);
		s1.selectByIndex(1);
		
		click(new TaskPom().getBtnOpenNewAcct());
		String currentUrl = getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("openaccount"), "New account is not created.");
		Thread.sleep(3000);
		
		WebElement newAcctId = driver.findElement(By.id("newAccountId"));
		String text = newAcctId.getText();
		System.out.println(text);
		getValueExcel(0, 0, text);
		
		

	}
	
	@Test
	
	private void test3() throws IOException, InterruptedException {
		System.out.println("Test 2");
		
		insertType(new TaskPom().getTxtUserName(), getData(0, 0));
		insertType(new TaskPom().getTxtpass(), "17Jun");
		click(new TaskPom().getBtnLogin());
		Thread.sleep(3000);
		
		click(new TaskPom().getNewAcct());
		
		Thread.sleep(3000);
		
		WebElement acctType = driver.findElement(By.id("type"));
		Select s = new Select(acctType);
		s.selectByVisibleText("SAVINGS");
		
		WebElement chooseAcct = driver.findElement(By.id("fromAccountId"));
		Select s1 = new Select(chooseAcct);
		s1.selectByIndex(1);
		
		click(new TaskPom().getBtnOpenNewAcct());
		String currentUrl = getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("openaccount"), "New account is not created.");
		Thread.sleep(3000);
		
		WebElement newAcctId = driver.findElement(By.id("newAccountId"));
		String text = newAcctId.getText();
		System.out.println(text);
		getValueExcel(0, 0, text);
	



}
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


