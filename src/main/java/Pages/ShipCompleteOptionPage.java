package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import SRSproject.SRSproject.BasePage;

public class ShipCompleteOptionPage extends BasePage {
	
	WebDriverWait wait;
	WebDriver driver;
	Actions act;
	
	
	
	@FindBy(xpath="//span[normalize-space()='Brands']")WebElement BrandsOption;
	@FindBy(xpath="//span[normalize-space()='Cart']")WebElement MiniCart;
	@FindBy(xpath="//button[@class='ambrands-letter letter-A']")WebElement Letter_A;
	@FindBy(xpath="//div[@class='ambrands-letter letter-A am-brands-fullwidth']//div[@class='ambrands-content']//div[1]")WebElement FirstProduct;
	@FindBy(xpath="(//div[@class='title title-subcategory'])[1]")WebElement ClickFirstProduct;
	
	@FindBy(xpath="(//span[contains(text(),'Add to Cart')])[1]")WebElement A_Products1;
	@FindBy(xpath="(//span[contains(text(),'Add to Cart')])[2]")WebElement A_Products2;
	@FindBy(xpath="(//span[contains(text(),'Add to Cart')])[3]")WebElement A_Products3;
	
	@FindBy(xpath="//button[@id='top-cart-btn-checkout']")WebElement Checkout;
	
	@FindBy(xpath="/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div[3]/div/input")WebElement OrderDetails;
	@FindBy(xpath="//input[contains(@id,'dp')]")WebElement RequestedDate;
	@FindBy(xpath="//a[contains(@class,'ui-state-default ui-state-hover')]")WebElement CalenderDate;
	@FindBy(xpath="//button[@class='button action continue secondary']//span//span[contains(text(),'Next Step')]")WebElement NextButton;
	@FindBy(xpath="//label[@for='ship_complete']")WebElement ShipCompleteOption;
	@FindBy(xpath="//button[@class='button action continue primary']")WebElement ShippingNextButton;
	
	   @FindBy(xpath ="(//input[@type='checkbox'])[2]") WebElement Checkbox;
	   @FindBy(xpath="//span[normalize-space()='Place Order']")WebElement PalceOrder;
	   @FindBy(xpath="//span[normalize-space()='Ship Order Complete:']")WebElement ShipOptionDis;
	   @FindBy(xpath="//span[normalize-space()='Yes']")WebElement YesOption;
	
	public ShipCompleteOptionPage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	public void ShopProductPage() throws InterruptedException {
		
		act = new Actions(driver);
		act.moveToElement(BrandsOption).build().perform();
		Thread.sleep(3000);
		act.moveToElement(Letter_A).click().perform();
		Thread.sleep(2000);
		act.moveToElement(FirstProduct).click().perform();
		//act.moveToElement(ClickFirstProduct).click().perform();
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
//		List<WebElement> AddCart = driver.findElements(By.xpath("(//span[text()='Add to Cart'])[1]"));
//		if(AddCart.) {
//			act.moveToElement(A_Products1).click().perform();
//			Thread.sleep(6000);
//		}else {
//			act.moveToElement(A_Products2).click().perform();
//			Thread.sleep(6000);
//		}
		act.moveToElement(A_Products1).click().perform();
		Thread.sleep(6000);
		act.moveToElement(A_Products2).click().perform();
		Thread.sleep(6000);
		act.moveToElement(A_Products3).click().perform();
		Thread.sleep(6000);
		driver.getTitle();
		driver.getCurrentUrl();	
		
	}

	public void MiniCartPage() throws InterruptedException {
		act = new Actions(driver);
		act.moveToElement(MiniCart).click().perform();
		Thread.sleep(3000);
		driver.getTitle();
		//driver.getPageSource();
		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
	}

	public void checkoutPage() throws InterruptedException {
		act =new Actions(driver);
		Thread.sleep(5000);
		act.moveToElement(MiniCart).click().perform();
		Thread.sleep(6000);
		act.moveToElement(Checkout).click().perform();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle()+ "Checkout PAge Display");
		
	}
	
	public void OrderDetailsPage() throws InterruptedException {
		act=new Actions(driver);
		OrderDetails.click();
		Thread.sleep(5000);
     	OrderDetails.sendKeys("12");
     	OrderDetails.getText();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(3000);
		act.moveToElement(RequestedDate).perform();
		RequestedDate.click();
		Thread.sleep(3000);
		act.moveToElement(CalenderDate).perform();
		CalenderDate.click();
		Thread.sleep(3000);
		act.moveToElement(NextButton).click().perform();
		Thread.sleep(3000);
		
	}
	
	public void ShipCompleteOption() throws InterruptedException {
		act=new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(3000);
		List<WebElement> ShipCom = driver.findElements(By.xpath("//label[@for='ship_complete']"));
		if(ShipCom.size()>0) {
			System.out.println("Option is available");
			System.out.println(ShipCompleteOption.getText());
			ShipCompleteOption.click();
			
		}else {
			System.out.println("Option Not Availble");
		}
		Thread.sleep(4000);
		ShippingNextButton.click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
	}
	public void PlaceOrderPage() throws InterruptedException {
		act= new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
		act.moveToElement(Checkbox).click().perform();
		Thread.sleep(2000);
		act.moveToElement(PalceOrder).click().perform();
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		}
	
	public void ShipOption() throws InterruptedException {
		act=new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		List<WebElement> ShipOp = driver.findElements(By.xpath("//span[normalize-space()='Ship Order Complete:']"));
		if(ShipOp.size()>0) {
			System.out.println(ShipOptionDis.getText() + " ***** Ship Order Complete*****  Is Available ");
			System.out.println(YesOption.getText());
		}else {
			System.out.println("***** Ship Order Complete***** Is Not-Available ");
		}
		Thread.sleep(3000);
	}
	
	public void AddToCartItem() throws InterruptedException {
		act =new Actions(driver);
		act.moveToElement(BrandsOption).build().perform();
		Thread.sleep(3000);
		act.moveToElement(Letter_A).click().perform();
		Thread.sleep(2000);
		act.moveToElement(FirstProduct).click().perform();
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		act.moveToElement(A_Products1).click().perform();
		Thread.sleep(5000);
		act.moveToElement(A_Products2).click().perform();
		Thread.sleep(5000);
		act.moveToElement(A_Products3).click().perform();
		Thread.sleep(5000);
		List<WebElement> ItemCart = driver.findElements(By.xpath("//span[text()='Items in Cart']"));
		if(ItemCart.size()>0) {
			System.out.println("Products are available");
		}else {
			System.out.println("You have no items in your shopping cart.");
		}
	}
	
}
