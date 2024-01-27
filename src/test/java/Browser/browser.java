package Browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browser {
	static WebDriver driver;

	public static WebDriver getdriver(String type) {
		WebDriver driver = null;
		if (type.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.automationexercise.com/");
		return driver;

	}
}
