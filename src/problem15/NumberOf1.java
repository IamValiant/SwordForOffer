package problem15;

/**
 * Created by Xueyong on 2018/6/7.
 */
public class NumberOf1 {
    public int hammingWeight(int n){
        int count = 0;
        int flag = 1;
        while (flag != 0){
            if((n & flag) != 0){
                count++;
            }
            flag=flag<<1;
        }
        return count;
    }
}
