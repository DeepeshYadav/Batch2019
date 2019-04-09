import java.io.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchCasePrograme {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		WebDriver driver = getWebDriver("Chrome"); 
		
		System.out.println("Please Select Anyone Option");
		System.out.println("1 : Handle Alert");
		System.out.println("2 : Handle Table");
		System.out.println("3. : Handle iframe");
		
		Scanner input = new Scanner(System.in);
		
		Integer choice = input.nextInt() ; 
						 
		switch(choice)
		
		{
			
			case 1: 
				
			System.out.println("First Case");	        
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
			break;
				
			case 2:
				
				driver.get("http://www.studyguideindia.com/Colleges/default.asp?ct=163");  
				
				String filepath = "C:\\selenium\\testfile\\FileWriter.txt";
				String screenshot = "C:\\selenium\\testsnap\\snapshot.png";
				
				 BufferedWriter bufferwrt = CreateFile(filepath);
				
		        
		        //No.of Columns
		        List  col = driver.findElements(By.xpath("//table[@class='clg-listing']/tbody/tr[1]/td"));
		        System.out.println("No of cols are : " +col.size()); 
		        
		        //No.of rows 
		        List  rows = driver.findElements(By.xpath("//table[@class='clg-listing']/tbody/tr")); 
		        System.out.println("No of rows are : " + rows.size());
		        
		        
		        for (int i=1;i<=col.size(); i= i+1) {
		        	String colval = driver.findElement(By.xpath("//table[@class='clg-listing']/tbody/tr[1]/td["+i+"]")).getText();
		        	System.out.println("col_value :"+colval);		
		        }
		        
		        System.out.println("####################################");
		        TakeSnapshot(driver, screenshot);
		        for (int i=2;i<=rows.size(); i= i+1) {
		        	String collegName = driver.findElement(By.xpath("//table[@class='clg-listing']/tbody/tr["+i+"]/td[1]")).getText();
		        	String Location = driver.findElement(By.xpath("//table[@class='clg-listing']/tbody/tr["+i+"]/td[2]")).getText();
		        	String State = driver.findElement(By.xpath("//table[@class='clg-listing']/tbody/tr["+i+"]/td[3]")).getText();
		        	
		        	
		        	bufferwrt.write(collegName);
		        	bufferwrt.newLine();
		        	bufferwrt.write(Location);
		        	bufferwrt.newLine();
		        	bufferwrt.write(State);
		        	bufferwrt.newLine();
		        	bufferwrt.write("_______________________________________________________________");
		        	bufferwrt.newLine();
		        	
		        	System.out.println("College :"+collegName);
		        	System.out.println("Location :" +Location);
		        	System.out.println("State :" + State);
		        	System.out.println("_______________________________________________________________");
		        }
		    	bufferwrt.close();
		        driver.close();

		        break;
			case 3 :
				
				System.out.println("Third Case");
		        break;
		
	}

}
	
	public static WebDriver getWebDriver(String Browser) {
		
		if (Browser == "Chrome") {
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    return driver;
		}
		else if(Browser == "Firefox"){
			
			//WebDriver driver = new FirefoxDriver();
			//driver.manage().window().maximize();
	    	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    //return driver;
		}
		return null; 		
	}
	
	public static void TakeSnapshot(WebDriver driver, String Filepath) throws IOException {
   	 
   	 File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
   	 FileUtils.copyFile(screenshot,  new File(Filepath));		 
   	 
    }
	
	public static BufferedWriter CreateFile(String Filepath) throws IOException {
		
		FileWriter filewriter = new FileWriter(Filepath);
		BufferedWriter bufferwrt = new BufferedWriter(filewriter);
		return   bufferwrt;
	}
	

	
}
