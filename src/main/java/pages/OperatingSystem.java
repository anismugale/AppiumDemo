package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import commons.BasePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class OperatingSystem extends BasePage{

	protected static final Logger lOGGER = LogManager.getLogger(OperatingSystem.class.getName());
	
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
	
	public OperatingSystem(AndroidDriver<AndroidElement> driver) {
		super(driver);
	}
	
	public void enableBroadcast() {
		wait.forElementToBeVisible(enableBroadcast);
		lOGGER.info("Clicks The Enable Broadcast");
		click(enableBroadcast);
	}
	public void smsMessaging() {
		wait.forElementToBeVisible(smsMessaging);
		lOGGER.info("Clicks The SMS Messaging");
		click(smsMessaging);
	}
	public void recipient() {
		wait.forElementToBeVisible(recipient);
		lOGGER.info("Clicks The Recipient");
		sendKeys(recipient, "9876543210");
	}
	public void messageBody() {
		wait.forElementToBeVisible(messageBody);
		lOGGER.info("Clicks The Message Body");
		sendKeys(messageBody, "Welcome to AppSierra");
	}
	public void sendButton() {
		wait.forElementToBeVisible(sendButton);
		lOGGER.info("Clicks The Send Button");
		click(sendButton);
	}
}

