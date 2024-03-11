package org.projectclass;

import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

public static WebDriver driver; 
		
	
	@BeforeClass
	
	public static void Beforeclasss() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
	
	
	}
		
	@Test
	public void login() {
		
	WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("mi mobile"); search.sendKeys(Keys.ENTER);
		
		WebElement text = driver.findElement(By.xpath("//span[text()='Showing 1 – 24 of 750 results for \"']"));
		String NoOfProd = text.getText();
		if(NoOfProd.contains("750")) {
			System.out.println("750 results for \"mi mobile\"");
		}else {
			System.out.println("No such value");
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
