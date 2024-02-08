package File_utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class file_utility {

	WebDriver driver;
	public String fetchfromthepropertyfile(String key) throws IOException {

		FileInputStream fis = new FileInputStream("./src/test/resources/config.properties");
		Properties pro = new Properties();

		pro.load(fis);

		return pro.getProperty(key);

	}
	
	public static void Selectclass (WebElement element,int value) {
		Select select= new Select(element);
		select.selectByIndex(value);
	}
	
	public void Click(WebElement element) {
		element.click();
		
	}

}
