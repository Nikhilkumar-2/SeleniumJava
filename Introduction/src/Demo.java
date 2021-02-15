import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// selenium code
		
				// Create Driver object for firefox Browser
				
				// We will strictly implement methods of webdriver
				
				/* Class name= X;
				 * 		X driver = new X(); 
				 * */
				// Invoke .exe file first
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nikhil\\seleniumrahulshetty\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("http://www.twitter.com");
				Thread.sleep(2000);
				System.out.println(driver.getTitle());

	}

}
