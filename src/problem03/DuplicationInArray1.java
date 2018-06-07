package problem03;

import java.util.Arrays;


/**
 * Created by Xueyong on 2018/6/6.
 */
public class DuplicationInArray1 {
    /**
     * 方法一
     * 利用了内置的Java排序函数sort
     * 时间复杂度为O(nlogn)
     * 改变了内部结构
     * 注：LeetCode 287 >30%
     * @param nums
     * @return
     */
    public int findDuplicate(int nums[]) {

        if(nums == null || nums.length <= 0){
            return -1;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0 || nums[i]>=nums.length){
                return -1;
            }
        }

        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                return nums[i];
            }
        }
        return -1;
    }
}



