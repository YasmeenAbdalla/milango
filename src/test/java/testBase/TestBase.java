package testBase;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;


public class TestBase {

    protected AppiumDriver driver;

    @BeforeMethod

    public void setUp() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("udid", "3422152382001CN");
        caps.setCapability("platformVersion","13.0");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.github_task");
        caps.setCapability("appActivity","com.github_task.MainActivity");
        driver = new AppiumDriver(caps);

    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
