import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_button {
	
	
	public static void main(String[] args) throws InterruptedException {
		    
		  WebDriver driver = new ChromeDriver();
	      
	      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //Launch website
	      driver.navigate().to("http://www.calculator.net/mortgage-payoff-calculator.html");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      Thread.sleep(5000);
	      System.out.println("The Output of the IsSelected :" +driver.findElement(By.id("cpayoff1")).isSelected());
	      System.out.println("The Output of the IsEnabled  :" + driver.findElement(By.id("cpayoff1")).isEnabled());
	      System.out.println("The Output of the IsDisplayed : " +driver.findElement(By.id("cpayoff1")).isDisplayed());
	      System.out.println("########################################################################################");
	      boolean val = driver.findElement(By.id("cpayoff1")).isSelected();
	      
	      if (val == true) {
	    	  
	    	  System.out.println("Option Already Selected");
	    	  
	      }
	      else {
	    	  
	    	  driver.findElement(By.id("cpayoff1")).click();
	    	  boolean val2 = driver.findElement(By.id("cpayoff1")).isSelected();
	    	  if (val2 == true) {
		    	  
		    	  System.out.println("Thanks you have Selected the option");
		    	  
		      } 
	    	  else {
	    		  
	    		  System.out.println(" There is issue with UI, option is not enabled to select.");
	    	  }
	      }
	    	  
	      
	      
	      
	      // Click on Radio Button
	      driver.findElement(By.id("cpayoff1")).click();
	      Thread.sleep(5000);
	      
	      System.out.println("The Output of the IsSelected :" +driver.findElement(By.id("cpayoff1")).isSelected());
	      System.out.println("The Output of the IsEnabled  :" + driver.findElement(By.id("cpayoff1")).isEnabled());
	      System.out.println("The Output of the IsDisplayed : " +driver.findElement(By.id("cpayoff1")).isDisplayed());
	      
	      //Close the Browser.
	      driver.close();
	   }

}
