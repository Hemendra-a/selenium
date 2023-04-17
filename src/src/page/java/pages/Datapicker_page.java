package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baselibrary.Baselibrary;

public class Datapicker_page extends Baselibrary {
public Datapicker_page () {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//*[@data-target='#widget']")
private WebElement widgets;

@FindBy(xpath="//*[@href='#tab_18']")
private WebElement Datapicker;

@FindBy(xpath="//*[@id='datePickerContainer']/div[1]/div[2]/input")
private WebElement selectdate;//*[@id='datePickerContainer']/div[1]/div[2]/input

@FindBy(xpath="//*[@id='datePickerContainer']/div[2]/div[2]/input")
private WebElement selectDateTime;

public void clickonwidgets() {
	widgets.click();
}
public void clickondatapicker() {
	Datapicker.click();
}

public void clickonselectdate() {
	
	  ((JavascriptExecutor)driver).executeScript ("document.getElementById('datePickerContainer').removeAttribute('readonly',0);"); // Enables the from date box
//	  selectdate.clear();
	  selectdate.sendKeys("18-11-2022"); //Enter date in required format
	  selectdate.clear();
	  selectdate.sendKeys("20-11-2022"); 
//    //Fill date as mm/dd/yyyy as 09/25/2013
//
//	selectdate.sendKeys("24112022");



}
public void selectdate_timePS() {
	selectdate.clear();
	selectdate.sendKeys(getdate());
	System.err.println(getdate());
	
}
public void selectgetdate_time()  {

	selectDateTime.sendKeys(getdate());
	
	selectDateTime.sendKeys(Keys.ARROW_RIGHT);
	selectDateTime.sendKeys(getdate_time());
	System.err.println(getdate()+" "+getdate_time());
	
	
}
}
