package problem04;

import org.junit.Test;

/**
 * Created by Xueyong on 2018/6/6.
 */
public class test04{
    FindIn2DArray fa = new FindIn2DArray();

    @Test
    public void test() {
        // 功能测试
        int[][] src = new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(fa.searchMatrix(src,7));

        // 特殊输入测试
        System.out.println(fa.searchMatrix(null,7));
    }

}


