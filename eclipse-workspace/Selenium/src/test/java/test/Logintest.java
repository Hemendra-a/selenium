package test;




import org.junit.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Baselibrary.Baselibrary;
import pages.Login;

public class Logintest extends Baselibrary{
  Login ob;
  
  @BeforeTest
  public void getLaunchtestingBaba()
  {
	  getLaunchUrl("https://www.testingbaba.com/old/");
	  ob = new Login();
	  
  }
  @Test(invocationCount = 100,successPercentage =100) 
//  @Test(priority=0)
 
  public void getTitle()
  {
	  ob.getVerifyTitle();
	 
	  Assert.assertTrue(true);
  }
//  @Test(priority=1)
//  public void clickonCloseButton() {
//	  ob.clickonCloseButton();
//  }
//  @Test(priority=2)
//  public void clickonpractice() {
//	  ob.clickonPractice();
//  }
  @Test(priority=3)
  public void clickonElements() {
		ob.clickonElements();
	
	}
 
}