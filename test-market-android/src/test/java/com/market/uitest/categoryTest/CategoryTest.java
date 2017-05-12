package com.market.uitest.categoryTest;

import com.market.base.Base;
import com.market.pages.categoryPages.CatListCase;
import com.market.pages.categoryPages.CategoryPage;
import com.market.pages.categoryPages.CategoryPageTest;
import com.market.pages.categoryPages.ItemListCase;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by zhouxin on 17/5/11.
 */
public class CategoryTest extends Base {
    @BeforeClass
    public void setUp() throws Exception{
        prepareAndroidForAppium();
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public static void testCategory() throws Exception {
        //初始化
        CategoryPage catList = new CatListCase();
        CategoryPage itemList = new ItemListCase();
        CategoryPageTest category = new CategoryPageTest();
        //测试分类页tagName
        category.getTagName(catList);
        //测试分类列表点击
        category.click(catList);
        //测试滑动分类列表
        category.swipe(catList);
        //测试分类页加车
        category.addItem(itemList);


    }
}
