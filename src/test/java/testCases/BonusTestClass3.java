package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.BaseClass;

public class BonusTestClass3 extends BaseClass {
	@Test
	public void testCase() {
		
		LoginPage lp = new LoginPage(driver);
		//password field is empty
		lp.setEmail("");
		lp.setPassword("dssrtfgh");
		lp.btnLogin();
		Assert.assertEquals(true, lp.errMsgVisible());
		System.out.println("Displayed error message:- "+lp.srrMsgString());
	}
}
