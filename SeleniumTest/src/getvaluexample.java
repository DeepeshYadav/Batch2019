import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getvaluexample 
{
	
	public static void main(String[] args) throws InterruptedException {
		   
		
		  WebDriver driver = new ChromeDriver();
	      // Puts a Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      // Launch website
	      driver.navigate().to("http://www.calculator.net/percent-calculator.html");
	      
	      // Maximize the browser
	      driver.manage().window().maximize();
	      
	      Thread.sleep(5000);
	      // Enter value 10 in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("500");
	      driver.findElement(By.id("cpar2")).sendKeys("200");
	      driver.findElement(By.id("cpar3")).sendKeys("300");
	      Thread.sleep(5000);
	      
	      // Get the text box from the application
	      String result1 = driver.findElement(By.id("cpar1")).getAttribute("value");
	      String result2 = driver.findElement(By.id("cpar2")).getAttribute("value");
	      String result3 = driver.findElement(By.id("cpar3")).getAttribute("value");
	      
	      // Print a Log In message to the screen
	      System.out.println(" The Result1 is " + result1);
	      System.out.println(" The Result2 is " + result2);
	      System.out.println(" The Result3 is " + result3);
	      
	      // Close the Browser.
	      driver.close();
	}
}
