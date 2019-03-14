package leetcode.array;

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 *
 * 示例 1:
 *
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 */
public class rotateNum {

    public void ROTATE(int[] nums,int k){
        int temp;
        //先算出真正要移动的次数，时间复杂度为O(n*k)
        k = k%nums.length;
        for (int i=0;i<k;i++){
            temp = nums[nums.length-1];
            for (int j=nums.length-1;j>0;j--){
                nums[j] = nums[j-1];
            }
            nums[0] = temp;
        }
    }
}
