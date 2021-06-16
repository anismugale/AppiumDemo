package commons;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public abstract class BasePage {


	protected AndroidDriver<AndroidElement> driver;
	protected static ExplicitWait wait;
	protected static JavaScriptHelper js;

	protected static final Logger lOGGER = LogManager.getLogger(BasePage.class.getName());


	public BasePage(AndroidDriver<AndroidElement> driver) {	
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public static void click(AndroidElement androidElement) {
		click(androidElement, Timeouts.EXPLICIT);
	}

	public static void click(AndroidElement androidElement, int timeOutInSeconds) {
		wait.forElementToBeClickable(androidElement, timeOutInSeconds, Timeouts.POLLING_INTERVAL);
		androidElement.click();
	}

	public static void sendKeys(AndroidElement androidElement, String value, int timeOutInSeconds) {
		androidElement.clear();
		androidElement.sendKeys(value);
	}

	public static void sendKeys(AndroidElement androidElement, String value) {
		sendKeys(androidElement, value, Timeouts.EXPLICIT);
	}

	public void executeJavascript(String string) {
		js.executeScript(string);
	}

	public void executeJavascript(String string, AndroidElement element) {
		js.executeScript(string, element);
	}


}

