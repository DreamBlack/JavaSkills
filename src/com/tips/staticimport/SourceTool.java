package com.tips.staticimport;

/**
 * *****************************************************************************************
 * 类描述：静态工具类
 *
 * @author: wycheng
 * @date： 2017年3月4日 下午6:56:34
 * @version 1.0
 *
 *
 * Version    Date       ModifiedBy                 Content
 * -------- ---------    ----------         ------------------------
 * 1.0      2017年3月4日       chengwenyao                             
 *******************************************************************************************
 */
public class SourceTool {
    public static final int SIZE =7;
    public static final String NAME_PREFIX = "DR.";

    public static final void f(){
        System.out.println("This is a func can be used by static manner...");
    }

    public  final void ff(){
        System.out.println("This is a func can't be used by static manner...");
    }
}
