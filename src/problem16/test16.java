package problem16;

import org.junit.Test;



/**
 * Created by Xueyong on 2018/6/7.
 */
public class test16 {
    MyPower mp = new MyPower();

    @Test
    public void test() {
        System.out.println(mp.myPow(2, 1024));
        System.out.println(mp.myPow(2, -4));
        System.out.println(mp.myPow(2, 0));
        System.out.println(mp.myPow(-2, 3));
        System.out.println(mp.myPow(0, 0));
        System.out.println(mp.myPow(0, 3));
        System.out.println(mp.myPow(0, -1));
        System.out.println(mp.myPow(1, -1));
        System.out.println(mp.myPow(8.84372, 5));
        System.out.println(mp.myPow(8.84372, -5));
    }
}



