package Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Browser.browser;
import File_utility.file_utility;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom.TC_CreatingUser;

public class CreatingUserTestCase {

	static WebDriver driver;
	TC_CreatingUser T;
	file_utility file = new file_utility(); 

	@BeforeTest
	public void setup() throws IOException {
		
		String broswername= file.fetchfromthepropertyfile("browsername");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = browser.getdriver(broswername);
		T = new TC_CreatingUser(driver);
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
