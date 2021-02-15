package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignmentcleartrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\seleniumrahulshetty\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		
		driver.findElement(By.id("DepartDate")).click();
		//driver.findElement(By.cssSelector("[id='DepartDate']")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ']")).click();
				
		//driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active ")).click();
		//driver.switchTo().alert().dismiss();
		WebElement ad = driver.findElement(By.id("Adults"));
		Select dropdown = new Select(ad);
		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());
				
		WebElement ch = driver.findElement(By.id("Childrens"));
		Select dropdown1 = new Select(ch);
		dropdown1.selectByValue("6");
		System.out.println(dropdown1.getFirstSelectedOption().getText());
				
		driver.findElement(By.xpath("//a[@title='More search options']")).click();
		//driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Indigo");
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("[id='homeErrorMessage']")).getText());
	}

}
