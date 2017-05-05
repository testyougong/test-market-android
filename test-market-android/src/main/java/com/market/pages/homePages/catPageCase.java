package com.market.pages.homePages;

import com.market.base.Base;
import com.market.base.baseWidget;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;


/**
 * Created by zhouxin on 17/3/15.
 */
public class CatPageCase extends Base implements HomePage{
    private final String name = "分类";
    @Override
    public void click() throws Exception {
        for(int i = 1;i < 3;i++){
            for(int j = 1;j < 5;j++){
                baseWidget.isElementExist(objectMap.getLocator("market.android.cat["+i+"]["+j+"]"));
                if(baseWidget.isElementExist(objectMap.getLocator("market.android.cat["+i+"]["+j+"]"))){
                    driver.findElement(objectMap.getLocator("market.android.cat["+i+"]["+j+"]")).click();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    if(baseWidget.isElementExist(objectMap.getLocator("market.android.back"))){
                        String activityName = driver.findElement(objectMap.getLocator("market.android.getActivityName")).getText();
                        System.out.println("从分类推荐进入"+activityName+"页验证成功");
                        WebElement tab = (WebElement) driver.findElements(objectMap.getLocator("market.android.back")).get(0);
                        tab.click();
                    }else{
                        String catName = driver.findElement(objectMap.getLocator("market.android.getCatName")).getText();
                        if(catName.equals(name)){
                            System.out.println("从分类推荐进入分类页验证成功");
                        }else{
                            System.out.println("从分类推荐进入了错误的页面"+i+","+j);
                        }
                        driver.pressKeyCode(AndroidKeyCode.BACK);
                    }
                }
            }
        }
    }

    @Override
    public void swipe() throws Exception {

    }
}
