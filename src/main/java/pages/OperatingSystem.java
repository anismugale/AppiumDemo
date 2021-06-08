package pages;

import commons.BasePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class OperatingSystem extends BasePage{

	public OperatingSystem(AndroidDriver<AndroidElement> driver) {
		super(driver);
	}
	
	@AndroidFindBy(id="io.appium.android.apis:id/sms_enable_receiver")
	public AndroidElement enableBroadcast;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"SMS Messaging\"]")
	public AndroidElement smsMessaging;
	
	@AndroidFindBy(id="io.appium.android.apis:id/sms_recipient")
	public AndroidElement recipient;
	
	@AndroidFindBy(id="io.appium.android.apis:id/sms_content")
	public AndroidElement messageBody;
	
	@AndroidFindBy(id="io.appium.android.apis:id/sms_send_message")
	public AndroidElement sendButton;
	
	
}

