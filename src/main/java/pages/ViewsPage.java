package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import commons.BasePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class ViewsPage extends BasePage{

	protected static final Logger lOGGER = LogManager.getLogger(ViewsPage.class.getName());
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Expandable Lists\"]")
	public AndroidElement expandableLists;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]")
	public AndroidElement customAdaptor;
	
	@AndroidFindBy(xpath="//*[contains(@text,'People Names')]")
	public AndroidElement peopleNames;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Controls\"]")
	public AndroidElement controls;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"2. Dark Theme\"]")
	public AndroidElement darkTheme;
	
	@AndroidFindBy(id="io.appium.android.apis:id/edit")
	public AndroidElement textBox;
	
	@AndroidFindBy(id="io.appium.android.apis:id/radio1")
	public AndroidElement radioButton;
	
	@AndroidFindBy(id="io.appium.android.apis:id/star")
	public AndroidElement starButton;
	
	@AndroidFindBy(id="io.appium.android.apis:id/spinner1")
	public AndroidElement select;
	
	@AndroidFindBy(xpath="//*[contains(@text,'Earth')]")
	public AndroidElement selectEarth;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Rotating Button\"]")
	public AndroidElement rotatingButton;
	
	@AndroidFindBy(id="io.appium.android.apis:id/translationX")
	public AndroidElement txBar;
	
	@AndroidFindBy(id="io.appium.android.apis:id/scaleY")
	public AndroidElement syBar;
	
	@AndroidFindBy(id="io.appium.android.apis:id/rotationX")
	public AndroidElement xBar;
	
	@AndroidFindBy(id="io.appium.android.apis:id/rotationZ")
	public AndroidElement zBar;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Rating Bar\"]")
	public AndroidElement ratingBar;
	
	@AndroidFindBy(id="io.appium.android.apis:id/ratingbar2")
	public AndroidElement ratings;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Seek Bar\"]")
	public AndroidElement seekBarButton;
	
	@AndroidFindBy(id="io.appium.android.apis:id/seek")
	public AndroidElement seekBar;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Date Widgets\"]")
	public AndroidElement dateWidgets;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"2. Inline\"]")
	public AndroidElement inline;
	
	@AndroidFindBy(xpath="//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"9\"]")
	public AndroidElement clock_9;
	
	@AndroidFindBy(xpath="//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"15\"]")
	public AndroidElement clock_15;
	
	@AndroidFindBy(xpath="//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"45\"]")
	public AndroidElement clock_45;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Drag and Drop\"]")
	public AndroidElement dragDrop;
	
	@AndroidFindBy(id="io.appium.android.apis:id/drag_dot_1")
	public AndroidElement dot1;
	
	@AndroidFindBy(id="io.appium.android.apis:id/drag_dot_2")
	public AndroidElement dot2;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Popup Menu\"]")
	public AndroidElement popUp;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Make a Popup!\"]")
	public AndroidElement makePopup;
	
	@AndroidFindBy(xpath="//*[contains(@text,'Edit')]")
	public AndroidElement edit;
	
	@AndroidFindBy(xpath="//*[contains(@text,'Share')]")
	public AndroidElement share;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Switches\"]")
	public AndroidElement switches;
	
	@AndroidFindBy(xpath="//android.widget.Switch[@content-desc=\"Standard switch\"and @checkable='true']")
	public AndroidElement stdSwitch;
	
	@AndroidFindBy(xpath="//android.widget.Switch[@content-desc=\"Monitored switch\"and @checkable='true']")
	public AndroidElement monitored;
	
	@AndroidFindBy(xpath="//android.widget.Switch[@content-desc=\"Customized text\"and @checkable='true']")
	public AndroidElement customized;
	
	public ViewsPage(AndroidDriver<AndroidElement> driver) {
		super(driver);
	}
	
	public void expandableLists() {
		wait.forElementToBeVisible(expandableLists);
		lOGGER.info("Clicks The Expandable Lists");
		click(expandableLists);
	}
	public void customAdaptor() {
		wait.forElementToBeVisible(customAdaptor);
		lOGGER.info("Clicks The Custom Adaptor");
		click(customAdaptor);
	}
	public void peopleNames() {
		wait.forElementToBeVisible(peopleNames);
		lOGGER.info("Clicks The People Names");
		click(peopleNames);
		driver.navigate().back();
		driver.navigate().back();
	}
	public void controls() {
		wait.forElementToBeVisible(controls);
		lOGGER.info("Clicks The Controls");
		click(controls);
	}
	public void darkTheme() {
		wait.forElementToBeVisible(darkTheme);
		lOGGER.info("Clicks The Dark Theme");
		click(darkTheme);
	}
	public void textBox() {
		wait.forElementToBeVisible(textBox);
		lOGGER.info("Enters Text in Text Box");
		sendKeys(textBox, "Hello");
		driver.hideKeyboard();
	}
	public void clicksButtons() {
		wait.forElementToBeVisible(radioButton);
		lOGGER.info("Clicks The Radio Button");
		click(radioButton);
		wait.forElementToBeVisible(starButton);
		lOGGER.info("Clicks The Star Button");
		click(starButton);
	}
	public void dropDown() {
		wait.forElementToBeVisible(select);
		lOGGER.info("Clicks The select");
		click(select);
		wait.forElementToBeVisible(selectEarth);
		lOGGER.info("Clicks The Select Earth");
		click(selectEarth);
	}
	public void rotating() {
		BasePage gestures = new BasePage(driver);
		gestures.scrollToText("Rotating Button");
		wait.forElementToBeVisible(rotatingButton);
		lOGGER.info("Clicks The Rotating Button");
		click(rotatingButton);
	}
	public void scrollBars() {
		wait.forElementToBeVisible(txBar);
		lOGGER.info("Clicks The TX Bar");
		BasePage gestures = new BasePage(driver);
		gestures.progressBar(txBar);
		wait.forElementToBeVisible(syBar);
		lOGGER.info("Clicks The SY Bar");
		gestures.progressBar(syBar);
	}
	public void rotatingButtons() {
		wait.forElementToBeVisible(xBar);
		lOGGER.info("Clicks The X Bar");
		BasePage gestures = new BasePage(driver);
		gestures.progressBar(xBar);
		wait.forElementToBeVisible(zBar);
		lOGGER.info("Clicks The Z Bar");
		gestures.progressBar(zBar);
		driver.navigate().back();
	}
	public void ratingBars() {
		wait.forElementToBeVisible(ratingBar);
		lOGGER.info("Clicks The Rating Bar");
		click(ratingBar);
		BasePage gestures = new BasePage(driver);
		gestures.progressBar(ratings);
		driver.navigate().back();
	}
	public void seekBar() {
		wait.forElementToBeVisible(seekBarButton);
		lOGGER.info("Clicks The Seek Bar Buttonr");
		click(seekBarButton);
		BasePage gestures = new BasePage(driver);
		gestures.progressBar(seekBar);
	}
	public void dateWidgets() {
		wait.forElementToBeVisible(dateWidgets);
		lOGGER.info("Clicks The Date Widgets");
		click(dateWidgets);
	}
	public void inline() {
		wait.forElementToBeVisible(inline);
		lOGGER.info("Clicks The Inline");
		click(inline);
	}
	public void clock() {
		wait.forElementToBeVisible(clock_9);
		lOGGER.info("Clicks The 9 In The Clock");
		click(clock_9);
		BasePage gestures = new BasePage(driver);
		gestures.longPress(clock_15, clock_45);
		driver.navigate().back();
		driver.navigate().back();
	}
	public void dragDrop() {
		wait.forElementToBeVisible(dragDrop);
		lOGGER.info("Clicks The Drag Drop");
		click(dragDrop);
		BasePage gestures = new BasePage(driver);
		gestures.dragAndDrop(dot1, dot2);
	}
	public void popUp() {
		BasePage gestures = new BasePage(driver);
		gestures.scrollToText("Popup Menu");
		wait.forElementToBeVisible(popUp);
		lOGGER.info("Clicks The Pop Up");
		click(popUp);
	}
	public void makePopup() {
		wait.forElementToBeVisible(makePopup);
		lOGGER.info("Clicks The Make Popup");
		click(makePopup);
	}
	public void edit() {
		wait.forElementToBeVisible(edit);
		lOGGER.info("Clicks The Edit");
		click(edit);
		wait.forElementToBeVisible(share);
		lOGGER.info("Clicks The Share");
		click(share);
		driver.navigate().back();
	}
	public void switches() {
		BasePage gestures = new BasePage(driver);
		gestures.scrollToText("Switches");
		wait.forElementToBeVisible(switches);
		lOGGER.info("Clicks The Switches");
		click(switches);
	}
	public void toggleSwitch() {
		wait.forElementToBeVisible(stdSwitch);
		lOGGER.info("Clicks The Standard Switch");
		click(stdSwitch);
		wait.forElementToBeVisible(monitored);
		lOGGER.info("Clicks The Monitored Switch");
		click(monitored);
		wait.forElementToBeVisible(customized);
		lOGGER.info("Clicks The Customized Switch");
		click(customized);
	}
}
