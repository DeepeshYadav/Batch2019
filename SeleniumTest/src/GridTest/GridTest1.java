package GridTest;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class GridTest1 {
	

	     WebDriver driver;
	     String baseURL, nodeURL;
	     String path = "Chrome DriverPath" ;

	     @BeforeTest
	     public void setUp() throws MalformedURLException {
	    	
	         baseURL = "http://itpreneurpune.com/courses/";
	         nodeURL = " http://localhost:5566/wd/hub";
	         
	         ChromeOptions options = new ChromeOptions();
	         options.setBinary(path);
	         
	         
	         DesiredCapabilities capability = DesiredCapabilities.chrome();
	         capability.setBrowserName("chrome");
	         capability.setCapability(ChromeOptions.CAPABILITY, options);
	         //capability.setPlatform(Platform.WIN10);
	         driver = new RemoteWebDriver(new URL(nodeURL), capability);
	     }

	     @AfterTest
	     public void afterTest() {
	         driver.quit();
	     }
	     
	     @Test
	     public void sampleTest() {
	         driver.get(baseURL);
             driver.manage().window().maximize();

	         if (driver.getPageSource().contains("ITPD")) {
	             Assert.assertTrue(true, "ITPD Link Found");
	         } else {
	             Assert.assertTrue(false, "Failed: Link not found");
	         }

	     }
	     
}
	 



