package com.market.pages.homePages;

import com.market.base.Base;
import com.market.base.baseWidget;
import java.util.concurrent.TimeUnit;

/**
 * Created by zhouxin on 17/3/9.
 */
public class FocusPageCase extends Base implements HomePage{
    @Override
    public void swipe() throws Exception {
        if(baseWidget.isElementExist(objectMap.getLocator("market.android.focus"))) {
            for (int i = 0; i < 5; i++) {
                baseWidget.swipeToLeft(500);
            }
        System.out.println("首页轮播图滑动正常");
        }else{
            System.out.println("首页轮播图元素获取失败,无法滑动");
        }
    }

    @Override
    public void click() throws Exception {
        if(baseWidget.isElementExist(objectMap.getLocator("market.android.focus"))) {
            driver.findElement(objectMap.getLocator("market.android.focus")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            if(baseWidget.isElementExist(objectMap.getLocator("market.android.getActivityName"))){
                System.out.println("首页轮播图点击正常");
            }else{
                System.out.println("活动页面title元素获取失败");
            }
        }else{
            System.out.println("轮播图元素获取失败,无法点击");
        }
    }
}
