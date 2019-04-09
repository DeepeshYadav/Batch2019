import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Firstclass {
	
	public static void main(String[] args) {
		   
		
		  String ele = ".//span[@onclick='r(5)']" ;
	      //WebDriver driver = new FirefoxDriver();
	      WebDriver driver = new ChromeDriver();
	      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //Launch website
	      driver.navigate().to("http://www.calculator.net/");
	      
	      //Maximize the browser
	      driver.manage().window().maximize();
	      
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      
	      // Click on Math Calculators
	      //driver.findElement(By.xpath(".//*[@id = 'menu']/div[3]/a")).click();
	      WebDriverWait wait = new WebDriverWait(driver,30);
	      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(ele))));
	      
	      driver.findElement(By.xpath(ele)).click();
	      
	      
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     
	      driver.findElement(By.xpath(".//span[@onclick='r(6)']")).click();
	      

	      
	      //Close the Browser.
	      driver.close();
	}

}
