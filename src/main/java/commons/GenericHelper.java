package commons;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class GenericHelper {

	public static final Logger log = LogManager.getLogger(GenericHelper.class);

	private final AndroidDriver<AndroidElement> driver;

	public GenericHelper(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}

	public AndroidElement getElement(By locator) {
		log.info(locator);
		if (IsElementPresentQuick(locator)) {
			return driver.findElement(locator);
		}
		try {
			throw new NoSuchElementException("Element Not Found : " + locator);
		} catch (RuntimeException e) {
			log.error(e);
			throw e;
		}
	}

	public AndroidElement getElementWithNull(By locator) {
		log.info(locator);
		try {
			return driver.findElement(locator);
		} catch (NoSuchElementException e) {
			log.warn(e);
		}
		return null;
	}

	public boolean IsElementPresentQuick(By locator) {
		boolean flag = driver.findElements(locator).size() >= 1;
		log.info(flag);
		return flag;
	}
}
