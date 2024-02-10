package BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;

	@BeforeTest
	public void Setup() {
		driver=WebDriverManager.chromedriver().create();
        driver.get("https://www.automationexercise.com/");
		driver.manage().window().maximize();
	}

}
