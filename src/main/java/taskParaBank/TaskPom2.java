package taskParaBank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPom2 extends TaskBase{
	public TaskPom2() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Register']")
	 private WebElement register;
	
	@FindBy(id="customer.firstName")
	 private WebElement txt1stName;
	
	@FindBy(id="customer.lastName")
	 private WebElement txtLastName;
	
	@FindBy(id="customer.address.street")
	 private WebElement txtaddress;
	
	@FindBy(id="customer.address.city")
	 private WebElement txtCity;
	
	@FindBy(id="customer.address.state")
	 private WebElement txtState;
	
	@FindBy(id="customer.address.zipCode")
	 private WebElement txtZipCode;
	
	@FindBy(id="customer.phoneNumber")
	 private WebElement txtPhNo;
	
	@FindBy(id="customer.ssn")
	 private WebElement txtSsn;
	
	@FindBy(id="customer.username")
	 private WebElement txtRegUName;
	
	@FindBy(id="customer.password")
	 private WebElement txtRegPass;
	
	@FindBy(id="repeatedPassword")
	 private WebElement txtRegConPass;
	
	@FindBy(xpath = "(//input[@Type='submit'])[2]")
	 private WebElement Btnregister;
	
	@FindBy(xpath = "//a[text()='Log Out']")
	 private WebElement btnLogout;
	
	public WebElement getTxtUserName() {
		return txtUserName;
	}


	public WebElement getTxtpass() {
		return txtpass;
	}


	public WebElement getBtnLogin() {
		return btnLogin;
	}
	@FindBy(name="username")
	 private WebElement txtUserName;
	
	@FindBy(name="password")
	 private WebElement txtpass;
	
	@FindBy(xpath = "//input[@value='Log In']")
	 private WebElement btnLogin;
	
	
	
	@FindBy(xpath = "//a[text()='Open New Account']")
	 private WebElement newAcct;
	
	
	@FindBy(xpath = "(//select[contains(@class,'input ng-pristine ng-valid ng-not-empty ng-touched')])[1]")
	 private WebElement DDAcct;
	
	
	@FindBy(xpath = "(//select[contains(@class,'input ng-pristine ng-valid ng-not-empty ng-touched')])[2]")
	 private WebElement DDChooseAcct;
	
	
	@FindBy(xpath = "//input[contains(@class,'button')]")
	 private WebElement btnOpenNewAcct;

	
	
	public WebElement getRegister() {
		return register;
	}


	public WebElement getTxt1stName() {
		return txt1stName;
	}


	public WebElement getTxtLastName() {
		return txtLastName;
	}


	public WebElement getTxtaddress() {
		return txtaddress;
	}


	public WebElement getTxtCity() {
		return txtCity;
	}


	public WebElement getTxtState() {
		return txtState;
	}


	public WebElement getTxtZipCode() {
		return txtZipCode;
	}


	public WebElement getTxtPhNo() {
		return txtPhNo;
	}


	public WebElement getTxtSsn() {
		return txtSsn;
	}


	public WebElement getTxtRegUName() {
		return txtRegUName;
	}


	public WebElement getTxtRegPass() {
		return txtRegPass;
	}


	public WebElement getTxtRegConPass() {
		return txtRegConPass;
	}


	public WebElement getBtnregister() {
		return Btnregister;
	}


	public WebElement getBtnLogout() {
		return btnLogout;
	}


	public WebElement getNewAcct() {
		return newAcct;
	}


	public WebElement getDDAcct() {
		return DDAcct;
	}


	public WebElement getDDChooseAcct() {
		return DDChooseAcct;
	}


	public WebElement getBtnOpenNewAcct() {
		return btnOpenNewAcct;
	}
	
	
	
	
	
	
	
	
	
	}
	
	
	


