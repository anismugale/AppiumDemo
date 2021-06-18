package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import commons.BasePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Content extends BasePage {

	protected static final Logger lOGGER = LogManager.getLogger(Content.class.getName());
	
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
	
	public Content(AndroidDriver<AndroidElement> driver) {
		super(driver);
	}
	
	public void storage() {
		wait.forElementToBeVisible(storage);
		lOGGER.info("Clicks The Storage");
		click(storage);
	}
	public void externalStorage() {
		wait.forElementToBeVisible(externalStorage);
		lOGGER.info("Clicks The External Storage");
		click(externalStorage);
	}
	public void createDelete() {
		wait.forElementToBeVisible(create);
		lOGGER.info("Clicks The Create");
		click(create);
		wait.forElementToBeVisible(delete);
		lOGGER.info("Clicks The Delete");
		click(delete);
		driver.navigate().back();
		driver.navigate().back();
	}
	public void provider() {
		wait.forElementToBeVisible(provider);
		lOGGER.info("Clicks The Provider");
		click(provider);
	}
	public void pickContact() {
		wait.forElementToBeVisible(pickContact);
		lOGGER.info("Clicks The Pick Contact");
		click(pickContact);
	}
	public void contactButton() {
		wait.forElementToBeVisible(contactButton);
		lOGGER.info("Clicks The Contact Button ");
		click(contactButton);
	}
	public void chooseContact() throws InterruptedException {
		wait.forElementToBeVisible(chooseContact);
		lOGGER.info("Clicks The Choose Contact");
		click(chooseContact);
	}
}
