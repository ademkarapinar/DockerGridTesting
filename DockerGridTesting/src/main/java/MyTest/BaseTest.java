package MyTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
		
		public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();
		
		@BeforeMethod
		@Parameters(value = {"browser"})
		public void setup(String browser) throws MalformedURLException {
			
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("browserName", browser);
			
			//Set the HUB url
			driver.set(new RemoteWebDriver(new URL("http://192.168.0.11:4444/wd/hub"), caps));
		}		
		public RemoteWebDriver getDriver() {
			return driver.get();
		}		
		@AfterMethod
		public void tearDown() {
			getDriver().quit();
		}		
		@AfterClass
		void terminate() {
			driver.remove();
		}
}
