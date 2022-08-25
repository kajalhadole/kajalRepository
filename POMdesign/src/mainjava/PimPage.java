/**
 * 
 */
package mainjava;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class PimPage extends BaseTest {

	@FindBy(xpath="//h6[text()='PIM']") WebElement txtpage;
	@FindBy(xpath="//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']") List<WebElement> CheckAllcheckbox;
	
	public PimPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	public String titleOfPimPage() {
		return txtpage.getText();
	}
	
	public boolean verifyCheckBoxisSelected() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return CheckAllcheckbox.get(0).isSelected();
		}
	public void verifyIdCheckBox() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    CheckAllcheckbox.get(0).click();
	}
	
}
