package problem03;

import org.junit.Test;

/**
 * Created by Xueyong on 2018/6/6.
 */
public class test03{
//    DuplicationInArray1 dia = new DuplicationInArray1();
//    DuplicationInArray2 dia = new DuplicationInArray2();
//    DuplicationInArray3 dia = new DuplicationInArray3();
    DuplicationInArray4 dia = new DuplicationInArray4();

    @Test
    public void test() {
        // 功能测试1：数组长度 = 8，含1个重复数字
        int[] src1 = new int[]{2, 1, 5, 4, 3, 2, 6, 7};
        System.out.println(dia.findDuplicate(src1));

        // 功能测试2：数组长度 = 8，含多个重复数字
        int[] src2 = new int[]{2, 2, 5, 4, 3, 3, 6, 7};
        System.out.println(dia.findDuplicate(src2));

        // 功能测试3：数组长度 = 8，不含重复数字
        int[] src3 = new int[]{0, 1, 2, 3, 4, 5, 6, 7};
        System.out.println(dia.findDuplicate(src3));

        // 特殊输入测试1：包含0~n-1之外的数字
        int[] src4 = new int[]{0, 1, 2, 3, 4, 5, 6, 9};
        System.out.println(dia.findDuplicate(src4));

        // 特殊输入测试2：空指针
        System.out.println(dia.findDuplicate(null));
    }

}


