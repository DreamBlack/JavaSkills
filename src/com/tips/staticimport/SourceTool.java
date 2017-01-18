package com.tips.staticimport;

/**
 * Created by wycheng on 17-1-18.
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
