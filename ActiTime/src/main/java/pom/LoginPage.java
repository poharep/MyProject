package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	
	
	@FindBy (xpath ="//input[@name='username']")
	private WebElement userName;
	
	@FindBy (xpath ="//input[@name='pwd']")
	private WebElement password;
	
	@FindBy (xpath ="//a[@id='loginButton']")
	private WebElement login;
	
	@FindBy (xpath ="//label[@id='keepLoggedInLabel']")
	private WebElement keepMeLoginCheckbox;
	
	
	
	
	public LoginPage(WebDriver driver123)
	{
		
		PageFactory.initElements(driver123,this);;
	}
	
	public void sendUserName()
	{
		userName.sendKeys("admin");
	}
	
	public void sendPassword()
	{
		password.sendKeys("manager");
	}
	public void clickOnLogin()
	{
		login.click();;
	}
	public void selectKeepMeLogin()
	{
		keepMeLoginCheckbox.click();
	}
	
	
	
	
	public void loginToApplication()
	{
		userName.sendKeys("admin");
		password.sendKeys("manager");
		keepMeLoginCheckbox.click();
		login.click();
	
	}

	
	
	
	//ApplicationHeader applicationHeader = new ApplicationHeader(driver);
	//applicationHeader.openReportPage();
	
	
	
}


