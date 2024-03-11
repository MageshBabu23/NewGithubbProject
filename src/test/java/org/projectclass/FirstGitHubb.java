package org.projectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstGitHubb {

	
		public static WebDriver driver; 
		@BeforeClass
		public static void Beforeclasss() {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
		}		
		@Test
		public void Flipkart() {
			
			WebElement search = driver.findElement(By.name("q"));
			search.sendKeys("mi mobile"); search.sendKeys(Keys.ENTER);
			
			List<WebElement> product = driver.findElements(By.className("_4rR01T"));
			System.out.println("Print all Product "+ product.size());
			
//			for(WebElement e : product) {
//				System.out.println(e.getText());
				
				
				List<WebElement> money = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
				System.out.println("Total Money"+ money.size());
				
				
				for (int i = 0; i <product.size(); i++) {
					System.out.println(product.get(i).getText()+"----------" + money.get(i).getText());
				} 
					
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

	}


