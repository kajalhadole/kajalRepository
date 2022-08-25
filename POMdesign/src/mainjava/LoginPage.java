/**
 * 
 */
package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class LoginPage extends BaseTest {

	// All the locators of page
	@FindBy(xpath="//*[@name='username']")
	WebElement userName;
	
	@FindBy(xpath="//*[@name='password']")      // sequence of locators doesn't matter in execution
	WebElement passWord;
	
	@FindBy(xpath="//*[text()=' Login ']")
	WebElement btnlogin;
	
	//Initialization (constructor)of locators/variables
	public LoginPage(WebDriver driver) {                //constructor with local parameters
		this.driver=driver;                             // matching global driver(from BaseTest) and local driver
		PageFactory.initElements(driver, this);         //this method initializing element in sequential manner
	}                                                   // start executing with local driver = global driver
	
	//Methods required to perform test steps
	public void loginMethod() {
		userName.sendKeys("Admin");
		passWord.sendKeys("admin123");
		btnlogin.click();
		
	}
}
