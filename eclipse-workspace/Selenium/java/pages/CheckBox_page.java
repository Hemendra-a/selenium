package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baselibrary.Baselibrary;

public class CheckBox_page extends Baselibrary{
	public CheckBox_page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@class='btn btn-block p-0 text-left']")
	private WebElement elementsbutton;
	@FindBy(xpath="//*[text()='check box'] ")
	private WebElement CheckBoxButton;
	@FindBy(xpath="//*[@id='myCheck']")
	private WebElement mobileCheckBoxButton;
	@FindBy(xpath="//*[@id=\'tab_2\']/div/iframe")
	private WebElement frame;
	@FindBy(xpath="//*[@id='mylaptop']")
	private WebElement LaptopCheckBoxButton ;
	@FindBy(xpath="//*[@id='mydesktop']")
	private WebElement DesktopCheckBoxButton ;
	
	@FindBy(xpath="//*[@id='text']")
	private  WebElement mobileText;
	
	@FindBy(xpath="//*[@id='text1']")
	private  WebElement laptopText;
	
	@FindBy(xpath="//*[@id='text2']")
	private  WebElement desktopText;
	
	public void clickonElements() {
		elementsbutton.click();
	}
	public void clickonCheckBox() {
		CheckBoxButton.click();
	}
	public void mobileCheckBoxButton() {
		driver.switchTo().frame(frame);
		mobileCheckBoxButton.click();
		String Text=mobileText.getText();
		assertEquals(Text, "You are selected Mobile");
		System.out.println("Text: "+Text);
		System.out.println(Text.equals("You are selected Mobile"));
		driver.switchTo().defaultContent();
	}
	public void LaptopCheckBoxButton() {
		driver.switchTo().frame(frame);
		LaptopCheckBoxButton.click();
		String Text=laptopText.getText();
		assertEquals(Text, "You are Selected Laptop");
		System.out.println("Text: "+Text);
		System.out.println(Text.equals("You are Selected Laptop"));
		driver.switchTo().defaultContent();
	}
	public void DesktopCheckBoxButton() {
		driver.switchTo().frame(frame);
		DesktopCheckBoxButton.click();
		String Text=desktopText.getText();
		assertEquals(Text, "You are Selected Desktop");//assertion/Hard
		System.out.println("Text: "+Text);
		System.out.println(Text.equals("You are Selected Desktop"));
	
		driver.switchTo().defaultContent();
	}
}
