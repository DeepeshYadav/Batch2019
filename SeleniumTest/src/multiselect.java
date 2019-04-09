import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class multiselect {
	
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      driver.manage().window().maximize();

	      driver.navigate().to("http://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");

	      
	      driver.findElement(By.id("ContentHolder_lbFeatures_LBI0T1")).click();
	      driver.findElement(By.id("ContentHolder_lbFeatures_LBI1T1")).click();
	      driver.findElement(By.id("ContentHolder_lbFeatures_LBI2T1")).click();
	      Thread.sleep(5000);
	      
	      // Perform Multiple Select
	      Actions builder = new Actions(driver);
	      WebElement select = driver.findElement(By.id("ContentHolder_lbFeatures_LBT"));
	      List<WebElement> options = select.findElements(By.tagName("td"));
	      
	      System.out.println(options.size());
	      Action multipleSelect = builder.keyDown(Keys.CONTROL).click(options.get(2)).click(options.get(4)).click(options.get(6)).build();
	      
	      multipleSelect.perform();
	      
	      driver.close();
	   }

}
