/**
 * 
 */
package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import main.BaseClass;
import main.LoginPage;
import main.PimPage;

public class BaseTest extends BaseClass {
	
	@BeforeClass 
	public void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
     
	@BeforeClass
	public void PageObjects() {
		loginpage=new LoginPage(driver);
		pimpage = new PimPage(driver);
		}

	@AfterClass
   public void teardowmEnvi() {
	   driver.quit();
   }
}
