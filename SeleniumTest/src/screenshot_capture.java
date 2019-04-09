import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class screenshot_capture {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		 WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	      driver.manage().window().maximize();

	      driver.navigate().to("http://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
	      
	      File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(screenshot, new File("C:\\selenium\\screenshots1.jpg"));
	      Thread.sleep(5000);
	      
	      
	      driver.findElement(By.id("ContentHolder_lbFeatures_LBI0T1")).click();
	      driver.findElement(By.id("ContentHolder_lbFeatures_LBI1T1")).click();
	      driver.findElement(By.id("ContentHolder_lbFeatures_LBI2T1")).click();
	      
	      File screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(screenshot2, new File("C:\\selenium\\screenshots2.jpg"));
	      
	      // Perform Multiple Select
	    
	      
	      driver.close();
	   }

}
