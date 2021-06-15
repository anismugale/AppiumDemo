package commons;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class Gestures {

	 AndroidDriver<AndroidElement>  driver;
	 
	 public Gestures(AndroidDriver<AndroidElement> driver) {	
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		 this.driver=driver;
		}
	
	public void scrollToText(String text) {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"" +text+ "\"));");
	}
	public void dragAndDrop(AndroidElement source, AndroidElement target) {

		TouchAction action = new TouchAction(driver);
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
	public void swipe(double sx, double sy, double ex, double ey) {

		TouchAction action = new TouchAction(driver);
		Dimension size = driver.manage().window().getSize();
		int start_x = (int) (size.width * sx);
		int start_y = (int) (size.height * sy);
		int end_x = (int) (size.width * ex);
		int end_y = (int) (size.height * ey);

		action.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
				.moveTo(PointOption.point(end_x, end_y)).release().perform();
	}
}
