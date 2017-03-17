package com.market.uitest;

import com.market.base.Base;
import com.market.pages.homePages.bannerPageCase;
import com.market.pages.homePages.catPageCase;
import org.junit.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Created by zhouxin on 17/3/15.
 */
public class catPageTest extends Base{
    @BeforeClass
    public void setUp() throws Exception{
        prepareAndroidForAppium();
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void testCat() throws Exception {
        //初始化
        catPageCase catpagecase = new catPageCase();
        //测试banner点击
        catpagecase.clickCat();

    }
}
