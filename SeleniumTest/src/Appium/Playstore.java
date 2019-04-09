package Appium;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Playstore {
		
		private static final TimeUnit Thread = null;

		public static void main(String[] args) throws InterruptedException {
			
			//Set the Desired Capabilities
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("deviceName", "MotoG");
			caps.setCapability("udid", "ZY223DBDTR"); //Give Device ID of your mobile phone
			caps.setCapability("platformName", "Android");
			caps.setCapability("platformVersion", "7.0");
			caps.setCapability("appPackage", "com.android.vending");
			caps.setCapability("appActivity", "com.google.android.finsky.activities.MainActivity");
			caps.setCapability("noReset", "true");
			
			//Instantiate Appium Driver
			try {
		
				WebDriver driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//Thread.sleep(10000);
				driver.findElement(By.id("com.android.vending:id/search_box_idle_text")).clear();
				driver.findElement(By.id("com.android.vending:id/search_box_text_input")).sendKeys("WhatsApp");
				driver.findElement(By.className("android.widget.TextView")).click();
				
			} catch (MalformedURLException e) {
				System.out.println(e.getMessage());
			}
		}
	 
	}


