package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baselibrary.Baselibrary;
import pages.ProgressBar_page;


public class ProgressBar_test extends Baselibrary{
	 ProgressBar_page ob;
	 @Parameters("env")
	 @BeforeTest
	 public void getLaunchtestingBaba(String env)
	  {
  	  System.out.println("value "+env);
		  getLaunchUrl(getReadData(env));
		  System.out.println("value "+getReadData(env));
		 
		  ob = new  ProgressBar_page();
		  
	  }
	 @Test(priority=0)
	 public void clickonwidgets() {
		ob.clickonwidgets();
		}
	 @Test(priority=1)
	    public void clickonprogressbarbutton() {
	    ob.clickonprogressbarbutton();
		}
	 @Test(priority=2)
	    public void widthbeforestart() {
	    	ob.widthbeforestart();
	  	}
	 @Test(priority=3)
	    public void clickonStart() throws InterruptedException {
	    	ob.clickonStart();
	   	}
	 @Test(priority=4)
	    public void widthafterstart() {
	    	ob.widthafterstart();
	   	}
		

}
