import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class dropdown_class {
	
	public static void main(String[] args) throws InterruptedException {
		      
		   WebDriver driver = new ChromeDriver();
	      
	      //Puts a Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.manage().window().maximize();
	      
	      //Launch website
	      driver.get("https://google.com");
	      Thread.sleep(5000);
	      driver.navigate().to("http://www.calculator.net/interest-calculator.html");
	     
	      Thread.sleep(5000);
	      
	      //Selecting an item from Drop Down list Box
	      Select dropdown = new Select(driver.findElement(By.id("ccompound")));
	      
	      dropdown.selectByVisibleText("continuously");
	      
	      Thread.sleep(5000);
	      
	      dropdown.selectByIndex(1);
	      
	      Thread.sleep(5000);
	      
	      dropdown.selectByValue("quarterly");
	      
	      Thread.sleep(3000);
	      
	      driver.close();
	   }

}
