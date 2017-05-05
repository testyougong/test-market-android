package com.market.uitest.myTest;

import com.market.base.Base;
import com.market.base.Constant;
import com.market.pages.myPages.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by zhouxin on 17/4/25.
 */
public class UserTest extends Base {
    @BeforeClass
    public void setUp() throws Exception{
        prepareAndroidForAppium();
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public static void testUser() throws Exception {
        //初始化
        UserPageTest userPageTest = new UserPageTest();
        MyPage user = new UserPageCase(Constant.phone);
        //测试我的页面tagName
        userPageTest.getTabName(user);
    }
}
