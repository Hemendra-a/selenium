package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baselibrary.Baselibrary;
import pages.upload_download_page;

public class upload_download_test extends Baselibrary {
	upload_download_page ob;
	  
@Parameters("env")
    
	  @BeforeTest
	  public void getLaunchtestingBaba(String env)
	  {
  	  System.out.println("value "+env);
		  getLaunchUrl(getReadData(env));
		  System.out.println("value "+getReadData(env));
		 
		  ob = new upload_download_page();
		  
	  }
@Test(priority=0)
public void clickonElements() {
	 
		ob.clickonElements();
	}
@Test(priority=1)
public void clickonuploadanddownload() {
	ob.clickonuploadanddownload();
}
@Test(priority=2)
public void clickonchoosefile(){
	ob.clickonchoosefile();
}

}
