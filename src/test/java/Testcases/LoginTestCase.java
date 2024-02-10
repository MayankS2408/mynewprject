package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import BaseTest.BaseTest;
import pom.TC_LoginPage;

public class LoginTestCase extends BaseTest {

	TC_LoginPage T;

	@Test
	public void loginpage() throws IOException {
		T = new TC_LoginPage(driver);
		T.Loginapplication();
	}

}
