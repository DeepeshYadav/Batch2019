package JunitPKG;

import org.junit.Ignore;
import org.junit.Test;

public class TestJunit2 {
	
	String message = "iTpreneur Data System";	
	 
	   @Test
	   public void testMessage2() {
		   
		   System.out.println("In side junit2: " +message);
		   
		   
	   }
	   
	   
	   @Test(timeout=1000)
	   public void login() {
		   
		   System.out.println("In side logintest :" +message);
		   
		   
	   }
	   
	   @Ignore
	   @Test(timeout=1000)
	   public void logout() {
		   
		   System.out.println("In side logout test :" +message);
		   
		   
	   }
}
