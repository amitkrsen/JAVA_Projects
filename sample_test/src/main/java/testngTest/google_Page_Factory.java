package testngTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class google_Page_Factory {

	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//input[@name='q']")
	WebElement search;

	@FindBy(how = How.XPATH, using = "//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/div/cite")
	WebElement result;

	public google_Page_Factory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void search() throws IOException {

		try {
			search.sendKeys("Selenium");
			search.sendKeys(Keys.ENTER);
		}
		catch (Exception e) {
			File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenShot, new File("D:\\SeleniumScreenshot\\output.jpeg"));
		}


	}

	public String result() {

		WebDriverWait wait = new WebDriverWait(driver, 2);
		wait.until(ExpectedConditions.elementToBeClickable(result));
		String actualText = result.getText();
		return actualText;
	}

}
