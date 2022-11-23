package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baselibrary.Baselibrary;
import pages.Frame_page;

public class Frame_test extends Baselibrary {
	Frame_page ob;
	 @Parameters("env")
   
	  @BeforeTest
	  public void getLaunchtestingBaba(String env)
	  {
 	  System.out.println("value "+env);
		  getLaunchUrl(getReadData(env));
		  System.out.println("value "+getReadData(env));
		 
		  ob = new Frame_page();
		  
	  }
	 @Test(priority=0)
	 public void clickonalertframebutton() {
		
		 ob.clickonalertframebutton();
	 }
	 @Test(priority=1)
	 public void clickonframe() {
		
		 ob.clickonframe();
	 }
	 @Test(priority=2)
	 public void enterinparentframe1(){
		
		 ob.enterinparentframe1();
	 }
	 @Test(priority=2)
	 public void enterinchildframe2(){
		
		 ob.enterinchildframe2();
	 }

}
