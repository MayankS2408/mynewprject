package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constant.constant;

import org.junit.Assert;

public class TC_Automationhomepage {

	WebDriver driver;

	public TC_Automationhomepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(xpath = "//a[@href='/login']")
	WebElement login;

	@FindBy(xpath = "//h2[text()='New User Signup!']")
	WebElement verifytitle;

	@FindBy(xpath = "//input[@placeholder='Name']")
	WebElement name;

	@FindBy(xpath = "//input[@name='email']")
	WebElement email;

	@FindBy(xpath = "//button[text()='Signup']")
	WebElement signup;

	public void signupactions() {

		String actualtitle = "Automation Exercise - Signup / Login";
		System.out.println(actualtitle);
		String expected = driver.getTitle();
		System.out.println(expected);
		Assert.assertEquals(actualtitle, expected);
		
	}

	public void verifysignup() throws InterruptedException {

		login.click();
		name.sendKeys("Mayank");
		email.sendKeys("MS@1234.com");
//		signup.submit();
	}

}
