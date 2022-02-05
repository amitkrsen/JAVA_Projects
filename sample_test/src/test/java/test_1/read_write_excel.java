package test_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class read_write_excel {
	
		WebDriver driver;
		
		XSSFWorkbook workbook;
		XSSFSheet sheet;
		XSSFCell cell;
		
		String currDir = System.getProperty("user.dir");
		
		@FindBy(how = How.XPATH, using = "//input[@name='email']")
		WebElement emailId;
		
		@FindBy(how = How.XPATH, using = "//input[@name='password']")
		WebElement pass;
		
		public read_write_excel(WebDriver ldriver) {
			
			this.driver = ldriver;
			PageFactory.initElements(ldriver, this);
		}
		
		public void data_drivern() throws IOException {
			
			File src = new File(currDir+"\\datafiles\\credentials.xlsx");
			FileInputStream fis = new FileInputStream(src);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheetAt(0);
			
			for(int i = 1; i <= sheet.getLastRowNum(); i++)
			{
				cell = sheet.getRow(i).getCell(0);
				cell.setCellType(CellType.STRING);
				emailId.sendKeys(cell.getStringCellValue());
				
				cell = sheet.getRow(i).getCell(1);
				cell.setCellType(CellType.STRING);
				pass.sendKeys(cell.getStringCellValue());
				
				FileOutputStream fos = new FileOutputStream(src);
				String msg = "Passed";
				sheet.getRow(i).createCell(2).setCellValue(msg);
				workbook.write(fos);
			}
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
