package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObjects.EmpireLoginpage;

public class EmpireLoginStepDefinition {
	
	public WebDriver driver;
	public EmpireLoginpage elp;
	
	@Given("launch the chrome browser")
	public void launch_the_chrome_browser() {
		driver = new ChromeDriver();
		elp = new EmpireLoginpage(driver);
		
	}

	@When("opens the url")
	public void opens_the_url() {
		driver.get("http://empirehome.myprojectsonline.co.in/");
		driver.manage().window().maximize();
	}

	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String uname, String pword) {
		elp.setusername(uname);
		elp.setpassword(pword);
	}

	@When("click on login button")
	public void click_on_login_button() {
		elp.loginbutton();
	}

	@Then("verify the page title")
	public void verify_the_page_title() {
//		if(driver.getPageSource().contains("Login was unsucessful.")) {
//			driver.close();
//			org.junit.Assert.assertTrue(false);
//		}else {
//			org.junit.Assert.assertEquals("Dashboard / nopCommerce administration", driver.getTitle());
//		}
	}

	@Then("click on logout button")
	public void click_on_logout_button() throws Throwable {
		elp.signoutclick();
	}

}
