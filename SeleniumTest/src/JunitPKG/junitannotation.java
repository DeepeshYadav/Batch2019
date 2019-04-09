package JunitPKG;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class junitannotation {
			
		@BeforeClass
		public static void BeforeClassMethod() {
			
			System.out.println("Execute Before Class Method");
		}
		
		@AfterClass
		public static void AfterClassMethod() {
			System.out.println("Execute After Class Method");
		}
		
		@Before
		public void beforetest() {
			System.out.println("Execute Before Test");
			// For Example open Initialize browser
			// Driver initialize, objects creation, Timeout, Application URL.
			
			}
		
		@After
		public void aftertest() {
			System.out.println("Execute after test");
			System.out.println("-------------------------------");
			// Destroy Driver Initialization, clean cache, delete cookies, memory free
		}
		
				
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

}



