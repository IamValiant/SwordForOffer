package problem15;

import org.junit.Test;


/**
 * Created by Xueyong on 2018/6/7.
 */
public class test15 {
    NumberOf1 no = new NumberOf1();

    @Test
    public void test() {
        System.out.println(no.hammingWeight(3));
        System.out.println(no.hammingWeight(-3));
    }
}



