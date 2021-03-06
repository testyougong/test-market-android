package com.market.base;

import io.appium.java_client.TouchAction;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

/**
 * Created by zhouxin on 17/3/8.
 */
public class baseWidget extends Base{
    //判断元素是否存在
    public static boolean isElementExist(By by){
        try{
            driver.findElement(by);
            return true;
        }catch(Exception e){
            //e.printStackTrace();
            return false;
        }
    }

    //判断元素是否存在
    public static boolean isElementsExist(By by,int n){
        try{
            driver.findElements(by).get(n);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    //判断某一位置的文案是否一致
    public static boolean isTextEquals(By by,String text){
        try{
            driver.findElement(by).getText().equals(text);
            return true;
        }catch(Exception e){
            //e.printStackTrace();
            return false;
        }
    }

    //native和webview相互切换,0为native,1为webview
    public static void webview(int a){
        Set<String> contextNames = driver.getContextHandles();
        driver.context((String) contextNames.toArray()[a]);
    }

    //抓toast
    public static WebElement waitForElement(By by, int timeout, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return element;
    }

    /*旧版,现在不用了
    //清除文本内容
    public void clearText(String text) {
        driver.sendKeyEvent(123);
        for (int i = 0; i < text.length(); i++) {
            driver.sendKeyEvent(67);
        }
    }
    */

    //获取当前时间
    public static String time(){
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return dateFormat.format(date);
    }


    //截图存放到本地
    public static void takeScreenshots(){
        File screen = driver.getScreenshotAs(OutputType.FILE);
        File screenFile = new File("/Users/zhouxin/Desktop/" + baseWidget.time() + ".jpg");
        try {
            FileUtils.copyFile(screen, screenFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //长按
    public static void longPress(By by){
        TouchAction action = new TouchAction(driver);
        WebElement element = driver.findElement(by);
        action.longPress(element).perform();
    }

    //按住不放
    public static void press(By by){
        TouchAction action = new TouchAction(driver);
        //按住等待5秒后释放
        action.press(driver.findElement(by)).waitAction(5000);
        action.perform();
    }

    //滑动屏幕
    public static void swipeToUp(int during){
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        driver.swipe(width*1/2, height*1/4, width*1/2, height*3/4, during);
    }
    public static void swipeToDown(int during){
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        driver.swipe(width*1/2, height*3/4, width*1/2, height*1/4, during);
    }
    public static void swipeToLeft(int during){
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        driver.swipe(width*1/4, height*1/4, width*3/4, height*1/4, during);
    }
    public static void swipeToRight(int during){
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        driver.swipe(width*3/4, height*1/2, width*1/4, height*1/2, during);
    }

    //水平拖动控件
    public void swipeView(String Name,int moveX,int duration){
        int startX=driver.findElementByName(Name).getLocation().getX();
        System.out.println("当前对象的X坐标"+startX);
        int startY=driver.findElementByName(Name).getLocation().getY();
        System.out.println("当前对象的Y坐标"+startY);
        int toX = startX+moveX;
        int toY = startY;
        driver.swipe(startX,startY,toX,toY,duration);
		     /*int startX1=driver.findElementByName(Name).getLocation().getX();
		     System.out.println(toX+"+"+startX1);
		     while (startX1!=toX){
		       	driver.swipe(startX1,startY,toX,toY,duration);
		       	int startX11=driver.findElementByName(Name).getLocation().getX();
		     	startX1=startX11;
		     	}*/
    }
    /**
     * 控制滑动方向
     */
    public enum Heading {
        UP, DOWN,LEFT,RIGHT
    }
    //滑动指定元素
    public static void swipeElement(By by, Heading heading) {
        // 获取控件开始位置的坐标轴
        Point start = driver.findElement(by).getLocation();
        int startX = start.x;
        int startY = start.y;

        // 获取控件坐标轴差
        Dimension q = driver.findElement(by).getSize();
        int x = q.getWidth();
        int y = q.getHeight();
        // 计算出控件结束坐标
        int endX = x + startX;
        int endY = y + startY;

        // 计算中间点坐标
        int centreX = (endX + startX) / 2;
        int centreY = (endY + startY) / 2;

        switch (heading) {
            // 向上滑动
            case UP:
                driver.swipe(centreX, centreY + 100, centreX, centreY - 100, 500);
                break;
            // 向下滑动
            case DOWN:
                driver.swipe(centreX, centreY - 100, centreX, centreY + 100, 500);
                break;
            //向左滑动
            case LEFT:
                driver.swipe(centreX - 100, centreY, centreX + 100, centreY, 500);
                break;
            //向右滑动
            case RIGHT:
                driver.swipe(centreX + 100, centreY, centreX - 100, centreY, 500);
                break;
        }
    }
}
