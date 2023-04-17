package Baselibrary;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import applicationUtility.ApplicationUtility;
import excelUtility.ExcelUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import propertyUtility.PropertyUtility;
import screenshotUtility.Screenshot_Utility;
import waitUtility.WaitUtility;

public class Baselibrary implements ExcelUtility,PropertyUtility,ApplicationUtility,WaitUtility,Screenshot_Utility {
	
	
	String path="C:\\Users\\winni\\eclipse-workspace\\Selenium\\TestData\\config.properties";
	
	public static WebDriver driver;
	
	public void getLaunchUrl(String url) {
		WebDriverManager.edgedriver().setup();
	    driver = new EdgeDriver();

		driver.manage().window().maximize();
		
		driver.navigate().to(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[text()='×']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//*[text()='Practice']")).click();
		   
	}
	
	@Override
	public String getReaddata(String path, int sheetno, int colno, int rowno) {
	String value="";
		try {
			FileInputStream fis=new  FileInputStream(path);//Java FileInputStream class obtains input bytes from a file.
			XSSFWorkbook wb=new XSSFWorkbook(fis);// This class has methods to read and write Microsoft Excel and OpenOffice xml files in .xls or .xlsx format.
			XSSFSheet sheet=wb.getSheetAt(sheetno);
			value=sheet.getRow(rowno).getCell(colno).getStringCellValue();
		} catch (Exception e) {
		System.out.println("Issue in get data");
		}
		return value;
	}
	@Override
	public String getReadData(String key) {
        	String value="";
		try { 
			FileInputStream fis=new  FileInputStream(path);
			Properties prop=new Properties();
			prop.load(fis);
			value=prop.getProperty(key);
			
			
		} catch (Exception e) {
			System.out.println("Issue in get read data from property file");
			
			
		}
		
         return value;
	}

	


	@Override
	public void doubleclick(WebElement ele) {
		 Actions act=new Actions(driver);
		act.doubleClick(ele).perform();
		
		
	}

	@Override
	public void rightclick(WebElement ele) {
		 Actions act=new Actions(driver);
		act.contextClick(ele).perform();
		//act.contextClick().perform();
		
		
	}

	@Override
	public void elementtobeclickable(WebElement ele, int time) {
		WebDriverWait wait=new WebDriverWait(driver,time); 
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		;
	}

	@Override
	public void Alert(int time) {
		WebDriverWait wait=new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.alertIsPresent());
		
	}

	@Override
	public void fileupload(String path) {
		try {
			StringSelection sel=new StringSelection(path);
			Clipboard tool=Toolkit.getDefaultToolkit().getSystemClipboard();
			tool.setContents(sel, null);
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.delay(1000);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
		} catch (Exception e) {
			System.out.println("issue in file upload");
		}
		
	}

	@Override
	public void getScreenshot(String foldername, String filename) {
		String location=System.getProperty("user.dir");
		try {
			String path=location+"\\screenshot\\"+foldername+"\\"+filename+".png";
			EventFiringWebDriver efw=new EventFiringWebDriver(driver);
			File src=efw.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File(path));
		} catch (Exception e) {
			System.out.println("Issue in getScreenshot");
		}
		
	}
	@AfterMethod
	public void getanalysis(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		try {
			if(result.isSuccess()) {
			getScreenshot(methodname, "pass");
		}
			else if(result.getStatus()==ITestResult.FAILURE){
				getScreenshot(methodname, "Fail");
			}
			else if (result.getStatus()==ITestResult.SKIP){
				getScreenshot(methodname, "skip");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void selectbyvalue(WebElement ele, String value) {
		 Select sel= new Select(ele);
		sel.selectByVisibleText(value);
		
		
		
	}

	@Override
	public void multiselect(WebElement ele) {
		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_SPACE);
			
			robot.keyRelease(KeyEvent.VK_SPACE);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			
		} catch (Exception e) {
			
			System.out.println("issue in selectmenu");
		}
		
		
	}

	@Override
	public void mousehower(WebElement ele) {
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();//when we need to perform sigle actions then used .perform
		
		
	}

	@Override
	public void mousehower_click(WebElement ele, String target) {
		Actions act=new Actions(driver);
		act.moveToElement(ele).build().perform();//when we need to perform more than one actionbuild.perform
		driver.findElement(By.linkText(target)).click();
	}
	@Override
	public String getdate() {
		String value="";
		try {
			Date sb = new Date();
			DateFormat db= new SimpleDateFormat("dd-MM-yyyy");
			value=db.format(sb);
			
		} catch (Exception e) 
		{
			System.out.println("Issue in get date"+e);
		}
		
		return value;
	}

	@Override
	public String getdate_time() {
		String value="";
		try {
			Date sb = new Date();
			DateFormat db= new SimpleDateFormat("hhmm");
			
			value=db.format(sb);
			
			
		} catch (Exception e) 
		{
			System.out.println("Issue in get date"+e);
		}
		
		return value;
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
		
	}
	
	
}
	



