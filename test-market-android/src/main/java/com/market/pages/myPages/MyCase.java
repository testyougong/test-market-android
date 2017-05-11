package com.market.pages.myPages;

import com.market.base.Base;
import com.market.base.baseWidget;
import io.appium.java_client.android.AndroidElement;


/**
 * Created by zhouxin on 17/4/25.
 */
public class MyCase extends Base implements MyPage {
    private final String name = "我的";
    @Override
    public void getTagName() throws Exception {
        AndroidElement my = (AndroidElement) driver.findElements(objectMap.getLocator("market.android.my")).get(3);
        my.click();
        baseWidget basewidget = new baseWidget();
        if (basewidget.isElementExist(objectMap.getLocator("market.android.myTagName"))) {
            String tagName = driver.findElement(objectMap.getLocator("market.android.myTagName")).getText();
            if (tagName.equals(name)) {
                System.out.println("访问我的页面成功");
            } else {
                System.out.println("进入了错误的页面");
            }
        } else {
            System.out.println("我的页tagName获取元素失败");
        }
    }

    @Override
    public void getTabName() {

    }

    @Override
    public void click() {

    }
}
