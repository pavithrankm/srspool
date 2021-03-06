package Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import SRSproject.SRSproject.BasePage;

public class BulkOrderPage extends BasePage {
	
	WebDriverWait wait;
	WebDriver driver;
	Actions act;
	
	@FindBy(xpath="//span[@class='amqorder-text']") WebElement PartNo;
	@FindBy(xpath="//span[@class='base']") WebElement YourPriceLabel;
	@FindBy(xpath="(//a[text()='Bulk Order Pad'])[1]") WebElement BulkOrderPad;
	@FindBy(xpath = "//input[@class='amqorder-input -search']") List <WebElement> Product;
	@FindBy(xpath = "//li[@class='amqorder-item -item']") WebElement ProductLabel;
	@FindBy(xpath = "//button[@class='amasty-action-add-new-line']") WebElement AddANewLineItem;
	@FindBy(xpath = "(//input[@class='amqorder-input'])[1]") WebElement FirstItem_Qty;
	@FindBy(xpath = "(//div[@class='price-box price-final_price'])[1]")  WebElement FirstItem_price;
	@FindBy(xpath = "(//span[@class='amqorder-item amqorder-price'])[1]") WebElement FirstItem_ext_price;
	@FindBy(xpath = "/html/body/div[2]/main/div[4]/div/section/section/section[1]/div[2]/button[1]") WebElement AddAll_ItemsToCart;
	@FindBy(xpath = "//a[@class='amqorder-title']") List<WebElement> listOfItems;
	@FindBy(xpath = "(//button[@class='amasty-action-file'])[1]") WebElement UploadCsv;
	@FindBy(xpath = "//input[@id='amqorder-file']") WebElement file;
	@FindBy(xpath = "//button[text()='Upload now']") WebElement UploadNow;
	@FindBy(xpath = "//div[@class='amqorder-item amqorder-sku']") List<WebElement> PartNo_List;
	@FindBy(xpath = "//button[text()='Accept']") WebElement Accept;
	@FindBy(xpath = "/html/body/div[2]/main/div[4]/div/aside/div/div[1]/h5") WebElement ItemsImported;
    @FindBy(xpath = "(//button[text()='Add All Items To Cart'])[3]") WebElement Addallitems ;
    @FindBy(xpath = "(//span[@class='price uom'])[1]") WebElement FirstProduct_UOM;
    @FindBy(xpath = "(//span[@class='price uom'])[2]") WebElement SecondProduct_UOM;
    
