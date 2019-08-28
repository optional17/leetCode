package com.deng.leetcode.math;

/**
 * 第9题：回文数
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。 
 * 
 *  示例 1: 
 * 
 *  输入: 121
 * 输出: true
 *  
 * 
 *  示例 2: 
 * 
 *  输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 *  
 * 
 *  示例 3: 
 * 
 *  输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 *  
 * 
 *  进阶: 
 * 
 *  你能不将整数转为字符串来解决这个问题吗？ 
 */
public class IsPalindrome {

	/**
	 * 19 ms	39.6 MB
	 * @date 2019-08-28
	 * @param x
	 * @return
	 */
	public boolean isPalindrome(int x) {
		if(x < 0){
			return false;
		}

		char[] chars = String.valueOf(x).toCharArray();
		int length = chars.length;
		for(int i = 0,j = length/2; i < j; i ++){
			if(chars[i] != chars[length - 1 - i]){
				return false;
			}
		}
		return true;
	}
}
