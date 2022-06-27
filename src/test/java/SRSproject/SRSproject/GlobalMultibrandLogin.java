package SRSproject.SRSproject;

import org.testng.annotations.Test;

import Pages.HomePage_Global;

public class GlobalMultibrandLogin extends BaseTest{
	
	HomePage_Global  Hpg ;
	
	@Test(priority = 1)
	public void ValidMultiSelectPCS() throws InterruptedException {
		Hpg = new HomePage_Global(driver);
		Hpg.ValidLoginMultiBrandPCS();
		Thread.sleep(3000) ;
		Hpg.SignOut();
		Thread.sleep(3000) ;
		
	}
	
	@Test(priority = 2)
	public void ValidMultiSelectCPS() throws InterruptedException {
		Hpg = new HomePage_Global(driver);
		Hpg.ValidLoginMultiBrandCPS();
		Thread.sleep(3000) ;
		Hpg.SignOut();
		Thread.sleep(3000) ;
	}
	
	@Test(priority = 3)
	public void ValidMultiSelectFIS() throws InterruptedException {
		Hpg = new HomePage_Global(driver);
		Hpg.ValidLoginMultiBrandFIS();
		Thread.sleep(3000) ;
		Hpg.SignOut();
		Thread.sleep(3000) ;
	}
	@Test(priority = 4)
	public void ValidMultiLoginSelectQPS() throws InterruptedException {
		Hpg = new HomePage_Global(driver);
		Hpg.ValidLoginMultiBrandQPS();
		Thread.sleep(3000) ;
		Hpg.SignOut();
		Thread.sleep(3000) ;
	}
	
	@Test(priority = 4)
	public void InvalidMultiLogin() throws InterruptedException {
		Hpg = new HomePage_Global(driver);
		Hpg.ValidLoginMultiBrandQPS();
		Thread.sleep(3000) ;
		Hpg.SignOut();
		Thread.sleep(3000) ;
	}

}
