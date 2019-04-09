package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class TestNGClass2 {
	
	public WebDriver driver;
	
	  @BeforeTest
	  public void beforeTest() {
		  
		  driver = new ChromeDriver();
	      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      //Maximize the browser
	      driver.manage().window().maximize();

		  
		  System.out.println("Before Test Method"); 
		 
	  }	
  
      @Test
  	  public void printlink() {
	      // Click on Math Calculators
    	     
    	      System.out.println("Test 1");
		      driver.navigate().to("http://www.calculator.net");
		      java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		      System.out.println("Number of Links in the Page is " + links.size());
		      System.out.println("_______________________________________________");
		      
		      for (int i = 1; i<links.size(); i = i+1) {
		         System.out.println("Name of Link# " + i + links.get(i).getText());
		      }
      
         }
  
       @Test
       public void secondtest() throws InterruptedException {
	                 
    	   System.out.println("Test 2");	

    	   driver.navigate().to("http://www.calculator.net/interest-calculator.html");   
           //Selecting an item from Drop Down list Box
           System.out.println("Test Executed Successfully");
      
       }

       @AfterTest
       public void AfterTestMethod() {
    	   System.out.println("After Test Method");
    	   driver.close();
	  }

}
