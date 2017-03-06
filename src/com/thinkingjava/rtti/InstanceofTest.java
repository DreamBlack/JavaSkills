package com.thinkingjava.rtti;

/**
 * *****************************************************************************************
 * 类描述：instanceof 和 直接比较Class很重要的差别就是instanceof考虑继承结构，而使用equals或者==不考虑继承结构
 *
 * @author: wycheng @date： 2017年3月6日 下午8:41:52
 * @version 1.0
 * 
 *******************************************************************************************
 */
public class InstanceofTest {
	public static void main(String[] args) {
		/**
		 * instanceof是运算符只被用于对象引用变量，检查左边的被测试对象是不是右边类或接口的实例化。
		 * 如果被测对象是null值，则测试结果总是false。
		 */
		String str1 = new String("测试");
		System.out.println(str1 instanceof String);
		// 输出true。
		
		/**
		 * isInstance(Object obj)方法，这个方法与instanceof等价，其中obj是被测试的对象，
		 * 如果obj是调用这个方法的class或接口的实例，则返回true。
		 */
		String str2 = new String("测试");
		System.out.println(String.class.isInstance(str2));
		// 输出true。
		
		/**
		 * isAssignableFrom(Class cls)方法，如果调用这个方法的class或接口与参数cls表示的类或接口相同，
		 * 或者是参数cls表示的类或接口的父类，则返回true。
		 */
		System.out.println(String.class.isAssignableFrom(Object.class));
		System.out.println(Object.class.isAssignableFrom(String.class));
		// 其中第一个输出false，第二个输出true。
	}
}
