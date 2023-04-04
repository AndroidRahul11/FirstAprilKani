package com.mobile;

import Pages.LoginPage;
import Pages.Menu;
import Utils.Utility;
import com.beust.jcommander.Parameter;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;



public class BaseClass {
    public AndroidDriver driver;
    public static LoginPage loginPage;
    public static Utility util;
    public static Menu menu;


    @BeforeTest
    public void AppiumTest() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();

        options.setDeviceName("rahulemu");
        options.setCapability("autoAcceptAlerts", true);
        options.setCapability("noReset", true);
        options.setApp("/Users/rahul.vyavahare/Documents/TestAppFramework/Kani/src/test/resources/app-release.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        loginPage = new LoginPage(driver);
        util = new Utility(driver);
        menu = new Menu(driver);

    }
    @AfterClass
    public void TearsDown() {

        driver.quit();

    }
}
