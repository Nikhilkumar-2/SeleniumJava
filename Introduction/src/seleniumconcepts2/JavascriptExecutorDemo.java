package seleniumconcepts2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavascriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\seleniumrahulshetty\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

		
		  List<WebElement> values =
		  driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)")); int sum
		  = 0;
		  
		  for (int i = 0; i < values.size(); i++) {
		  
		  sum = sum + Integer.parseInt(values.get(i).getText());
		  
		  } System.out.println(sum);
		  
		  int total =
		  Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText()
		  .split(":")[1].trim()); System.out.println(total); Assert.assertEquals(sum,
		  total);
		 
		
		/*
		 * List<WebElement> values1 =
		 * driver.findElements(By.cssSelector(".table-display td:nth-child(3)")); int
		 * sum1 = 0; for(int i1 =0 ;i1<values1.size();i1++) {
		 * 
		 * sum1 = sum1 + Integer.parseInt(values1.get(i1).getText());
		 * 
		 * } System.out.println(sum1);
		 */

	}

}
