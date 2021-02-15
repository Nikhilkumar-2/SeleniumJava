package selnium4new;

import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\seleniumrahulshetty\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		
		WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(driver.findElement(withTagName("label").above(nameEditBox)).getText());
		
		WebElement dateOfBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(withTagName("input").below(dateOfBirth)).sendKeys("02/02/1369");
		
		WebElement iceCreamLabel = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(withTagName("input").toLeftOf(iceCreamLabel)).click();
		// Get me the label of first Radio button
		WebElement rb = driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(withTagName("label").toRightOf(rb)).getText());
	}

}