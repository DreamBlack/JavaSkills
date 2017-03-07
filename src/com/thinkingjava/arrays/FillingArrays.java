package com.thinkingjava.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * *****************************************************************************************
 * 类描述：Arrays类中d的实用方法
 *
 * @author: wycheng @date： 2017年3月7日 下午8:09:58
 * @version 1.0
 * 
 *******************************************************************************************
 */
public class FillingArrays {
	public static void main(String[] args) {
		// -----------fill()----------------
		boolean[] a1 = new boolean[10];
		Arrays.fill(a1, true);
		System.out.println(Arrays.toString(a1));

		// ------------arrayCopy()-----------
		boolean[] j = new boolean[20];
		// System.arraycopy()不会执行自动包装盒自动拆包，两个数组必须具有相同的确切类型
		System.arraycopy(a1, 0, j, 0, a1.length);
		System.out.println(Arrays.toString(j));

		// --------------equals()--------------
		int[] aa = new int[10];
		int[] bb = new int[10];
		Arrays.fill(aa, 47);
		Arrays.fill(bb, 47);
		// 数组中的每个位置的元素必须相等，通过调用Object.equals()来比较
		System.out.println(Arrays.equals(aa, bb));

		// --------------sort()--------------
		/**
		 * 使用内置的排序方法，就可以对任意的基本类型数组排序；也可以对任意的对象数组进行排序，
		 * 只要该对象实现了Comparable接口或者具有相关联的Comparator
		 * 
		 * Java标准类库中的排序算法针对基本类型用的是“快速排序”，针对对象设计的“稳定归并排序”
		 */
		Integer[] cc = new Integer[] { 3, 4, 1, 4, 5, 7, 8, 9, 16, 78 };
		Arrays.sort(cc); // 返回void
		System.out.println(Arrays.toString(cc));

		Arrays.sort(cc, Collections.reverseOrder()); // 返回void
		System.out.println(Arrays.toString(cc));
		
		// --------------binarySearch()---------
		/**
		 * 在已排序的数组中查找(默认比较器的话，是要升序排列。若为降序，则需要提供降序比较器)
		 */
		int localtion = Arrays.binarySearch(cc, 4,Collections.reverseOrder());
		System.out.println("location: "+localtion);
	}
}
