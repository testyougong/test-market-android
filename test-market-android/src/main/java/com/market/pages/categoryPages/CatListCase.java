package com.market.pages.categoryPages;

import com.market.base.Base;
import com.market.base.baseWidget;
import io.appium.java_client.android.AndroidElement;

import java.util.List;
import java.util.Random;

/**
 * Created by zhouxin on 17/5/11.
 */
public class CatListCase extends Base implements CategoryPage{
    private final String name = "分类";
    baseWidget basewidget = new baseWidget();
    @Override
    public void getTagName() throws Exception {
        if(basewidget.isElementExist(objectMap.getLocator("market.android.categoryTagName"))){
            String tagName = driver.findElement(objectMap.getLocator("market.android.categoryTagName")).getText();
            if(tagName.equals(name)){
                System.out.println("访问分类页面成功");
            }else {
                System.out.println("访问分类页失败,进入了错误的页面");
            }
        }else {
            System.out.println("分类页tagName获取元素失败");
        }
    }

    @Override
    public void click() throws Exception {
        List<AndroidElement> catList = driver.findElements(objectMap.getLocator("market.android.catName"));
        Random random = new Random();
        int randomCounts = random.nextInt(catList.size());
        AndroidElement cat = (AndroidElement) driver.findElements(objectMap.getLocator("market.android.catName")).get(randomCounts);
        cat.click();
    }

    @Override
    public void swipe() throws Exception {

    }

    @Override
    public void addProduct() throws Exception {

    }
}
