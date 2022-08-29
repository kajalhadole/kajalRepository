/**
 * 
 */
package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import main.BaseClass;

public class LoginTest extends BaseTest {

	
	@Test
	public void verifylogin() {
		loginpage.LoginMethod();
		Assert.assertEquals(pimpage.titlePimpage(), "PIM");
	}
}
