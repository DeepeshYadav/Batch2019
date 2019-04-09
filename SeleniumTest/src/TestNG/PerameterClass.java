package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.collections.Objects;

public class PerameterClass {

	@Test(dataProvider="getData")
	public void loginTest(String username, String password, String ExpResult, String Browser) {
		System.out.println(username+"----"+password+"----"+ExpResult+"-----"+Browser);
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[3][4];
		
		//1st row
		data[0][0] = "U1";
		data[0][1] = "P1";
		data[0][2] = "Pass";
		data[0][3] = "Mozilla";
		
		// 2nd row
		data[1][0] = "U2";
		data[1][1] = "P2";
		data[1][2] = "fail";
		data[1][3] = "Chrome";
		
		
		// 3rd row
		data[2][0] = "U3";
		data[2][1] = "P3";
		data[2][2] = "Pass";
		data[2][3] = "IE";
		
		return data;
		
	}
	
}
