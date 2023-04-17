package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Baselibrary.Baselibrary;

public class Tab_page extends Baselibrary{
	public Tab_page () {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@data-target='#widget']")
	private WebElement Widgets;
	
	@FindBy(xpath="//*[@href='#tab_21']")
	private WebElement Tabs;
	
	@FindBy(xpath="//*[@id='home-tab']")
	private WebElement Tab1;
	//text xpath
	@FindBy(xpath="//*[@id='home']")
	private WebElement Text1;
	
	@FindBy(xpath="//*[@id='profile-tab']")
	private WebElement Tab2;
	//text xpath
	@FindBy(xpath="//*[@id='profile']")
	private WebElement Text2;
	
	@FindBy(xpath="//*[@id='contact-tab']")
	private WebElement Tab3;
	//text xpath
	@FindBy(xpath="//*[@id='contact']")
	private WebElement Text3;
	
	public void clickonwidgets() {
		Widgets.click();
	}
	public void clickonTab() {
		Tabs.click();
	}
	public void gettextTab1() throws InterruptedException {
		
		Tab1.click();
		System.out.println("text1 :"+Text1.getText());
		Thread.sleep(2000);
		
	}
    public void gettextTab2() throws InterruptedException {
    	elementtobeclickable(Tab2,10);
    	Tab2.click();
    	Thread.sleep(2000);
		System.out.println("Text2 : "+Text2.getText());
		
	}
	
     public void gettextTab3() throws InterruptedException {
    
    	    Tab3.click();
    	    Thread.sleep(2000);
 		System.out.println("Text3 : "+Text3.getText());
    }

	
}
