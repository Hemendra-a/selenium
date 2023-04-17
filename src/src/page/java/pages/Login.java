package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baselibrary.Baselibrary;

public class Login extends Baselibrary
{
	public Login() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[text()='×']")
	private WebElement closebutton;//incapsulation example
	@FindBy(xpath="//*[text()='Practice']")
	private WebElement practicebutton;
	@FindBy(xpath="//*[@class='btn btn-block p-0 text-left']")
	private WebElement elementsbutton;
	
	public void getVerifyTitle() {
		String title=driver.getTitle();
		System.out.println("title="+title);
	}

	public void clickonCloseButton() {
		closebutton.click();
	}
	public void clickonPractice() {
		practicebutton.click();
	}
	public void clickonElements() {
		elementsbutton.click();
	}
}
