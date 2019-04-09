import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import bsh.ParseException;

public class GetRowColnsValues {
	
	 public static void main(String[] args) throws ParseException {
	    	WebDriver driver =  new ChromeDriver();
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	
	    
	        driver.get("http://www.studyguideindia.com/Colleges/default.asp?ct=163");         
	        
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
	        
	        for (int i=2;i<=rows.size(); i= i+1) {
	        	String collegName = driver.findElement(By.xpath("//table[@class='clg-listing']/tbody/tr["+i+"]/td[1]")).getText();
	        	String Location = driver.findElement(By.xpath("//table[@class='clg-listing']/tbody/tr["+i+"]/td[2]")).getText();
	        	String State = driver.findElement(By.xpath("//table[@class='clg-listing']/tbody/tr["+i+"]/td[3]")).getText();
	        	
	        	System.out.println("College :"+collegName);
	        	System.out.println("Location :" +Location);
	        	System.out.println("State :" + State);
	        	System.out.println("_______________________________________________________________");
	        }
	        
	        driver.close();
	    }

}
