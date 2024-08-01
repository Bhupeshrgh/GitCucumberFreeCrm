package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSearch {
	
	public static WebDriver driver;

	public static String launch(String url, String lap) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("start-maximized");
		 driver = new ChromeDriver(options);
		
		driver.get(url);
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement st = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		st.sendKeys(lap);
		
		WebElement search = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		search.click();
		
		
		WebElement hpPrice = driver.findElement(By.xpath("(//span[contains(text(),'HP')])[2]/../../../../div[3]/div/div/div/div/div/a/span/span/span[@class='a-price-whole']"));
				
		String price = hpPrice.getText();
		System.out.println(price);
		
		return price;
		
	}
		public static void main(String[] args) {
			
			
			String laptopPrice = AmazonSearch.launch("https://www.amazon.in/" , "laptops" );
			
			System.out.println(laptopPrice);
		}

	}


