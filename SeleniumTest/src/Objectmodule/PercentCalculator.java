package Objectmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PercentCalculator {
	
	private static WebDriver driver = null;
	  
	   public static void main(String[] args) throws InterruptedException {
	   
	      driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.manage().window().maximize();
	      Thread.sleep(5000);
	      driver.get("http://www.calculator.net/percent-calculator.html");
	  
	      //Use page Object library now

	      PageObjectsPercCalc.txt_num_1(driver).clear(); 
	      PageObjectsPercCalc.txt_num_1(driver).sendKeys("10");      
	  	   
	      PageObjectsPercCalc.txt_num_2(driver).clear();
	      PageObjectsPercCalc.txt_num_2(driver).sendKeys("50");  
	  	   
	      PageObjectsPercCalc.btn_calc(driver).click();
	      String result =  PageObjectsPercCalc.web_result(driver).getText();
	      
	      if(result.equals("5")) {      
	         System.out.println(" The Result is Pass : "+result );
	      } else {
	         System.out.println(" The Result is Fail :"+result);
	      }
	      Thread.sleep(5000);
	      
	      driver.close();
	   }

}
