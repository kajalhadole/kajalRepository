/**
 * 
 */
package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	
	//locators
	
	@FindBy(xpath="//*[@name='username']") WebElement userName;
	@FindBy(xpath="//*[@name='password']") WebElement passWord;
	@FindBy(xpath="//*[text()=' Login ']") WebElement btnlogin;



    //initialization
   public LoginPage(WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   
   public void LoginMethod() {
	   userName.sendKeys("Admin");
	   passWord.sendKeys("admin123");
	   btnlogin.click();
   }
   
}