package Appium;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class chromebrowser {
	
	 
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
				driver.get("http://www.google.com");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.findElement(By.xpath(".//*[text()='Sign in']")).click();
				Thread.sleep(5000);
				driver.findElement(By.id("identifierId")).click();
				Thread.sleep(5000);
				driver.findElement(By.id("identifierId")).clear();
				Thread.sleep(5000);
				driver.findElement(By.id("identifierId")).sendKeys("mytest@gmail.com");
				Thread.sleep(5000);
				driver.findElement(By.xpath(".//*[text()='Next']")).click();
				
				
			} catch (MalformedURLException e) {
				System.out.println(e.getMessage());
			}
					
			//Open URL in Chrome Browser
			
		}
}