    //100line items
    @FindBy(xpath="//h5[@class='amqorder-header']")WebElement LineItemsCount;
    @FindBy(xpath="//button[@class='-fill -secondary amqorder-button']")WebElement AcceptButton;
                   //button[@class='-fill -secondary amqorder-button']
    @FindBy(xpath="//ul[contains(@class,'amqorder-errors-list')]")WebElement ErrorList;
    @FindBy(xpath="//div[@id='swal2-content']")WebElement MoreItems;//more than 100 items
    @FindBy(xpath="//button[@aria-label='Close this dialog']")WebElement CloseMark;
    
    
	public BulkOrderPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<String> PartNo() throws InterruptedException 
	{
		Thread.sleep(8000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		 js.executeScript("arguments[0].scrollIntoView();", YourPriceLabel);
		Thread.sleep(8000);
	List <WebElement>  PartNopath= driver.findElements(By.xpath("//div[@class='amqorder-item amqorder-sku']"));
	ArrayList<String> Partno= new ArrayList<String>();
	for (WebElement option:PartNopath)
	{
		String text= option.getText();
		Partno.add(text);
	//	System.out.println(Partno);
		
	}
	
	return (Partno);
	}
	
	public WebElement  BulkOrderPad()
	{
		return BulkOrderPad;
	}
	
	public String  BulkOrderPadClick()
	{
		BulkOrderPad.click();
		String BulkOrderPageTitle= driver.getTitle();
		return BulkOrderPageTitle;
}
	public void  ProductEntry() throws InterruptedException
	{
		
		 Thread.sleep(4000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// js.executeScript("arguments[0].scrollIntoView();", ProductLabel);
		//Product1.sendKeys(prop.getProperty("BulkOrder_Product1"));
		List <WebElement>  listele= Product;
	



		listele.size();
		 Thread.sleep(900);
		
		 listele.get(0).click();
	listele.get(0).sendKeys(prop.getProperty("BulkOrder_Product1"));
	

	
	
	Thread.sleep(8000);
	driver.findElement(By.xpath("(//li[@class='amqorder-item'])[2]")).click();
	Thread.sleep(1000);
	
	List <WebElement>  listele1= Product;
	



	listele1.size();
	 Thread.sleep(3000);
	

	
	listele.get(0).click();
	listele.get(0).sendKeys(prop.getProperty("BulkOrder_Product2"));
	
	
	
	Thread.sleep(8000);
	driver.findElement(By.xpath("(//li[@class='amqorder-item'])[2]")).click();
	
	
	
}
	
	public void  AddNewLineItem() throws InterruptedException
	{
		 Thread.sleep(6000);
		AddANewLineItem.click();
		
		 Thread.sleep(4000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// js.executeScript("arguments[0].scrollIntoView();", ProductLabel);
		 
		
		
		List <WebElement>  listele= Product;
		
			
	



		listele.size();
		 Thread.sleep(3000);
		

	listele.get(0).click();
	listele.get(0).sendKeys(prop.getProperty("BulkOrder_Product3"));
	
	
	
	Thread.sleep(8000);
	driver.findElement(By.xpath("(//li[@class='amqorder-item'])[2]")).click();
	
	
	
}
	

	public WebElement  UpdateQuantity() throws InterruptedException
	{
	return FirstItem_Qty;
	}
	
	public WebElement  AddAllItem_TOCart() throws InterruptedException
	{
		((JavascriptExecutor) driver)
	    .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
	return AddAll_ItemsToCart;
	}
	public WebElement  Addallitems() throws InterruptedException
	{
		((JavascriptExecutor) driver)
	    .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
	return Addallitems;
	}
	

	public BulkOrderPage Fileupload() throws Exception
	
{
		
		Thread.sleep(5000);
		
//		((JavascriptExecutor) driver)
//	    .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
//		waitUntilElementVisibility(UploadCsv);
		UploadCsv.click();
		 Thread.sleep(2000);
		 file .sendKeys(System.getProperty("user.dir") + prop.getProperty("valid_csvfile"));

//		file.sendKeys(prop.getProperty("valid_csvfile"));

		
		
		Thread.sleep(3000);
		
		UploadNow.click();
		Thread.sleep(3000);
		return new BulkOrderPage(driver);
	
}
	
	public BulkOrderPage HundredFileupload() throws Exception
	
{
		
		Thread.sleep(6000);
		
//		((JavascriptExecutor) driver)
//	    .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
//		waitUntilElementVisibility(UploadCsv);
		UploadCsv.click();
		 Thread.sleep(8000);
		 file .sendKeys(System.getProperty("user.dir") + prop.getProperty("valid_Hundredcsvfile"));

//		file.sendKeys(prop.getProperty("valid_csvfile"));
		
		Thread.sleep(6000);
		
	
		//Thread.sleep(10000);
		
//		try {
//			UploadNow.click();
//			Thread.sleep(12000);
//			System.out.println("Uploaded all files");
//			//driver.findElement(By.xpath("//button[@class='-fill -secondary amqorder-button']")).click();
//			//System.out.println("Accept Button is available");
//			} catch (Exception e) {
//				LineItemsCount.getText();
//				Thread.sleep(6000);
//				System.out.println(LineItemsCount.getText());
//				Thread.sleep(5000);
//				ErrorList.getText();
//				System.out.println(ErrorList.getText());
//				
//				//JavascriptExecutor js = (JavascriptExecutor) driver;
//				//js.executeScript("window.scrollBy(0,700)");
//				act.moveToElement(AcceptButton).build().perform();
//				AcceptButton.click();
//				Thread.sleep(5000);
//				//driver.findElement(By.xpath("//button[@class='-fill -secondary amqorder-button']")).click();
//				System.out.println("Accept Button is available");
//			//System.out.println("Uploaded all files");
//			}
		
		try {
			UploadNow.click();
			Thread.sleep(12000);
			LineItemsCount.getText();
			Thread.sleep(6000);
			System.out.println("****************************************************************");
			System.out.println(LineItemsCount.getText());
			System.out.println("****************************************************************");
			Thread.sleep(5000);
			ErrorList.getText();
			System.out.println("****************************************************************");
			System.out.println(ErrorList.getText());
			System.out.println("****************************************************************");
		//	act.moveToElement(AcceptButton).click();
			AcceptButton.click();
			Thread.sleep(5000);
			
			} catch (Exception e) {
				System.out.println("Uploaded all files");
				
			}
		
	
			
		return new BulkOrderPage(driver);
		
		
	
}
	
//100 line items
	public void AddOnemoreHundred() throws InterruptedException {
	try {
		//UploadCsv.click();
		MoreItems.isDisplayed();
		System.out.println(MoreItems.getText());
		Thread.sleep(6000);
		CloseMark.isDisplayed();
		System.out.println(CloseMark.isDisplayed());
		CloseMark.click();
		Thread.sleep(6000);
		System.out.println("****************************************************************");
		System.out.println("Not able to Upload more than 100 files");
		System.out.println("****************************************************************");
	}catch (Exception e) {
		System.out.println("Uploaded all files");
		Thread.sleep(6000);
	}
	}
	
////100 line items
	public void fileDetails() throws InterruptedException {
		LineItemsCount.getText();
		Thread.sleep(6000);
		System.out.println(LineItemsCount.getText());
		Thread.sleep(5000);
		ErrorList.getText();
		System.out.println(ErrorList.getText());
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		AcceptButton.click();
		Thread.sleep(5000);
	}
	
	
	
	public ArrayList<String> ListOfItem()
	{
		// List<String> a1 = new ArrayList();
		 
		List<WebElement> list1= PartNo_List;
		ArrayList<String> a1= new ArrayList<String>();
		for (WebElement option:list1)
		{
			String text= option.getText();
			
			a1.add(text);
			
		}
		return a1;
	}
	
	public String InvalidFileupload() throws InterruptedException
	
	{
			
		
		((JavascriptExecutor) driver)
	    .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		
		UploadCsv.click();
		 Thread.sleep(8000);
		 file .sendKeys(System.getProperty("user.dir") + prop.getProperty("Invalid_csvfile"));
//		file.sendKeys(prop.getProperty("Invalid_csvfile"));

		
		
		Thread.sleep(3000);
		
		UploadNow.click();
		Thread.sleep(5000);
 String No_of_itemsimported= ItemsImported.getText();
	Thread.sleep(8000);
			Accept.click();
			
			
			
			return No_of_itemsimported;
			
		
	}
	
	
	public WebElement  First_Product_UOM()
	{
		return FirstProduct_UOM;
}
	
	public WebElement  Second_Product_UOM()
	{
		return SecondProduct_UOM;
}
	
	
	
	
	
}