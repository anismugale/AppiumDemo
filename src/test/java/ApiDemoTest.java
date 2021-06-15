import java.io.IOException;

import org.testng.annotations.Test;

import commons.Gestures;
import commons.TestBase;
import commons.TestData;
import pages.Content;
import pages.HomePage;
import pages.OperatingSystem;
import pages.Preferences;

public class ApiDemoTest extends TestBase{
	
	static HomePage home=new HomePage(driver);
	
	@Test(dataProvider="InputData",dataProviderClass=TestData.class)
	public void apiDemoTest(String input) throws IOException, InterruptedException {
		
		home.preferences.click();
		Preferences pref=new Preferences(driver);
		pref.dependencies.click();
		pref.checkbox.click();
		pref.layout.click();
		pref.editText.sendKeys(input);
		pref.buttons.get(1).click();;
	}
	@Test
	public void contentTest() throws InterruptedException {
		
		home.content.click();
		Content content=new Content(driver);
		content.storage.click();
		content.externalStorage.click();
		content.create.click();
		content.delete.click();
		driver.navigate().back();
		driver.navigate().back();
		content.provider.click();
		content.pickContact.click();
		content.contactButton.click();
		content.chooseContact.click();
		Thread.sleep(5000);
		Gestures ges = new Gestures(driver);
		ges.scrollToText("AppSierra");
	}
	@Test
	public void osTest() {
		
		home.operatingSystem.click();
		OperatingSystem os = new OperatingSystem(driver);
		os.smsMessaging.click();
		os.enableBroadcast.click();
		os.recipient.sendKeys("9876543210");
		os.messageBody.sendKeys("Welcome to AppSierra");
		os.sendButton.click();
	}

}


