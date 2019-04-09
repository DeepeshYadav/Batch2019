import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class drag_and_drop {
	
	public static void main(String[] args) throws InterruptedException {
		   
		  WebDriver driver = new ChromeDriver();
	      //Puts a Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.manage().window().maximize();
	      
	      Thread.sleep(5000);
	      
	      // Launch website
	      driver.navigate().to("http://www.keenthemes.com/preview/metronic/templates/admin/ui_tree.html");
	     
	      WebElement From = driver.findElement(By.xpath("//*[@id='j3_7']/a"));
	      
	      WebElement To = driver.findElement(By.xpath("//*[@id='j3_1']/a"));
	      
	      Thread.sleep(10000);
	      Actions builder = new Actions(driver);
	      //Action dragAndDrop = builder.clickAndHold(From).moveToElement(To).release(To).build();
	      
	      Action dragAndDrop = builder.clickAndHold(From).moveToElement(To).release(To).build();
	      dragAndDrop.perform();
	      Thread.sleep(5000);
	      driver.close();

	}
	
}
