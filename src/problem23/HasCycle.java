package problem23;


/**
 * Created by Xueyong on 2018/6/8.
 */
public class HasCycle {
    /**
     * LeetCode 141
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head){
        if(head == null){
            return false;
        }
        ListNode pFast = head;
        ListNode pSlow = head;
        //因为底下用到pFast.next.next，所以先判定pFast和pFast.next
        // pSlow可以不判定(在pFast后面),最好也判定一下
        while (pFast != null && pSlow != null && pFast.next != null){
            //各先走一步，以免起点相同,底下的相等判定出现在第一步
            pFast = pFast.next.next;
            pSlow = pSlow.next;

            if(pFast==pSlow){
                return true;
            }
        }
        return false;
    }
}
