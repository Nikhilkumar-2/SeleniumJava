package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {

	@Parameters({"URL"})
	@Test
	public void WebLoginCarLoan(String urlName) {
		//Selenium
		System.out.println("WebLoginCarLoan");
		System.out.println(urlName);
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginCarLoan() {
		//Appium
		System.out.println("MobileLoginCarLoan");
	}
	
	@Test
	public void APILoginCarLoan() {
		//Rest API automation
		System.out.println("APILoginCarLoan");
	}
	@AfterClass
	public void Afterclass() {
		System.out.println("After executing all the methods in the class");
	}
}
