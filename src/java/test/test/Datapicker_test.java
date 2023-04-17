package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baselibrary.Baselibrary;
import pages.Datapicker_page;



public class Datapicker_test  extends Baselibrary{
	
	Datapicker_page ob;
	 @Parameters("env")
   
	  @BeforeTest
	  public void getLaunchtestingBaba(String env)
	  {
 	  System.out.println("value "+env);
		  getLaunchUrl(getReadData(env));
		  System.out.println("value "+getReadData(env));
		 
		  ob = new Datapicker_page();
	  }
	 @Test(priority=0)
	 public void clickonwidgets() {
		 ob.clickonwidgets();
			
		}
	 @Test(priority=1)
		public void clickondatapicker() {
		ob.clickondatapicker();
		}
	 @Test(priority=2)
		public void clickonselectdate() {
			ob.clickonselectdate();
		}
	 @Test(priority=3)
	 public void selectdate_timePS() {
			ob.selectdate_timePS();
	 }
	 @Test(priority=4)
	 public void selectgetdate_time()  {
			ob.selectgetdate_time();
			
			
		}
//	 @AfterTest
//     public void teardown() {
//    	 driver.quit();
//     }
}
