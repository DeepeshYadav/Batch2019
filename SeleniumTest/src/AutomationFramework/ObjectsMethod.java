package AutomationFramework;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ObjectsMethod {
	
	 
	  WebDriver driver = new ChromeDriver();
	  WebDriverWait  wait = new WebDriverWait(driver, 30);
	  FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(10, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
	  private static WebElement element = null;
	  
	  
	  public WebElement GSearchbox() {
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Webelement.SearchBox)));
		  element = driver.findElement(By.xpath(Webelement.SearchBox));
		  return element;
		  
	  }
	  
	  public WebElement GSearchBtn() {
		  fwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Webelement.GoogleSearchBtn)));
		  element = driver.findElement(By.xpath(Webelement.GoogleSearchBtn));
		  return element;
		  
	  }

}
