package com.stepdefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import junit.framework.Assert;
import org.junit.Assert;

public class LoginStepDefinition {
	
	WebDriver driver;
	
	@Given("^user is present on the first page of the website$")
	public void user_present_on_first_page () {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\eclipse-workspace\\FreeCrmBDDFramework\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
//	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\FreeCrmBDDFramework\\Drivers\\chromedriver.exe");
//	    driver = new ChromeDriver();
//	    System.setProperty("webdriver.edge.driver", "C:\\Users\\hp\\eclipse-workspace\\FreeCrmBDDFramework\\Drivers\\msedgedriver.exe");
//	    driver = new EdgeDriver();	
		driver.get("https://freecrm.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	
	@When("^title on the first page is Free CRM$")
	public void title_on_first_page () {
		String title=driver.getTitle();
		System.out.println(title);
		//Assert.assertEquals(Free CRM software for customer relationship management, sales, marketing campaigns and support., title);
		Assert.assertEquals("Free CRM software for customer relationship management, sales, marketing campaigns and support.", title);
	}
	
	@Then("^user clicks on login option$")
	public void user_clicks_on_login_option() {
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); // this will make wait time of 5 seconds for each element including preloader.
		
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		 if(driver.findElement(By.id("preloader")).isDisplayed())
		{    wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.id("preloader")));
		// wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("preloader")));
		}
		 driver.findElement(By.linkText("Login")).click();
	}
	
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_email_and_password(String email, String password) {
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);
	}
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
	    driver.findElement(By.cssSelector("div[class='ui fluid large blue submit button']")).click();
		
	}
	@Then("^user is on the home page$")
	public void user_is_on_the_home_page() {
		WebElement webE =driver.findElement(By.xpath("//span[text()='Bhupesh Gupta']"));
		String txt=webE.getText();
		    System.out.println(txt);
	    Assert.assertEquals("Bhupesh Gupta", txt);
	}
	
	@Then("^close the browser$")
	public void close_browser (){
		driver.quit();
	}

}
