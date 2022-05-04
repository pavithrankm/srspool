package SRSproject.SRSproject;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage
{ 

	public static Properties prop;
	public static WebDriver driver;
	

	//PCS
//	public static String configpath ="E:\\SRSPool\\src\\main\\java\\config_staging\\configuration_staging_pcs.properties";
//	public static String configpath ="E:\\SRSPool\\src\\main\\java\\config_prod\\config_prod_pcs.properties";
//	public static String configpath ="E:\\SRSPool\\src\\main\\java\\config_prod\\config_prod_pcs.properties";
//	public static String configpath ="E:\\SRSPool\\src\\main\\java\\config\\configuration_pcs.properties";//QA
	//QPS
//	public static String configpath ="E:\\SRSPool\\src\\main\\java\\config_prod\\config_prod_qps.properties";
//	public static String configpath ="C:\\Users\\DCKAP\\eclipse-workspace\\SRSproject_Pool\\src\\main\\java\\config_staging\\configuration_staging_qps.properties";
//	public static String configpath ="E:\\SRSPool\\src\\main\\java\\config_staging\\configuration_staging_qps.properties";
     //glb
	//	public static String configpath ="E:\\SRSPool\\src\\main\\java\\config_prod\\config_prod_glb.properties";
//	  public static String configpath ="E:\\SRSPool\\src\\main\\java\\config_staging\\configuration_staging_glb.properties";
	
	  //STG-2
	  
//	  public static String configpath= "E:\\SRSPool\\src\\main\\java\\config_staging2\\configuration_staging2_glb.properties";
//	  public static String configpath="E:\\SRSPool\\src\\main\\java\\config_staging2\\configuration_staging2_pcs.properties";
//      public static String configpath="E:\\SRSPool\\src\\main\\java\\config_staging2\\configuration_staging2_qps.properties";	  
//      public static String configpath="E:\\SRSPool\\src\\main\\java\\config_staging2\\configuration_staging2_Aquagon.properties";
//      public static String configpath="E:\\SRSPool\\src\\main\\java\\config_staging2\\configuration_staging2_PEP.properties";
//      public static String configpath ="E:\\SRSPool\\src\\main\\java\\config_staging2\\configuration_staging2_FWP.properties";
//	public static String configpath ="E:\\SRSPool\\src\\main\\java\\config_staging2\\configuration_staging2_FWP.properties";
      //prod
//      public static String configpath="E:\\SRSPool\\src\\main\\java\\config_prod\\config_prod_Aquagon.properties";
//      public static String configpath="E:\\SRSPool\\src\\main\\java\\config_prod\\config_prod_PEP.properties";
//        public static String configpath = "src/main/java/config_prod/config_prod_Aps.properties";
	 public static String configpath ="src/main/java/config_prod/config_prod_Tps.properties";
//        public static String configpath = "src/main/java/config_prod/config_prod_Conely.properties";
//	    src/main/resources/app.properties
	//to run your selenium’s tests in parallel, Webdriver object should be thread-safe, i.e. a single object can be used with multiple threads at the same time without causing problems. 
	//thread local driver object for webdriver,
	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();
	
	//multithreading  
	public static synchronized WebDriver getDriver()
	{
		return tdriver.get();
		
	}
	
	public static WebDriver initializtion() throws IOException 
	{
		prop = new Properties();
	
		FileInputStream ip = new FileInputStream(configpath);
		prop.load(ip);

		String BrowserName= prop.getProperty("browser");
		
		if(BrowserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
		}
		else {
			WebDriverManager.edgedriver().browserVersion("10.0.18362.1139").setup();
			driver = new EdgeDriver();
//			EdgeDriver driver = new EdgeDriver();
//			System.out.println(driver.getCapabilities().toString());
		}
		
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		tdriver.set(driver);
		return getDriver();
	}
	public static void waitUntilElementVisibility(WebElement element) throws Exception {
		try {
			WebDriverWait wb = new WebDriverWait(driver, 50);
			wb.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
		e.printStackTrace();
		}
			}
	
	/***
	 * 
	 * screenshot
	 * 
	 *
	 */
	
	public String getScreenshot() throws IOException, InterruptedException
	{
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "/screenshots/" + System.currentTimeMillis() + ".png";
		File destination = new File(path);

		try {
			FileUtils.copyFile(src, destination);
		} catch (IOException e) {
			System.out.println("screenshot captured failed...");
		}

		return path;
	}
	

}
