package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import commons.TestBase;
import commons.TestData;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pages.HomePage;
import pages.Preferences;

public class ApiDemoTest extends TestBase{

@Test(dataProvider="InputData",dataProviderClass=TestData.class)
public void apiDemoTest(String input) throws IOException, InterruptedException
{
	service=startServer();
	
		AndroidDriver<AndroidElement> driver=capabilities("apiDemo");
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
     HomePage home=new HomePage(driver);
     home.preferences();
     
     Preferences pref=new Preferences(driver);
     pref.dependencies();
     pref.checkbox();
     pref.layout();
     pref.editText(input);
     pref.buttons();
    
     service.stop();
  
	}
}


