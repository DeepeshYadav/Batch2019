package antpkg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestB {
	@BeforeClass
	public void setUp() {
		System.out.println("*** In class - Test B ***");
	}

	@Test
	public void testOne() {
		System.out.println("hello B One");
	}
	
	@Test
	public void testTwo() {
		System.out.println("hello B two");
	} 
	
	@AfterClass
	public void tearDown() {
		System.out.println("*** End of class***");
	}
}
