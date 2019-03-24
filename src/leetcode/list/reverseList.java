package leetcode.list;

/**
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 */
//思路：先判断头结点是否为null,如果为null直接进行返回
//    如果头结点不为null,一个先结点，一个当前节点，一个头结点，反转
public class reverseList {
    public ListNode ReverseList(ListNode head) {
        ListNode pre=null;
        ListNode fence = null;
        if (head==null){
            return head;
        }
        while (head.next!=null){
            fence = head;
            head = head.next;
            fence.next =pre;
            pre=fence;
        }
        head.next=pre;
        return head;
    }
}
