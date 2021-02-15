import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testCase3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// selenium code
		
		// Create Driver object for ie Browser
		
		// We will strictly implement methods of webdriver
		
		/* Class name= X;
		 * 		X driver = new X(); 
		 * */
		// Invoke .exe file first
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Nikhil\\seleniumrahulshetty\\IEDriverServer.exe");
		WebDriver driver = new  InternetExplorerDriver();
		driver.get("http://www.amazon.com");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.close();

	}

}
