package com.market.uitest.homeTest;

import com.market.pages.homePages.BannerPageTest;
import com.market.pages.homePages.HomePage;
import com.market.pages.homePages.BannerPageCase;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.market.base.Base;

/**
 * Created by zhouxin on 17/3/6.
 */
public class BannerTest extends Base{
    @BeforeClass
    public void setUp() throws Exception{
        prepareAndroidForAppium();
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void testBanner() throws Exception {
        //初始化
        BannerPageTest bannerPageTest = new BannerPageTest();
        HomePage banner = new BannerPageCase();
        //测试banner点击
        bannerPageTest.click(banner);

    }
}
