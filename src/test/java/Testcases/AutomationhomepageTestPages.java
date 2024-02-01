package Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Browser.browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom.TC_Automationhomepage;

public class AutomationhomepageTestPages {

	static WebDriver driver;
	TC_Automationhomepage T;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = browser.getdriver("chrome");
		T = new TC_Automationhomepage(driver);
	}

	@Test
	public void homepqagetitleverification() {
		T.signupactions();
	}

	@Test()
	public void Signup() throws InterruptedException {
		T.verifysignup();
	}
}
