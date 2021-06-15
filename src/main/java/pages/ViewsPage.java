package pages;

import org.openqa.selenium.WebElement;

import commons.BasePage;
import commons.Gestures;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ViewsPage extends BasePage{

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
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Testing\"]")
	public AndroidElement testing;
	
	
}
