import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforceE2E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\seleniumrahulshetty\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[contains(@id,'logi')]")).sendKeys("regularxpath");
		driver.findElement(By.cssSelector("input[name*='passw']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
		
		

	}

}
