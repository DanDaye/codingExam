package Sword_means_offer.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class duplicateNumber_3 {
    /**题目一
     * 找出数组中重复的数字
     * 在一个长度为n的数组里的所有数字都在0~n-1的范围内。数组中某些数字是重复的，
     * 但不知道每个数字重复了几次。请找出数组中任意一个重复的数字。例如，如果输出长度为7，那么对应的输出是重复的数字是2或3
     */
    /**
     * 解法1：对数组进行排序，如果存在连续相同的数值，则为重复
     * @param nums
     * @param len
     * @return
     */
    public int duplicate1_1(int[] nums,int len){
        Arrays.sort(nums);
        for (int i=1;i<len;i++){
            if (nums[i] == nums[i-1]){
                return nums[i];
            }
        }
        return -1;
    }

    /**
     * 解法2：通过hashset可以判断每个数字是否重复，时间复杂度为O(n),空间复杂度为O(n)
     * @param nums
     * @param len
     * @return
     */
    public int duplicate1_2(int[] nums,int len){
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<len;i++){
            if (set.contains(nums[i])){
                return nums[i];
            }else {
                set.add(nums[i]);
            }
        }
        return -1;
    }

    /**
     * 解法3：由于数字的范围在0~n-1之间，所以，时间复杂度为O(n),空间复杂度为O(1)
     * @param nums
     * @param len
     * @return
     *
     */
    public  int duplicate1_3(int[] nums,int len){
        for (int i=0;i<len;i++){
            if (nums[i] == i){
                continue;
            }else {
                int index = nums[i];
                if (nums[index] == index){
                    return  index;
                }else{
                    int temp = nums[index];
                    nums[index] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return -1;
    }

    //题目二：不能修改数组找出重复的数字

    /**
     * 思路一：用额外的空间保存数组
     * @param nums
     * @param len
     * @return
     */
    public int duplicate2_1(int[] nums,int len){
        int[] other = new int[len];
        for (int i=0;i<len;i++){
            if (other[nums[i]]==0){
                other[nums[i]]=1;
            }else {
                return  nums[i];
            }
        }
        return -1;
    }

    /**
     *用二分的思想将数组进行拆分，如果在start~middle中出现的次数比在middle-start+1多，那么重复的数字就会出现在这个区间内
     * @param nums
     * @param len
     * @return
     */
    public int duplicate2_2(int[] nums,int len){
        if (nums ==null || len ==0){
            return -1;
        }
        int start =1;
        int end = len-1;
        while (end>=start){
            int middle = ((end-start)>>1)+start;
            int count = coutRange(nums,len,start,middle);
            if (end == start){
                if (count>1){
                    return start;
                }else
                    break;
            }
            if (count>(middle-start+1)){
                end=middle;
            }else {
                start = middle + 1;
            }
        }
        return -1;
    }
    public int coutRange(int[] nums,int len,int start,int end){
        if (nums==null){
            return 0;
        }
        int count =0;
        for (int i=0;i<len;i++){
            if (nums[i]>=start && nums[i]<=end){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] nums = new int[]{2,4,3,5};
    }
}
