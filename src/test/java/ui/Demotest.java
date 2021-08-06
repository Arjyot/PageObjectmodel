package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Demotest {
	
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\CucumberFramework\\SEL\\ChromeDriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("lg washing machine");
			driver.findElement(By.id("nav-search-submit-button")).click();
			
			WebElement check=driver.findElement(By.xpath("//*[@id=\"p_89/LG\"]/span/a/div/label/i"));
			Boolean checked =check.isSelected();
               if(checked==false) {
            	   check.click();
            	    System.out.println("checked");
               }
               else {
            	   System.out.println("alrady checked");
              }
               
	           String xpath1="(//*[@class='a-size-medium a-color-base a-text-normal'])[";
	           String xpath2="]";
	           
	           List<WebElement> count= driver.findElements(By.xpath("//*[@class='a-size-medium a-color-base a-text-normal']"));
	             int length=count.size();
	             System.out.println(count);
	             driver.switchTo().frame("");
	             
	           
	           for(int i=1;i<length;i++) {
           String elements = driver.findElement(By.xpath(xpath1+i+xpath2)).getText();
	           System.out.println(elements); }
	           
		         List<WebElement> we=  driver.findElements(By.xpath("//iframe"));
		         System.out.println(we.size());
	}
   
}
