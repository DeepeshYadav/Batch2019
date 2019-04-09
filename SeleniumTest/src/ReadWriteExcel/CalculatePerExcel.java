package ReadWriteExcel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Objectmodule.PageObjectsPercCalc;

public class CalculatePerExcel 


{
	
	   private static WebDriver driver = null;
	   public static void main(String[] args) throws Exception {
	   
	      driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.manage().window().maximize();
	      Thread.sleep(5000);
	      driver.get("http://www.calculator.net/percent-calculator.html");
	  
	      
	      ReadDataFromExcel  obj = new ReadDataFromExcel ("C:\\selenium\\inputdata.xlsx","Sheet1");
	      
	      
	      String per1 = obj.getCellData(1, 1);
	      String per2 = obj.getCellData(2, 1);
	      String per3 = obj.getCellData(3, 1);
	       
	      String val1 = obj.getCellData(1, 2);
	      String val2 = obj.getCellData(2, 2);
	      String val3 = obj.getCellData(3, 2);
	      
	      String result1 = obj.getCellData(1, 3);
	      String result2 = obj.getCellData(2, 3);
	      String result3 = obj.getCellData(3, 3);
	      
	      System.out.println("Per1: "+per1 );
	    
	      
	      ArrayList<String> Per_list =new ArrayList<String>();
	      Per_list.add(per1);
	      Per_list.add(per2);
	      Per_list.add(per3);
	      
	      System.out.println("Per_list :"+Per_list);
	      
	      ArrayList<String> val_list =new ArrayList<String>();
	      val_list.add(val1);
	      val_list.add(val2);
	      val_list.add(val3);
	      
	      System.out.println("val_list :"+val_list);
	      
	      ArrayList<String> result_list =new ArrayList<String>();
	      result_list.add(result1);
	      result_list.add(result2);
	      result_list.add(result3);
	     
	      System.out.println("result_list :"+result_list);
	      
	      try {
	    	  
	    	  for (int i=0; i<= Per_list.size(); i = i+1) {
	  	    	  Thread.sleep(5000);
		
		    	  PageObjectsPercCalc.txt_num_1(driver).clear();
			      PageObjectsPercCalc.txt_num_1(driver).sendKeys(Per_list.get(i));      
			  	   
			      PageObjectsPercCalc.txt_num_2(driver).clear();
			      PageObjectsPercCalc.txt_num_2(driver).sendKeys(val_list.get(i));  
			  	   
			      PageObjectsPercCalc.btn_calc(driver).click();
			      String result =  PageObjectsPercCalc.web_result(driver).getText();
			      
			      if(result.equals(result_list.get(i))) {      
			    	 System.out.println("______________________________"); 
			         System.out.println(" The Result is Pass : "+result);
			      } else {
			    	 System.out.println("_______________________________");
			    	 System.out.println(" The Result is Fail :"+result);
			         
			      }
			      
		      }
	      }
	      catch (Exception e) {
	    	  driver.close();
	    	  throw(e);
	      }
	      driver.close();
	   }

}
	   


	   
	   
	   
