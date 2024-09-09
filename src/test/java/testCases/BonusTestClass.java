package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.BaseClass;

public class BonusTestClass extends BaseClass {
	@Test
	public void testCase() {
		
		LoginPage lp = new LoginPage(driver);
		//Both fields are empty
		lp.setEmail("");
		lp.setPassword("");
		lp.btnLogin();
		Assert.assertEquals(true, lp.errMsgVisible());
		System.out.println("Displayed error message:- "+lp.srrMsgString());
	}
}
