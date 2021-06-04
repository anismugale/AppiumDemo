package pages;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Preferences  {
	
	private static final Logger lOGGER = LogManager.getLogger(HomePage.class.getName());
	
	public Preferences(AppiumDriver driver)  {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
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
	
	public void dependencies() {
		lOGGER.info("Wait Till Clicks dependencies");
		 dependencies.click();
	 }
	public void checkbox() {
		lOGGER.info("Wait Till Clicks checkbox");
		 checkbox.click();
	 }
	public void layout() {
		lOGGER.info("Wait Till Clicks layout");
		layout.click();
	 }
	public void editText(String input) {
		lOGGER.info("Wait Till Enters Text In  Edit Text");
		 editText.sendKeys(input);
	 }
	
	public void buttons() {
		lOGGER.info("Wait Till Clicks buttons");
		buttons.get(1).click();
	 }
	
	
}
