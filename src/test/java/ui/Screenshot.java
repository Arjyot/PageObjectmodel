package ui;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot {
	
	public static WebDriver driver;
    @Test
	public void screenshots() throws IOException{
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\CucumberFramework\\SEL\\ChromeDriver.exe");
	      driver= new ChromeDriver();
	      driver.get("https://www.google.com/");
	      Screenshots();
	      
    }
	      public static void Screenshots() throws IOException {
	      
	      File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(screenshot, new File("C:\\Users\\arpit\\OneDrive\\Desktop\\New folder\\screenshot.png"));	      
	     

	}
}




