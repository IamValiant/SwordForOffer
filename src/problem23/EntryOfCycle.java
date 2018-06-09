package problem23;


/**
 * Created by Xueyong on 2018/6/8.
 */
public class EntryOfCycle {
    /**
     * LeetCode 142
     * 第一步，判断有环 --> HasCycle函数
     * 第二步，求出环中结点个数
     * 第三步，找到入口位置
     * @param head
     * @return
     */
    public ListNode entryOfCycle(ListNode head){
        ListNode meetingNode = hasCycle(head);
        if(meetingNode==null){
            return null;
        }

        //求解环中的结点数 --> 绕一圈就得到了结点数
        int NodeNums = 1;  //1表示的是meetingNode结点
        ListNode Node = meetingNode;
        while(Node.next != meetingNode){
            Node = Node.next;
            NodeNums++;
        }

        //找到入口结点
        //指针1先走NodeNums步，之后和指针2一起走，相遇处就是所求入口
        ListNode Node1 = head;
        for(int i=0;i<NodeNums;i++){
            Node1 = Node1.next;
        }
        ListNode Node2 = head;
        while(Node1 != Node2){
            Node1=Node1.next;
            Node2=Node2.next;
        }
        return Node1;
    }

    //确认链表中有环，与HasCycle相同
    private ListNode hasCycle(ListNode head){
        if(head == null){
            return null;
        }
        ListNode pFast = head;
        ListNode pSlow = head;
        while (pFast != null && pSlow != null && pFast.next != null){
            pFast = pFast.next.next;
            pSlow = pSlow.next;
            if(pFast==pSlow){
                return pFast;
            }
        }
        return null;
    }
}
