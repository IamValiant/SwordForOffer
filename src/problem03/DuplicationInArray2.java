package problem03;

/**
 * Created by Xueyong on 2018/6/6.
 */
public class DuplicationInArray2 {
    /**
     * 方法二
     * 通过比较下标并交换得到重复的值
     * 时间复杂度为O(n)——每个数字最多交换2次便会出现在序号等于值的位置上
     * 改变了内部结构
     * 注：LeetCode 287 >50%
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

        for(int i=0;i<nums.length;i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                //swap nums[i] and nums[nums[i]]
                int tmp = nums[i];
                nums[i] = nums[tmp];
                nums[tmp] = tmp;
            }
        }
        return -1;
    }
}



