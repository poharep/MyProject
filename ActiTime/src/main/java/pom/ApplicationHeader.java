package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ApplicationHeader {

	@FindBy (xpath ="sdfgh")
	private WebElement timeTrack;


	@FindBy (xpath ="//a[@class='content tasks']")
	private WebElement task;
	

	@FindBy (xpath ="//a[@class='content reports']")
	private WebElement savedReports;
	
//	@FindBy (xpath ="//a[@class='content reports_selected selected']")
//	private WebElement savedReports;
//	
//	@FindBy (xpath ="//a[text()='Reports']")
//	private WebElement savedReports;
//	

	@FindBy (xpath ="//a[@class='content users']")
	private WebElement userList;
	
	
	
//	@FindBy (xpath ="//a[@class='content calendar_selected selected']")
//	private WebElement workSchedule;
	
	@FindBy (xpath ="//a[@class='content calendar']")
	private WebElement workSchedule;
	
	@FindBy (xpath="//a[@class='logout']")
	private WebElement logOut;
	
	
	
	private WebDriver driver;
	private WebDriverWait wait;
	private Actions actions;
	
	
	public ApplicationHeader(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
		actions = new Actions(driver);
	}
	
	public void openTimeTrackPage()
	{
//		WebDriverWait wait = new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.visibilityOf(timeTrack));
//		timeTrack.click();
		
		actions.moveToElement(timeTrack).click().build().perform();
		}
	
	
	public void openTaskPage()
	{
//		WebDriverWait wait = new WebDriverWait(driver,10);
//	    wait.until(ExpectedConditions.visibilityOf(task));
//	
//		task.click();
		actions.moveToElement(task).click().build().perform();
		
		}
	
	
	
	public void openSavedReports()
	{
//		WebDriverWait wait = new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.visibilityOf(savedReports));
//		savedReports.click();
		
		actions.moveToElement(savedReports).click().build().perform();
	}
	
	public void openUserPage()
	{
//		WebDriverWait wait = new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.visibilityOf(userList));
//		userList.click();
		actions.moveToElement(userList).click().build().perform();
		
	
	}
	
	public void workSchedule()
	{
//		WebDriverWait wait = new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.visibilityOf(workSchedule));
//	    workSchedule.click();
//	    
		actions.moveToElement(workSchedule).click().build().perform();
	
	}
	
	public void logOut()
	{
		logOut.click();
	}
	
//	public void closedBrowser()
//	{
//		closedBrowser.click();
//	}
	
	
	public void loginToHeaderApplication()
	{
		
		timeTrack.click();
		task.click();
		savedReports.click();
		userList.click();
		workSchedule.click();
	logOut.click();
	
	}
	
}
