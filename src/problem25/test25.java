package problem25;

import org.junit.Test;

/**
 * Created by Xueyong on 2018/6/8.
 */
public class test25 {
    MergeTwoLists mtl = new MergeTwoLists();
    @Test
    public void test() {
// 功能测试：输入链表有多个节点
        // 链表1 = 1->3->5->7
        ListNode l1 = new ListNode(1);
        ListNode node3 = new ListNode(3);
        ListNode node5 = new ListNode(5);
        ListNode node7 = new ListNode(7);
        l1.next = node3;
        node3.next = node5;
        node5.next = node7;

        // 链表2 = 2->4->6->8
        ListNode l2 = new ListNode(2);
        ListNode node4 = new ListNode(4);
        ListNode node6 = new ListNode(6);
        ListNode node8 = new ListNode(8);

        l2.next = node4;
        node4.next = node6;
        node6.next = node8;

        ListNode newHead1 = mtl.mergeTwoLists(l1, l2);
        // 输出链表
        while (newHead1 != null) {
            System.out.print(newHead1.val+"-->");
            newHead1 = newHead1.next;
        }

        //以下测试需要先不执行上面的merge操作（会影响下面的测试）

        // 异常情况测试1：二链表中，随意1个链表的头节点为空，合并结果 = 另外1个链表
//        System.out.println();
//        System.out.print("异常情况测试1：二链表中，随意1个链表的头节点为空，合并结果 = 另外1个链表: ");
//        ListNode newHead2 = mtl.mergeTwoLists(l1, null);
//        while (newHead2 != null) {
//            System.out.print(newHead2.val);
//            newHead2 = newHead2.next;
//        }

//        System.out.println();
//        System.out.print("异常情况测试1：二链表中，随意1个链表的头节点为空，合并结果 = 另外1个链表: ");
//        ListNode newHead3 = mtl.mergeTwoLists(null, l2);
//        while (newHead3 != null) {
//            System.out.print(newHead3.val);
//            newHead3 = newHead3.next;
//        }

        // 异常情况测试2：二链表的头节点同时为空，合并结果 = 1个空链表
//        System.out.println();
//        System.out.print("异常情况测试2：二链表的头节点同时为空，合并结果 = 1个空链表");
//        mtl.mergeTwoLists(null, null);
//
    }
}
