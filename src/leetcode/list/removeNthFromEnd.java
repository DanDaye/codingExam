package leetcode.list;

/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 *
 * 示例：
 *
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 *
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 *
 * 给定的 n 保证是有效的。
 *
 * 进阶：
 *
 * 你能尝试使用一趟扫描实现吗？
 */

//思路：有一个前结点，先走了n步，一个结点最后指向要被删除的结点的位置，一个结点指向要被删除结点的前一个位置
public class removeNthFromEnd {
    public ListNode RemoveNthFromEnd(ListNode head, int n) {
        ListNode pre = head;
        while (n!=0){
            pre = pre.next;
            n--;
        }
        ListNode after = head;
        ListNode after1=null;
        while (pre!=null){
            after1=after;
            after= after.next;
            pre = pre.next;
        }
        if (after.next==null){
            if (after1==head || after1 == null){
                return null;
            }else {
                after1.next = null;
            }
        }else {
            after1.next = after.next;
        }
        return head;
    }
}
