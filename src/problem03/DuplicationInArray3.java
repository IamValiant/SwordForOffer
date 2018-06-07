package problem03;

/**
 * Created by Xueyong on 2018/6/6.
 */
public class DuplicationInArray3 {
    /**
     * 方法三（推荐）
     * 二分查找
     * 时间复杂度为O(nlogn)
     * 不需要辅助空间（时间换空间）
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

        int start = 1;
        int end = nums.length-1;
        while (end >= start){
            //用减号不用加号，防止整数越界；>>右移比除2快很多
            int middle = ((end - start)>>1)+start;

            int count = countRange(nums,start,middle);

            //循环终止条件
            if(end == start){
                if(count > 1){
                    return start;
                }
                break;
            }
            //前半部分中数据的个数 vs 序号差（记得+1）
            if(count > (middle-start+1)){
                end = middle;
            }else{
                //注意中间数据计算在前半部分
                start = middle+1;

            }
        }
        return -1;
    }

    private int countRange(int[] nums, int start, int end) {
        if(nums == null){
            return 0;
        }
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=start && nums[i]<=end){
                count++;
            }
        }
        return count;
    }
}



