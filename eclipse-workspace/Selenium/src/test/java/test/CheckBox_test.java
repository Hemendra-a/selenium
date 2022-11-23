package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baselibrary.Baselibrary;
import pages.CheckBox_page;

public class CheckBox_test extends Baselibrary {
	CheckBox_page ob;
      @Parameters("env")
      
	  @BeforeTest
	  public void getLaunchtestingBaba(String env)
	  {
    	  System.out.println("value "+env);
		  getLaunchUrl(getReadData(env));
		  System.out.println("value "+getReadData(env));
		 
		  ob = new CheckBox_page();
		  
	  }
	  @Test(priority=0)
	  public void clickonElements() {
			ob.clickonElements();
		}
	  @Test(priority=1)
		public void clickonCheckBox() {
			ob.clickonCheckBox();
		}
	  @Test(priority=2)
	  public void mobileCheckBoxButton() {
			ob.mobileCheckBoxButton();
		}
	  @Test(priority=3)
	  public void LaptopCheckBoxButton() {
			ob.LaptopCheckBoxButton();
		}
	  @Test(priority=4)
	  public void DesktopCheckBoxButton() {
			ob.DesktopCheckBoxButton();
			
		}
}
