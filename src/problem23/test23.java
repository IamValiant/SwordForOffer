package problem23;


import org.junit.Test;

/**
 * Created by Xueyong on 2018/6/8.
 */
public class test23 {
    EntryOfCycle eoc = new EntryOfCycle();

    @Test
    public void test() {
        // 创建链表：
        // 1->2->3->4->5->6
        //       ^        |
        //       |        |
        //       +--------+
        ListNode pHead = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        pHead.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node3;

        // 功能测试：倒数第1个节点（尾结点）、倒数第6个节点（头节点）、中间节点
        System.out.println("入口结点为："+eoc.entryOfCycle(pHead).val);

        // 异常测试：链表中没环
        // 创建链表：
        // 1->2->3->4->5->6
//        ListNode pHead = new ListNode(1);
//        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(3);
//        ListNode node4 = new ListNode(4);
//        ListNode node5 = new ListNode(5);
//        ListNode node6 = new ListNode(6);
//        pHead.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//        node5.next = node6;
//
//        System.out.println(eoc.entryOfCycle(pHead).val);


        // 异常测试：头节点为空
//        System.out.println(eoc.entryOfCycle(null).val);
    }
}
