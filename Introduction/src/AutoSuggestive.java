import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\seleniumrahulshetty\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		
		/*
		 * driver.findElement(By.id("autosuggest")).sendKeys("ind"); Thread.sleep(3000);
		 * List<WebElement> options =
		 * driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		 * for(WebElement option :options) {
		 * if(option.getText().equalsIgnoreCase("India")) { option.click(); break; } }
		 */
		/*
		 * driver.get("https://www.amazon.com/");
		 * driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(
		 * "air"); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(
		 * Keys.DOWN);
		 * driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(
		 * Keys.ENTER);
		 */
		driver.get("https://www.spicejet.com/");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		//System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		//System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		//count the number of checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}
