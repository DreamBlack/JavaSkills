package com.tips.collectionreturn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * *****************************************************************************************
 * 类描述：
 *
 * @author: wycheng
 * @date： 2017年3月4日 下午6:49:57
 * @version 1.0
 *
 *
 * Version    Date       ModifiedBy                 Content
 * -------- ---------    ----------         ------------------------
 * 1.0      2017年3月4日       chengwenyao                             
 *******************************************************************************************
 */
public class CollectionReturn {
    public static final List<Integer> generateList(Integer... a){
        if(a.length==0){
            // or return new ArrayList<Integer>();
            return Collections.emptyList();
        }else{
            return Arrays.asList(a);
        }
    }
    // Effective Java 2nd Edition. Item 43
    public static void main(String[] args) {
        System.out.println(generateList());
        System.out.println(generateList(1,2,3));
    }
}
