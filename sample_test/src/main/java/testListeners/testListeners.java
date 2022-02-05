package testListeners;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testListeners {

	WebDriver driver;

	@Test
	public void a_test_passed() throws Exception {
			
			WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
			searchBox.sendKeys("Selenium");
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(searchBox));
	}
	
	
	@Test
	public void a_test_failed() throws Exception {
		
		try {
			
			WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
			searchBox.clear();
			searchBox.sendKeys("Selenium");
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(searchBox));
		}
		catch(Exception e) {
			
			File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("D:\\SeleniumScreenshot\\output.jpeg"));
		}
		
	}

	@BeforeClass
	public void beforeClass() {
		
		String currDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currDir+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@AfterClass
	public void afterClass() {
		
		driver.quit();	
	}

}
