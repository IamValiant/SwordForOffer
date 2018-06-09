package problem31;

import org.junit.Test;

/**
 * Created by Xueyong on 2018/6/9.
 */
public class test31 {
    IsPopOrder ip = new IsPopOrder();

    @Test
    public void test(){
        // 压入序列
        int[] push = {1,2,3,4,5};

        // 判断弹出序列
        int[] pop1 = {4,5,3,2,1};
        int[] pop2 = {4,3,5,1,2};
        int[] pop3 = {1,2,4,3,5};
        System.out.println(ip.isPopOrder(push,pop1));
        System.out.println(ip.isPopOrder(push,pop2));
        System.out.println(ip.isPopOrder(push,pop3));
        // 特殊输入测试
        System.out.println(ip.isPopOrder(null,null));
    }
}
