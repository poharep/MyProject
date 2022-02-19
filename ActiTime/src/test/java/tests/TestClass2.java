package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass2 {

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before Class TestClass2");
		
		
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before Method TestClass2");
		
		
	}
	
	@Test
	public void TestA()
	{
		System.out.println("TestA TestClass2");
	}
	
	@Test
	public void TestB()
	{
		System.out.println("TestB TestClass2");
	}
	
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after Method TestClass2");
		
		
	}
	
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("after Class TestClass2");
		
		
	}
}
