package com.deng.leetcode.array;

/**
 * 第26题：删除排序数组中的重复项
 *
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 
 *  不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * 
 *  示例 1:
 * 
 *  给定数组 nums = [1,1,2],
 * 
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 * 
 * 你不需要考虑数组中超出新长度后面的元素。
 * 
 *  示例 2:
 * 
 *  给定 nums = [0,0,1,1,1,2,2,3,3,4],
 * 
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 * 
 * 你不需要考虑数组中超出新长度后面的元素。
 */
public class RemoveDuplicates {

	/**
	 * 2 ms	44.4 MB
	 * @date 2019-08=23
	 * @param nums
	 * @return
	 */
	public int removeDuplicates(int[] nums) {
		if(nums.length == 0){
			return 0;
		}
		//记录最新的非重复数字
		int num = nums[0];
		//记录非重复数量，同时也是下一个非重复数据插入数组的下标
		int local = 1;
		//排除数组第一个元素，i从1开始
		for(int i = 1, j = nums.length; i < j; i++){
			//判断与最新的非重复数字是否相等
			if(nums[i] != num){
				//如果不相等
				//替换非重复数字
				num = nums[i];
				//最新非重复数字插入数组，覆盖原来下标的数据
				nums[local] = num;
				//下标、计数+1
				local++;
			}

			//如果相等，则忽略
		}
		return local;
	}
}
