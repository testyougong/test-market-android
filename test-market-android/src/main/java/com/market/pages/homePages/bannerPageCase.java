package com.market.pages.homePages;

import com.market.base.Base;
import com.market.base.baseWidget;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by zhouxin on 17/3/6.
 */
public class BannerPageCase extends Base implements HomePage {
    @Override
    public void click() throws Exception {
       if(baseWidget.isElementExist(objectMap.getLocator("market.android.banner.one"))){
           driver.findElement(objectMap.getLocator("market.android.banner.one")).click();
           driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           if(baseWidget.isElementExist(objectMap.getLocator("market.android.getActivityName"))){
               System.out.println("首页banner点击正常");
           }else{
               System.out.println("活动页面title元素获取失败");
           }
       }else{
           System.out.println("banner元素获取失败,无法点击");
       }
    }

    @Override
    public void swipe() throws Exception {

    }
}
