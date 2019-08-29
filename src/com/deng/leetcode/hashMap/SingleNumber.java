package com.deng.leetcode.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 第136题：只出现一次的数字
 *
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。 
 * 
 *  说明： 
 * 
 *  你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？ 
 * 
 *  示例 1: 
 * 
 *  输入: [2,2,1]
 * 输出: 1
 *  
 * 
 *  示例 2: 
 * 
 *  输入: [4,1,2,1,2]
 * 输出: 4 
 *  Related Topics 位运算 哈希表
 */
public class SingleNumber {

	public int singleNumber(int[] nums) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i : nums){
			if(map.containsKey(i)){
				map.put(i,map.get(i) + 1);
			}else {
				map.put(i,1);
			}
		}
		Iterator<Integer> iterator = map.keySet().iterator();
		while (iterator.hasNext()){
			int num = iterator.next();
			if(map.get(num) == 1){
				return num;
			}
		}
		return 0;
	}
}
