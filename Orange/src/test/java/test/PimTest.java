/**
 * 
 */
package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import main.BaseClass;

public class PimTest extends BaseTest{


	@Test
	public void verifyPimPage() {
		Assert.assertEquals(pimpage.titlePimpage(), "PIM");
		
	}
}
