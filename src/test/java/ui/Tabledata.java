package ui;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.Arrays;
import java.util.List;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import com.opencsv.CSVReader;

public class Tabledata {

	public static void main(String[] args) throws FileNotFoundException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Java\\CucumberFramework\\SEL\\ChromeDriver.exe");
//        WebDriver driver= new ChromeDriver();
//        WebDriverWait wait= new WebDriverWait(driver,20);
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.get("https://www.w3schools.com/html/html_tables.asp");
//        //driver.findElement(By.className("ws-btn")).click();  
//        //driver.switchTo().frame("iframeResultSQL");
        //js.executeScript("document.querySelector('#divResultSQL > div > table > tbody > tr:nth-child(4) > td:nth-child(4)')");
//        WebElement ele= driver.findElement(By.xpath("//*[@class='w3-example']//tbody/tr[6]/td[3]"));
//        wait.until(ExpectedConditions.visibilityOf(ele));
//	    String ne= ele.getText();
//	    System.out.println(ne);
	    try {
	    	//File fl= new File();
	    	
	    FileInputStream fis= new FileInputStream("C:\\Users\\arpit\\OneDrive\\Desktop\\Arpit.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb= new XSSFWorkbook(fis);
	    XSSFSheet sh =wb.getSheetAt(0);
	          String name = sh.getSheetName();
	    System.out.println(name);}
	    catch(IOException e) {
	    System.out.println("Ex");
	    }
	    	
	  CSVReader reader = new CSVReader(new FileReader("C:\\Users\\arpit\\OneDrive\\Desktop\\arpit.txt"));
	       
	  try {
		List<String[]> data=reader.readAll();
		System.out.println(data.size());
		
		for(String da[] : data) {
		
				System.out.println(Arrays.toString(da));
				
		}
		
		
			} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  
	 // DriverManager.registerDriver(new com.my);
	    

	    }

	}


