package Appium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class browsertest {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "My Phone");
		//Give Device ID of your mobile phone
		caps.setCapability("udid", "ZY223DBDTR"); 
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "7.0");
		caps.setCapability("browserName", "Chrome");
		caps.setCapability("noReset", true);
		
		//Set ChromeDriver location
		//System.setProperty("webdriver.chrome.driver","C:\\selenium_drivers\\chromedriver.exe");
		
		//Instantiate Appium Driver
		WebDriver driver = null;
		try {
			
			driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
			driver.get("http://www.facebook.com");
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			System.out.println("Title "+driver.getTitle()); 
			Thread.sleep(5000);
			driver.findElement(By.id("m_login_email")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("m_login_email")).sendKeys("mukesh@gmail.com");
			Thread.sleep(5000);
			driver.findElement(By.id("m_login_password")).sendKeys("mukesh_selenium");
			driver.findElement(By.id("u_0_6")).click();
			 
			// close the browser
			driver.quit();
			 	
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
	}
	}
}


