import java.io.IOException;

import org.testng.annotations.Test;

import commons.TestBase;
import commons.TestData;
import pages.HomePage;
import pages.Preferences;

public class ApiDemoTest extends TestBase{
	
@Test(dataProvider="InputData",dataProviderClass=TestData.class)
public void apiDemoTest(String input) throws IOException, InterruptedException
{
 
     HomePage home=new HomePage(driver);
     home.preferences.click();
     
     Preferences pref=new Preferences(driver);
     pref.dependencies.click();
     pref.checkbox.click();
     pref.layout.click();
     pref.editText.sendKeys(input);
     pref.buttons.get(1).click();;
    
  
	}
}


