package com.market.pages.loginPages;

import com.market.base.Constant;
import com.market.base.baseWidget;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

/**
 * Created by zhouxin on 17/3/8.
 */
public class loginPageCase extends loginPage{
    private final String name = "登录";
    public String getLoginTagName() throws Exception {
        baseWidget basewidget = new baseWidget();
        if(basewidget.isElementExist(objectMap.getLocator("market.android.loginTagName"))){
            String tagName = driver.findElement(objectMap.getLocator("market.android.loginTagName")).getText();
            if(tagName.equals(name)){
                return "访问登录页面成功";
            }else {
                return "进入了错误的页面";
            }
        }else {
            return "登录页tagName获取元素失败";
        }
    }

    public void testLogin() throws Exception{
        baseWidget bw = new baseWidget();
        WebElement cellphone = driver.findElement(objectMap.getLocator("market.android.phone"));
        WebElement password = driver.findElement(objectMap.getLocator("market.android.password"));
        String cellphoneText = cellphone.getAttribute("text");
        if(cellphone.getText()!="请输入手机号"){
            driver.findElement(objectMap.getLocator("market.android.clearButton")).click();
        }
        cellphone.sendKeys(Constant.phone);
        password.sendKeys(Constant.password);
        driver.findElement(objectMap.getLocator("market.android.loginButton")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        if(bw.isTextEquals(objectMap.getLocator("market.android.loginTagName"),name)){
            System.out.println("登录成功");
        }else
            System.out.println("登录失败");
    }

}
