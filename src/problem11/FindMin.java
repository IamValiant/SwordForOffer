package problem11;

/**
 * Created by Xueyong on 2018/6/7.
 */
public class FindMin {
    /**
     * 旋转数组
     * 时间复杂度为O(n)
     * 可以利用二分查找法，但二分法也有特例，需要使用顺序查找
     * @param nums
     * @return
     */
    public int findMin(int[] nums){
        if(nums.length == 0){
            return -1;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return nums[i+1];
            }
        }
        return nums[0]; //如果以上for循环没有找到，说明旋转了0个数字，返回第一个数字即可
    }
}
