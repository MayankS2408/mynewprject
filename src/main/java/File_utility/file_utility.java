package File_utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class file_utility {

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
	
	
}
