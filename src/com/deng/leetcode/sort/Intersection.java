package com.deng.leetcode.sort;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 第349题：两个数组的交集
 * 给定两个数组，编写一个函数来计算它们的交集。
 * 
 *  示例 1:
 * 
 *  输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2]
 * 
 * 
 *  示例 2:
 * 
 *  输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [9,4]
 * 
 *  说明:
 * 
 * 
 *  输出结果中的每个元素一定是唯一的。
 *  我们可以不考虑输出结果的顺序。 
 */
public class Intersection {
	/**
	 * 9 ms	37.5 MB
	 * @date 2019-08-26
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<>();
		Set<Integer> result = new HashSet<>();
		int length1 = nums1.length;
		int length2 = nums2.length;

		if(length1 < length2){
			for (int i = 0; i < length1; i ++){
				set.add(nums1[i]);
			}
			for (int i = 0; i < length2; i ++){
				if(set.contains(nums2[i])){
					result.add(nums2[i]);
				}
			}
		}else {
			for (int i = 0; i < length2; i ++){
				set.add(nums2[i]);
			}
			for (int i = 0; i < length1; i ++){
				if(set.contains(nums1[i])){
					result.add(nums1[i]);
				}
			}
		}

		int[] arrResult = new int[result.size()];
		int index = 0;
		Iterator<Integer> iterator = result.iterator();
		while (iterator.hasNext()){
			arrResult[index++] = iterator.next();
		}
		return arrResult;
	}
}
