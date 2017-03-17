package com.market.base;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Base {
    public static AndroidDriver driver;
    public static properties objectMap = new properties(Constant.propertiesFilePath);// 配置文件路径
    //public static org.apache.log4j.Logger logger = Logger.getLogger(Base.class);
    public static void prepareAndroidForAppium() throws Exception{
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "SM_G9250");
        capabilities.setCapability("platformVersion", "5.1.1");
        capabilities.setCapability("platformName", "04157df47a9d263a");
        capabilities.setCapability("Package", "com.elianshang.yougong");
        capabilities.setCapability("Activity", "com.elianshang.yougong.ui.activity.WelcomeActivity");
        capabilities.setCapability("unicodeKeyboard", "True");
        capabilities.setCapability("resetKeyboard", "True");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

}
