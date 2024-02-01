package Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Browser.browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom.TC_LoginPage;

public class LoginTestCase {

	TC_LoginPage T;
	static WebDriver driver;

	@BeforeTest
	public void Setup() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = browser.getdriver("chrome");
		T = new TC_LoginPage(driver);
	}

	@Test
	public void loginpage() throws IOException {
		T.Loginapplication();
	}

}
