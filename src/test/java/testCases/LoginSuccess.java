package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.BaseClass;

public class LoginSuccess extends BaseClass {
	
	@Test
	public void testCase() {
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail("test007@gmail.com");
		lp.setPassword("testCase@11");
		lp.btnLogin();
		//test case will pass if lp.imgVisible() this returns true(image visible in the next page after login, also can be done using the title of the page if facing any page loading timeout issues or add a sleep for seconds)
		Assert.assertEquals(true, lp.imgVisible());
	}
}
