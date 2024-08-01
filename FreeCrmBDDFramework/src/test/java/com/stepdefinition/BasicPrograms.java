package com.stepdefinition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicPrograms {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://onecompiler.com/java/42m7zyd3z");
		
		//Dimension dem = new Dimension(600, 700);
		//driver.manage().window().setSize(dem);
		
		System.out.println(driver.manage().window().getSize());

		
		
	}

}
