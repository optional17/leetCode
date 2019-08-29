package com.deng.leetcode.array;

/**
 * 第27题：移除元素
 *
 * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。 
 * 
 *  不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。 
 * 
 *  元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。 
 * 
 *  示例 1: 
 * 
 *  给定 nums = [3,2,2,3], val = 3,
 * 
 * 函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
 * 
 * 你不需要考虑数组中超出新长度后面的元素。
 *  
 * 
 *  示例 2: 
 * 
 *  给定 nums = [0,1,2,2,3,0,4,2], val = 2,
 * 
 * 函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。
 * 
 * 注意这五个元素可为任意顺序。
 * 
 * 你不需要考虑数组中超出新长度后面的元素。
 */
public class RemoveElement {


	/**
	 * 1 ms	36 MB
	 * @date 2019-08-23
	 * @param nums
	 * @param val
	 * @return
	 */
	public int removeElement(int[] nums, int val) {
		//val值出现的次数
		int num = 0;
		int j = nums.length;
		for(int i = 0; i < j; i++){
			//判断数字是否等于目标值
			if(nums[i] == val){
				//等于目标值,目标值出现次数+1
				num++;
			}else {
				//非目标值，把该值往前移动num位，覆盖目标位置的目标值
				nums[i - num] = nums[i];
			}
		}
		return j - num;
	}
}
