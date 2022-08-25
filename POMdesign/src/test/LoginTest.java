/**
 * 
 */
package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

	@Test
	public void verifylogin() {
		loginpage.loginMethod();
			Assert.assertEquals(pimpage.titleOfPimPage(),"PIM");
		}
	}

