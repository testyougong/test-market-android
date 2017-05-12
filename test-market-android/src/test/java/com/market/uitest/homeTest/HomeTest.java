package com.market.uitest.homeTest;

import com.market.base.Base;
import com.market.pages.homePages.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by zhouxin on 17/5/11.
 */
public class HomeTest extends Base {
    @BeforeClass
    public void setUp() throws Exception{
        prepareAndroidForAppium();
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public static void testHome() throws Exception {
        //初始化
        HomePageTest homePageTest = new HomePageTest();
        HomePage focus = new FocusCase();
        HomePage banner = new BannerCase();
        HomePage cat = new CatCase();
        //测试轮播图滑动
        homePageTest.swipe(focus);
        //测试轮播图点击
        homePageTest.click(focus);
        //测试cat点击
        homePageTest.click(cat);
        //测试banner点击
        homePageTest.click(banner);


    }
}
