package leetcode.array;
/*
给定一个非空整数数组，除了某个元素只出现一次以外，
其余每个元素均出现两次。找出那个只出现了一次的元素。
 */

//思路：利用异或的原理实现

public class singleNumber {
    public int SINGELNUMBER(int[] nums){
        if (nums.length == 1){
            return nums[0];
        }else {
            int temp = 0;
            for (int i=0;i<nums.length;i++){
                temp = temp ^ nums[i];
            }
            return temp;
        }
    }
}
