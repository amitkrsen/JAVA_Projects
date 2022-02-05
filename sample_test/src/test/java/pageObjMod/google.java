package pageObjMod;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class google {
	
	WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//input[@name='q']")
	WebElement search;
	
	public google (WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(ldriver, this);
		
	}
	
	public void setSearch(String searchTxt) {
		
		search.sendKeys(searchTxt);
		search.sendKeys(Keys.ENTER);
				
	}

}
