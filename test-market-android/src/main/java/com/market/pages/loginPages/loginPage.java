package com.market.pages.loginPages;

import com.market.base.Base;

/**
 * Created by zhouxin on 17/3/8.
 */
public abstract class loginPage extends Base{
    public abstract void testLogin() throws Exception;
    public abstract String getLoginTagName() throws Exception;
}
