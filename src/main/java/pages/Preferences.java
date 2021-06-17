package pages;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import commons.BasePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Preferences extends BasePage  {
	
	protected static final Logger lOGGER = LogManager.getLogger(Preferences.class.getName());

	@AndroidFindBy(xpath="//android.widget.TextView[@text='3. Preference dependencies']")
	public AndroidElement dependencies;
	
	@AndroidFindBy(id="android:id/checkbox")
	public AndroidElement checkbox;
	
	@AndroidFindBy(xpath="(//android.widget.RelativeLayout)[2]")
	public AndroidElement layout;
	
	@AndroidFindBy(className="android.widget.Button")
	public List<AndroidElement> buttons;
	
	@AndroidFindBy(className="android.widget.EditText")
	public AndroidElement editText;
	
	public Preferences(AndroidDriver<AndroidElement> driver) {
		super(driver);
	}
	
	public void dependencies() {
		wait.forElementToBeVisible(dependencies);
		lOGGER.info("Clicks The Dependencies");
		click(dependencies);
	}
	public void checkbox() {
		wait.forElementToBeVisible(checkbox);
		lOGGER.info("Clicks The Checkbox");
		click(checkbox);
	}
	public void layout() {
		wait.forElementToBeVisible(layout);
		lOGGER.info("Clicks The Layout");
		click(layout);
	}
	
}
