package pages;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baselibrary.Baselibrary;

public class browserwindows_page extends Baselibrary {
	

	public browserwindows_page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='headingOne']/h2/button")
	private WebElement alertframebutton;
	@FindBy(xpath="//*[@href='#tab_11']")
	private WebElement browserwindowsbutton;
	@FindBy(xpath="//*[@href='https://www.google.co.in/']")
	private WebElement NewTab_button;
	@FindBy(xpath="//*[text()='New Window']")
	private WebElement NewWindow;
	@FindBy(xpath="//*[text()='New Window Message']")
	private WebElement NewWindowmsg;
	
	
	public void clickonalertframebutton() {
		alertframebutton.click();
	}
	public void clickonbrowserwindowsbutton() {
		browserwindowsbutton.click();
	}
	public void clickonNewTab_button() {
		NewTab_button.click();
	
	}
	public void clickonNewWindow() {
		NewWindow.click();
		String parent=driver.getWindowHandle();
		System.out.println("parentwindow: "+parent);
		Set<String >allwindowid=driver.getWindowHandles();
		System.out.println("all window are ");
		for(String childwindow:allwindowid) {
			System.out.println("all window are: "+childwindow);
			if(!parent.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				driver.manage().window().maximize();
				driver.getCurrentUrl();
				System.out.println("get current url is  "+driver.getCurrentUrl());
				System.out.println("get title "+driver.getTitle());
				driver.get("https://www.youtube.com/");
				
			}
			
		}
		driver.switchTo().window(parent);
		
	}
	public void clickonNewWindowmsg() throws InterruptedException {
		NewWindowmsg.click();
		String parent=driver.getWindowHandle();
		System.out.println("parentwindow: "+parent);
		Set<String >allwindowid=driver.getWindowHandles();
		System.out.println("all window are ");
		for(String childwindow:allwindowid) {
			System.out.println("all window are: "+childwindow);
			if(!parent.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				System.out.println("child window "+childwindow);
				Thread.sleep(5000);
				driver.manage().window().maximize();
				driver.getCurrentUrl();
				System.out.println("get current url is  "+driver.getCurrentUrl());
				System.out.println("get title "+driver.getTitle());
				
							}
			
		}
		driver.switchTo().window(parent);
		
	}
	

}
