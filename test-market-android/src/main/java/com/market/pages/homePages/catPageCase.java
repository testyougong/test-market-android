package com.market.pages.homePages;

import com.market.base.Base;
import com.market.base.baseWidget;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;


/**
 * Created by zhouxin on 17/3/15.
 */
public class catPageCase extends Base implements catPage{
    public void clickCat() throws Exception {
        for(int i = 1;i < 3;i++){
            for(int j = 1;j < 5;j++){
                baseWidget.isElementExist(objectMap.getLocator("market.android.cat["+i+"]["+j+"]"));
                if(baseWidget.isElementExist(objectMap.getLocator("market.android.cat["+i+"]["+j+"]"))){
                    driver.findElement(objectMap.getLocator("market.android.cat["+i+"]["+j+"]")).click();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    if(baseWidget.isElementExist(objectMap.getLocator("market.android.tab"))){
                        WebElement tab = (WebElement) driver.findElements(objectMap.getLocator("market.android.tab")).get(0);
                        tab.click();
                    }else driver.pressKeyCode(AndroidKeyCode.BACK);
                }
            }
        }
    }
}
