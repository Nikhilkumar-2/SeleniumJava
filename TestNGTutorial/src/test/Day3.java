package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;

public class Day3 {

	@BeforeClass
	public void befoClass() {
		System.out.println("Before executing any methods in the class");
	}
	
	@Parameters({"URL","APIKey/username"})
	@Test
	public void WebLoginHomeLoan(String urlName, String key) {
		//Selenium
		System.out.println("WebLoginHomeLoan");
		System.out.println(urlName);
		System.out.println(key);
	}
	@BeforeMethod
	public void BeforeEvery() {
		System.out.println("I will execute before every test method in Day3 class");
	}
	@AfterMethod
	public void AfterEvery() {
		System.out.println("I will execute after every test method in Day3 class");
	}
	@Test(timeOut=4000)
	public void MobileLoginHomeLoan() {
		//Appium
		System.out.println("MobileLoginHomeLoan");
	}
	
	@BeforeSuite
	public void BfSuite() {
		System.out.println("I am number 1");
	}
	
	@Test(enabled=false)
	public void MobilesigninHomeLoan() {
		//Appium
		System.out.println("MobilesigninHomeLoan");
	}
	
	@Test(dataProvider="getData")
	public void MobilesignoutHomeLoan(String username, String password) {
		//Appium
		System.out.println("MobilesignoutHomeLoan");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test(dependsOnMethods= {"WebLoginHomeLoan","MobilesignoutHomeLoan"})
	public void APILoginHomeLoan() 
	{
		//Rest API automation
		System.out.println("APILoginHomeLoan");
	}
	
	@DataProvider
	public Object[][] getData() {
		//1st combination - username password - good credit history
		//2nd - username password - no credit history
		//3rd - username password - fradulent credit history
		Object[][] data = new Object[3][2];
		data[0][0]="firstsetusername";
		data[0][1]="firstsetpassword";
		//columns in the row are nothing but values for that particular combination(row)
		
		//2nd set
		data[1][0]="secondsetusername";
		data[1][1]="secondsetpassword";
		
		//3rd set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdsetpassword";
		
		return data;
	}
}
