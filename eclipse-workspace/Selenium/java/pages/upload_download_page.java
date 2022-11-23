package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baselibrary.Baselibrary;

public class upload_download_page extends Baselibrary {
	String path="C:\\Users\\winni\\Downloads\\Microsoft.SkypeApp_kzf8qxf38zg5c!App - Copy\\All\\java";
	public upload_download_page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@class='btn btn-block p-0 text-left']")
	private WebElement elementsbutton;
	@FindBy(xpath="//*[text()='upload and download']")
	private WebElement uploadanddownload;
	@FindBy(xpath="//*[text()='Select a file']")
	private WebElement choosefile;
//	@FindBy(xpath="//*[@class='btn btn-primary my-3']")
//	private WebElement downloadfile;
	
	public void clickonElements() {
		elementsbutton.click();
	}
	public void clickonuploadanddownload() {
		uploadanddownload.click();
	}
	
	public void clickonchoosefile() {
		choosefile.click();
	
		fileupload(path);
	}
	

}
