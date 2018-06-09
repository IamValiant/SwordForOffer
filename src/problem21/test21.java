package problem21;

import org.junit.Test;

/**
 * Created by Xueyong on 2018/6/8.
 */
public class test21 {
    ReOrder ro = new ReOrder();

    @Test
    public void test(){
        int[] array1 = {1,2,3,4,5,6,7};
        ro.reOrder(array1);
        for(int i=0;i<array1.length;i++) {
            System.out.print(array1[i]);
        }
    }
}
