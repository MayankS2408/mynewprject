package Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Browser.browser;
import File_utility.file_utility;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom.TC_LoginPage;

public class LoginTestCase {

	TC_LoginPage T;
	static WebDriver driver;
	file_utility file = new file_utility(); 

	@BeforeTest
	public void Setup() throws IOException {
		
		String broswername= file.fetchfromthepropertyfile("browsername");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = browser.getdriver(broswername);
		T = new TC_LoginPage(driver);
	}

	@Test
	public void loginpage() throws IOException {
		T.Loginapplication();
	}

}
