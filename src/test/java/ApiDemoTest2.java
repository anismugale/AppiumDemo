import org.testng.annotations.Test;

import commons.TestBase;
import pages.HomePage;
import pages.ViewsPage;

public class ApiDemoTest2 extends TestBase{
	
	@Test
	public void viewsTest() {
		HomePage home=new HomePage(driver);
		home.views();
		ViewsPage view=new ViewsPage(driver);
		view.expandableLists();
		view.customAdaptor();
		view.peopleNames();
		view.controls();
		view.darkTheme();
		view.textBox();
		view.clicksButtons();
		view.dropDown();
	}
	@Test
	public void progressBars() {
		HomePage home=new HomePage(driver);
		home.views();
		ViewsPage view=new ViewsPage(driver);
		view.rotating();
		view.scrollBars();
		view.rotatingButtons();
		view.ratingBars();
		view.seekBar();
	}
	@Test
	public void dragging() {
		HomePage home=new HomePage(driver);
		home.views();
		ViewsPage view=new ViewsPage(driver);
		view.dateWidgets();
		view.inline();
		view.clock();
		view.dragDrop();
	}
	@Test
	public void popUpMenu() {
		HomePage home=new HomePage(driver);
		home.views();
		ViewsPage view=new ViewsPage(driver);
		view.popUp();
		view.makePopup();
		view.edit();
		view.switches();
		view.toggleSwitch();
	}
	
}
