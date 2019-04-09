package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTestNG {
	
	@BeforeClass
	public void BeforeClassMethod() {
		
		System.out.println("Execute Before Class Method");
	}
	
	@AfterClass
	public void AfterClassMethod() {
		System.out.println("Execute After Class Method");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("Execute Before Test method");
		// For Example open Initialize browser
		// Driver initialize, objects creation, Timeout, Application URL.
		
		}
	
	@AfterTest
	public void aftertest() {
		System.out.println("Execute after test method");
		// Destroy Driver Initialization, clean cache, delete cookies, memory free
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("------Before Method-------");
		//Open Browser for each test case.
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("------After Method-------");
		System.out.println("################################");
		// Close Browser after each test case execution.
	}
	
	
	@BeforeSuite
	public void  BeforeSuiteMethod() {
		System.out.println("Execute the Before Test Suite Method");
		//Example 1 . Set System Property
		//        2.  Installation like Java, python, Browser, Jar
		//        3.  Set Browsers and their drivers property. 
	}
	
	@AfterSuite
	public void AfterSuiteMethod() {
		System.out.println("Execute the After Test Suite Method");
		// 1. Clean Process, Destroy the VM/Machine for iteration.
	}

	
	@Test ()
	public void AloginTest() {
		System.out.println("Execute the login test1");
		
	}
	
	@Test ()
	public void homeTest() {
		System.out.println("Execute the home navigation test2");
		System.out.println("-------------------------------");
	}
	
	@Test()
	public void logoutTest(){
		System.out.println("Execute the logout test3");
		System.out.println("-------------------------------");
		
	}

}
