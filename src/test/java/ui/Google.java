package ui;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Google {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Java\\CucumberFramework\\SEL\\ChromeDriver.exe");
      WebDriver driver= new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
      driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      driver.get("https://www.google.com/");
      WebElement ele= driver.findElement(By.xpath("//*[@title='Search']"));
       ele.sendKeys("Covid 19");
       ele.sendKeys(Keys.ENTER);
       
       driver.findElement(By.xpath("//*[@class='hdtb-mitem']/a")).click();
       //String xpath1="//*[@class='dbsr']/a/div/div[2]/div[";
       //String xpath2="]";
       
       List<WebElement> count = driver.findElements(By.xpath("//*[@class='dbsr']/a/div/div[2]/div[1]"));
         int length=count.size();
         System.out.println(length);
         try {
         if(length>=3) {
         for(WebElement elements:count) {
         System.out.println(elements.getText()); 
         }
       
        }}
         catch(NoSuchElementException e){
        	 System.out.println("no Element found");
        	 
         }
         driver.quit();
         }
	
         } 
         
       
       
       

	


