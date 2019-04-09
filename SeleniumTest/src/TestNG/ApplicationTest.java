package TestNG;

import org.testng.annotations.Test;

public class ApplicationTest {
	
	
	/*
	@Test ()
	public void loginTest() {
		System.out.println("Execute the login test");
	}
	
	@Test ()
	public void homeTest() {
		System.out.println("Execute the home navigation test");
	}
	
	@Test()
	public void logoutTest(){
		System.out.println("Execute the logout test");
		
	}
	
	*/
	
	
	
	@Test (priority=1)
	public void loginTest() {
		System.out.println("Execute the login test");
	}
	
	@Test (priority=2)
	public void homeTest() {
		System.out.println("Execute the home navigation test");
	}
	
	@Test(priority=3)
	public void logoutTest(){
		System.out.println("Execute the logout test");
		
	}
	
	
	
	
}
