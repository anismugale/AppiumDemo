import java.io.IOException;

import org.testng.annotations.Test;

import commons.TestBase;
import commons.TestData;
import pages.Content;
import pages.HomePage;
import pages.OperatingSystem;
import pages.Preferences;

public class ApiDemoTest extends TestBase{
	
	@Test(dataProvider="InputData",dataProviderClass=TestData.class)
	public void apiDemoTest(String input) throws IOException, InterruptedException {
		
		HomePage home=new HomePage(driver);
		home.preferences();
		Preferences pref=new Preferences(driver);
		pref.dependencies();
		pref.checkbox();
		pref.layout();
		pref.editText.sendKeys(input);
		pref.buttons.get(1).click();
	}
	@Test
	public void contentTest() throws InterruptedException {
		
		HomePage home=new HomePage(driver);
		home.content();
		Content content=new Content(driver);
		content.storage();
		content.externalStorage();
		content.createDelete();
		content.provider();
		content.pickContact();
		content.contactButton();
		content.chooseContact();
	}
	@Test
	public void osTest() {
		
		HomePage home=new HomePage(driver);
		home.operatingSystem();
		OperatingSystem os = new OperatingSystem(driver);
		os.smsMessaging();
		os.enableBroadcast();
		os.recipient();
		os.messageBody();
		os.sendButton();
	}

}


