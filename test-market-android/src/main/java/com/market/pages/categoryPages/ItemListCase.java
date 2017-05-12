package com.market.pages.categoryPages;

import com.market.base.Base;
import com.market.base.baseWidget;
import io.appium.java_client.android.AndroidElement;

import java.util.List;
import java.util.Random;

/**
 * Created by zhouxin on 17/5/11.
 */
public class ItemListCase extends Base implements CategoryPage{
    baseWidget basewidget = new baseWidget();
    @Override
    public void getTagName() throws Exception {

    }

    @Override
    public void click() throws Exception {

    }

    @Override
    public void swipe() throws Exception {

    }

    @Override
    public void addItem() throws Exception {
        List<AndroidElement> itemList = driver.findElements(objectMap.getLocator("market.android.item"));
        Random random = new Random();
        int itemCounts = random.nextInt(itemList.size()-1)%(itemList.size()-1-1+1) + 1;
        AndroidElement addButton = (AndroidElement) driver.findElements(objectMap.getLocator("market.android.add")).get(itemCounts-1);
        if(basewidget.isElementExist(objectMap.getLocator("market.android.min["+itemCounts+"]"))){
            String minName = driver.findElement(objectMap.getLocator("market.android.min["+itemCounts+"]")).getText();
            if(minName.length() > 3){
                String min = minName.substring(0,minName.length()-3);
                int minCount = Integer.parseInt(min);
                addButton.click();
                String num = driver.findElement(objectMap.getLocator("market.android.min["+itemCounts+"]")).getText();
                int count = Integer.parseInt(num);
                if(minCount == count){
                    System.out.println("分类页加车成功");
                }else{
                    System.out.println("分类页加车失败或超出限购量");
                }
            }else {
                AndroidElement nameElement = (AndroidElement) driver.findElements(objectMap.getLocator("market.android.skuName")).get(itemCounts-1);
                String skuName = nameElement.getText();
                System.out.print("该商品已经添加至购物车,商品名为:"+skuName+",");
                int nowCount = Integer.parseInt(minName);
                System.out.println("当前已经添加了"+nowCount+"个");
                addButton.click();
                String num = driver.findElement(objectMap.getLocator("market.android.min["+itemCounts+"]")).getText();
                int count = Integer.parseInt(num);
                if(count == nowCount + 1){
                    System.out.println("分类页加车成功");
                }else{
                    System.out.println("分类页加车失败或超出限购量");
                }
            }

        }else {
            int moq = 1;//最小起订量
            addButton.click();
            String num = driver.findElement(objectMap.getLocator("market.android.min["+itemCounts+"]")).getText();
            int count = Integer.parseInt(num);
            if(count == moq){
                System.out.println("分类页加车成功");
            }else{
                System.out.println("分类页加车失败或超出限购量");
            }
        }


    }
}
