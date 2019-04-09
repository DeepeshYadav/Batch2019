package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class DependencyTest {

	WebDriver driver = new ChromeDriver();
	
	@Test(priority = 3)
	public void loginTest() {
		System.out.println("Execute the login test");
		//throw new SkipException(" Skip the login test");
	}
	
	@Test (priority = 1, dependsOnMethods= {"logoutTest"})
	public void ChangePassTest() {
		System.out.println("Execute the change password test");
	}
	
	@Test (priority = 2)
	public void logoutTest(){
		System.out.println("Execute the logout test");
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).clear();	
		driver.close();
	
}

}