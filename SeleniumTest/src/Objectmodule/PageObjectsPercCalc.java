package Objectmodule;

//import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;

public class PageObjectsPercCalc {
	
	private static WebElement element = null;
	 
	 	
	   //Number 1 Text Box
	   public static WebElement txt_num_1(WebDriver driver) {
	      element = driver.findElement(By.id("cpar1"));
	      return element;
	   }
		
	   //Number 2 Text Box	
	   public static WebElement txt_num_2(WebDriver driver) {
	      element = driver.findElement(By.id("cpar2"));
	      return element;
	   }
		
	   //Calculate Button	
	   public static WebElement btn_calc(WebDriver driver) {
	      element =
	         driver.findElement(By.xpath("(.//input[@value=\"Calculate\"])[1]"));
	      return element;
	   }	
		
	   // Result	
	   public static WebElement web_result(WebDriver driver) {
	      element =
	         driver.findElement(By.xpath("//*[@id=\"content\"]//font/b"));
	      return element;
	   }	

}
