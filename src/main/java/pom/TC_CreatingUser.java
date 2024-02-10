package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Excel.Excellibrary;
import File_utility.file_utility;

import java.io.IOException;

import org.junit.Assert;

public class TC_CreatingUser {

	WebDriver driver;
	file_utility file = new file_utility();

	public TC_CreatingUser(WebDriver driver) {
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

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;

	@FindBy(xpath = "//input[@id='first_name']")
	WebElement firstname;

	@FindBy(xpath = "//input[@id='last_name']")
	WebElement lastname;

	@FindBy(xpath = "//input[@id='address1']")
	WebElement address;

	@FindBy(xpath = "//input[@id='state']")
	WebElement state;

	@FindBy(xpath = "//input[@id='city']")
	WebElement city;

	@FindBy(xpath = "//input[@id='zipcode']")
	WebElement zipcode;

	@FindBy(xpath = "//input[@id='mobile_number']")
	WebElement mobilenumber;
	
	@FindBy(xpath="//button[text()='Create Account']")
	WebElement Createaccount;

	public void verifysignup() throws InterruptedException, IOException {

		Excellibrary excel = new Excellibrary();
		String Name = excel.readdata("Sheet1", 1, 2);
		String Email = excel.readdata("Sheet1", 1, 0);
		login.click();
		name.sendKeys(Name);
		email.sendKeys(Email);
		signup.submit();

	}

	public void createaccount() throws IOException {


		Excellibrary excel = new Excellibrary();
		String Password = excel.readdata("Sheet1", 1, 1);
		String Firstname = excel.readdata("Sheet1", 1, 3);
		String Lastname = excel.readdata("Sheet1", 1, 4);
		String Address = excel.readdata("Sheet1", 1, 5);
		String State =excel.readdata("Sheet1", 1, 6);
		String City = excel.readdata("Sheet1", 1, 7);
		String Zipcode = excel.readdata("Sheet1", 1, 8);
		String Mobilenumber = excel.readdata("Sheet1", 1, 9);

		gender.click();
		gender.isSelected();
		password.sendKeys(Password);
		file_utility.Selectclass(days, 2);
		file_utility.Selectclass(month, 2);
		file_utility.Selectclass(year, 2);
		firstname.sendKeys(Firstname);
		lastname.sendKeys(Lastname);
		address.sendKeys(Address);
		state.sendKeys(State);
		city.sendKeys(City);
		zipcode.sendKeys(Zipcode);
		mobilenumber.sendKeys(Mobilenumber);
		Createaccount.submit();
	}

}
