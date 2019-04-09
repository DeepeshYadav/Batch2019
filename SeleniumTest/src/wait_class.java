import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;

public class wait_class {
		public static void main(String[] args) throws Exception {
			
			  //System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			  
			  //Explicit Wait 
			  WebDriverWait  wait = new WebDriverWait(driver, 30);
			  
			  
			  try {
				  
				  // implicit  wait example
				  // implicit applies on all the elements present till web driver life.
				  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				  driver.manage().window().maximize();
				  
				  driver.get("http://www.google.com");
				  
				  if (driver.findElement(By.xpath("//input[@name='q']")).isEnabled()) {
					   System.out.println("Google search text box Is enabled.");
					   
					   // use of explicit wait -> element specific wait
					   wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//input[@name='q']")));
					   
					   driver.findElement(By.xpath(".//input[@name='q']")).clear();
					   driver.findElement(By.xpath(".//input[@name='q']")).sendKeys("WebDriver Test successful");
					   
					   // static wait -> which is not recommended
					   Thread.sleep(30);
					   //driver.findElement(By.xpath("//button[@name='btnK']")).click();
					   
					   driver.findElement(By.xpath("//input[@value='Google Search']")).click();
					   
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
