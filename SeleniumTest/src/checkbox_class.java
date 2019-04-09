import java.util.concurrent.TimeUnit;
//import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox_class {
	public static void main(String[] args) throws InterruptedException {
		   
		 WebDriver driver = new ChromeDriver();
	      //Puts a Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.manage().window().maximize();
	      
	      //Launch website
	      driver.navigate().to("http://www.calculator.net/mortgage-calculator.html");
	      Thread.sleep(5000);
	      // initials checkbox status
	      System.out.println("The Output of the IsSelected : " +driver.findElement(By.id("caddoptional")).isSelected());      
	      System.out.println("The Output of the IsEnabled  :" +driver.findElement(By.id("caddoptional")).isEnabled());
	      System.out.println("The Output of the IsDisplayed  :" +driver.findElement(By.id("caddoptional")).isDisplayed());
	      System.out.println("########################################################################################");
	      
	      //Click on check Box
	      driver.findElement(By.id("caddoptional")).click();
	      Thread.sleep(5000);
	      System.out.println("The Output of the IsSelected : " +driver.findElement(By.id("caddoptional")).isSelected());      
	      System.out.println("The Output of the IsEnabled  :" +driver.findElement(By.id("caddoptional")).isEnabled());
	      System.out.println("The Output of the IsDisplayed :" +driver.findElement(By.id("caddoptional")).isDisplayed());
	      
	      driver.close();
	}

}
