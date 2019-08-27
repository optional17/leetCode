package com.deng.leetcode.sort;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 第242题：有效的字母异位词
 * 异位词：两个字符串的字符完全一样
 *
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * 
 *  示例 1:
 * 
 *  输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 
 * 
 *  示例 2:
 * 
 *  输入: s = "rat", t = "car"
 * 输出: false
 * 
 *  说明:
 * 你可以假设字符串只包含小写字母。
 * 
 *  进阶:
 * 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 */
public class IsAnagram {

	/**
	 * 用时58 ms，内存43.9 MB
	 * @date 2019-08-27
	 * @param s
	 * @param t
	 * @return
	 */
	public boolean isAnagram(String s, String t) {
		if(null == s || null  == t ){
			return false;
		}
		//长度不一样肯定不是字母异位词
		if(s.length() != t.length()){
			return false;
		}
		//判断两个词是否一样，相同的话是字母异位词
		if(s.equals(t)){
			return true;
		}
		Map<Character,Integer> map1 = new HashMap<>();
		Map<Character,Integer> map2 = new HashMap<>();
		char[] chars1 = s.toCharArray();
		char[] chars2 = t.toCharArray();

		for(int i = 0,j = chars1.length; i < j; i++){
			if(!map1.containsKey(chars1[i])){
				map1.put(chars1[i],1);
			}else {
				map1.put(chars1[i],map1.get(chars1[i]).intValue()+1);
			}
		}
		for(int i = 0,j = chars2.length; i < j; i++){
			if(!map2.containsKey(chars2[i])){
				map2.put(chars2[i],1);
			}else {
				map2.put(chars2[i],map2.get(chars2[i]).intValue()+1);
			}
		}

		Iterator<Character> iterator = map1.keySet().iterator();
		while (iterator.hasNext()){
			Character next = iterator.next();
			if(!map2.containsKey(next)){
				return false;
			}
			if(map1.get(next).intValue() != map2.get(next).intValue()){
				return false;
			}
		}

		return true;
	}
}
