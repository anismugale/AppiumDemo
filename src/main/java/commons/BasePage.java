package commons;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public abstract class BasePage {


	protected AndroidDriver driver;

	public BasePage(AndroidDriver<AndroidElement> driver) {	
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}


}

