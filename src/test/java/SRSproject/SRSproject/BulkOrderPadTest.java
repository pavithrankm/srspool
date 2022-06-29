package SRSproject.SRSproject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.opencsv.exceptions.CsvValidationException;

import Pages.BulkOrderPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.QuickOrderPadPage;
import Utils.Constants;

public class BulkOrderPadTest extends BaseTest {

	BulkOrderPage Bp ;
	ArrayList<String> BulkOrderPage_List = null;

	@Test(priority=1)
	public void BulOrder_Redirection() throws InterruptedException, IOException 
	{
	
		BasePage.initializtion();
		Thread.sleep(8000);
		
		LoginPage Lp = new LoginPage(driver);
		Lp.ValidLogin();
		Bp= new BulkOrderPage(driver);
		Thread.sleep(15000);
		String BulkOrderTitle= Bp.BulkOrderPadClick();
		Assert.assertEquals(BulkOrderTitle, Constants.BulkOrderTitle);
}
	
	@Test(priority=2)
	public void AddItemtoBulkOrder_Validation() throws InterruptedException 
	{
	
		
			Thread.sleep(6000);
		
		Bp.ProductEntry();
	
		
		
}
	

	@Test(priority=3)
	public void AddNewLineItem_Validation() throws InterruptedException 
	{
	
		
			Thread.sleep(10000);
			
		Bp.AddNewLineItem();
		
}
	
	@Test(priority=4)
	public void UpdateQunatity_Validation() throws InterruptedException 
	{
	
		
		
		WebElement qty_field=Bp.UpdateQuantity();
		qty_field.clear();
		qty_field.sendKeys(prop.getProperty("BulkOrder_qty"));
		Thread.sleep(1000);
		qty_field.sendKeys(Keys.ENTER);
		Reporter.log("Items added to bulk order as expected",true);
		
	}

		@Test(priority=5)
		public void AddAll_ItemToCart_Validation() throws InterruptedException 
		{
			
			
				Thread.sleep(1000);
				
					
		Bp.AddAllItem_TOCart().click();
		
		
		}
			
			@Test(priority=6)
			public void ListofItem_Validation() throws InterruptedException, CsvValidationException, IOException 
			{
				Thread.sleep(10000);
				
				
						Bp.Fileupload();
						Thread.sleep(25000);
					ArrayList<String> List= Bp.ListOfItem();
					BulkOrderPage_List = List;
					
					System.out.println("one"+BulkOrderPage_List);
					QuickOrderPadPage qp = new QuickOrderPadPage(driver);
					
					List<String> arr = qp.ReadfileData(); 
					System.out.println("two"+arr);
					
					Assert.assertEquals(BulkOrderPage_List,arr);
					
			
			
}
			
			@Test(priority=7)
			public void InValid_FileUpload_Validation() throws InterruptedException 
			{
				Thread.sleep(16000);
				
						System.out.println(Bp.InvalidFileupload());
						
					
				driver.close();	
			
			
}
	
	
	

}
