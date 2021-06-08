package commons;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class JavaScriptHelper {

	private final AndroidDriver<AndroidElement> driver;

	public static final Logger log = LogManager.getLogger(JavaScriptHelper.class);

	public JavaScriptHelper(AndroidDriver<AndroidElement> driver) {
		this.driver = (AndroidDriver<AndroidElement>) driver;
	}

	public Object executeScript(String script) {
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		log.info(script);
		return exe.executeScript(script);
	}

	public Object executeScript(String script, Object... args) {
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		log.info(script);
		return exe.executeScript(script, args);
	}

	public void scrollToElement(AndroidElement element) {
		executeScript("window.scrollTo(arguments[0],arguments[1])", element.getLocation().x, element.getLocation().y);
		log.info(element);
	}

	public void scrollToElement(By locator) {
		scrollToElement(driver.findElement(locator));
		log.info(locator);
	}

	public void scrollToElementAndClick(AndroidElement element) {
		scrollToElement(element);
		element.click();
		log.info(element);
	}

	public void scrollIntoView(AndroidElement element) {
		executeScript("arguments[0].scrollIntoView(true)", element);
		log.info(element);
	}

	public void scrollIntoViewAndClick(AndroidElement element) {
		scrollIntoView(element);
		element.click();
		log.info(element);
	}

	public void clickElement(AndroidElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}

	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
	}

	public void actionEnter() {
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER);
	}

}
