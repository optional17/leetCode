package com.deng.leetcode.twoPointers;

/**
 * 第28题：实现 strStr() 函数。
 * 
 *  给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回 -1。 
 * 
 *  示例 1: 
 * 
 *  输入: haystack = "hello", needle = "ll"
 * 输出: 2
 *  
 * 
 *  示例 2: 
 * 
 *  输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 *  
 * 
 *  说明: 
 * 
 *  当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。 
 * 
 *  对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。 
 */
public class StrStr {

	/**
	 * 1 ms	36.7 MB
	 * @date 2019-08-26
	 * @param haystack
	 * @param needle
	 * @return
	 */
	public int strStr(String haystack, String needle) {
		if("".equals(needle)){
			return 0;
		}
		int haystackLength = haystack.length();
		int needleLength = needle.length();
		if(needleLength > haystackLength){
			return -1;
		}
		char[] chars = haystack.toCharArray();
		char firstNeedleChar = needle.toCharArray()[0];
		for(int i = 0; i < haystackLength; i++){
			if(chars[i] != firstNeedleChar){
				continue;
			}
			int endIndex = i + needleLength;
			if(endIndex > haystackLength){
				return -1;
			}

			String substring = haystack.substring(i, endIndex);
			if(needle.equals(substring)){
				return i;
			}
		}

		return -1;
	}
}
