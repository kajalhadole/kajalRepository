/**
 * 
 */
package mainjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class LeavePage extends BaseTest {

	//locator
	@FindBy(xpath="//*[text()='Leave']") WebElement leavetxt;
	
	//initialization
	public LeavePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver ,this);
	}
		
		
    //methods 
 		public String titleOfLeavePage() {
 			leavetxt.click();
 			driver.manage().timeouts().implicitlyWait(20 ,TimeUnit.SECONDS);
			return leavetxt.getText();
		}
	
}
