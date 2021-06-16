package pages;

import commons.BasePage;
import commons.Gestures;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ViewsPage extends Gestures{

	public ViewsPage(AndroidDriver<AndroidElement> driver) {
		super(driver);
	}
	
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
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Rating Bar\"]")
	public AndroidElement ratingBar;
	
	@AndroidFindBy(id="io.appium.android.apis:id/ratingbar2")
	public AndroidElement ratings;
	
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
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Gallery\"]")
	public AndroidElement gallery;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"2. People\"]")
	public AndroidElement people;
	
	@AndroidFindBy(id="io.appium.android.apis:id/gallery")
	public AndroidElement testing;
	
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
	
	public void swipeInClock() {
		Gestures ges = new Gestures(driver);
		ges.progressBar(clock_45);
	}
	public void dragDrop() {
		Gestures ges = new Gestures(driver);
		ges.dragAndDrop(dot1, dot2);
	}
	
}
