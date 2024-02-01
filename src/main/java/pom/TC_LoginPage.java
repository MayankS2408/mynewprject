package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import File_utility.file_utility;

public class TC_LoginPage {

	WebDriver driver;
	file_utility file= new file_utility();
	
	public TC_LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	
	@FindBy(xpath = "//a[@href='/login']")
	WebElement login;

	@FindBy(xpath = "(//input[@name='email'])[1]")
	WebElement email;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement Loginbtn;

	
	public void Loginapplication() throws IOException {
		
		String Email = file.fetchfromthepropertyfile("email");
		String Password = file.fetchfromthepropertyfile("password");
		
		login.click();
		email.sendKeys(Email);
		password.sendKeys(Password);
		Loginbtn.click();
		Loginbtn.click();

	}
	
}
