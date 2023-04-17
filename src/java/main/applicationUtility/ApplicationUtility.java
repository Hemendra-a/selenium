package applicationUtility;

import org.openqa.selenium.WebElement;

public interface ApplicationUtility {
	public void doubleclick(WebElement ele);
	public void rightclick(WebElement ele);
	public void fileupload(String path);
	public void selectbyvalue(WebElement ele,String value);
	public void multiselect(WebElement ele);
    public void mousehower(WebElement ele);
    public void mousehower_click(WebElement ele,String target);
}
