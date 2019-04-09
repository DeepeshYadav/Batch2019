package AutomationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class funkeyword {
	
	static WebDriver driver;
	public static WebDriver OpenBrowser(String Browser) {
		if  (Browser.equalsIgnoreCase("chrome")) {
			
			WebDriver driver = new ChromeDriver();
		}else if (Browser.equalsIgnoreCase("firefox")) {
			
			WebDriver driver = new FirefoxDriver();
		}
			
		return driver;		
	}
	
	public static void GotoURL(WebDriver driver, String URL)
	{
		driver.get(URL);
		driver.manage().window().maximize();		
	}
		
	public static void Search_Text_Verify(WebElement SearchBox, WebElement SearchButton, String text ) {
		SearchBox.clear();
		SearchBox.sendKeys(text);
				
	}
	
	

}
