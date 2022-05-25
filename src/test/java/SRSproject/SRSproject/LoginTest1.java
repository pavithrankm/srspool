package SRSproject.SRSproject;

import java.io.IOException;

import org.testng.annotations.Test;

import Pages.LoginPage1;

public class LoginTest1 extends BaseTest{
	

	
	@Test
	public void LoginValidation() throws IOException, InterruptedException {
		
		Thread.sleep(5000);
		LoginPage1 lp=new LoginPage1(driver);
		Thread.sleep(5000);
		lp.validLogin();
		
		String url = driver.getCurrentUrl();
		String Title = driver.getTitle();
		System.out.println(Title +  url);
		
		
		if(url.equals(prop.get("url"))) {
			System.out.println("navigate the brand page");
		} else {
			System.out.println("not-navigate the brand page");
		}

	}


public void inValidLoginValidation() throws InterruptedException {
	Thread.sleep(5000);
	LoginPage1 lp=new LoginPage1(driver);
	Thread.sleep(2000);
	lp.invalidLogin();
	
	String url=driver.getCurrentUrl();
	String Title =driver.getTitle();
	System.out.println(Title + url);
	

	if(url.equals(prop.get("url"))) {
		System.out.println("navigate the brand page");
	} else {
		System.out.println("not-navigate the brand page");
	}

}
}

	
	