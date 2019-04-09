package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class xmlperameter {
	
	@Test
	@Parameters("username")
	public void xmlgetperameter(String username) {
		System.out.println("username :"+username);
		
	}
	
	

}
