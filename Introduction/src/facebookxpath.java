import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\seleniumrahulshetty\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\seleniumrahulshetty\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		/*
		 * driver.get("https://www.facebook.com/");
		 * 
		 * //tagName[@attribute='value'] - xpath //*[@attribute='value'] - xpath
		 * driver.findElement(By.xpath("//input[@name='email']")).sendKeys("myownxpath")
		 * ;
		 * driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");
		 * driver.findElement(By.xpath("//button[@name='login']")).click();
		 */
		
		/*
		 * tagName[attribute='value'] - css selector, tagName#id - css, tagname.classname
		 * - css, $("tagName[attribute='value']") - validation for css selector
		 */
		
		
		  driver.get("https://login.salesforce.com/?locale=in");
		  driver.findElement(By.cssSelector("input[type='email']")).sendKeys("myowncss");
		  driver.findElement(By.cssSelector("input#password")).sendKeys("124578");
		  driver.findElement(By.cssSelector("input[id='Login']")).click();
		 
		
	}

}
