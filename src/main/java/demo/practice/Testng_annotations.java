package demo.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_annotations {
	
	@BeforeSuite
	public void setup() {
		System.out.println("system set-up");
	}
	
	
	@BeforeClass
	public void browserLunch() {
		System.out.println("Lunching the Web Browser");
	}
	
	@BeforeMethod
	public void url() {
		System.out.println("Enter URL");
	}
	
	@BeforeTest
	public void login() {
		System.out.println("Login to the website");
	}
	
	@Test
	public void demotest() {
		System.out.println("@Test Annotations");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logout from the Website");
	} 
	
	@AfterTest
	public void deletecookies() {
		System.out.println("Delete all the cookies");
		
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close the Browser");
	}
	
	@AfterSuite
	public void report() {
		System.out.println("Generate test Report");
	}
	

}
