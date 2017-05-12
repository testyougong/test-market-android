package com.market.pages.categoryPages;

import com.market.base.Base;
import com.market.base.baseWidget;
import io.appium.java_client.android.AndroidElement;

import java.util.List;
import java.util.Random;

import static com.market.base.baseWidget.Heading.UP;

/**
 * Created by zhouxin on 17/5/11.
 */
public class CatListCase extends Base implements CategoryPage{
    private final String name = "分类";
    baseWidget basewidget = new baseWidget();
    @Override
    public void getTagName() throws Exception {
        AndroidElement category = (AndroidElement) driver.findElements(objectMap.getLocator("market.android.tab")).get(1);
        category.click();
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
        int randomCounts = random.nextInt(catList.size()-1)%(catList.size()-1-1+1) + 1;
        AndroidElement cat = (AndroidElement) driver.findElements(objectMap.getLocator("market.android.catName")).get(randomCounts);
        cat.click();
        System.out.println("点击"+cat.getText()+"分类成功");
    }

    @Override
    public void swipe() throws Exception {
        AndroidElement startCat = (AndroidElement) driver.findElements(objectMap.getLocator("market.android.catName")).get(0);
        String startCatName = startCat.getText();
        baseWidget.swipeElement(objectMap.getLocator("market.android.catList"),UP);
        AndroidElement endCat = (AndroidElement) driver.findElements(objectMap.getLocator("market.android.catName")).get(0);
        String endCatName = endCat.getText();
        if(startCatName.equals(endCatName)){
            System.out.println("分类列表滑动失败");
        }else{
            System.out.println("分类列表滑动成功");
        }
    }

    @Override
    public void addItem() throws Exception {

    }
}
