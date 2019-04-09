package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTest {
	
	@Test ()
	public void loginTest() {
		System.out.println("Execute the login test");
	}
	
	@Test ()
	public void homeTest() {
		System.out.println("Execute the home navigation test");
		throw new SkipException("Hold On");
	}
	
	@Test()
	public void logoutTest(){
		System.out.println("Execute the logout test");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");
		driver.findElement(By.name("R")).click();
		driver.quit();
	}
    
	@Test()
	public void FlightBooking(){
		System.out.println("Execute the logout test");
		
	}
    
	@Test()
	public void HoteBooking(){
		System.out.println("Execute the logout test");
		
	}

	
	@Test()
	public void TrainBooking(){
		System.out.println("Execute the logout test");
		
	}

}
