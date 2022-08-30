
package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{

	
	//locators
	@FindBy(xpath="//*[@id='nav-link-accountList-nav-line-1']") WebElement signinclick;
	@FindBy(xpath="//*[@id='ap_email']") WebElement email;
	@FindBy(xpath="//*[@id='continue']//parent::span//input") WebElement btncontinue;
	
	//initialization
	public LoginPage (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	//methods
	public void checkurlofpage() {
		driver.getCurrentUrl();
	}
	public String titleofpage() {
		return email.getText();
	}
	public void signinMethod() {
		signinclick.click();
        email.sendKeys("kajalhadole@gmail.com");
        btncontinue.click();
		
	}
}
