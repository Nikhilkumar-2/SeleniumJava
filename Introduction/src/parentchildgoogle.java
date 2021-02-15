import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class parentchildgoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\seleniumrahulshetty\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//form[@class='_featuredLogin__formContainer']/div/div/input")).sendKeys("abc");
		
		//driver.get("https://in.yahoo.com/");
		driver.get("http://www.qaclickacademy.com/interview.php");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		System.out.println(driver.getTitle());

		WebElement ele = driver.findElement(By.xpath("//button[contains(text(),'NO THANKS')]"));

		//WebElement ele = driver.findElement(By.xpath("//*[@id='homepage']/div[4]/div[2]/div/div/div/span/div/div[7]/div/div/div[2]"));

		ele.click();  
		//driver.findElement(By.xpath("//*[text()=' Selenium ']")).click();

		//driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();

		//System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
		//
		//driver.findElement(By.xpath("//*[text()='News']")).click();
		//driver.findElement(By.xpath("//div[@id='header-wrapper']/div[2]/ul/li[2]/following-sibling::li/preceding-sibling::li/parent::ul")).click();
	   // driver.findElement(By.xpath("//ul[@id='header-nav-bar']/li/following-sibling::li[6]")).click();
	  
	}

}
