package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class SecondClass {
  WebDriver driver = new ChromeDriver();
  
  
  
  @Test
  public void f() throws Exception {
	  try {   
		      System.out.println("Start fun");
			  driver.navigate().to("http://www.calculator.net");
		      java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		      System.out.println("Number of Links in the Page is " + links.size());
		      System.out.println("_______________________________________________");
		      File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		      FileUtils.copyFile(screenshot, new File("C:\\selenium\\screenshotsfun1.jpg"));
		      for (int i = 0; i<links.size(); i = i+1) {
		         System.out.println("Name of Link# " + i + links.get(i).getText());
		      }
	     }
	   catch(Exception e) {
		   throw(e);
	   }
      }
  @Test
  public void fun2() throws Exception {
		  try {
			  System.out.println("Start fun2");
			  driver.navigate().to("http://www.calculator.net/interest-calculator.html"); 
		      
		      //Selecting an item from Drop Down list Box
		      Select dropdown = new Select(driver.findElement(By.id("ccompound")));
		      dropdown.selectByVisibleText("continuously");
		      File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		      FileUtils.copyFile(screenshot, new File("C:\\selenium\\screenshots2.jpg"));
		      Thread.sleep(3000);
		      
		      dropdown.selectByIndex(1);
		     }
		  
		   catch(Exception e) {
			   throw(e);
			   
		   }
	  
	  
	  
  }
  
  @Test
  public void fun3() throws Exception {
		  try {
			  System.out.println("Start fun3");
			  driver.navigate().to("http://www.calculator.net/mortgage-payoff-calculator.html");
		      Thread.sleep(5000);
		      System.out.println("The Output of the IsSelected :" +driver.findElement(By.id("cpayoff3")).isSelected());
		      System.out.println("The Output of the IsEnabled  :" + driver.findElement(By.id("cpayoff4")).isEnabled());
		      System.out.println("The Output of the IsDisplayed : " +driver.findElement(By.id("cpayoff5")).isDisplayed());
		      System.out.println("########################################################################################");
		      ;
		      File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			  FileUtils.copyFile(screenshot, new File("C:\\selenium\\screenshots3.jpg"));
		      // Click on Radio Button
		      driver.findElement(By.id("cpayoff1")).click();
		      Thread.sleep(5000);
		      
		      System.out.println("The Output of the IsSelected :" +driver.findElement(By.id("cpayoff1")).isSelected());
		      System.out.println("The Output of the IsEnabled  :" + driver.findElement(By.id("cpayoff1")).isEnabled());
		      System.out.println("The Output of the IsDisplayed : " +driver.findElement(By.id("cpayoff1")).isDisplayed());
		      
		     }
		  
		   catch(Exception e) {
			   throw(e);
			   
		   }
	  
	  
	  
  }
  @BeforeTest
  public void BeforeMethod() throws IOException, InterruptedException {
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.manage().window().maximize();
      Thread.sleep(5000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  
  }

}
