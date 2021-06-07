package commons;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
public class TestBase {
	 
	  public static AppiumDriverLocalService service;
	  public static AndroidDriver<AndroidElement>  driver;
	  public static DesiredCapabilities capabilities = new DesiredCapabilities();
	  
	  @BeforeMethod
		public void setUp() throws IOException, InterruptedException {
		  service=startServer();
		 AndroidDriver<AndroidElement> driver=capabilities("appName");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	  
	public AppiumDriverLocalService startServer()
	{
	boolean flag=	checkIfServerIsRunnning(4723);
	if(!flag)
	{
		service=AppiumDriverLocalService.buildDefaultService();
		service.start();
	}
		return service;
	}
	
	public static boolean checkIfServerIsRunnning(int port) {
		
		boolean isServerRunning = false;
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(port);
			
			serverSocket.close();
		} catch (IOException e) {
			isServerRunning = true;
		} finally {
			serverSocket = null;
		}
		return isServerRunning;
	}
	public static void startEmulator() throws IOException, InterruptedException
	{
	Runtime.getRuntime().exec( System.getProperty("user.dir")+"\\src\\main\\java\\resources\\startEmulator.bat");
	Thread.sleep(6000);
	}
	public  AndroidDriver<AndroidElement> capabilities(String appName) throws IOException, InterruptedException, MalformedURLException
	{
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\TestData\\global.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
	 File appDir = new File("src");
     File app = new File( appDir, (String) prop.get(appName) );
    
    String device_name= System.getProperty("deviceName");
    String automation_name= System.getProperty("automationName");
 
   if(device_name.contains("emulator"))
  {
  startEmulator();
  }
     capabilities.setCapability( MobileCapabilityType.DEVICE_NAME, device_name);
     capabilities.setCapability( MobileCapabilityType.AUTOMATION_NAME, automation_name);
     capabilities.setCapability( MobileCapabilityType.NEW_COMMAND_TIMEOUT,14 );
     capabilities.setCapability( MobileCapabilityType.APP, app.getAbsolutePath() );
    
     driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	    return driver;
	}
	public static void getScreenshot(String s) throws IOException
	{
	File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrfile,new File(System.getProperty("user.dir")+"\\"+s+".png"));
	}
	
	@AfterMethod
	public void stopService() {
		 service.stop();
	}

}
