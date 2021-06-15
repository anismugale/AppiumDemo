package pages;

import commons.BasePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends BasePage {


	public HomePage(AndroidDriver<AndroidElement> driver) {
		super(driver);
	}

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Preference']")
	public AndroidElement preferences;

	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Content\"]")
	public AndroidElement content;

	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"OS\"]")
	public AndroidElement operatingSystem;

	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Views\"]")
	public AndroidElement views;
}
