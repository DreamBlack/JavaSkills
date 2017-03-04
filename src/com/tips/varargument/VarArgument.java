package com.tips.varargument;

import java.util.Arrays;

/**
 * *****************************************************************************************
 * 类描述：测试可变参数功能
 *
 * @author: wycheng
 * @date： 2017年3月4日 下午6:58:20
 * @version 1.0
 *
 *
 * Version    Date       ModifiedBy                 Content
 * -------- ---------    ----------         ------------------------
 * 1.0      2017年3月4日       chengwenyao                             
 *******************************************************************************************
 */
public class VarArgument {
    public static int f(int... args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("You must input at least 1 argument");
        }
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Effective Java 2nd Edition. Item 42
        try {
            System.out.println(f(1, 2, 3, 4, 5));
            System.out.println(f());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(Arrays.asList(1, 2, 3, 4, 5));
        int[] a = {1, 2, 3, 4, 5};
        // 'a' as the only input argument here.
        System.out.println(Arrays.asList(a));

    }
}
