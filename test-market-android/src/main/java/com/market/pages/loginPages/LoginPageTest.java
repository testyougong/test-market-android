package com.market.pages.loginPages;

/**
 * Created by zhouxin on 17/4/25.
 */
public class LoginPageTest {
    public void getTagName(LoginPage login) throws Exception {
        login.getTagName();
    }

    public void testLogin(LoginPage login) throws Exception{
        login.login();
    }
}
