package tests;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass1 {

	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before Class TestClass1");
		
		
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before Method TestClass1");
		
		
	}
	
	@Test
	public void TestA()
	{
		System.out.println("TestA TestClass1");
	}
	
	@Test
	public void TestB()
	{
		System.out.println("TestB TestClass1");
	}
	
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after Method TestClass1");
		
		
	}
	
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("after Class TestClass1");
		
		
	}
	
}
