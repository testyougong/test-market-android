package com.market.uitest.myTest;

import com.market.base.Base;
import com.market.base.Constant;
import com.market.pages.myPages.MyPage;
import com.market.pages.myPages.MyCase;
import com.market.pages.myPages.MyPageTest;
import com.market.pages.myPages.UserCase;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by zhouxin on 17/4/25.
 */
public class MyTest extends Base{
    @BeforeClass
    public void setUp() throws Exception{
        prepareAndroidForAppium();
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public static void testMy() throws Exception {
        //初始化
        MyPageTest myPageTest = new MyPageTest();
        MyPage my = new MyCase();
        MyPage user = new UserCase(Constant.phone);
        //测试我的页面tagName
        myPageTest.getTagName(my);
        //测试我的页面用户tabName
        myPageTest.getTabName(user);
    }
}
