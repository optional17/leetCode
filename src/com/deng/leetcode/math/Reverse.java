package com.deng.leetcode.math;

/**
 * 第7题：整数反转
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。 
 * 
 *  示例 1: 
 * 
 *  输入: 123
 * 输出: 321
 *  
 * 
 *  示例 2: 
 * 
 *  输入: -123
 * 输出: -321
 *  
 * 
 *  示例 3: 
 * 
 *  输入: 120
 * 输出: 21
 *  
 * 
 *  注意: 
 * 
 *  假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231, 231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。 
 * 
 */
public class Reverse {

	/**
	 * 5 ms	34.2 MB
	 * @date 2019-08-19
	 * @param x
	 * @return
	 */
	public int reverse(int x) {
		boolean lessZero = false;
		if(x < 0){
			lessZero = true;
			x = 0 - x;
		}

		char[] chars = String.valueOf(x).toCharArray();
		int l = chars.length;
		for(int i = 0, j = l/2; i < j; i++){
			char a = chars[i];
			chars[i] = chars[l - i - 1];
			chars[l - i - 1] = a;
		}
		int result;
		try {
			result  = Integer.valueOf(String.valueOf(chars));
		}catch (Exception e){
			return 0;
		}


		if(lessZero){
			result = 0 - result;
		}
		return result;
	}
}
