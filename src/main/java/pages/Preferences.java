package pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import commons.BasePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Preferences extends BasePage  {
	
		public Preferences(AndroidDriver driver) {
			super(driver);
		}

	@AndroidFindBy(xpath="//android.widget.TextView[@text='3. Preference dependencies']")
	public WebElement dependencies;
	
	@AndroidFindBy(className="android.widget.Button")
	public List<WebElement> buttons;
	
	@AndroidFindBy(id="android:id/checkbox")
	public WebElement checkbox;
	
	@AndroidFindBy(xpath="(//android.widget.RelativeLayout)[2]")
	public WebElement layout;
	
	@AndroidFindBy(className="android.widget.EditText")
	public WebElement editText;
	
	
}
