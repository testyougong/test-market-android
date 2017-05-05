package com.market.uitest.homeTest;

import com.market.base.Base;
import com.market.pages.homePages.FocusPageCase;
import com.market.pages.homePages.FocusPageTest;
import com.market.pages.homePages.HomePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by zhouxin on 17/3/9.
 */
public class FocusTest extends Base{
    @BeforeClass
    public void setUp() throws Exception{
        prepareAndroidForAppium();
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public static void testFocus() throws Exception {
        //初始化
        FocusPageTest focusPageTest = new FocusPageTest();
        HomePage focus = new FocusPageCase();
        //测试轮播图滑动
        focusPageTest.swipe(focus);
        //测试轮播图点击
        focusPageTest.click(focus);
    }
}
