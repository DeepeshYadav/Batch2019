package JunitPKG;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;


public class TestJunit1 {
	
	int i = 10;
	String arr[] = new String[10];
	
	String message = "iTpreneur Data System Pvt. Ltd.";	
	   
	   
	   @Test()
	   public void testPrintMessage() {	
	      System.out.println("Inside junit Test1 :" +message);
	      for (i =0; i<10;i++) 
	           {
	    	  arr[i] = "name"+i; 	
	  	       }
	  		
	  		for (String str:arr) 
	           {
	  			System.out.println("array values:" +str);
	  	       }
	   }
	   
	   @Test
	   public void go_to_home_page() {	
	      System.out.println("Inside go to home page Test2 :" +message);    
	        
	   }
}
