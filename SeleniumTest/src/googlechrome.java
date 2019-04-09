import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Predicate;

public class googlechrome {
	
	public static void main(String[] args) throws Exception {
		
		  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  WebDriverWait  wait = new WebDriverWait(driver, 30);
		  FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(10, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		  
		  String GoogleSearch = "//input[@value='Google Search']";
		  String SearchBox    = "//input[@name='q']" ;
		  
		  //Explicit Wait 
		  
		  try {
			  // implicit  wait example
			  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  driver.manage().window().maximize();
			  driver.get("http://www.google.com");
			  
			  if (driver.findElement(By.xpath("//input[@name='q']")).isEnabled()) {
				   System.out.println("Google search text box Is enabled.");
				   //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//input[@name='q']")));
				   
				   
				   
				   fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SearchBox)));
				   driver.findElement(By.xpath(SearchBox)).clear();
				   driver.findElement(By.xpath(".//input[@name='q']")).sendKeys("WebDriver Test successful");
				   Thread.sleep(3000);
				   //driver.findElement(By.xpath("//button[@name='btnK']")).click();
				   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(GoogleSearch)));
				   
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
