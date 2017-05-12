package com.market.base;

import io.appium.java_client.android.AndroidDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;


public class Base {
    public static AndroidDriver driver;
    public static properties objectMap = new properties(Constant.propertiesFilePath);// 配置文件路径
    public static Logger logger = Logger.getLogger(Base.class);
    public static void prepareAndroidForAppium() throws Exception{
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "SM_G9250");
        capabilities.setCapability("platformVersion", "5.1");
        capabilities.setCapability("platformName", "QLXBBBA650570583");
        capabilities.setCapability("Package", "com.elianshang.yougong");
        capabilities.setCapability("Activity", "com.elianshang.yougong.ui.activity.WelcomeActivity");
        capabilities.setCapability("unicodeKeyboard", "True");
        capabilities.setCapability("resetKeyboard", "True");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

}
