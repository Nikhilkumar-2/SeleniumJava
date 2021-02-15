package seleniumconcepts2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MAximizingAndCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\seleniumrahulshetty\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().addCookie(null);
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("sessionKey");
		driver.manage().deleteCookie(null);
	}

}
