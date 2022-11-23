package test;


import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baselibrary.Baselibrary;
import pages.Alert_page;

public class Alert_test extends Baselibrary {
	Alert_page ob;
	 @Parameters("env")
     
	  @BeforeTest
	  public void getLaunchtestingBaba(String env)
	  {
   	  System.out.println("value "+env);
		  getLaunchUrl(getReadData(env));
		  System.out.println("value "+getReadData(env));
		 
		  ob = new Alert_page();
		  
	  }
	 @Test(priority=0)
	 public void clickonalertframe() {
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 ob.clickonalertframe();
	 }
	 @Test(priority=1)
	 public void clickonalertbutton() {
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 ob.clickonalertbutton();
	 }
	 @Test(priority=2)
	 public void clickonclickmealert() {
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 ob.clickonclickmealert();
	 }
     @Test(priority=3)
     public void clickmeafter5sec() {
    	
    	 ob.clickmeafter5sec();
     }
     @Test(priority=4)
     public void clickonmyconfirm() {
    	
    	 ob.clickonmyconfirm();
     }
     @Test(priority=5)
     public void clickonmypromt()  {
    	
    	 ob.clickonmypromt() ;
     }
}
