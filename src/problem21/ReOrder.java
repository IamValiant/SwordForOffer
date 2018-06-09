package problem21;

/**
 * Created by Xueyong on 2018/6/8.
 */
public class ReOrder {
    public void reOrder(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        //定义两个指针
        int begin = 0;
        int end = array.length - 1;

        while (begin < end) {

            if (begin < end && (array[begin] & 0x1) == 1) {
                begin++;
            }
            if (begin < end && (array[end] & 0x1) == 0) {
                end--;
            }

            //交换
            if (begin < end) {
                int tmp = array[begin];
                array[begin] = array[end];
                array[end] = tmp;
            }
        }
    }
}
