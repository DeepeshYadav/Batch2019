package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.*;

import com.thoughtworks.selenium.webdriven.commands.IsElementPresent;

public class AssertTest {
	
	 private WebDriver driver = new ChromeDriver();
	
	@Test
	public void doRegister() {
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		String Actualtitle = driver.getTitle();
		
		System.out.println("Actaultitle :" + Actualtitle);
		String Expectedtitle  = "Amazon";
		
		Assert.assertEquals(Expectedtitle, Actualtitle);
		System.out.print("A \n");
		Assert.assertTrue(2>11, "Error not matching condition");
		System.out.print("B \n");
		
		
	}
	
	
	@Test
	public void dosignout() {
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		String Actualtitle = driver.getTitle();
		
		//String Actualtitle = "Amazon";
		System.out.println("Actaultitle :" + Actualtitle);
		String Expectedtitle  = "Amazon";
		
		Assert.assertEquals(Expectedtitle, Actualtitle);
		System.out.print("A \n");
		Assert.assertTrue(2<11, "Error not matching condition");
		System.out.print("B \n");
		//Assert.assertTrue(IsElementPresent("xyz"),"Element not found");
		
	}
	
	 
	@Test
	public void login() {
		//driver.get("https://amazon.in");
		//driver.manage().window().maximize();
		//String Actualtitle = driver.getTitle();
		
		String Actualtitle = "Amazon";
		System.out.println("Actualtitle :" + Actualtitle);
		String Expectedtitle  = "Amazon";
		
		Assert.assertEquals(Expectedtitle, Actualtitle);
		System.out.print("A \n");
		Assert.assertTrue(2<11, "Error not matching condition");
		System.out.print("B \n");
		//Assert.assertTrue(IsElementPresent("xyz"),"Element not found");
		
	}

}
