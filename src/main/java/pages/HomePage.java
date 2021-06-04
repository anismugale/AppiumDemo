package pages;

import org.openqa.selenium.WebElement;

import commons.BasePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends BasePage {
	
	
	public HomePage(AndroidDriver driver) {
		super(driver);
	}

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Preference']")
	public WebElement preferences;

	
}
