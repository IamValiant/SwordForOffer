package problem06;

import org.junit.Test;


/**
 * Created by Xueyong on 2018/6/6.
 */
public class test06 {
    printListFromTailToHead pl = new printListFromTailToHead();

    @Test
    public void test() {
        // 功能测试
        ListNode head = new ListNode(67);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(24);
        ListNode node4 = new ListNode(58);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;


        System.out.println(pl.printListFromTailToHead((head)));

    }
}


