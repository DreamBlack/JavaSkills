package com.thinkingjava.rtti;

import java.util.Random;

/**
 * *****************************************************************************************
 * 类描述：使用.class方式生成对Class对象的引用（和Class.forName()比较）
 * 当使用".class"来创建对Class对象的引用时，不会自动地初始化该Class对象
 *
 * @author: wycheng @date： 2017年3月6日 下午8:14:25
 * @version 1.0
 * 
 *******************************************************************************************
 */
class Initable {
	static final int staticFinal = 47;
	static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);

	static {
		System.out.println("Initializing Initable");
	}
}

class Initable2 {
	static int staticNonFinal = 147;

	static {
		System.out.println("Initializing Initable2");
	}
}

class Initable3 {
	static int staticNonFinal = 74;

	static {
		System.out.println("Initializing Initable3");
	}
}

public class ClassInitialization {
	public static Random rand = new Random(47);

	@SuppressWarnings("unused")
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> initable = Initable.class;
		System.out.println("After creating Initable ref");
		/**
		 * 如果一个值是static final的，也就是说是编译器常量，
		 * 那么这个值不需要对Initable类进行初始化就可以被读取，
		 * 这就是staticFinal和staticFinal2的区别
		 */
		// 并没有触发初始化
		System.out.println(Initable.staticFinal); 
		// 触发了初始化
		System.out.println(Initable.staticFinal2);
		
		System.out.println("------------------");
		// 触发了初始化
		System.out.println(Initable2.staticNonFinal);
		
		System.out.println("------------------");
		/**
		 * 在Java SE5中，Class<?>优于平凡的Class，即便它们是等价的，
		 * 主要是因为Class<?>告诉编译器我知道自己在做什么
		 */
		Class<?> initable3 = Class.forName("com.thinkingjava.rtti.Initable3");
		System.out.println("After creating Initable3 ref");
		System.out.println(Initable3.staticNonFinal);

	}
}
