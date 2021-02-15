import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class salesforce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\seleniumrahulshetty\\chromedriver.exe");
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nikhil\\seleniumrahulshetty\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("hello");
		Thread.sleep(2000);
		driver.findElement(By.name("pw")).sendKeys("123456");
		Thread.sleep(2000);
		//driver.findElement(By.className("button r4 wide primary")).click();// error
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
