package problem14;

import org.junit.Test;


/**
 * Created by Xueyong on 2018/6/7.
 */
public class test14 {
    MaxCutting mc = new MaxCutting();

    @Test
    public void test() {
        // 功能测试：绳子长度 = 10
        System.out.println("绳子长度 = 10 的最大值:"+mc.maxCutting(10));

        // 边界值测试：绳子长度 = 0、1、2、3、4
        for(int i=0;i<5;i++){
            System.out.println("长度 = "+i+"的最大值:"+mc.maxCutting(i));
        }
    }
}



