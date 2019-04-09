import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class firefoxclass {
	 public static void main(String[] args) {
		 	 
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\geckodriver.exe");
		//  WebDriver driver = new FirefoxDriver();
		  FirefoxProfile fp = new FirefoxProfile();
		// set something on the profile...
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		dc.setCapability(FirefoxDriver.PROFILE, fp);
		WebDriver driver = new RemoteWebDriver(dc);
		
		
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get("http://www.google.com");
		  if (driver.findElement(By.xpath("//input[@name='q']")).isEnabled()) {
		   System.out.println("Google search text box Is enabled.");
		   driver.findElement(By.xpath("//input[@name='q']")).sendKeys("WebDriver Test successful.");
		   driver.findElement(By.xpath("//button[@name='btnG']")).click();
		   System.out.println("Google search completed.");
		  } else {
		   System.out.println("Google search test box Is Not enabled.");
	
		  }
		  driver.close();

	 }
}
