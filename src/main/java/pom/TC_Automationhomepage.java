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

import java.io.IOException;

import org.junit.Assert;

public class TC_Automationhomepage {

	WebDriver driver;
	file_utility file = new file_utility();

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

		String Name = file.fetchfromthepropertyfile("name");
		String Email = file.fetchfromthepropertyfile("email");
		login.click();
		name.sendKeys(Name);
		email.sendKeys(Email);
		signup.submit();

	}

	public void createaccount() throws IOException {

		String Password = file.fetchfromthepropertyfile("password");
		String Firstname = file.fetchfromthepropertyfile("Firstname");
		String Lastname = file.fetchfromthepropertyfile("Lastname");
		String Address = file.fetchfromthepropertyfile("Address");
		String State = file.fetchfromthepropertyfile("State");
		String City = file.fetchfromthepropertyfile("City");
		String Zipcode = file.fetchfromthepropertyfile("Zipcode");
		String Mobilenumber = file.fetchfromthepropertyfile("Mobilenumber");

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
