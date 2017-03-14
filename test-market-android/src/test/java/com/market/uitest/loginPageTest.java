package com.market.uitest;

import com.market.pages.loginPages.loginPageCase;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.market.base.Base;

/**
 * Created by zhouxin on 17/3/8.
 */
public class loginPageTest extends Base{
    @BeforeClass
	public void setUp() throws Exception{
        prepareAndroidForAppium();
    }

    @AfterClass
	public void tearDown() throws Exception {
		driver.quit();
	}

    @Test
    public static void testLogin() throws Exception {
        //初始化
        loginPageCase loginpagecase = new loginPageCase();
        //测试登录页面tagName
        String loginTagNameCheck = loginpagecase.getLoginTagName();
        System.out.println(loginTagNameCheck);
        //测试登录
        loginpagecase.testLogin();
    }
}
