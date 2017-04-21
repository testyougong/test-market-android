package com.market.uitest;

import com.market.pages.homePages.bannerPageCase;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.market.base.Base;

/**
 * Created by zhouxin on 17/3/6.
 */
public class bannerPageTest extends Base{
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
        bannerPageCase bannerpagecase = new bannerPageCase();
        //测试banner点击
        bannerpagecase.clickBanner();

    }
}
