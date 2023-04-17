package test;




import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baselibrary.Baselibrary;
import pages.Button;

public class Button_test extends Baselibrary{
	  Button ob;
	  
 @Parameters("env")
      
	  @BeforeTest
	  public void getLaunchtestingBaba(String env)
	  {
    	  System.out.println("value "+env);
		  getLaunchUrl(getReadData(env));
		  System.out.println("value "+getReadData(env));
		 
		  ob = new Button();
		  
	  }
	  @Test(priority=0)
	  public void clickonElements() throws InterruptedException {
		  Thread.sleep(1000);
			ob.clickonElements();
		}
	  @Test(priority=1)
	  public void clickonButton() throws InterruptedException {
		  Thread.sleep(1000);
			ob.clickonButton();
		}
	  @Test(priority=2)
	  public void clickondoubleclick() throws InterruptedException {
		  Thread.sleep(1000);
			ob.clickondoubleclick();
		}
	  @Test(priority=3)
	  public void clickonrightclick() throws InterruptedException {
		  Thread.sleep(1000);
			ob.clickonrightclick();
		}
	  @Test(priority=4)
	  public void clickonclickme() throws InterruptedException {
		  Thread.sleep(1000);
			ob.clickonclickme();
			
		}
	  @AfterTest()
	  public void tearDown() {
		  driver.quit();
		  
	  }
	  
	  
	
}
