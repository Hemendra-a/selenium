package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baselibrary.Baselibrary;

public class ProgressBar_page extends Baselibrary {
	public  ProgressBar_page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@data-target='#widget']")
	private WebElement widgets;
	@FindBy(xpath="//*[@href='#tab_20']")
	private WebElement ProgressBar;
	//beforeclick width
	@FindBy(xpath="//*[@id='myBar']")
	private WebElement Width;
	//start
	@FindBy(xpath="//*[@id='resetButton']")
	private WebElement Start;
	//width afterclick
	@FindBy(xpath="//*[@id='myBar']")
	private WebElement Widthafterclick;
	
	public void clickonwidgets() {
		widgets.click();
	}
    public void clickonprogressbarbutton() {
    	ProgressBar.click();
	}
    public void widthbeforestart() {
    	Width.getAttribute(getdate());
    	System.out.println("Get progress :"+Width.getAttribute("style"));
  	}
    public void clickonStart() throws InterruptedException {
    	Start.click();
    	Thread.sleep(2000);
   	}
    public void widthafterstart() {
    	
    	System.out.println("Get progress :"+Widthafterclick.getAttribute("style"));
   	}
	
	

}
