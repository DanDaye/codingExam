package Algorithm_interview.list;

public class EntranceOfLoop {
    public static LNode constructList(){
        int i =1;
        LNode head = new LNode();
        head.next = null;
        LNode tmp = null;
        LNode cur = head;
        for (;i<8;i++){
            tmp = new LNode();
            tmp.data = i;
            tmp.next =null;
            cur.next = tmp;
            cur = tmp;
        }
        cur.next = head.next.next;
        return head;
    }


    public static LNode isLoop(LNode head){
        if (head == null || head.next == null){
            return null;
        }
        LNode slow = head.next;
        LNode fast = head.next;
        while (fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return slow;
            }
        }
        return null;
    }

    public static LNode findLoopNode(LNode head,LNode meetNode){
        LNode first = head.next;
        LNode second = meetNode;
        while (first != meetNode ){
            first = first.next;
            second = second.next;
        }
        return first;
    }

    public static void main(String[] args){
        LNode head = constructList();
        LNode meetNode = isLoop(head);
        LNode loopNode = null;
        if (meetNode !=null){
            System.out.println("有环");
            loopNode = findLoopNode(head,meetNode);
            System.out.println("环入口点为："+loopNode.data);
        }else {
            System.out.println("无环");
        }
    }
}
