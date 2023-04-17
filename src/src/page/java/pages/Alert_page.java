package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Baselibrary.Baselibrary;

public class Alert_page extends Baselibrary {
	public  Alert_page() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//*[@data-target='#alerts']")
	private WebElement alertframe;
	@FindBy(xpath="//*[text()='alerts']")
	private WebElement AlertButton;
	@FindBy(xpath="//*[@onclick='myalert()']")
	private WebElement clickmealert;
	
	@FindBy(xpath="//*[@onclick='aftersec5()']")
	private WebElement clickmeafter5sec;
	
	@FindBy(xpath="//*[@onclick='myconfirm()']")
	private WebElement onclickmyconfirm;
	
	@FindBy(xpath="//*[@onclick='myprompt()']")
	private WebElement clickonmypromt;
	
	public void clickonalertframe() {
		alertframe.click();
	}
	public void clickonalertbutton() {
		AlertButton.click();
		
	}
	public void clickonclickmealert() {
		elementtobeclickable(clickmealert,5);
		clickmealert.click();
		driver.switchTo().alert().accept();
	}
	public void clickmeafter5sec() {
		
		clickmeafter5sec.click();
		Alert(5);//wait
	     driver.switchTo().alert().accept();
	}
	public void clickonmyconfirm(){
	
		onclickmyconfirm.click();
		Alert(5);
		driver.switchTo().alert().accept();
		
		
	}
	public void clickonmypromt() {
		clickonmypromt.click();
		driver.switchTo().alert().sendKeys("hemendra");
		driver.switchTo().alert().accept();
	}

}
