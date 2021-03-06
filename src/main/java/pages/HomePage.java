package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import commons.BasePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends BasePage {

	protected static final Logger lOGGER = LogManager.getLogger(HomePage.class.getName());
	

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Preference']")
	public AndroidElement preferences;

	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Content\"]")
	public AndroidElement content;

	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"OS\"]")
	public AndroidElement operatingSystem;

	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Views\"]")
	public AndroidElement views;

	public HomePage(AndroidDriver<AndroidElement> driver) {
		super(driver);
	}
	
	public void preferences() {
		wait.forElementToBeVisible(preferences);
		lOGGER.info("Clicks The Preferences");
		click(preferences);
	}
	public void content() {
		wait.forElementToBeVisible(content);
		lOGGER.info("Clicks The Content");
		click(content);
	}
	public void operatingSystem() {
		wait.forElementToBeVisible(operatingSystem);
		lOGGER.info("Clicks The Operating System");
		click(operatingSystem);
	}
	public void views() {
		wait.forElementToBeVisible(views);
		lOGGER.info("Clicks The Views");
		click(views);
	}
}

