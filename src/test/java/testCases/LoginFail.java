package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.BaseClass;

public class LoginFail extends BaseClass {
	@Test
	public void testCase() {
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail("test007@gmail.com");
		lp.setPassword("ljnl11");
		lp.btnLogin();
		Assert.assertEquals(true, lp.errMsgVisible());
		System.out.println("Displayed error message:- "+lp.srrMsgString());
	}
}
