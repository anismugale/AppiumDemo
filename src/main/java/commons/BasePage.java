package commons;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.time.Duration;
import static io.appium.java_client.touch.offset.PointOption.point;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import static io.appium.java_client.touch.WaitOptions.waitOptions;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class BasePage {


	protected AndroidDriver<AndroidElement> driver;
	protected static ExplicitWait wait;
	protected static JavaScriptHelper js;
	protected static final Logger lOGGER = LogManager.getLogger(BasePage.class.getName());

	public BasePage(AndroidDriver<AndroidElement> driver) {	
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		 this.driver=driver;
		 wait = new ExplicitWait(driver);
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
	public void scrollToText(String text) {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"" +text+ "\"));");
	}
	public void scr(String text) {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).setAsHorizontalList().scrollIntoView(text(\"" +text+ "\"));");
	}
	public void dragAndDrop(AndroidElement source, AndroidElement target) {

		TouchAction action = new TouchAction((AndroidDriver<AndroidElement>) driver);
		action.longPress(ElementOption.element(source)).moveTo(ElementOption.element(target)).release().perform();
	}
	public void clickOnOKAlert() {

		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	public void progressBar(AndroidElement source) {

		TouchAction action = new TouchAction(driver);
		action.longPress(ElementOption.element(source)).moveTo(ElementOption.element(source, 250, 250)).release()
				.perform();
	}
	public void verticalScroll() {

		TouchAction  action =new TouchAction(driver);	
		Dimension size	=driver.manage().window().getSize();
		int width=size.width;
		int height=size.height;				
		int middleOfX=width/2;
		int startYCoordinate= (int)(height*.7);
		int endYCoordinate= (int)(height*.2);
						
		action.press(PointOption.point(middleOfX, startYCoordinate))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
		.moveTo(PointOption.point(middleOfX, endYCoordinate)).release().perform();
	}
	
	
	public void dropDown(AndroidElement element, String option, String value) {

		Select s = new Select(element);
		if (option.equalsIgnoreCase("Value")) {
			s.selectByValue(value);
		} else if (option.equalsIgnoreCase("VisibleText")) {
			s.selectByVisibleText(value);
		} else if (option.equalsIgnoreCase("Index")) {
			int i = Integer.parseInt(value);
			s.selectByIndex(i);
		}
	}
	public void longPress(AndroidElement source, AndroidElement destination) {
		TouchAction action = new TouchAction(driver);
		action.longPress(longPressOptions().withElement(element(source)).withDuration(ofSeconds(2)))
		.moveTo(element(destination)).release().perform();
	}
	public void swipe(AndroidElement source, AndroidElement dest) {

		TouchAction action = new TouchAction((AndroidDriver) driver);
		action.longPress(ElementOption.element(source)).moveTo(ElementOption.element(dest)).release().perform();
		
	}
	public void scrollHorizontal(double value1,double value2) {

		Dimension dimension =driver.manage().window().getSize();
		
		Double scrollheight = dimension.getHeight()*value1;
		int scrollStart = scrollheight.intValue();
		Double scrollheightEnd = dimension.getHeight()*value2;
		int scrollEnd = scrollheightEnd.intValue();

		new TouchAction((PerformsTouchActions)driver)
		.press(PointOption.point(scrollStart,0))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
		.moveTo(PointOption.point(scrollEnd , 0))
		.release()
		.perform(); 
	}
	public static void swipeTo(AndroidDriver driver, Direction direction, long duration) {
	    Dimension size = driver.manage().window().getSize();

	    int startX = 0;
	    int endX = 0;
	    int startY = 0;
	    int endY = 0;

	    switch (direction) {
	        case RIGHT:
	            startY = (int) (size.height / 2);
	            startX = (int) (size.width * 0.90);
	            endX = (int) (size.width * 0.05);
	            new TouchAction(driver)
	                    .press(PointOption.point(startX, startY))
	                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
	                    .moveTo(PointOption.point(endX, startY))
	                    .release()
	                    .perform();
	            break;
	        case LEFT:
	            startY = (int) (size.height / 2);
	            startX = (int) (size.width * 0.05);
	            endX = (int) (size.width * 0.90);
	            new TouchAction(driver)
	                    .press(PointOption.point(startX, startY))
	                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
	                    .moveTo(PointOption.point(endX, startY))
	                    .release()
	                    .perform();
	            break;

	        case UP:
	        	endY = (int) (size.height * 0.70);
	        	startY = (int) (size.height * 0.30);
	        	startX = (size.width / 2);
	        	new TouchAction(driver)
	        	.press(PointOption.point(startX, startY))
	        	.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
	        	.moveTo(PointOption.point(startX, endY))
	        	.release()
	        	.perform();
	        	break;

	        case DOWN:
	            startY = (int) (size.height * 0.70);
	            endY = (int) (size.height * 0.30);
	            startX = (size.width / 2);
	            new TouchAction(driver)
	                    .press(PointOption.point(startX, startY))
	                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
	                    .moveTo(PointOption.point(startX, endY))
	                    .release()
	                    .perform();
	            break;
	    }
	}

}

