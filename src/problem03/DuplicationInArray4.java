package problem03;

/**
 * Created by Xueyong on 2018/6/6.
 */
public class DuplicationInArray4 {
    /**
     * 方法四
     * 额外创建一个n+1的数组
     * 时间复杂度为O(n)
     * 空间换时间
     * 注：LeetCode 287 >50%
     *
     * @param nums
     * @return
     */
    public int findDuplicate(int nums[]) {

        if (nums == null || nums.length <= 0) {
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 || nums[i] >= nums.length) {
                return -1;
            }
        }

        int[] nums2 = new int[nums.length];
        //初始化空数组
        for(int i=0;i<nums2.length;i++){
            nums2[i] = -1;
        }

        for(int i=0;i<nums.length;i++){
            //循环终止条件
            if(nums2[nums[i]] == nums[i]){
                return nums[i];
            }
            nums2[nums[i]] = nums[i];
        }
        return -1;
    }
}



