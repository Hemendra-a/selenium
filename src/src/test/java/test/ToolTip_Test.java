package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baselibrary.Baselibrary;
import pages.ToolTip_page;


public class ToolTip_Test extends Baselibrary {
	ToolTip_page ob;
	  
	@Parameters("env")
	    
		  @BeforeTest
		  public void getLaunchtestingBaba(String env)
		  {
			  getLaunchUrl(getReadData(env));
			 
			  ob = new ToolTip_page();
			  
		  }
	@Test(priority=0)
	public void clickonwidgets() {
		ob.clickonwidgets();
	}
	@Test(priority=1)
    public void clickonToolTip() {
    ob.clickonToolTip();
	}
	@Test(priority=2)
    public void HandelHover() {
    ob.HandelHover();
      }

}
