package Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseTest.BaseTest;
import File_utility.file_utility;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom.TC_CreatingUser;

public class CreatingUserTestCase extends BaseTest{

	TC_CreatingUser T;
	
	@Test(priority=1)
	public void Signup() throws InterruptedException, IOException {
		T= new TC_CreatingUser(driver);
		T.verifysignup();
	}

	@Test(priority=2)
	public void Acoountcreation() throws IOException {
		
		T.createaccount();
	}
}
