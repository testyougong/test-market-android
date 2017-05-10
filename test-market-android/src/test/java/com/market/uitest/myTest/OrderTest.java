package com.market.uitest.myTest;

import com.market.base.Base;
import com.market.pages.myPages.OrderPage;
import com.market.pages.myPages.OrderPageCase;
import com.market.pages.myPages.OrderPageTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by zhouxin on 17/5/5.
 */
public class OrderTest extends Base{
    @BeforeClass
    public void setUp() throws Exception{
        prepareAndroidForAppium();
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public static void testOrder() throws Exception {
        //初始化
        OrderPageTest orderPageTest = new OrderPageTest();
        OrderPage order = new OrderPageCase();
        //测试我的页面全部订单tabName
        orderPageTest.getTabName(order);
        //测试我的订单页面tagName
        orderPageTest.getTagName(order);
        //测试订单状态准确性
        orderPageTest.orderStatusCheck(order);
    }
}
