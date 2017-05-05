package com.market.uitest.loginTest;

import com.market.pages.loginPages.LoginPage;
import com.market.pages.loginPages.LoginPageCase;
import com.market.pages.loginPages.LoginPageTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.market.base.Base;

/**
 * Created by zhouxin on 17/3/8.
 */
public class LoginTest extends Base{
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
        LoginPage login = new LoginPageCase();
        LoginPageTest loginPageTest = new LoginPageTest();
        //测试登录页面tagName
        loginPageTest.getTagName(login);
        //测试登录
        loginPageTest.testLogin(login);
    }
}
