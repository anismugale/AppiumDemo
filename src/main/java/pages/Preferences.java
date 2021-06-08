package pages;

import java.util.List;

import commons.BasePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Preferences extends BasePage  {
	
		public Preferences(AndroidDriver<AndroidElement> driver) {
			super(driver);
		}

	@AndroidFindBy(xpath="//android.widget.TextView[@text='3. Preference dependencies']")
	public AndroidElement dependencies;
	
	@AndroidFindBy(className="android.widget.Button")
	public List<AndroidElement> buttons;
	
	@AndroidFindBy(id="android:id/checkbox")
	public AndroidElement checkbox;
	
	@AndroidFindBy(xpath="(//android.widget.RelativeLayout)[2]")
	public AndroidElement layout;
	
	@AndroidFindBy(className="android.widget.EditText")
	public AndroidElement editText;
	
	
}
