package SRSproject.SRSproject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Pages.BulkOrderPage;
import Pages.LoginPage;
import Pages.QuickOrderPadPage;
import Utils.Constants;

public class BulkOrderPageTest100 extends BaseTest{
	

	BulkOrderPage Bp ;
	ArrayList<String> BulkOrderPage_List = null;

	@Test(priority=1,enabled=true)
	public void BulOrder_Redirection() throws InterruptedException, IOException 
	{
	
		//BasePage.initializtion();
		Thread.sleep(8000);
		
		LoginPage Lp = new LoginPage(driver);
		Lp.ValidLogin();
		Thread.sleep(8000);
		Bp= new BulkOrderPage(driver);
		String BulkOrderTitle= Bp.BulkOrderPadClick();
		Assert.assertEquals(BulkOrderTitle, Constants.BulkOrderTitle);

}
	
	@Test(priority=2,enabled=true)
	public void ListofItem_Validation() throws Exception 
	{
		Thread.sleep(15000);
		
		
				Bp.HundredFileupload();
				Thread.sleep(10000);
			ArrayList<String> List= Bp.ListOfItem();
			BulkOrderPage_List = List;
			
			System.out.println("List Of Items: "+BulkOrderPage_List);
			QuickOrderPadPage qp = new QuickOrderPadPage(driver);
			
			List<String> arr = qp.ReadHunderdfileData(); 
		
								
			System.out.println("Item Lists : "+arr);
			System.out.println("Number of Items Added : "+arr.size());
			
			
			//Bp.fileDetails();
		
		//	Assert.assertEquals(BulkOrderPage_List,arr);
			
		
			
	//Reporter.log("Items are uploaded",true);
	
		}
}
