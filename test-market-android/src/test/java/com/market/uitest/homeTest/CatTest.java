package com.market.uitest.homeTest;

import com.market.base.Base;
import com.market.pages.homePages.CatPageCase;
import com.market.pages.homePages.CatPageTest;
import com.market.pages.homePages.HomePage;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Created by zhouxin on 17/3/15.
 */
public class CatTest extends Base{
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
        CatPageTest catPageTest = new CatPageTest();
        HomePage cat = new CatPageCase();
        //测试cat点击
        catPageTest.click(cat);

    }
}
