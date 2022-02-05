package testngTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class captureScreenShot {

	WebDriver driver;
	google_Page_Factory gpf;

	@Test
	public void failed_test_capture() throws Exception {
			
			gpf.search();
			System.out.println(gpf.result());
			List <WebElement> link = driver.findElements(By.tagName("a"));
			System.out.println("Total number of links are: "+link.size());
			String expectedLinkText = "https://www.selenium.dev";
			AssertJUnit.assertEquals(expectedLinkText, gpf.result());
	
	}

		@BeforeClass
		public void beforeClass() {

			gpf = new google_Page_Factory(driver);

		}

		@BeforeSuite
		public void beforeSuite() {

			String currDir = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", currDir+"\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		}

		@AfterSuite
		public void afterSuite() {
			driver.quit();
		}

	}
	
	
