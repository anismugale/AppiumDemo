package pages;

import commons.BasePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Content extends BasePage {

	public Content(AndroidDriver<AndroidElement> driver) {
		super(driver);
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Storage\"]")
	public AndroidElement storage;
	
	@AndroidFindBy(id="android:id/text1")
	public AndroidElement externalStorage;
	
	@AndroidFindBy(xpath="(//android.widget.Button[@content-desc=\"Create\"])[1]")
	public AndroidElement create;
	
	@AndroidFindBy(xpath="(//android.widget.Button[@content-desc=\"Delete\"])[1]")
	public AndroidElement delete;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Provider\"]")
	public AndroidElement provider;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Pick Contact\"]")
	public AndroidElement pickContact;
	
	@AndroidFindBy(id="io.appium.android.apis:id/pick_contact")
	public AndroidElement contactButton;
	
	@AndroidFindBy(xpath="//*[contains(@text,'Choose a contact')]")
	public AndroidElement chooseContact;
	
	
}
