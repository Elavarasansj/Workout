package org.global;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass2 
{
	public static WebDriver driver;
    public static JavascriptExecutor javascriptExecutor;
    public static Actions actions;
    
    public void getDriver()
	{
		WebDriverManager.chromedriver().driverVersion("129.0.6668.70").setup();
		driver = new ChromeDriver();
	}
	public void getUrl(String url)
	{
		driver.get(url);
	}
	
	public void winMax()
	{
		driver.manage().window().maximize();
	}
	
	public void sendKeysByJS(WebElement element, String keysToSend)
	{
		javascriptExecutor = (JavascriptExecutor) driver;
		javascriptExecutor.executeScript("arguments[0].setAttribute('value','" + keysToSend + "')", element);

	}

	public void handelingAlert()
	{
	
		Alert a = driver.switchTo().alert();
		a.accept();
	}

    public static  void clearAndSetValueByJS(WebElement element, String value) 
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='';", element); // Clear the field
        js.executeScript("arguments[0].value='" + value + "';", element); // Set the value
    }

    public  void clickByJS(WebElement element) 
    {
        javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].click()", element);
    }
	
	public void TakeScreenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sc = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\selav\\Documents\\workspace-spring-tool-suite-4-4.21.0.RELEASE\\NewFrameworkProject\\Image\\"
						+ System.currentTimeMillis() + ".png");
		FileUtils.copyFile(sc, destination);
	}
	
	  public void PageText(String xpath) 
	  {
	        WebElement element = driver.findElement(By.xpath(xpath));
	        String text = element.getText();
	        System.out.println(text);
	  }
	
	  public void selectByIndex(WebElement element, int index)
	  {
	        Select dropdown = new Select(element);
	        dropdown.selectByIndex(index);
	   }
	  
	  
	  public void clickByActions(WebElement element)
	  {
		  Actions a = new Actions(driver);
		  a.click(element).perform();
	  }
	  
	  public void scrollDownByJS(WebElement element)
	  {
		  javascriptExecutor = (JavascriptExecutor) driver;
		  javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", element);

	  }
	 
	  public String getProperty(String key) throws IOException {

			// To Locater Where the Properties will be located
			File propertyfile = new File("DataBase\\config.properties");

			// Used to Read FileData from File Class Path
			FileReader fileReader = new FileReader(propertyfile); // throws FileNotFoundException

			// To Define Property
			Properties properties = new Properties();

			// To Load Property files to Property Class
			properties.load(fileReader); // throws IOException

			// To get Value from Property file using respective key
			String property = properties.getProperty(key);

			return property;

		}
	  
	public String readExcel(int rownum, int cellnum) throws IOException
	{
	
		File file = new File("C:\\ElavarasanSJ\\FrameWork\\LoginData.xlsx");

		FileInputStream fileInputStream = new FileInputStream(file); 

		Workbook book = new XSSFWorkbook(fileInputStream); 
		
		Sheet sheet = book.getSheet("Login");

		Row row = sheet.getRow(rownum);

		Cell cell = row.getCell(cellnum);

		CellType cellType = cell.getCellType();

		String value = null;

		switch (cellType) {
		case STRING:

			value = cell.getStringCellValue();

			break;

		case NUMERIC:

			if (DateUtil.isCellDateFormatted(cell)) {

				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
				value = simpleDateFormat.format(dateCellValue);

			} else {

				double numericCellValue = cell.getNumericCellValue();
				BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
				value = valueOf.toString();

			}

			break;

		default:
			
			break;
		}
		return value;

	}

}
