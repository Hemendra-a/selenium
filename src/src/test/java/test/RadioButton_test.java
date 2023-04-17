package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Baselibrary.Baselibrary;
import pages.RadioButton_page;

public class RadioButton_test extends Baselibrary {
	RadioButton_page ob;
	 @BeforeTest
	 public void getLaunchtestingBaba()
	  {
		  getLaunchUrl("https://www.testingbaba.com/old/");
		  ob = new RadioButton_page();
		  
	  }
	 @Test(priority=0)
	  public void clickonElements() throws InterruptedException  {
		 Thread.sleep(2000);
			ob.clickonElements();
		}
	 @Test(priority=1)
	  public void clickonRadioButton() throws InterruptedException {
		 Thread.sleep(2000);
		 ob.clickonRadioButton();
		
		}
	 @Test(priority=2)
	  public void clickonYesButton() throws InterruptedException {
		 Thread.sleep(2000);
			ob.clickonYesButton();
		}
	 @Test(priority=3)
	  public void clickonImpressiveButton() throws InterruptedException {
		 Thread.sleep(2000);
			ob.clickonImpressiveButton();
		}
	 @Test(priority=4)
	  public void clickonNoButton() throws InterruptedException {
		 Thread.sleep(2000);
			ob.clickonNoButton();
			
		}
	 @AfterTest
     public void teardown() {
    	 driver.quit();
     }

}
