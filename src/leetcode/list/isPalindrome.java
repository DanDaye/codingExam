package leetcode.list;

import java.util.ArrayList;
import java.util.BitSet;

/**
 * 请判断一个链表是否为回文链表。
 *
 * 示例 1:
 *
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 *
 * 输入: 1->2->2->1
 * 输出: true
 * 进阶：
 * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 */
public class isPalindrome {
    public boolean IsPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        //使用快慢指针找到中间节点
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondhead = null;
        //记录后半部分的头节点
        ListNode second = slow.next;
        slow.next = null;
        while(second != null){
            //临时变量，记录下一个节点
            ListNode tmp = second.next;
            second.next = secondhead;
            secondhead = second;
            second = tmp;
        }
        //链表的后半部分逆置，开始比较节点
        while(secondhead != null && head.val == secondhead.val){
            head = head.next;
            secondhead = secondhead.next;
        }
        if(secondhead == null){
            return true;
        }else{
            return false;
        }

    }
}
