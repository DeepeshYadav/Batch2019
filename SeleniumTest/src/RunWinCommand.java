
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class RunWinCommand {
	public static void main(String[] args) {
		
		//WebDriver driver = new ChromeDriver();
		
		String command = "cmd /c services.msc";
		
		try {
	        Process exec = Runtime.getRuntime().exec(command);
	        int exitVal = exec.waitFor();
	        System.out.println("Exit value: " + exitVal);
	        } catch (InterruptedException | IOException ex) {
	        System.out.println(ex.toString());
	        }
	        //driver.close();
	        }
}


