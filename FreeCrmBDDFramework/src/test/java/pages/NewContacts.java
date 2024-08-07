package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewContacts {
	
	@FindBy (css = "input[name='first_name']")
	WebElement firstName;
	
	

}
