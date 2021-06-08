import org.testng.annotations.Test;

import commons.Gestures;
import commons.TestBase;
import pages.Content;
import pages.HomePage;

public class ContentTest extends TestBase{
	
	@Test
	public void contentTest() {
		
		HomePage home=new HomePage(driver);
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
		
		Gestures ges = new Gestures(driver);
		ges.scrollToText("AppSierra");
	}

}
