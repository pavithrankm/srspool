package SRSproject.SRSproject;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utils.BaseClass;

public class BaseTest extends BasePage {
	
	
	@BeforeSuite
	public void setUp() throws IOException {
		initializtion();
		driver.quit();
	}
	
//	@BeforeMethod
//	public void setUp() throws IOException {
//		initializtion();
//	}

//	@AfterClass
//	public void tearDown() {
//		driver.quit(); 
//	}

//	@AfterClass
//	public void tearDown() {
//		BasePage.driver.quit();
//	}
	

}


//public void onTestFailure(ITestResult result) {
//    
//      driver = new Augmenter().augment(driver);
//      String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
//      TakesScreenshot ts = (TakesScreenshot) driver;
//      File source = ts.getScreenshotAs(OutputType.FILE);
//  
//      String destination = System.getProperty("user.dir") + File.separator + "ExtentReport" +  File.separator +"Screenshots" + File.separator + result.getMethod().getMethodName() + dateName + ".png";
//      File finalDestination = new File(destination);
//      try {
//          FileUtils.copyFile(source, finalDestination);
//      } catch (IOException e) {
//          e.printStackTrace();
//      }
// 
//
//  }