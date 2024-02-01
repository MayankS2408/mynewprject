package Testcases;

import java.io.IOException;

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

	@Test(priority=1)
	public void Signup() throws InterruptedException, IOException {
		T.verifysignup();
	}

	@Test(priority=2)
	public void Acoountcreation() throws IOException {
		T.createaccount();
	}
}
