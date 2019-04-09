import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverWaits {
	
	
	public static void main(String[] args) throws Exception {
		  
		  WebDriver driver = new ChromeDriver();
		  
		  // Explicit driver objects 
		  WebDriverWait  wait = new WebDriverWait(driver, 30);
		  
		  //Fluent wait driver objects
		  FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(10, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		  
		  String GoogleSearch = "//input[@value='Google Search']";
		  String SearchBox    = "//input[@name='q']" ;
		  
		 
		  
		  try {
			  // implicit  wait objects
			  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  driver.manage().window().maximize();
			  driver.get("http://www.google.com");
			  
			  
			  if (driver.findElement(By.xpath("//input[@name='q']")).isEnabled()) {
				   System.out.println("Google search text box Is enabled.");
			
				   // Use of fluent wait
				   fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SearchBox)));
				   driver.findElement(By.xpath(SearchBox)).clear();
				   driver.findElement(By.xpath(".//input[@name='q']")).sendKeys("WebDriver Test successful");
				   
				   // Use of static wait
				   Thread.sleep(3000);
				   
				   // Use of explicit wait
				   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='btnK']")));	   
				   driver.findElement(By.xpath(GoogleSearch)).click();
				   
				   System.out.println("Google search completed.");
				  } else {
				   System.out.println("Google search test box Is Not enabled.");
				  }
	
		      }
		  
		       catch (Exception e)
		             {
		  
		  //driver.close();
		    	       driver.quit();
		    	        throw(e);
		    	   		
		            }
		        driver.quit();
	      }


}
