package com.market.uitest;

import com.market.base.Base;
import com.market.pages.homePages.focusPageCase;
import com.market.pages.loginPages.loginPageCase;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by zhouxin on 17/3/9.
 */
public class focusPageTest extends Base{
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
        focusPageCase focusPageCase = new focusPageCase();
        //测试轮播图滑动
        focusPageCase.swipeFocus();
        //测试轮播图点击
        focusPageCase.clickFocus();
    }
}
