import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
	
        
        // Alert Message handling                   		
        driver.get("file:///C:/ecplipse-workspace/SeleniumTest/src/alert_test.html");	
        
        
        Thread.sleep(5000);
                            		
        driver.findElement(By.xpath("//button[text()='Try it']")).click();					
        		
        // Switching to Alert        
        Alert alert = driver.switchTo().alert();		
        		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        Thread.sleep(5000);
        		
        // Accepting alert		
        alert.accept();		
        
        driver.close();

	}

}
