package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baselibrary.Baselibrary;
import pages.Tab_page;


public class Tab_test extends Baselibrary{
	Tab_page ob;
	  
	@Parameters("env")
	    
		  @BeforeTest
		  public void getLaunchtestingBaba(String env)
		  {
			  getLaunchUrl(getReadData(env));
			 
			  ob = new Tab_page();
			  
		  }
	@Test(priority=0)
	public void clickonwidgets() {
		ob.clickonwidgets();
	}
	@Test(priority=1)
	public void clickonTab() {
		ob.clickonTab();
	}
	@Test(priority=2)
	public void gettextTab1() throws InterruptedException {
		ob.gettextTab1();
		
	}
	@Test(priority=3)
    public void gettextTab2() throws InterruptedException {
    	ob.gettextTab2();
    	
	}
	@Test(priority=4)
     public void gettextTab3() throws InterruptedException {
    	ob.gettextTab3();
    
    }

}
