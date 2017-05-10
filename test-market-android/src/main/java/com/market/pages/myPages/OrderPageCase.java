package com.market.pages.myPages;

import com.market.base.Base;
import com.market.base.baseWidget;
import io.appium.java_client.android.AndroidElement;

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
    public void orderStatusCheck() throws Exception {
        for(int i = 0;i < 4;i++){
            baseWidget.swipeToRight(500);
            if(basewidget.isElementExist(objectMap.getLocator("market.android.orderItem"))) {
                AndroidElement orderItem = (AndroidElement) driver.findElements(objectMap.getLocator("market.android.orderItem")).get(0);
                orderItem.click();
                AndroidElement orderStatus = (AndroidElement) driver.findElement(objectMap.getLocator("market.android.detailOrderStatus"));
                String expectStatus = null;
                switch (i) {
                    case 0:
                        expectStatus = "待发货";
                        if (orderStatus.getText().equals(expectStatus)) {
                            System.out.println("订单待发货状态验证成功");
                            driver.findElement(objectMap.getLocator("market.android.back")).click();
                        } else {
                            System.out.println("期望状态:"+expectStatus+","+"实际状态:" + orderStatus.getText());
                            driver.findElement(objectMap.getLocator("market.android.back")).click();
                        }break;
                    case 1:
                        expectStatus = "待收货";
                        if (orderStatus.getText().equals(expectStatus)) {
                            System.out.println("订单待收货状态验证成功");
                            driver.findElement(objectMap.getLocator("market.android.back")).click();
                        } else {
                            System.out.println("期望状态:"+expectStatus+","+"实际状态:" + orderStatus.getText());
                            driver.findElement(objectMap.getLocator("market.android.back")).click();
                        }break;
                    case 2:
                        expectStatus = "已送达";
                        if ((orderStatus.getText().equals(expectStatus))) {
                            System.out.println("订单已送达状态验证成功");
                            driver.findElement(objectMap.getLocator("market.android.back")).click();
                        } else {
                            System.out.println("期望状态:"+expectStatus+","+"实际状态:" + orderStatus.getText());
                            driver.findElement(objectMap.getLocator("market.android.back")).click();
                        }break;
                    case 3:
                        expectStatus = "已完成";
                        if (orderStatus.getText().equals(expectStatus)) {
                            System.out.println("订单已完成状态验证成功");
                            driver.findElement(objectMap.getLocator("market.android.back")).click();
                        } else {
                            System.out.println("期望状态:"+expectStatus+","+"实际状态:" + orderStatus.getText());
                            driver.findElement(objectMap.getLocator("market.android.back")).click();
                        }break;
                    default:
                        break;
                }
            }else{
                continue;
            }
        }
        for(int j = 0;j < 4;j++) {
            baseWidget.swipeToLeft(500);
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
