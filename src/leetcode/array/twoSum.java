package leetcode.array;


/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，
 * 并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 */
public class twoSum {

    /**
     * 思路一：时间复杂度为O(n^2)
     */
    public int[] TWOSUM(int[] nums,int target){
        int[] result = null;
        for (int i=0;i<nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                if ((nums[i]+nums[j])==target){
                    result = new int[2];
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }

    /**
     * 思路二：
     *
     */


}
