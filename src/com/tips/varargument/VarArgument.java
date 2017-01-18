package com.tips.varargument;

import java.util.Arrays;

/**
 * Created by wycheng on 17-1-18.
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
