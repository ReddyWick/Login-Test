package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.BaseClass;

public class BonusTestCase4 extends BaseClass {
	@Test
	public void testCase() {
		
		LoginPage lp = new LoginPage(driver);
		//email should be lower, "Test007@gmail.com".toLowerCase()
		lp.setEmail("Test007@gmail.com");
		lp.setPassword("testCase@11");
		lp.btnLogin();
		Assert.assertEquals(true, lp.errMsgVisible());
		System.out.println("Displayed error message:- "+lp.srrMsgString());
	}
}
