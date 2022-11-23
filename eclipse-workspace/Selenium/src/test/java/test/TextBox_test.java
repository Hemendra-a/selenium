package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Baselibrary.Baselibrary;
import pages.TextBox_page;

public class TextBox_test extends Baselibrary {
	TextBox_page ob;
	  @BeforeTest
	  public void getLaunchtestingBaba()
	  {
		  getLaunchUrl("https://www.testingbaba.com/old/");
		  ob = new TextBox_page();
		  
	  }
	  @Test(priority=0)
	  public void clickonElements() throws InterruptedException {
		  Thread.sleep(1000);
			ob.clickonElements();
		}
	  @Test(priority=1)
	  public void clickonTexBoxButton() throws InterruptedException {
		  Thread.sleep(1000);
			ob.clickonTexBoxButton();
		}
	  @Test(priority=2)
	  public void  sendTextFullName() throws InterruptedException {
		  Thread.sleep(1000);
		  
			ob.sendTextFullName();
		}
	  @Test(priority=3)
		public void sendTextfullemail1() throws InterruptedException {
		  Thread.sleep(1000);
			ob.sendTextfullemail1();
		}
	  
	  @Test(priority=4)
		public void sendTextfulladdresh1() throws InterruptedException {
		  Thread.sleep(1000);
			ob.sendTextfulladdresh1();
		}
	  
	  @Test(priority=5)
		public void sendTextPaddresh1() throws InterruptedException {
		  Thread.sleep(1000);
			ob.sendTextPaddresh1();
		}
	  
	  @Test(priority=6)
		public void clickonSubmitButton() throws InterruptedException {
		 
			ob.clickonSubmitButton();
			 Thread.sleep(5000);
			
		}
	  

}
