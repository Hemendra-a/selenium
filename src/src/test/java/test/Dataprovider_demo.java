
package test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import excelUtility.datadriven;


public class Dataprovider_demo extends datadriven {
	WebDriver driver;
	static String path="C:\\\\\\\\Users\\\\\\\\winni\\\\\\\\eclipse-workspace\\\\\\\\Selenium\\\\\\\\TestData\\\\\\\\logindata_dataprovider.xlsx";
	@Test(dataProvider="create")
	public void test(String username,String password) {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\winni\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");
		
	     driver = new EdgeDriver();

		driver.manage().window().maximize();
       driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.navigate().to("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='login-button']")).click();
		
	}
	@DataProvider(name="create")
	
	public static Object[][] getData() throws IOException {
		Object data [][] = excelDataReader(path,"Sheet1");

		return data;
	}
	
//	public Object[][] dataset1() {
//	
//	   Object[][] data=new Object[4][2];//[row][col]
//
//	   data[0][0]="standard_user";
//	   data[0][1]="secret_sauce";
//	   
//	   data[1][0]="locked_out_user";
//	   data[1][1]="secret_sauce";
//	   
//	   data[2][0]="problem_user";
//	   data[2][1]="secret_sauce";
//	   
//	   data[3][0]="performance_glitch_user";
//	   data[3][1]="secret_sauce";
//	   
//	   
//	   return data;
//		
//	}
	
	@AfterMethod
	public void Teardown(){
	driver.quit();
	}

}
