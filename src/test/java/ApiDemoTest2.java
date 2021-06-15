import org.testng.annotations.Test;

import commons.Gestures;
import commons.TestBase;
import pages.HomePage;
import pages.ViewsPage;

public class ApiDemoTest2 extends TestBase{
	
	@Test
	public void viewsTest() {
		HomePage home=new HomePage(driver);
		home.views.click();
		ViewsPage view=new ViewsPage(driver);
		view.expandableLists.click();
		view.customAdaptor.click();
		view.peopleNames.click();
		driver.navigate().back();
		driver.navigate().back();
		
		view.controls.click();
		view.darkTheme.click();
		view.textBox.sendKeys("Hello");
		driver.hideKeyboard();
		view.radioButton.click();
		view.starButton.click();
		view.select.click();
		view.selectEarth.click();

	}
	@Test
	public void rotatingButton() {
		HomePage home=new HomePage(driver);
		home.views.click();
		Gestures ges = new Gestures(driver);
		ges.scrollToText("Rotating Button");
		ViewsPage view=new ViewsPage(driver);
		view.rotatingButton.click();
		view.txBar.click();
	}
	@Test
	public void dateWidgets() {
		HomePage home=new HomePage(driver);
		home.views.click();
		ViewsPage view=new ViewsPage(driver);
		view.dateWidgets.click();
		view.inline.click();
		view.clock_9.click();
		
	}
	@Test
	public void gallery() {
		HomePage home=new HomePage(driver);
		home.views.click();
		ViewsPage view=new ViewsPage(driver);
		view.gallery.click();
		view.people.click();
		
	}
}
