package com.market.pages.myPages;

/**
 * Created by zhouxin on 17/5/5.
 */
public interface OrderPage {
    void getTagName() throws Exception;
    void getTabName() throws Exception;
    void getDefaultOrderStatusTab() throws Exception;
    void orderStatusTabClick() throws Exception;
}
