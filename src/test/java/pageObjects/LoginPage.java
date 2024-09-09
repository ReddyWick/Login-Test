package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='username']") private WebElement email_txt;
	@FindBy(xpath = "//input[@id='password']") private WebElement password_txt;
	@FindBy(xpath = "//button[normalize-space()='Log In']") private WebElement login_btn;
	@FindBy(xpath = "//a[@class='d-none d-md-flex align-items-center pb-3 mb-md-0 me-md-auto text-white text-decoration-none']//img") 
	private WebElement img;
	
	@FindBy(xpath = "//div[@class='alert alert-danger']") private WebElement errMsg;
	
	public void setEmail(String email) {
		email_txt.sendKeys(email);
	}
	
	public void setPassword(String password) {
		password_txt.sendKeys(password);
	}
	
	public void btnLogin() {
		login_btn.click();
	}
	
	public boolean imgVisible() {
		return img.isDisplayed();
	}
	
	public boolean errMsgVisible() {
		return errMsg.isDisplayed();
	}
	
	public String srrMsgString() {
		return errMsg.getText();
	}
	
}
