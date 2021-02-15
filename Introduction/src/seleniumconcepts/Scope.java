package seleniumconcepts;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scope {

	public static void main(String[] args) throws InterruptedException  {
		
		//Asked in HCL interview
		//1. Give me the count of the links on the page
		//2.count of the links on the footer section
		//3.count of the links of 1st column on the footer section
		//4.click on each link in the column and check if the pages are opening
		//5.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\seleniumrahulshetty\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		/*
		 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); WebDriverWait
		 * w = new WebDriverWait(driver, 5);
		 * w.until(ExpectedConditions.visibilityOfElementLocated(columndriver.
		 * findElements(By.tagName("a"))));
		 */
		
		//1.
		System.out.println(driver.findElements(By.tagName("a")).size());
		//2.
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));  // limiting WebDriver scope
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		//3.
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		//4.
		for(int i=1; i<columndriver.findElements(By.tagName("a")).size();i++) {
			
			
			  String clickonlinktab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			  
			  columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
			 
			/*
			 * columndriver.findElements(By.tagName("a")).get(i).click();
			 * Thread.sleep(3000); driver.navigate().back();
			 */
			  
			  Thread.sleep(3000L);
			
		}
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		
		while(it.hasNext()) {
			
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
