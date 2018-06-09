package problem16;

/**
 * Created by Xueyong on 2018/6/8.
 */
public class MyPower {
    public double myPow(double x,int n){
        //底数为0，指数≤0时，返回0
        if(x==0){
            return 0;
        }
        if(n==0 || x==1){
            return 1;
        }
        if(n==0){
            return 1;
        }
        double result = 1.0;
        int pn = Math.abs(n);
        while (pn != 0){
            //每次除以2为奇数的时候都会少乘一次，所以需要补上来
            //但千万注意，每次只是补一次x！
            if((pn & 0x1) == 1){
                result *=x;
            }
            x *= x;
            pn = pn>>1;
        }
        return n>0 ? result : 1/result;
    }
}
