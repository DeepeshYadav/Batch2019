import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindows {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		
		driver.get("https://business.twitter.com/start-advertising");
	    
		System.out.println("title1:"+driver.getTitle());
	    // considering that there is only one tab opened in that point.
	    String oldTab = driver.getWindowHandle();
	    
	    driver.findElement(By.linkText("Start a Campaign")).click();
	    
	    ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
	    
	    newTab.remove(oldTab);
	    // change focus to new tab
	    driver.switchTo().window(newTab.get(0));
	     
	    driver.findElement(By.linkText("Get started")).click();
	    
	    System.out.println("title2:"+driver.getTitle());

	    // Do what you want here, you are in the new tab

	    driver.close();
	    //driver.quit();
	    // change focus back to old tab
	    driver.switchTo().window(oldTab);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	    System.out.println("title3:"+driver.getTitle());
	    
	    driver.close();
	}
	
}
