package com.tips.staticimport;

import static com.tips.staticimport.SourceTool.*;
/**
 * Created by wycheng on 17-1-18.
 */
public class StaticImport {
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
