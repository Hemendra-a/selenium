package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Baselibrary.Baselibrary;

public class SelectMenu_page extends Baselibrary {

	public SelectMenu_page () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@data-target='#widget']")
	private WebElement widget;
	
	@FindBy(xpath="//*[@href='#tab_24']")
	private WebElement selectmenu;
	
	@FindBy(xpath="//*[@id=\"tab_24\"]/form/div/div[1]/select")
	private WebElement selectbyvalue;
	
	@FindBy(xpath="//*[@id='tab_24']/form/div/div[2]/select")
	private WebElement selectbyone;
	
	@FindBy(xpath="//*[@id='tab_24']/form/div/div[5]/div/select")
	private WebElement multiselect;
	public void clickonwidget() {
		widget.click();
	}
	public void clickonselectmenu() {
		selectmenu.click();
	}
	public void clickonselectbyvalue() {
		selectbyvalue(selectbyvalue,"Group 1, Option 1");
		selectbyvalue(selectbyvalue,"Group 1, Option 2");
		selectbyvalue(selectbyvalue,"Group 2, Option 1");
		selectbyvalue(selectbyvalue,"Group 2, Option 2");
	
	}
	public void clickonselectbyone() {
		selectbyvalue(selectbyone,"HTML");
		selectbyvalue(selectbyone,"CSS");
		selectbyvalue(selectbyone,"PHP");
		selectbyvalue(selectbyone,"Bootstrap");
		selectbyvalue(selectbyone,"Java");
		selectbyvalue(selectbyone,"HTTPS");
		
	}
	public void clickonmultiselect() {
	
		selectbyvalue(multiselect,"HTML");
		selectbyvalue(multiselect,"CSS");
		selectbyvalue(multiselect,"PHP");
		selectbyvalue(multiselect,"javascript");
	   
	
	}
	public void clickonmultiselectrobotclass() {
	    multiselect.click();

	    multiselect(multiselect);
	
	}
}
