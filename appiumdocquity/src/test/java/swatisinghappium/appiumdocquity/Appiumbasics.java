package swatisinghappium.appiumdocquity;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Appiumbasics {
     @Test
	public void AppiumTest() throws MalformedURLException
	{
    	 //android driver  - to inform appium -create object of android driver 
    	 //Appium code > appium server > mobile 
    	 
    	 UiAutomator2Options options = new UiAutomator2Options();
    	 options.setDeviceName("SWATI_EMULATOR");
    	 options.setApp("C:\\Users\\swati.singh\\eclipse-workspace\\appiumdocquity\\src\\test\\java\\Resources\\package-info.java");
    	 
    	 AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
    	 
    	 //Actual automation starts once app is opened
    	 
	}

}
