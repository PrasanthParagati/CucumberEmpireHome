package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmpireLoginpage {
	
	@FindBy (xpath = "//input[@placeholder='example@gmail.com']")
	WebElement username;
	
	@FindBy (xpath = "//input[@id='pword']")
	WebElement password;
	
	@FindBy (xpath = "//button[@class='btn green_btn']")
	WebElement login;
	
	@FindBy (xpath = "//img[@alt='user']")
	WebElement profile;
	
	@FindBy (xpath = "//a[normalize-space()='Signout']")
	WebElement signout;
	
	public WebDriver driver;
	
	public EmpireLoginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setusername(String uname) {
		username.sendKeys(uname);
	}
	
	public void setpassword(String pword) {
		password.sendKeys(pword);
	}
	
	public void loginbutton() {
		login.click();
	}
	
	public void signoutclick() throws Throwable {
		Thread.sleep(2000);
		profile.click();
		Thread.sleep(2000);
		signout.click();
	}
	

}
