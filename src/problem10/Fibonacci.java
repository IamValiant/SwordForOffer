package problem10;

/**
 * Created by Xueyong on 2018/6/7.
 */
public class Fibonacci {
    /**
     * 递归和循环
     * @param n
     * @return
     */
    public int fibonacci(int n){
        if(n<0){
            return -1;
        }
        if(n<=1){
            return n;
        }
        int fibOne=1;
        int fibTwo=0;
        int fibN = 0;
        for(int i=2;i<=n;i++){
            fibN = fibOne + fibTwo;
            fibTwo = fibOne;
            fibOne = fibN;
        }
    return fibN;
    }
}
