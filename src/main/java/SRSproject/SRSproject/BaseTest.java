package SRSproject.SRSproject;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest extends BasePage {

	@BeforeSuite
	public void setUp() throws IOException {
		initializtion();
	}
	//@BeforeMethod
	//public void setUp1() throws IOException {
	//	initializtion();
	//}

//	@AfterMethod
//	public void tearDown1() {
//		driver.close(); 
//	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
