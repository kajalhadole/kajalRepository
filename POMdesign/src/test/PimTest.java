
package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PimTest extends BaseTest {
  @BeforeMethod
  public void login() {
	  loginpage.loginMethod();
	  
  }
@Test
public void verifyPimPage() {
	Assert.assertEquals(pimpage.titleOfPimPage(),"PIM");
}
public void verifycheckboxisSelected() throws InterruptedException  {
	pimpage.verifyIdCheckBox();
	Assert.assertEquals(pimpage.verifyCheckBoxisSelected(), true);
	
}
	
	
}
