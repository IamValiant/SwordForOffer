package problem06;


import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Xueyong on 2018/6/6.
 */
public class printListFromTailToHead {
    /**
     * 打印-->不改变栈结构-->用栈存放（鲁棒性更好，推荐）或者递归打印
     * 如果链表翻转则新增一个pre指针并循环转换指针方向即可（LeetCode 206）
     * 注：LeetCode 暂无
     * 解题思路：如何解-->返回值&函数名&参数输入-->边界条件-->循环（终止条件+循环体）
     */

    public ArrayList<Integer> printListFromTailToHead(ListNode head) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        if(head == null){
            return arrayList;
        }

        ListNode cur = head;

        //声明用于存放和输出的栈
        Stack<ListNode> stack = new Stack<ListNode>();
        //遍历链表
        while (cur != null){
            stack.push(cur);
            cur = cur.next;
        }

        //从栈顶开始输出结点的值
        while (!stack.isEmpty()){
            arrayList.add(stack.pop().val);
        }
        return arrayList;
    }
}




