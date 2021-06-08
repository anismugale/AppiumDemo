import org.testng.annotations.Test;

import commons.TestBase;
import pages.HomePage;
import pages.OperatingSystem;

public class OSTest extends TestBase{

	@Test
	public void osTest() {
		
		HomePage home=new HomePage(driver);
		home.operatingSystem.click();
		
		OperatingSystem os = new OperatingSystem(driver);
		os.smsMessaging.click();
		os.enableBroadcast.click();
		os.recipient.sendKeys("9876543210");
		os.messageBody.sendKeys("Welcome to AppSierra");
		os.sendButton.click();
	}
}
