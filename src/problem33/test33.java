package problem33;

import org.junit.Test;

/**
 * Created by Xueyong on 2018/6/9.
 */
public class test33 {
    VerifySequenceOfBST vs = new VerifySequenceOfBST();
    @Test
    public void test(){
// 功能测试
        int[] data1 = {5,7,6,9,11,10,8};
        int[] data2 = {7,4,6,5};
        System.out.println(vs.verifySequenceOfBST(data1,data1.length));
        //System.out.println(vs.verifySequenceOfBST(data2,data2.length));

        // 特殊输入测试
        //System.out.println(vs.verifySequenceOfBST(null,0));
    }
}
