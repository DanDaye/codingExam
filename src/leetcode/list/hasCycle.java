package leetcode.list;

/**
 * 给定一个链表，判断链表中是否有环。
 *
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 *
 *
 *
 * 示例 1：
 *
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 *
 *
 * 示例 2：
 *
 * 输入：head = [1,2], pos = 0
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第一个节点。
 *
 *
 * 示例 3：
 *
 * 输入：head = [1], pos = -1
 * 输出：false
 * 解释：链表中没有环。
 */
//思路一：快慢指针
//    思路二：set,如果出现在set中出现过的listNode,就说明出现了循环
public class hasCycle {

    public boolean HasCycle(ListNode head) {
        if (head==null || head.next==null){
            return false;
        }else{
            ListNode fence = head.next;
            ListNode temp = head;
            while (temp!=fence){
                if (fence==null || fence.next==null){
                    return false;
                }
                temp = temp.next;
                fence = fence.next.next;
            }
            return true;
        }
    }
}
