import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeswitch {
	
		public static void main(String[] args) throws InterruptedException {
			
			    WebDriver driver = new ChromeDriver();
			    
			    driver.get("https://www.goibibo.com/");  
			    driver.manage().window().maximize();
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			    Thread.sleep(5000);
			    
			    driver.findElement(By.id("get_sign_in")).click();
			    
			    int size = driver.findElements(By.tagName("iframe")).size();
			    System.out.println(size);
			    
			    driver.switchTo().frame("authiframe");
			    
			    System.out.println("Switched to Frame");
			    
			    driver.findElement(By.id("authMobile")).clear();
			    System.out.println("Mobile Number Field Cleared");
			    driver.findElement(By.id("authMobile")).sendKeys("1234598675");
			    System.out.println("Value Entered");
			    
			    Thread.sleep(2000);
			    driver.findElement(By.id("mobileSubmitBtn")).click();
			    Thread.sleep(2000);
			    
			    
			    driver.switchTo().defaultContent();
			    driver.close();
		
        }

}
