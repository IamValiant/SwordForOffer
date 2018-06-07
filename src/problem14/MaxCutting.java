package problem14;

import static java.lang.Math.pow;

/**
 * Created by Xueyong on 2018/6/7.
 */
public class MaxCutting {
    /**
     * 贪心算法
     * @param length
     * @return
     */
    public int maxCutting(int length){
        if(length<2){
            return 0; //无法裁剪
        }
        if(length==2){
            return 1; //2=1+1
        }
        if(length==3){
            return 2; //3=2+1
        }

        int timeOf3 = length/3;

        if(length%3==1){
            timeOf3-=1;
        }
        int timeOf2 = (length-3*timeOf3)/2;  //结果为0、1（5=3+2）或者2（余4的时候,4=2+2）

        return (int)pow(3,timeOf3)*(int)pow(2,timeOf2);
    }
}
