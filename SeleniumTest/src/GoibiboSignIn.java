import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoibiboSignIn {
	
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      driver.manage().window().maximize();

	      driver.navigate().to("https://www.goibibo.com/");
	      
	      driver.findElement(By.id("get_sign_in")).click();
	      
	      String CurrentTab = driver.getWindowHandle();
	      
	      ArrayList<String> NewTab = new ArrayList<String>(driver.getWindowHandles());
	      
	      NewTab.remove(CurrentTab);
	      driver.switchTo().window(NewTab.get(0));
	      
	      driver.findElement(By.id("authMobile")).clear();
	      driver.findElement(By.id("authMobile")).sendKeys("2345");
	      driver.close();
	    		  
	      

	}
}
