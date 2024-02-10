package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_AddToCart {

	WebDriver driver;

	public TC_AddToCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void Category() throws InterruptedException {
		
		List<WebElement>list= driver.findElements(By.xpath("//div[@id='accordian']"));
		for(WebElement cat:list) {
			String categorie=cat.getText();
			System.out.println(categorie);
			if(categorie.equalsIgnoreCase("WOMEN")) {
				Thread.sleep(2000);
				cat.click();
			}
		}
	}
}
