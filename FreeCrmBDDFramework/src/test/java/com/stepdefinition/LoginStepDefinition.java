package com.stepdefinition;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

//import junit.framework.Assert;
import org.junit.Assert;

public class LoginStepDefinition {
	
	public static WebDriver driver;
	
	
	@Given("^user is present on the first page of the website$")
	public void user_present_n_first_page () {
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\eclipse-workspace\\FreeCrmBDDFramework\\Drivers\\geckodriver.exe");
//		driver = new FirefoxDriver();
//	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\FreeCrmBDDFramework\\Drivers\\chromedriver.exe");
//	    driver = new ChromeDriver();
//	    System.setProperty("webdriver.edge.driver", "C:\\Users\\hp\\eclipse-workspace\\FreeCrmBDDFramework\\Drivers\\msedgedriver.exe");
//	    driver = new EdgeDriver();	
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(options);
		
		driver.get("https://freecrm.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
		
	}
	
	@When("^title on the first page is Free CRM$")
	public void title_on_first_page () {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("#1 Free CRM Software Power Up your Entire Business Free Forever", title);
	}
	
	@Then("^user clicks on login option$")
	public void user_clicks_on_login_option() {	
		
//		WebDriverWait wait1 = new WebDriverWait(driver, 20);
//		 if(driver.findElement(By.id("preloader")).isDisplayed())
//		{    wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.id("preloader")));
//		// wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("preloader")));
//		}
		 driver.findElement(By.xpath("//span[text()='Log In']")).click();
	}
	
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_email_and_password(String email, String password) {
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);
	}
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
	    driver.findElement(By.xpath("//div[text()='Login']")).click();
	}
	@Then("^user is on the home page$")
	public void user_is_on_the_home_page() {
		WebElement webE =driver.findElement(By.xpath("//span[text()='Bhupesh Gupta']"));
		String txt=webE.getText();
		    System.out.println(txt);
	    Assert.assertEquals("Bhupesh Gupta", txt);
	}

	@Then("user is able to see invalid login message")
	public void user_is_able_to_see_invalid_login_message() {
	 String invalidMsg = driver.findElement(By.xpath("//p[text()='Invalid login']")).getText();
	 System.out.println(invalidMsg);
	  Assert.assertEquals("Invalid login", invalidMsg);
	}

//	@Then("^close the browser$")
//	public void close_browser (){
//		//driver.close();
//		driver.quit();
//	}
	
//	@Then("^dataTables test ")
//	public void dataTableTest (DataTables tables) {
//			List<List<String>> userDetails = tables.asLists(String.class);
//			
//			for (List<String> s : userDetails) {
//				System.out.println(s);
//			}
			
	@Given("user is on the create new contact page")
	public void user_is_on_the_create_new_contact_page() {
		
		Actions act = new Actions(driver);
		WebElement contacts = driver.findElement(By.xpath("//i[@class='users icon']"));
		act.moveToElement(contacts).perform();
		
	   driver.findElement(By.xpath("//span[text()='Contacts']/../../button")).click();
	   
	  // driver.switchTo().defaultContent();
	}

	@Then("user enters all the following details")
	public void user_enters_all_the_following_details(io.cucumber.datatable.DataTable dataTable) {
		
		List<List<String>> custDetails = dataTable.asLists(String.class);
				
		driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys(custDetails.get(0).get(0));
		driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys(custDetails.get(0).get(1));
		driver.findElement(By.cssSelector("input[name='middle_name']")).sendKeys(custDetails.get(0).get(2));
		
		driver.findElement(By.xpath("//div[@name='company']/input")).sendKeys(custDetails.get(0).get(3));
		driver.findElement(By.xpath("//div[@name='company']/input/../div/div")).click();
		
		driver.findElement(By.xpath("//label[text()='Tags']/../div/input")).sendKeys(custDetails.get(0).get(4));
		driver.findElement(By.xpath("//span[text()='Add ']")).click();
		
		driver.findElement(By.cssSelector("input[placeholder='Email address']")).sendKeys(custDetails.get(0).get(5));
		driver.findElement(By.cssSelector("input[placeholder='Personal email, Business, Alt...']")).sendKeys(custDetails.get(0).get(6));
		
		driver.findElement(By.xpath("(//div[@name='category'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='Lead']")).click();
		
		driver.findElement(By.xpath("(//div[@name='status'])[1]")).click();	
		driver.findElement(By.xpath("//span[text()='New']")).click();
		
		
		driver.findElement(By.cssSelector("textarea[name='description']")).sendKeys(custDetails.get(0).get(7));
		
		driver.findElement(By.cssSelector("div[name='timezone']")).click();
		try {
		
		driver.findElement(By.xpath("//span[text()='America/Aruba']")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		driver.findElement(By.cssSelector("div[name='country']")).click();
		driver.findElement(By.xpath("//span[text()='South Africa']")).click();
		
		driver.findElement(By.cssSelector("input[placeholder='Number']")).sendKeys(custDetails.get(0).get(8));
		
		driver.findElement(By.cssSelector("input[placeholder='Home, Work, Mobile...']")).sendKeys(custDetails.get(0).get(9));
		
		driver.findElement(By.xpath("//div[@name='referred_by']/input")).sendKeys(custDetails.get(0).get(10));
		driver.findElement(By.xpath("//span[text()='Add ']")).click();
		
		driver.findElement(By.xpath("(//div[@name='source'])[1]")).click();
		driver.findElement(By.xpath("//div[@name='source']//span[text()='Facebook']")).click();
		
		driver.findElement(By.xpath("//input[@name='do_not_call']/../label")).click();		
		driver.findElement(By.xpath("//input[@name='do_not_email']/../label")).click();
		
		driver.findElement(By.cssSelector("input[name='day']")).sendKeys(custDetails.get(0).get(11));
		driver.findElement(By.cssSelector("div[name='month']")).click();
		driver.findElement(By.xpath("//span[text()='September']")).click();
		driver.findElement(By.cssSelector("input[name='year']")).sendKeys(custDetails.get(0).get(12));
		
		driver.findElement(By.cssSelector("input[name='identifier']")).sendKeys(custDetails.get(0).get(13));
		
	}		
	
	@Then("user clicks on save button")
	public void click_on_save_button() {
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	}

}
