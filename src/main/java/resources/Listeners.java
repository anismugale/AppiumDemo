package resources;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.IAnnotationTransformer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

import commons.TestBase;
import pages.HomePage;

public  class Listeners implements ITestListener, IAnnotationTransformer {

	private static final Logger lOGGER = LogManager.getLogger(Listeners.class.getName());

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestFailure(ITestResult result) {

		String folderPath = "./screenshots/";
		createFolder(folderPath);
		try {

			String filename = result.getMethod().getMethodName();
			WebDriver driver = ((TestBase) result.getInstance()).driver;
			FileOutputStream out = new FileOutputStream(folderPath + filename + ".jpg");
			out.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
			out.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void createFolder(String folderPath) {
		File file = new File(folderPath);
		if (!file.exists()) {
			file.mkdir();
		}
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
	}

	public void onTestStart(ITestResult result) {
		lOGGER.info("*******************" + result.getTestClass().getName() + "." + result.getMethod().getMethodName()
				+ " started*******************");
	}

	public void onTestSuccess(ITestResult result) {
		lOGGER.info("*******************" + result.getTestClass().getName() + "." + result.getMethod().getMethodName()
				+ " passed*******************");
	}

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
		
	}
}
