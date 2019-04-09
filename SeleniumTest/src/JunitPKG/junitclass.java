package JunitPKG;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class junitclass {
	
	@Test
	   public void testAdd() {
	      String str = "Junit is working fine1";
	      assertEquals("Junit is working fine",str);
	   }

}
