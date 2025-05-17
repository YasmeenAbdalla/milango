package repositoriesScreen;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utilties.WaitStrategy;


public class Repositories {

    private final AppiumDriver driver;
    private final WaitStrategy waitUtils;


    private final By repositoriesTab= new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Repositories Screen\")");
    private final By languageTab = new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Any\")");
    private final By clickToLanguage= new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"C#\")");
    private final By pickerDate= new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"\uE61D\").instance(1)");
    private final By clickToYear=new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/date_picker_header_year\")");
    private final By selectYear= new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"2024\")");
    private final By clickOk= new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/button1\")");
    private final By cText= new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"C\").instance(0)");

    public Repositories (AppiumDriver driver){
        this.driver= driver;
        this.waitUtils = new WaitStrategy(driver, 7);
    }

    public Repositories clickToRepositories(){
        driver.findElement(repositoriesTab).click();
        return this;
    }

    public Repositories selectLanguage(){
        driver.findElement(languageTab).click();
        waitUtils.waitForElementClickable(clickToLanguage).click();
        return this;
    }

    public Repositories selectDate(){
        driver.findElement(pickerDate).click();
        waitUtils.waitForElementClickable(clickToYear).click();
        driver.findElement(selectYear).click();
        driver.findElement(clickOk).click();
        return this;
    }

    public String getActualText(){
        return waitUtils.waitForElementVisible(cText).getText();
    }





}
