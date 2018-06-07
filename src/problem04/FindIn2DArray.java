package problem04;

import java.util.Arrays;


/**
 * Created by Xueyong on 2018/6/6.
 */
public class FindIn2DArray {
    /**
     * 方法一：逐行进行二分查找（不推荐）
     * 方法二：从右上角开始，右上角是一个拐点，上面和右面没有元素，左面的元素比它小，下面的元素比它大
     * 时间复杂度为（M+N）
     * 注：LeetCode 74 >20%
     * 解题思路：如何解-->返回值&函数名&参数输入-->边界条件-->循环（终止条件+循环体）
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0 || (matrix.length==1 && matrix[0].length==0)){
            return false;
        }

        int row = 0;  //第一行
        int column = matrix[0].length - 1; //最后一列

        while(row < matrix.length && column >= 0){
            if (matrix[row][column] == target) {
                return true;
            }
            else if(target < matrix[row][column]){
                column--;
            }else {
                row++;
            }
        }
        return false;
    }
}




