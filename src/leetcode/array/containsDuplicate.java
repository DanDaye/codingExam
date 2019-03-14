package leetcode.array;

/*
给定一个整数数组，判断是否存在重复元素。
如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 */
import java.util.HashMap;

public class containsDuplicate {

    public boolean CONTAINS_DUPLICATE(int[] nums){
        if (nums.length<2){
            return false;
        }else {
            HashMap<Integer,Integer> contains = new HashMap<>();
            for (int i =0;i<nums.length;i++){
                if (contains.containsKey(nums[i])){
                    return true;
                }else {
                    return false;
                }
            }
            return false;
        }
    }
}
