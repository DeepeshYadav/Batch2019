import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multioption {
	
	
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      driver.manage().window().maximize();
	      Thread.sleep(5000);
	      driver.navigate().to("http://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");

	      
	      driver.findElement(By.id("ContentHolder_lbFeatures_LBI0T1")).click();
	      driver.findElement(By.id("ContentHolder_lbFeatures_LBI1T1")).click();
	      driver.findElement(By.id("ContentHolder_lbFeatures_LBI2T1")).click();
	      Thread.sleep(5000);
	      
	      
	      driver.close();
	}

}
