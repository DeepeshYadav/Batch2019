package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTest {
	
	@Test(groups = {"sanity"})
	public void doRegister() {
		System.out.println("First Test");
	}
	
	@Test(groups= {"regression"})
	public void dosignout() {
		System.out.println("Second Test");
	}

	@Test(groups = {"sanity", "regression"})
	public void login() {
		System.out.println("Third Test");	
	}
	@Test
	public void four() {	
		System.out.println("Fourth Test");		
	}    
	@Test
	public void five() {	
		System.out.println("Fifth Test");
	}

}
