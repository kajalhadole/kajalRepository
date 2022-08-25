
package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainjava.LeavePage;
import mainjava.LoginPage;
import mainjava.PimPage;

public class BaseTest {

	 public static WebDriver driver;
	 protected LoginPage loginpage;
	 protected PimPage pimpage;
	 protected LeavePage leavepage;
	 
	 @BeforeClass
	 public void launchBrowser() {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().getPageLoadTimeout();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 }
	 
	 @BeforeClass
	 public void pageObjects() {
		 loginpage = new LoginPage(driver);
		 pimpage = new PimPage(driver);
		 leavepage = new LeavePage(driver);
	 }
	 
	 @AfterClass
	 public void tearDownEnviornment() {
	 driver.quit();
	 }
}
