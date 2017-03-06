package com.thinkingjava.rtti;


class Gum {
	static {
		System.out.println("Loading Gum");
	}
}

/**
 * *****************************************************************************************
 * 类描述：验证Class对象仅在需要的时候才加载，static初始化是在类加载时进行的
 *
 * @author: wycheng 
 * @date： 2017年3月6日 下午8:03:12
 * @version 1.0
 *******************************************************************************************
 */
public class ClassLoad {
	static{
		System.out.println("Loading SweetShop...");
	}
	public static void main(String[] args) {
		try {
			Class.forName("com.thinkingjava.rtti.Gum");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
