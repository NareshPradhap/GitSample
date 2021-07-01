package taskParaBank;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskBase {
	
	public static WebDriver driver;
	
	public static void getDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\taskParaBank\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	public static void launchURL(String url) {
		driver.get(url);

	}
	public static void insertType(WebElement ele, String value) {
		ele.sendKeys(value);
		
	}
	public static void maxWindow() {
		driver.manage().window().maximize();

	}
	public static void click(WebElement ele) {
		ele.click();
		
	}
	
	public static String getTitle() {
		return driver.getTitle();

	}
	
	public static String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public static String getAttribute(WebElement ele, String s) {
		return ele.getAttribute(s);
		

	}
	
	public static void closeBrowser() {
		driver.close();

	}
	
	public static void quitBrowser() {
		driver.quit();
	

	}
	
	public static void waitTime(long millisecond) throws InterruptedException{
		
		Thread.sleep(millisecond);
	}
	
	public static String getData(int row, int cell) throws IOException {
		File loc = new File("D:\\New folder\\taskParaBank\\lib\\TestData.xlsx");
		
		FileInputStream fi = new FileInputStream(loc);
		Workbook w= new XSSFWorkbook(fi);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		int cellType = c.getCellType();
		String value = null;
		if (cellType==1) {
			value = c.getStringCellValue();
			} else if (cellType==0) {
				if (DateUtil.isCellDateFormatted(c)) {
					Date dateCellValue = c.getDateCellValue();
					SimpleDateFormat sim = new SimpleDateFormat("MM//dd/yyy");
					 value = sim.format(dateCellValue);
								
				}else {
					double numericCellValue = c.getNumericCellValue();
					long l = (long) numericCellValue;
					value = String.valueOf(l);
				}
				
			}
		return value;
		
		}
	public static void getValueExcel(int row, int cell, String text) throws IOException {
		File f = new File("D:\\New folder\\taskParaBank\\lib\\TestData2.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("Data");
		Row r = s.createRow(row);
		Cell c = r.createCell(cell);
		c.setCellValue(text);
		System.out.println("write text:"+ c);
		FileOutputStream fo = new FileOutputStream(f);
		w.write(fo);
		System.out.println("done");
		
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
