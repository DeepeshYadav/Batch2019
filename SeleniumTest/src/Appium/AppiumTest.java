package Appium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;



public class AppiumTest {

 WebDriver driver;

 @BeforeClass
 public void setUp() throws Exception {

	//location of the app
	 File app = new File("C:\\Users\\Deepesh.Yadav\\Documents\\vaultdoc\\Documents\\shell\\Appium\\apk", "vaultize-android-app-release.apk");
	 
	 //To create an object of Desired Capabilities
	 DesiredCapabilities capability = new DesiredCapabilities();
	//OS Name
	 capability.setCapability("device","Android");
	 capability.setCapability(CapabilityType.BROWSER_NAME, "");
	//Mobile OS version. In My case its running on Android 4.2
	 capability.setCapability(CapabilityType.VERSION, "7.0");
	 capability.setCapability("app", app.getAbsolutePath());
	//To Setup the device name
	 capability.setCapability("deviceName","ZY223DBDTR");
	 capability.setCapability("platformName","Android");
	//set the package name of the app
	 capability.setCapability("app-package", "com.vaultize.mobility");
	 //set the Launcher activity name of the app
	 capability.setCapability("app-activity", "com.vaultize.mobility.view.LoginScreen");
	//driver object with new Url and Capabilities
	 driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capability);
	 }

 @Test
public void testApp() throws MalformedURLException{

	System.out.println("App launched");
	 // locate Add Contact button and click it
//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//	driver.findElement(By.id("com.vautlize.mobility:id/textUsername")).clear();
//	driver.findElement(By.id("com.vautlize.mobility:id/textUsername")).sendKeys("newuser1");
//	driver.findElement(By.id("com.vautlize.mobility:id/textPassword")).clear();
//	driver.findElement(By.id("com.vautlize.mobility:id/textPassword")).sendKeys("password123");
//	driver.findElement(By.id("com.vautlize.mobility:id/textUrl")).clear();
//	driver.findElement(By.id("com.vautlize.mobility:id/textUrl")).sendKeys("http://myserver.com");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.className("android.widget.EditText")).clear();
	driver.findElement(By.className("android.widget.EditText")).sendKeys("newuser1");
	driver.findElement(By.className("Enter Password")).clear();
	driver.findElement(By.name("Enter Password")).sendKeys("password123");
//	driver.findElement(By.id("com.vautlize.mobility:id/textUrl")).clear();
//	driver.findElement(By.id("com.vautlize.mobility:id/textUrl")).sendKeys("http://myserver.com");
//	driver.findElement(By.id("com.vautlize.mobility:id/buttonLogin")).click();
	

	 }
 }