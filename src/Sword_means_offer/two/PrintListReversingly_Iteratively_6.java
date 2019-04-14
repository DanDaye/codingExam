package Sword_means_offer.two;
import leetcode.list.ListNode;

/**
 * 题目：输入一个链表的头结点，从尾到头反过来打印出每个节点的值，链表节点定义如下
 *
 *
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x){
 *         val = x;
 *     }
 *
 *     public int getVal() {
 *         return val;
 *     }
 *
 *     public void setVal(int val) {
 *         this.val = val;
 *     }
 *
 *     public ListNode getNext() {
 *         return next;
 *     }
 *
 *     public void setNext(ListNode next) {
 *         this.next = next;
 *     }
 * }
 */


public class PrintListReversingly_Iteratively_6 {
    /**
     * 思路一：反转链表
     * @param root
     */
    public void PrintListReverse_1(ListNode root){
        ListNode fence = null;
        ListNode p = null;
        while (root.getNext()!=null){
            fence = root;
            fence.setNext(p);
            root = root.getNext();
            p=fence;
        }
        root.setNext(p);
        fence = root;
        while (fence!=null){
            System.out.println(fence.getVal());
            fence = fence.getNext();
        }
    }

    /**
     * 思路二：递归的思想
     * @param root
     */
    public void  PrintListReverse_2(ListNode root){
        if (root !=null){
            PrintListReverse_1(root.getNext());
            System.out.println(root.getVal());
        }
    }
}
