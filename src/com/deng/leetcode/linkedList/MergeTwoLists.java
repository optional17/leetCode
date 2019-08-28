package com.deng.leetcode.linkedList;

/**
 * 第21题：合并两个有序链表
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * 
 *  示例： 
 * 
 *  输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *  
 * 
 */
public class MergeTwoLists {

	/**
	 *	2 ms	36 MB
	 * @date 2019-08-23
	 * @param l1
	 * @param l2
	 * @return
	 */
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode listNode = new ListNode(0);
		ListNode tmp = listNode;
		while (l1 != null && l2 != null) {
			int m = l1.val;
			int n = l2.val;
			if (m < n) {
				tmp.next = l1;
				tmp = tmp.next;
				l1 = l1.next;
			} else {
				tmp.next = l2;
				tmp = tmp.next;
				l2 = l2.next;
			}
		}
		if (l1 == null) {
			tmp.next = l2;
		}
		if (l2 == null) {
			tmp.next = l1;
		}

		return listNode.next;
	}
}
