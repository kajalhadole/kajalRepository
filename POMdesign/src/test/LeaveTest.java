/**
 * 
 */
package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LeaveTest extends BaseTest{

	@BeforeMethod
	public void login() {
		loginpage.loginMethod();
	}
	
	@Test 
	public void verifyleavepage() {
		
		Assert.assertEquals(leavepage.titleOfLeavePage(), "Leave");
	}
}
