package ui;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



class Testweb {

	
		// TODO Auto-generated method stub
		public static WebDriver driver;
		public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\CucumberFramework\\SEL\\ChromeDriver.exe");
			
			driver= new ChromeDriver();
			//WebDriverWait wait = new WebDriverWait(driver, 20);
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
			//driver.get(" https://firsthandle.test-app.link/y5RklQyhvhb");
			
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
		    	robot.mouseMove(292,128);
		    	Thread.sleep(2000);
		    	robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		    	Thread.sleep(2000);
		    	robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		    	Thread.sleep(4000);
		    	robot.keyPress(KeyEvent.VK_DOWN);
		    	Thread.sleep(4000);
		    	robot.keyPress(KeyEvent.VK_DOWN);
		    	Thread.sleep(4000);
		    	robot.keyPress(KeyEvent.VK_DOWN);
		    	Thread.sleep(4000);
		    	robot.keyPress(KeyEvent.VK_DOWN);
		    	Thread.sleep(4000);
		    	robot.keyPress(KeyEvent.VK_DOWN);
		    	Thread.sleep(4000);
		    	robot.keyPress(KeyEvent.VK_DOWN);
		    	Thread.sleep(4000);
		    	robot.keyPress(KeyEvent.VK_DOWN);
		    	Thread.sleep(4000);
		    	robot.keyPress(KeyEvent.VK_DOWN);
		    	Thread.sleep(4000);
		    	robot.keyPress(KeyEvent.VK_ENTER);
		    
			} catch (AWTException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			System.out.println("Manage to homebar");
			
			driver.get("https://firsthandle.test-app.link/y5RklQyhvhb");
			driver.navigate().refresh();
			System.out.println("Manage to homebar"); //div[@class='footer']//input
			
			
			driver.findElement(By.xpath("//div[@class='footer']//input")).click();
			//driver.findElement(By.xpath("//input[@type='range' and @id='mySlider']")).click();
			//driver.findElement(By.xpath("//*[@class='timer']//following::button[2]")).click();
			System.out.println("we need a webelemet");
			WebElement web= driver.findElement(By.xpath("//div[@class='body-wrapper']//following::button//label[text()='Text me my offer!']"));
			web.click();
			//System.out.println("After perform the click element");
			//Actions action= new Actions(driver); 
			System.out.println("After perform the action");
			//action.click(web).perform();
			//System.out.println("After perfrom");
	}

}
