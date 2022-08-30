
package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainjava.BaseClass;
import mainjava.LoginPage;

public class BaseTest extends BaseClass {
   @BeforeClass
	public void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_6b31gegj9g_e&adgrpid=60612964962&hvpone=&hvptwo=&hvadid=486380734071&hvpos=&hvnetw=g&hvrand=9622776717531216084&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9299869&hvtargid=kwd-49491430&hydadcr=14454_2154375&gclid=CjwKCAjw6raYBhB7EiwABge5Knzl1FAGPMVenkqWD_5KwqE7amErkkMIfi3Ta2xhjK3KuBcAnX2yGBoC7SUQAvD_BwE");
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@BeforeClass
	public void pageobj() {
		loginpage = new LoginPage(driver);
	}
	
	@AfterTest
	public void teardownEnvi() {
		driver.quit();
	}
}
