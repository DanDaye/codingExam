package leetcode.list;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
//思路：先判断两个链表是否都为空，如果是，则返回空
//    再判断是否有一个链表为空，如果是，则返回不为空的链表
//    找到第一个最小的值作为头结点
//    对链表进行遍历，不断地加入到新链表中
public class mergeTwoLists {
    public ListNode MergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null && l2==null){
            return null;
        }else if (l1==null){
            return l2;
        }else if (l2 == null){
            return l1;
        }else {
            ListNode head=null;
            if (l1.val<l2.val){
                head=l1;
                l1 = l1.next;
            }else {
                head = l2;
                l2 = l2.next;
            }
            ListNode fence = head;
            while (l1!=null && l2!=null){
                if (l1.val<l2.val){
                    fence.next = l1;
                    l1=l1.next;
                }else {
                    fence.next=l2;
                    l2=l2.next;
                }
                fence = fence.next;
            }
            if (l1!=null){
                fence.next = l1;
            }else if (l2!=null){
                fence.next = l2;
            }
            return head;
        }
    }
}
