package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baselibrary.Baselibrary;

public class TextBox_page extends Baselibrary {
	public static String path="C:\\Users\\winni\\eclipse-workspace\\Selenium\\TestData\\ExcelData.xlsx";
	
	public TextBox_page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='btn btn-block p-0 text-left']")
	private WebElement elementsbutton;
	
	@FindBy(xpath="//*[@href='#tab_1']")
	private WebElement TexBoxButton;
	
	
	@FindBy(xpath="//*[@id='fullname1']")
	private WebElement fullname1;
	
	@FindBy(xpath="//*[@id='fullemail1']")
	private WebElement fullemail1;
	
	@FindBy(xpath="//*[@id='fulladdresh1']")
	private WebElement fulladdresh1;
	
	@FindBy(xpath="//*[@id='paddresh1']")
	private WebElement Paddresh1;
	
	@FindBy(xpath="//*[@id=\"tab_1\"]/div/div[1]/form/input[3]")
	private WebElement clickonSubmitButton;

	
	public void clickonElements() {
		elementsbutton.click();
	}
	public void clickonTexBoxButton() {
		TexBoxButton.click();
	}
	public void sendTextFullName() {
		fullname1.sendKeys(getReaddata(path,0,0,1));;
	}
	public void sendTextfullemail1() {
		fullemail1.sendKeys(getReaddata(path,0,1,1));;
	}
	
	public void sendTextfulladdresh1() {
		fulladdresh1.sendKeys(getReaddata(path,0,2,1));;
	}
	
	public void sendTextPaddresh1() {
		Paddresh1.sendKeys(getReaddata(path,0,3,1));;
	}
	
	public void clickonSubmitButton() {
		clickonSubmitButton.click();
	}

	

}
