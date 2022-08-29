/**
 * 
 */
package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimPage extends BaseClass {

	
	//locators
	@FindBy(xpath="//h6[text()='PIM']")WebElement pimtxt;


  //initialization
	public PimPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public String titlePimpage() {
		return pimtxt.getText();
	}

}
