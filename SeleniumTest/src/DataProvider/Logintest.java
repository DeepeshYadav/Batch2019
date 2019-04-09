package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Logintest {
	
	public DataReader datafile;
	public String workingDir = "C:\\Users\\Deepesh.Yadav\\eclipse-workspace\\SeleniumTest";
	WebDriver driver;
	public String URL;
	
	
	@BeforeMethod
	public void setUp() throws Exception {

		// Get current working directory and load data file
		//workingDir = System.getProperty("user.dir");
		datafile = new DataReader(workingDir + "\\config\\Configuration.properties");

		// Create a new instance of the Chrome driver
		driver = new ChromeDriver();
		URL = datafile.getData("url");
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	

	@AfterMethod
	public void afterMethod() throws Exception {
		driver.quit();
	}
	
	@Test
	public void login() throws Exception 
	
	{
		
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
	
	}
	
	
	@Test
	public void Register() throws Exception 
	
	{
	
	driver.findElement(By.xpath(".//a[contains(text(),'First Time Students')]")).click();	
	
		// First Name of user  
	WebElement firstname = driver.findElement(By.xpath(".//input[@name='first_name']"));
	System.out.println(firstname.isEnabled());
	firstname.sendKeys(datafile.getData("firstname"));
	
	//Last Name of the new user
	WebElement lastanme = driver.findElement(By.xpath(".//input[@name='last_name']"));
	System.out.println(lastanme.isEnabled());
	firstname.sendKeys(datafile.getData("lastname"));	
	
	// Email id of new user
	WebElement emailid = driver.findElement(By.xpath(".//input[@name='email']"));
	System.out.println(emailid.isEnabled());
	emailid.sendKeys(datafile.getData("usernemail"));
	
	//  Username of new user
	WebElement user_name = driver.findElement(By.xpath(".//input[@name='user_name']"));
	System.out.println(user_name.isEnabled());
	user_name.sendKeys(datafile.getData("username"));
	
	// Address line1 of user
	WebElement Address1 = driver.findElement(By.xpath(".//input[@name='address1']"));
	System.out.println(Address1.isEnabled());
	Address1.sendKeys(datafile.getData("address_1"));
	
	// Addrees Line2 of New user
	WebElement Address2 = driver.findElement(By.xpath(".//input[@name='address2']"));
	System.out.println(Address2.isEnabled());
	Address2.sendKeys(datafile.getData("address_2"));
	
	// Phone number of new user
	WebElement Phoneno = driver.findElement(By.xpath(".//input[@name='phone']"));
	System.out.println(Phoneno.isEnabled());
	Phoneno.sendKeys(datafile.getData("MobileNo"));
	
	// City name of new user
	WebElement City = driver.findElement(By.xpath(".//input[@name='city']"));
	System.out.println(City.isEnabled());
	City.sendKeys(datafile.getData("CityName"));
	
	// State name of new user
	WebElement State = driver.findElement(By.xpath(".//input[@name='prov']"));
	System.out.println(State.isEnabled());
	State.sendKeys(datafile.getData("StateName"));
	
	//Area zip code of the user
	WebElement Zip = driver.findElement(By.xpath(".//input[@name='zip']"));
	System.out.println(Zip.isEnabled());
	Zip.sendKeys(datafile.getData("ZipCode"));
		
	//password of new user 
	WebElement Password = driver.findElement(By.xpath(".//input[@name='password']"));
	System.out.println(Password.isEnabled());
	Password.sendKeys(datafile.getData("password"));
	 	
	driver.findElement(By.xpath(".//input[@name='Submit']")).click();
	
	}

}
