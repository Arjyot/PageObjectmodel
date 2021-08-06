package ui;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Listeners;







@Listeners(ui.TestNGListener.class)
public class Pratice {

	public static WebDriver driver;
	    
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\CucumberFramework\\SEL\\ChromeDriver.exe");
		
		
		
		driver= new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get(" https://firsthandle.test-app.link/y5RklQyhvhb");
		//WebElement element=driver.findElement(By.name("login"));
		//String s=element.getText();
		//Assert.assertEquals(s, "Arpit");
		 //Actions action = new Actions(driver);
		 // action.click();
		
		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_F12);//click on F12 button 
	    	robot.keyRelease(KeyEvent.VK_F12);//release F12 button
	    	
	    	robot.keyPress(KeyEvent.VK_CONTROL);
	    	Thread.sleep(2000);
	    	robot.keyPress(KeyEvent.VK_SHIFT);
	    	Thread.sleep(2000);
	    	robot.keyPress(KeyEvent.VK_M);
	    	Thread.sleep(2000);
	    	robot.keyRelease(KeyEvent.VK_M);
	    	Thread.sleep(2000);
	    	robot.keyRelease(KeyEvent.VK_SHIFT);
	    	Thread.sleep(2000);
	    	robot.keyRelease(KeyEvent.VK_CONTROL);
	    	Thread.sleep(2000);
		} catch (AWTException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.findElement(By.xpath("//input[@type='range' and @id='mySlider']")).click();
		
		//WebView myWebView = (WebView) findViewById(R.id.);
		//WebSettings webSettings = myWebView.getSettings();
		//ChromeOptions options= new ChromeOptions();
		//options.addArguments("");
		try {driver.findElement(By.xpath("//*[@class='timer']//following::button[2]")).click();}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//js.executeScript("document.querySelector('#root > div:nth-child(2) > div.root-body > section > section > div.container > div.body-wrapper > div.body > div:nth-child(2) > div.contact-field-component > div.contact-field-title-wrapper > button.jss102.jss135.jss137.jss139.jss140.jss142.null').click();");
		
		//Robot rb= new Robot();
		//rb.delay(10);
		driver.quit();
	 		
	}
}


