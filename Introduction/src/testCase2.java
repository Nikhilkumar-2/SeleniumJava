import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// selenium code
		
		// Create Driver object for chrome Browser
		
		// We will strictly implement methods of webdriver
		
		/* Class name= X;
		 * 		X driver = new X(); 
		 * */
		// Invoke .exe file first
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\seleniumrahulshetty\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.eenadupellipandiri.net/");  // Hit url on the browser
		Thread.sleep(2000);
		//System.out.println(driver.getTitle());  // validate if u r page title is correct
		//System.out.println(driver.getCurrentUrl()); // validate if u r landed on correct url
		System.out.println(driver.getPageSource());
		
		
		//System.out.println(driver.getPageSource());  // print page source
		/*driver.navigate().to("http://yahoo.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();  // it closes current browser
		driver.quit();  // it closes all the browsers opened by the selenium script*/
		
		/*driver.get("https://www.twitter.com/");
		String title = driver.getTitle();		
		System.out.println(title);*/
		
		

	}

}
