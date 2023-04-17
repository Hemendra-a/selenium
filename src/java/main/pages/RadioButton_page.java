package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baselibrary.Baselibrary;

public class RadioButton_page extends Baselibrary  {
	public RadioButton_page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@class='btn btn-block p-0 text-left']")
	private WebElement elementsbutton;
	
	@FindBy(xpath="//*[@href='#tab_3']")
	private WebElement RadioButton;
	@FindBy(xpath="//*[@id='yes']")
	private WebElement YesButton;
	
	@FindBy(xpath="//*[@id='impressive']")
	private WebElement ImpressiveButton;
	
	@FindBy(xpath="//*[@id='no']")
	private WebElement NoButton;
	
	public void clickonElements() {
		elementsbutton.click();
	}
	public void clickonRadioButton() {
		RadioButton.click();
	}
	public void clickonYesButton() {
		
		YesButton.click();
	
	}
	public void clickonImpressiveButton() {

		ImpressiveButton.click();

	}
	public void clickonNoButton() {

		NoButton.click();

	}
	

}
