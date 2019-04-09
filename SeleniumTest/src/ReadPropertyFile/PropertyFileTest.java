package ReadPropertyFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PropertyFileTest {
	
	
	public PropertyFileReader datafile;
	public String workingDir = "C:\\ecplipse-workspace\\SeleniumTest";
	WebDriver driver;
	public String URL;
	@Test
	public void login() throws Exception 
	{
		
		datafile = new PropertyFileReader(workingDir + "\\config\\Configuration.properties");

		// Create a new instance of the Chrome driver
		driver = new ChromeDriver();
		URL = datafile.getData("url");
		System.out.println("url" + URL);
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	WebElement userid = driver.findElement(By.xpath(".//input[@name='user_name']"));
	System.out.println(userid.isEnabled());
	userid.click();
	//System.out.println(userid.isEnabled());
	userid.sendKeys(datafile.getData("username"));

	// Get the password element
	WebElement passwd = driver.findElement(By.xpath(".//input[@name='password']"));
	System.out.println(passwd.isEnabled());
	passwd.click();
	System.out.println(passwd.isEnabled());
	passwd.sendKeys(datafile.getData("password"));
	
	driver.findElement(By.xpath(".//input[@name='Submit']")).click();
		
	driver.quit();
	
	}

}



