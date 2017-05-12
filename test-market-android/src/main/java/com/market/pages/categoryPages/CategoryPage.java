package com.market.pages.categoryPages;

/**
 * Created by zhouxin on 17/5/11.
 */
public interface CategoryPage {
    void getTagName() throws Exception;
    void click() throws Exception;
    void swipe() throws Exception;
    void addItem() throws Exception;
}
