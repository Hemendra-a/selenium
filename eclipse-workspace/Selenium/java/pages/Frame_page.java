package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baselibrary.Baselibrary;

public class Frame_page extends Baselibrary {
	public Frame_page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id='headingOne']/h2/button")
	private WebElement alertframebutton;
	
	@FindBy(xpath="//*[@href='#tab_13']")
	private WebElement clickonframe;
	
	@FindBy(xpath="//*[@id='tab_13']/iframe[1]")
	private WebElement frame;
	@FindBy(xpath="/html/body/h1")
	private WebElement gettext;
	@FindBy(xpath="//*[@id=\"tab_13\"]/iframe[2]")
	private WebElement frame2;
	@FindBy(xpath="/html/body/h1")
	private WebElement gettext2;
	
	public void clickonframe() {
		clickonframe.click();
	}
	public void clickonalertframebutton() {
		alertframebutton.click();
	}
	public void enterinparentframe1() {
		driver.switchTo().frame(frame);
		String text=gettext.getText();
		System.out.println( "Text "+text);
		driver.switchTo().defaultContent();
	}
	public void enterinchildframe2() {
		driver.switchTo().frame(frame2);
		String text2=gettext2.getText();
		System.out.println( "Text2 "+text2);
		driver.switchTo().defaultContent();
	}

}
