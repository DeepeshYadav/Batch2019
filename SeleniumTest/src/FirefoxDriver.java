import org.openqa.selenium.JavascriptExecutor;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;	



public class FirefoxDriver {
	
	public static void main(String [] args)

	   {		
		  
	        //WebDriver driver=  new FirefoxDriver();	
	        WebDriver driver= new ChromeDriver();	
	     		
	        //Creating the JavascriptExecutor interface object by Type casting		
	        JavascriptExecutor js = (JavascriptExecutor)driver;		
	        		
	        //Launching the Site.		
	        
	        driver.get("https://business.twitter.com/start-advertising");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	        js.executeScript("scroll(0, 250);");
				
	        //Fetching the Domain Name of the site. Tostring() change object to name.		
	        String DomainName = js.executeScript("return document.domain;").toString();			
	        System.out.println("Domain name of the site = "+DomainName);					
	          		
	        //Fetching the URL of the site. Tostring() change object to name		
	        String url = js.executeScript("return document.URL;").toString();			
	        System.out.println("URL of the site = "+url);					
	          		
	       //Method document.title fetch the Title name of the site. Tostring() change object to name		
	       String TitleName = js.executeScript("return document.title;").toString();			
	       System.out.println("Title of the page = "+TitleName);					

	        		
	      //Navigate to new Page i.e to generate access page. (launch new url)		
	      js.executeScript("window.location = 'http://facebook.com/'");			
	    }		

}

