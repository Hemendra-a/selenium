package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baselibrary.Baselibrary;
import pages.browserwindows_page;

public class browserwindows_test extends Baselibrary{
	browserwindows_page ob;
	 @Parameters("env")
    
	  @BeforeTest
	  public void getLaunchtestingBaba(String env)
	  {
  	  System.out.println("value "+env);
		 getLaunchUrl(getReadData(env));
		  System.out.println("value "+getReadData(env));
		 
		  ob = new browserwindows_page();
		  
	  }
	 @Test(priority=0)
	 public void clickonalertframebutton() {
		
		 ob.clickonalertframebutton();
	 }
	 @Test(priority=1)
	 public void clickonbrowserwindowsbutton() {
		
		 ob.clickonbrowserwindowsbutton();
	 }

	 @Test(priority=3)
	 public void clickonNewWindow() {
		
		 ob.clickonNewWindow();
	 }
	 @Test(priority=4)
	 public void clickonNewWindowmsg() throws InterruptedException {
		
		 ob.clickonNewWindowmsg();
	 }
	 
	 

}
