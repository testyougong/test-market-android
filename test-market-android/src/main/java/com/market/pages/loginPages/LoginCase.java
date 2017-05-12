package com.market.pages.loginPages;

import com.market.base.Base;
import com.market.base.Constant;
import com.market.base.baseWidget;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

/**
 * Created by zhouxin on 17/3/8.
 */
public class LoginCase extends Base implements LoginPage {
    private final String name = "登录";
    baseWidget basewidget = new baseWidget();
    public void getTagName() throws Exception {
        if(basewidget.isElementExist(objectMap.getLocator("market.android.loginTagName"))){
            String tagName = driver.findElement(objectMap.getLocator("market.android.loginTagName")).getText();
            if(tagName.equals(name)){
                System.out.println("访问登录页面成功");
            }else {
                System.out.println("访问登录页失败,进入了错误的页面");
            }
        }else {
            System.out.println("登录页tagName获取元素失败");
        }
    }

    public void login() throws Exception{
        WebElement cellphone = driver.findElement(objectMap.getLocator("market.android.phone"));
        WebElement password = driver.findElement(objectMap.getLocator("market.android.password"));
        //String cellphoneText = cellphone.getAttribute("text");
        if(!(cellphone.getText().equals("请输入手机号"))){
            driver.findElement(objectMap.getLocator("market.android.clearButton")).click();
        }
        cellphone.sendKeys(Constant.phone);
        password.sendKeys(Constant.password);
        driver.findElement(objectMap.getLocator("market.android.loginButton")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        if(baseWidget.isTextEquals(objectMap.getLocator("market.android.loginTagName"),name)){
            System.out.println("登录成功");
        }else
            System.out.println("登录失败");
    }

}
