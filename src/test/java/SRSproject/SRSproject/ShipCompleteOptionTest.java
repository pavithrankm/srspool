package SRSproject.SRSproject;

import org.testng.annotations.Test;


import Pages.LoginPage;
import Pages.ShipCompleteOptionPage;

public class ShipCompleteOptionTest extends BaseTest {
	
	
	ShipCompleteOptionPage SP;
	@Test(priority=1,enabled=true)
	public void Account() throws Exception {
		
		 
       SP=new ShipCompleteOptionPage(driver);
		  Thread.sleep(3000);
		LoginPage Lp = new LoginPage(driver);
		Lp.ValidLogin();
		Thread.sleep(5000);	
		String URL = driver.getCurrentUrl();
		String Title = driver.getTitle();
		System.out.println(Title + "-> " + URL);

}
	@Test(priority=2 , enabled=true)
	public void MiniCartTest() throws InterruptedException {

	       SP=new ShipCompleteOptionPage(driver);
	       Thread.sleep(3000);
	       SP.MiniCartPage();
	       Thread.sleep(3000);       
		
	}
	@Test(priority=3 , enabled=true)
	public void ShopProductPage() throws InterruptedException {
		
		  SP=new ShipCompleteOptionPage(driver);
	       Thread.sleep(5000);
	       SP.ShopProductPage();
	       Thread.sleep(5000);
	       SP.checkoutPage();
		      Thread.sleep(8000);
		      SP.OrderDetailsPage();
		  	Thread.sleep(3000);
		  	SP.ShipCompleteOption();
		  	Thread.sleep(4000);
		  	
	}
	@Test(priority=4 , enabled=false)
	public void PlaceOrderPage() throws InterruptedException {
		  SP=new ShipCompleteOptionPage(driver);
	       Thread.sleep(3000);
	       SP.PlaceOrderPage();
		  	Thread.sleep(2000);
		  	SP.ShipOption();
			Thread.sleep(2000);
	        SP.AddToCartItem();
	        Thread.sleep(4000);
	        driver.quit();
		
	}
	
}
