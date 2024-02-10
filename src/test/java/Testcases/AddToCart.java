package Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseTest.BaseTest;
import File_utility.file_utility;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom.TC_AddToCart;
import pom.TC_LoginPage;

public class AddToCart extends BaseTest {

	TC_LoginPage T;
	TC_AddToCart A;

	@Test
	public void loginpage() throws IOException {
		T= new TC_LoginPage(driver);
		T.Loginapplication();
	}

	@Test(priority = 2)
	public void Shopping() throws InterruptedException {
		A = new TC_AddToCart(driver);
		A.Category();
	}
}
