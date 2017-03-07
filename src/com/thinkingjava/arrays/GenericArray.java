package com.thinkingjava.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * *****************************************************************************************
 * 类描述：Java泛型与数组
 *
 * @author: wycheng @date： 2017年3月7日 下午9:10:10
 * @version 1.0
 * 
 *******************************************************************************************
 */
public class GenericArray {
	public static void main(String[] args) {
		// Java不能创建泛型数组
		// error: Cannot create a generic array of ArrayList<String>
		// ArrayList<String>[] as = new ArrayList<String>[10];

		/**
		 * Java中的泛型并不像C++那样会在编译时实例化成具体的类，
		 * 或者说Java中的泛型是“伪泛型”。对于一个泛型，程序无法获得它的具体的参数类型， 
		 * 也就是说：ArrayList<String> a =
		 * new ArrayList<String>();
		 * 声明a之后，你没法检查a的类型是ArrayList<String>还是ArrayList<Integer>，
		 * 只能知道a是ArrayList的一个实例化对象。
		 */
		ArrayList<String> a = new ArrayList<String>();
		System.out.println(a.getClass().toString());
		System.out.println(Arrays.toString(a.getClass().getTypeParameters()));
		/**
		 * 可以看出，获得a的具体类型的企图落空了。 泛型的这种机制在Java中叫做擦除。 
		 * 即，泛型的具体类型信息会被擦除到它的原生类型或者类型边界。
		 */

		/**
		 * 类型边界是Java泛型的另一个特性： class Temp<T extends Par> {...}
		 * Temp是泛型的名字，Par是边界类的名字。在定义一个泛型的时候，
		 * 可以通过extends关键词来指定T的导出类型（T的父类），擦除的时候，会擦除到边界，即Par。
		 * 而Java中的数组必须知道它所持有的确切类型。 数组名是一个标识符，是一个指向堆栈中的数组对象的引用。
		 * 如果是基本数据类型的数组，那么这个数组对象中存放着length等信息以及各个元素的值，
		 * 如果是引用类型的数组，那么这个数组对象中存放着length等信息以及各个元素的引用。
		 * 数组在定义时就必须有确切的类型，所有存入数组的元素都必须转化成数组的类型。 
		 * 所以Java中泛型和数组可谓水火不相容。
		 */
	}
}
