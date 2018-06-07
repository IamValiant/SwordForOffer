package problem11;

import org.junit.Test;
import problem10.Fibonacci;

/**
 * Created by Xueyong on 2018/6/7.
 */
public class test11 {
    FindMin fm = new FindMin();

    @Test
    public void test() {
        int[] src = new int[]{3,4,5,1,2};
        // 输出结果
        System.out.println(fm.findMin(src));
    }
}



