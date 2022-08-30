
package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test
	
	
	public void verifyloginpage() {
		loginpage.signinMethod();
		//Assert.assertEquals(false, false);
	}
}
