package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baselibrary.Baselibrary;
import pages.WebTables_page;

public class WebTables_test extends Baselibrary {
	WebTables_page ob;
	 @Parameters("env")
	 @BeforeTest
	 public void getLaunchtestingBaba(String env)
	  {
   	  System.out.println("value "+env);
		  getLaunchUrl(getReadData(env));
		  System.out.println("value "+getReadData(env));
		 
		  ob = new WebTables_page();
		  
	  }
	 @Test(priority=0)
	  public void clickonElements() throws InterruptedException  {
		 Thread.sleep(2000);
			ob.clickonElements();
		}
	 
	 
	 @Test(priority=1)
	  public void clickonWebTablesbutton() throws InterruptedException  {
		 Thread.sleep(1000);
			ob.clickonWebTablesbutton();
			
		}
	 

	 @Test(priority=2)
	 public void filldetails() throws InterruptedException {
		 Thread.sleep(1000);
		 ob.filldetails();
	 }
	 
	 @Test(priority=3)
	 public void editdetails() throws InterruptedException {
		 Thread.sleep(1000);
		 
		 ob.editdetails();
	 }
	 
	 @Test(priority=4)
	 public void matched_Data()throws InterruptedException {
		 Thread.sleep(1000);
		 ob.matched_Data();
		
	 }


}
