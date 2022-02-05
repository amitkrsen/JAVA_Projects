package test_1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjMod.google;

public class google_search {
	
	WebDriver driver;
	
	@BeforeClass
	public void setBrowser() {
		
		String currDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currDir+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	@Test(dataProvider = "Input")
	public void search_test(String srchTxt) {
		
		google gs = new google(driver);
		gs.setSearch(srchTxt);
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Number of Links: "+links.size());
//		for(int i = 1; i <= links.size(); i++)
//		{
//			System.out.println("Name of Link# "+ i + links.get(i).getText());
//		}
		
		for(WebElement link:links)
		{
			System.out.println(link.getText() +" - "+ link.getAttribute("href"));
		}
		
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.close();
		driver.quit();
	}
	
	@DataProvider(name = "Input")
	public Object [][] inputText() {
		
		return new Object[][] {{"Selenium"}};
		
	}
	
}
