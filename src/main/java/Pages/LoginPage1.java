package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SRSproject.SRSproject.BasePage;

public class LoginPage1 extends BasePage {
	WebDriver driver;
	Actions act;
	
	
	@FindBy(xpath="//span[text()='Account']") WebElement Account;
	@FindBy(xpath="//input[@id='header-email']") WebElement LoginEmail;
	@FindBy(xpath="//input[@title='Password']") WebElement Password;
	@FindBy(xpath="//button[@class='action login primary']") WebElement Singin;
	
	public LoginPage1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public Actions validLogin() {
		
	 act=new Actions(driver);
	 
	 act.moveToElement(Account).build().perform();
	 LoginEmail.sendKeys(prop.getProperty("ValidLogin_email"));
	 Password.sendKeys(prop.getProperty("ValidLogin_Pswd"));
	 Singin.click();
	 
	return act;
			
	}

	public Actions invalidLogin() {
		
		
		 act=new Actions(driver);
		 
		 act.moveToElement(Account).build().perform();
		 LoginEmail.sendKeys(prop.getProperty("inValidLogin_email"));
		 Password.sendKeys(prop.getProperty("ValidLogin_Pswd"));
		 Singin.click();
		 
		return act;
		// TODO Auto-generated method stub
		
	}
	
	
	


	

}


