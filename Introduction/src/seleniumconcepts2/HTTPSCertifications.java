package seleniumconcepts2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HTTPSCertifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SSL Certificates
		//DesiredCapabilities
		//this is like General chrome profile
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts();          OR 
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		//this Belongs to our local browser
		ChromeOptions c = new  ChromeOptions();
		c.merge(ch);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\seleniumrahulshetty\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
		driver.manage().window().maximize();
		
		//driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		

	}

}
