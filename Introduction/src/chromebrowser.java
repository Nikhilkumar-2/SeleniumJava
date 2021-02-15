import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chromebrowser {
	//static WebDriver driver = new ChromeDriver();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//chromedriver.exe
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\seleniumrahulshetty\\chromedriver.exe");
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nikhil\\seleniumrahulshetty\\geckodriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://login.salesforce.com/?locale=in");
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("#email")).sendKeys("hellooooo");
		driver.findElement(By.cssSelector("#pass")).sendKeys("12345");
		driver.findElement(By.xpath("")).click();
		
		
		/*
		 * driver.findElement(By.id("email")).sendKeys("this is my first code");
		 * driver.findElement(By.name("pass")).sendKeys("123456");
		 * driver.findElement(By.linkText("Forgotten password?")).click();
		 * driver.close();
		 */	
		
		/*
		 * driver.findElement(By.cssSelector("input#username")).sendKeys("helo");
		 * driver.findElement(By.xpath("//*[@id='password']")).sendKeys("1234");
		 * driver.findElement(By.cssSelector("input#Login")).click();
		 * System.out.println(driver.findElement(By.xpath("//*[@id='error']")).getText()
		 * );
		 */
		
		//driver.findElement(By.xpath("//*[@id='forgot_password_link']")).click();
	}

}
