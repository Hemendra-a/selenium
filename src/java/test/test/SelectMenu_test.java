package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baselibrary.Baselibrary;
import pages.Login;
import pages.SelectMenu_page;

public class SelectMenu_test extends Baselibrary {
	SelectMenu_page ob;
	
    
	  @BeforeTest
	  public void getLaunchtestingBaba()
	  {
		  getLaunchUrl("https://www.testingbaba.com/old/");
		  ob = new SelectMenu_page ();
		  
	  }
	 @Test(priority=0)
	  public void clickonwidget() {
			ob.clickonwidget();
		}
	 @Test(priority=1)
	 public void clickonselectmenu() {
			ob.clickonselectmenu();
		}
	 @Test(priority=2)
		public void clickonselectbyvalue() {
			ob.clickonselectbyvalue();
		}
	 @Test(priority=3)
	 public void clickonselectbyone() {
		ob.clickonselectbyone();
		}
	 @Test(priority=4)
	 public void clickonmultiselect() {
			ob.clickonmultiselect();
		}
	 @Test(priority=5)
	 public void clickonmultiselectrobotclass() {
		   ob.clickonmultiselectrobotclass();
		
		}
	 @AfterTest
     public void teardown() {
    	 driver.quit();
     }
}
