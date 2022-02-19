package test;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pom.ApplicationHeader;
import pom.LoginPage;

public class VerifyHeadersOfApplication {

	
	private WebDriver driver;
	private ApplicationHeader applicationHeader;
	private LoginPage loginPage;
	
	static ExtentTest test;
	static ExtentHtmlReporter reporter;	
	@BeforeClass
	public void launchBrowser()
	{
		
		
		reporter = new ExtentHtmlReporter("test-output"+File.separator+"ExtendReport"+File.separator+"extendReport.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		
		
		System.out.println("launchBrowser");
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void loginToApplication() {
		
		System.out.println("loginToApplication");
		driver.get("http://localhost/login.do");
		loginPage = new LoginPage(driver);
		loginPage.sendUserName();
		loginPage.sendPassword();
		loginPage.clickOnLogin();
		applicationHeader = new ApplicationHeader(driver);
		
	}
	
	@Test(priority=1)
	public void toVerifyTaskButton()
	{
		System.out.println("To Verify Task tab/button");
		applicationHeader = new ApplicationHeader(driver);
		
		applicationHeader.openTaskPage();
		String url = driver.getCurrentUrl();
		String title=driver.getTitle();
		
		SoftAssert softAssert= new SoftAssert();
		
		softAssert.assertEquals(url, "http://localhost/tasks/otasklist.do","url is not found");
		System.out.println("after assert");
		boolean result= url.equals("http://localhost/tasks/otasklist.do");
		System.out.println("after assert");
		softAssert.assertTrue(result);

		
		softAssert.assertAll();
		
		
		
		
//		Assert.assertEquals(url,"http://localhost/tasks/otasklist.do");
//		System.out.println("hard assert");
//		Assert.assertEquals(title,"actiTIME - Open Tasks");
//		
//		
//		boolean result= url.equals("http://localhost/tasks/otasklist.do");
//		
//		Assert.assertTrue(result);
//		
		//Assert.fail();
		
		//Assert.assertFalse(result);
//		
		
//		if(url.equals("http://localhost/tasks/otasklist.do"))
//		{
//			System.out.println("PASS");
//		}
//		else
//		{
//			System.out.println("Fail");
//		}
//		if(title.equals("actiTIME - Open Tasks"))
//		{
//			System.out.println("PASS");
//		}
//		else
//		{
//			System.out.println("FAIL");
//		}
		}
	
	@Test(priority=2)
	public void toVerifySavedReportTab()
	{
		System.out.println("To Verify SavedReporttab/button");
		applicationHeader = new ApplicationHeader(driver);
		
		applicationHeader.openSavedReports();
		String url = driver.getCurrentUrl();
		String title=driver.getTitle();
		
		
		
		Assert.assertEquals(url,"http://localhost/reports/reports.do", "url of task is not found");
		System.out.println("hard assert");
		Assert.assertEquals(title,"actiTIME - Saved Reports");
		
		
		
		
		
//		if(url.equals("http://localhost/reports/reports.do"))
//		{
//			System.out.println("PASS");
//		}
//		else
//		{
//			System.out.println("Fail");
//		}
//		if(title.equals("actiTIME - Saved Reports"))
//		{
//			System.out.println("PASS");
//		}
//		else
//		{
//			System.out.println("FAIL");
//		}
		}
	
	@Test(priority=3)
	public void toVerifyUserTab()
	{
		System.out.println("To Verify Usertab/button");
		applicationHeader = new ApplicationHeader(driver);
		
		applicationHeader.openUserPage();
		String url = driver.getCurrentUrl();
		String title=driver.getTitle();
		
		
		Assert.assertEquals(url,"http://localhost/administration/userlist.do", "url of task is not found");
		System.out.println("hard assert");
		Assert.assertEquals(title,"actiTIME - User List");
		
//		Assert.assertNotEquals(url,"http://localhost/administration/userlist.do");
//		
//		boolean result=url.equals("http://localhost/administration/userlist.do");
//		
//		Assert.assertTrue(result);
//		
//		Assert.assertFalse(result);
//		Assert.fail();
		
//		if(url.equals("http://localhost/administration/userlist.do"))
//		{
//			System.out.println("PASS");
//		}
//		else
//		{
//			System.out.println("Fail");
//		}
//		if(title.equals("actiTIME - User List"))
//		{
//			System.out.println("PASS");
//		}
//		else
//		{
//			System.out.println("FAIL");
//		}
	}
	@Test(priority=4)
	public void toVerifyWorkScheduleTab()
	{
		System.out.println("To Verify WorkScheduletab/button");
		applicationHeader = new ApplicationHeader(driver);
		
		applicationHeader.workSchedule();
		String url = driver.getCurrentUrl();
		String title=driver.getTitle();
		
		
		Assert.assertEquals(url,"http://localhost/administration/workingdays.do", "url of task is not found");
		System.out.println("hard assert");
		Assert.assertEquals(title,"actiTIME - Corporate Schedule");
		
		
//		if(url.equals("http://localhost/administration/workingdays.do"))
//		{
//			System.out.println("PASS");
//		}
//		else
//		{
//			System.out.println("Fail");
//		}
//		if(title.equals("actiTIME - Corporate Schedule"))
//		{
//			System.out.println("PASS");
//		}
//		else
//		{
//			System.out.println("FAIL");
//		}
		}
	
	@AfterMethod
	public void logoutFromApplication()
	{
		applicationHeader = new ApplicationHeader(driver);
	
		System.out.println("logout");
		applicationHeader.logOut();
		
	}
	
	
	@AfterClass
	public void closedBrowser()
	{
		System.out.println("after class");
		driver.quit();
	
	}
}

