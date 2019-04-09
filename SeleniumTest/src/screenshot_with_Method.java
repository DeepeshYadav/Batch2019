
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


public class screenshot_with_Method {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		  WebDriver driver = new ChromeDriver();
		  
	      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	      driver.manage().window().maximize();

	      driver.navigate().to("http://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
	      
	      String File1 = "C:\\selenium\\select1.jpg";
	      String File2 = "C:\\selenium\\select2.jpg";
	      String File3 = "C:\\selenium\\select3.jpg";
	      
	      TakeSnapshot(driver,File1);
	      driver.findElement(By.id("ContentHolder_lbFeatures_LBI0T1")).click();
	      driver.findElement(By.id("ContentHolder_lbFeatures_LBI1T1")).click();
	      TakeSnapshot(driver, File2);
	      
	      driver.findElement(By.id("ContentHolder_lbFeatures_LBI2T1")).click();
	      
	      TakeSnapshot(driver, File3);
	      driver.close();
	   }

	     public static void TakeSnapshot(WebDriver driver, String Filepath) throws IOException {
	    	 
	    	 File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    	 FileUtils.copyFile(screenshot,  new File(Filepath));		 
	    	 
	     }
	
}
