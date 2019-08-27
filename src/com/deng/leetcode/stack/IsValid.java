package com.deng.leetcode.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 第20题：有效的括号
 * 难度：简单
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 
 *  有效字符串需满足：
 * 
 * 
 *  左括号必须用相同类型的右括号闭合。
 *  左括号必须以正确的顺序闭合。
 * 
 * 
 *  注意空字符串可被认为是有效字符串。
 * 
 *  示例 1:
 * 
 *  输入: "()"
 * 输出: true
 * 
 * 
 *  示例 2:
 * 
 *  输入: "()[]{}"
 * 输出: true
 * 
 * 
 *  示例 3:
 * 
 *  输入: "(]"
 * 输出: false
 * 
 * 
 *  示例 4:
 * 
 *  输入: "([)]"
 * 输出: false
 * 
 * 
 *  示例 5:
 * 
 *  输入: "{[]}"
 * 输出: true
 *
 * @remark: 面试中遇见过类似的，简化Linux的路径，比如/user/.././test，简化为/test
 */
public class IsValid {
	/**
	 * 首次提交于2019-08-27，耗时7 ms，内存35.1 MB
	 * @param s
	 * @return
	 */
	public boolean isValid(String s) {
		Map<String,String> map = new HashMap<>();
		map.put(")","(");
		map.put("}","{");
		map.put("]","[");

		Stack<String> stack = new Stack<>();
		char[] chars = s.toCharArray();

		for(int i = 0, j = chars.length; i < j; i ++){
			String s1 = String.valueOf(chars[i]);
			if(stack.size() == 0){
				stack.push(s1);
				continue;
			}
			if(map.containsKey(s1) && map.get(s1).equals(stack.peek())){
				stack.pop();
			}else {
				stack.push(s1);
			}
		}
		if(stack.size() == 0){
			return true;
		}

		return false;

	}
}
