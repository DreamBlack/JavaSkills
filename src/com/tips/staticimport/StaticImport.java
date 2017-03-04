package com.tips.staticimport;

import static com.tips.staticimport.SourceTool.*;

/**
 * *****************************************************************************************
 * 类描述：静态导入静态工具类内部的函数及变量
 *
 * @author: wycheng
 * @date： 2017年3月4日 下午6:56:47
 * @version 1.0
 *
 *
 * Version    Date       ModifiedBy                 Content
 * -------- ---------    ----------         ------------------------
 * 1.0      2017年3月4日       chengwenyao                             
 *******************************************************************************************
 */
public class StaticImport {
    // Effective Java 2nd Edition. Item 30
    public static void main(String[] args) {
        f();
        System.out.println(SIZE);
        System.out.println(NAME_PREFIX);
        System.out.println(SourceTool.SIZE);

        // Error: ff()
        SourceTool st = new SourceTool();
        System.out.println(st.SIZE);
        st.ff();
    }
}
