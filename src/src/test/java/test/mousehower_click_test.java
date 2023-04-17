package test;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baselibrary.Baselibrary;

import pages.mousehower_click_page;

public class mousehower_click_test extends Baselibrary {
	mousehower_click_page ob;
	 @Parameters("env")
   
	  @BeforeTest
	  public void getLaunchtestingBaba(String env)
	  {
 	  System.out.println("value "+env);
		  getLaunchUrl(getReadData(env));
		  System.out.println("value "+getReadData(env));
		 
		  ob = new mousehower_click_page();
	  }
	 @Test(priority=0)
	 public void clickonwidgets() {
			ob.clickonwidgets();
		}
	 @Test(priority=1)
		public void clickonmenu() {
			ob.clickonmenu();
		}
	 @Test(priority=2)
		public void mousehower() {
			ob.mousehower();
		}
	 @Test(priority=3)
	    public void mousehowerandclick() {
			ob.mousehowerandclick();
		}
		
	 @AfterTest
     public void teardown() {
    	 driver.quit();
     }
}
