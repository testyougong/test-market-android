package com.market.pages.myPages;

import com.market.base.Base;
import com.market.base.baseWidget;
import io.appium.java_client.android.AndroidElement;

import java.util.List;

/**
 * Created by zhouxin on 17/5/5.
 */
public class OrderPageCase extends Base implements OrderPage {
    baseWidget basewidget = new baseWidget();
    @Override
    public void getTabName() throws Exception {
        AndroidElement my = (AndroidElement) driver.findElements(objectMap.getLocator("market.android.my")).get(3);
        my.click();
        if(basewidget.isElementExist(objectMap.getLocator("market.android.orderTabName"))){
            String tabName = driver.findElement(objectMap.getLocator("market.android.orderTabName")).getText();
            if(tabName.equals("全部订单")){
                System.out.println("全部订单tabName校验成功");
            }else {
                System.out.println("全部订单tabName校验失败");
            }
        }else {
            System.out.println("全部订单tabName元素获取失败");
        }
    }

    @Override
    public void getDefaultOrderStatusTab() throws Exception {
        if(basewidget.isElementExist(objectMap.getLocator("market.android.defaultOrderStatusTabName"))){
            String defaultOrderStatusTabName = driver.findElement(objectMap.getLocator("market.android.defaultOrderStatusTabName")).getText();
            if(defaultOrderStatusTabName.equals("全部")){
                System.out.println("我的订单defaultOrderStatusTabName校验成功");
            }else {
                System.out.println("我的订单defaultOrderStatusTabName校验失败");
            }
        }else {
            System.out.println("我的订单defaultOrderStatusTabName元素获取失败");
        }
    }

    @Override
    public void orderStatusTabClick() throws Exception {
        List<AndroidElement> list = driver.findElements(objectMap.getLocator("market.android.orderStatusTab"));
        for(int i = 1;i < list.size();i++){
            AndroidElement orderStatusTab = (AndroidElement) driver.findElements(objectMap.getLocator("market.android.orderStatusTab")).get(i);
            orderStatusTab.click();
        }

    }

    @Override
    public void getTagName() throws Exception {
        AndroidElement order = (AndroidElement) driver.findElement(objectMap.getLocator("market.android.orderTabName"));
        order.click();
        baseWidget basewidget = new baseWidget();
        if(basewidget.isElementExist(objectMap.getLocator("market.android.orderTagName"))){
            String tabName = driver.findElement(objectMap.getLocator("market.android.orderTagName")).getText();
            if(tabName.equals("我的订单")){
                System.out.println("我的订单tagName校验成功");
            }else {
                System.out.println("我的订单tagName校验失败");
            }
        }else {
            System.out.println("我的订单tagName元素获取失败");
        }
    }


}
