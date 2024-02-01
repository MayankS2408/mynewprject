package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import File_utility.file_utility;
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

	@FindBy(xpath = "(//input[@name='email'])[2]")
	WebElement email;

	@FindBy(xpath = "//button[text()='Signup']")
	WebElement signup;

	@FindBy(xpath = "//input[@id='id_gender1']")
	WebElement gender;

	@FindBy(xpath = "//select[@id='days']")
	WebElement days;

	@FindBy(xpath = "//select[@id='months']")
	WebElement month;

	@FindBy(xpath = "//select[@id='years']")
	WebElement year;

	public void verifysignup() throws InterruptedException {

		login.click();
		name.sendKeys("Mayank");
		email.sendKeys("MS@1234.com");
		signup.submit();

	}

	public void createaccount() {
		
		gender.click();
		gender.isSelected();
		file_utility.Selectclass(days, 2);
		file_utility.Selectclass(month, 2);
		file_utility.Selectclass(year, 2);
	}

}
