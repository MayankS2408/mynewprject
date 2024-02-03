package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Excel.Excellibrary;
import File_utility.file_utility;

public class TC_LoginPage {

	WebDriver driver;
	file_utility file = new file_utility();

	public TC_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	@FindBy(xpath = "//a[@href='/login']")
	WebElement login;

	@FindBy(xpath = "(//input[@name='email'])[1]")
	WebElement email;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//button[text()='Login']")
	WebElement Loginbtn;

	@FindBy(xpath = "//button[text()='Test Cases']")
	WebElement Testcases;

	public void Loginapplication() throws IOException {

		String Password = file.fetchfromthepropertyfile("password");
		Excellibrary excel = new Excellibrary();
		String mail = excel.readdata("Sheet1", 1, 0);

		String A = Testcases.getCssValue("background-color");
		System.out.println(A);

		login.click();
		email.sendKeys(mail);
		password.sendKeys(Password);
		Loginbtn.click();

	}

}
