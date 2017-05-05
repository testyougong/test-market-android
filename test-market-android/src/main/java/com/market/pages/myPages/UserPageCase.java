package com.market.pages.myPages;

import com.market.base.Base;
import com.market.base.baseWidget;
import io.appium.java_client.android.AndroidElement;

/**
 * Created by zhouxin on 17/4/25.
 */
public class UserPageCase extends Base implements MyPage{
    private String name;
    public UserPageCase(String name){
        this.name = name;
    }

    @Override
    public void getTabName() throws Exception {
        AndroidElement my = (AndroidElement) driver.findElements(objectMap.getLocator("market.android.my")).get(3);
        my.click();
        baseWidget basewidget = new baseWidget();
        if(basewidget.isElementExist(objectMap.getLocator("market.android.userTabName"))){
            String tabName = driver.findElement(objectMap.getLocator("market.android.userTabName")).getText();
            if(tabName.equals(name)){
                System.out.println("用户信息校验成功");
            }else {
                System.out.println("用户信息校验失败");
            }
        }else {
            System.out.println("用户信息tabName元素获取失败");
        }
    }

    @Override
    public void getTagName() throws Exception {

    }

    @Override
    public void click() {

    }
}
