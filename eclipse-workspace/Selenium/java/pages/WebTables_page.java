package pages;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Baselibrary.Baselibrary;

public class WebTables_page extends Baselibrary {
	public static String path="C:\\Users\\winni\\eclipse-workspace\\Selenium\\TestData\\ExcelData.xlsx";
	public WebTables_page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='btn btn-block p-0 text-left']")
	private WebElement elementsbutton;
	
	@FindBy(xpath="/html/body/div[2]/div/div[1]/div/div[1]/div[2]/div/div/a[4]")
	private  WebElement WebTablesbutton;
	
	@FindBy(xpath="//*[@id='tab_4']/div/iframe")
	private WebElement frame;
	
	@FindBy(xpath="/html/body/div/form/div[1]/input")
	private  WebElement Namebutton;
	
	@FindBy(xpath="//*[@name='email']")
	private  WebElement Emailbutton;
	
	@FindBy(xpath="/html/body/div/form/button")
	private  WebElement Savebutton;
	
	@FindBy(xpath="//*[text()='Edit']")///list 
	private  List<WebElement> EditButton;
	
	@FindBy(xpath="//*[@name='edit_name']")
	private  WebElement NameEditButton;
	
	@FindBy(xpath="//*[@name='edit_email']")
	private  WebElement EmailEditButton;
	
	@FindBy(xpath="//*[text()='Update']")
	private WebElement UpdateButton;
	
	//////------------matched data----------//
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[1]")
	private List<WebElement >List1;
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]")
	private List<WebElement >List2;
	
	//_________________________________________//
	
	
	public void clickonElements() {
		
		elementsbutton.click();
	}

	public void clickonWebTablesbutton() {
		WebTablesbutton.click();
	}
	

	
	
	//___________________BY Fills Details_______________//
	public void filldetails() {
		
		driver.switchTo().frame(frame);
		
		for(int i=1;i<=3;i++) {
			Namebutton.sendKeys(getReaddata(path,1,0,i));
			Emailbutton.sendKeys(getReaddata(path,1,1,i));
			Savebutton.click();
		}

		driver.switchTo().defaultContent();
	}
	
	//***************Edit Details********************//
	
	
	public void editdetails()  {
	
		driver.switchTo().frame(frame);
		int i=1;
		for(WebElement dd:EditButton) {
			dd.click();
			NameEditButton.clear();
			NameEditButton.sendKeys(getReaddata(path,2,0,i));
			EmailEditButton.clear();
			EmailEditButton.sendKeys(getReaddata(path,2,1,i));
			UpdateButton.click();
			i++;
		}
	}
     public void matched_Data() {
	int i=1;
	for(WebElement dd:List1) {
		assertEquals(getReaddata(path,2,0,i),dd.getText());
		System.out.println(dd.getText().equals(getReaddata(path,2,0,i)));
		
		i++;
		
	}
	int j=1;
	for(WebElement dd1:List2) {
		assertEquals(getReaddata(path,2,1,j),dd1.getText());
		System.out.println(dd1.getText().equals(getReaddata(path,2,1,j)));
		j++;
	}
}

}
