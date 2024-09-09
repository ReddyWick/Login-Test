package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.BaseClass;

public class BonusTestClass2 extends BaseClass {
	@Test
	public void testCase() {
		
		LoginPage lp = new LoginPage(driver);
		//email field is empty
		lp.setEmail("fhhj@gmail.com");
		lp.setPassword("");
		lp.btnLogin();
		Assert.assertEquals(true, lp.errMsgVisible());
		System.out.println("Displayed error message:- "+lp.srrMsgString());
	}
}
